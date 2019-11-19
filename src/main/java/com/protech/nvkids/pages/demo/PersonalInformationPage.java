package com.protech.nvkids.pages.demo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class PersonalInformationPage extends SeleniumBase 
{
	public PersonalInformationPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[@for='personId']") WebElement elelblParticipantID;
	@FindBy(xpath = "//lib-input[@class='allignCenter ng-pristine ng-valid ng-touched']//div[@class='paddingBottom0']//div//input[@type='text']") WebElement eletxtParticipantID;
	@FindBy(xpath = "//a[contains(@id,'ui-accordiontab-')]/span[contains(text(),'Participant Demographics')]") WebElement ParticipantDemographicsTab;
	@FindBy(xpath = "//span[@icon='pi pi-plus']") WebElement UploadBtn;
	
	
	CommonLocators cloc = new CommonLocators();
	
	public PersonalInformationPage Upload() throws Exception
	{

		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtParticipantID, elelblParticipantID, "1000000001");
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		clickIcon(cloc.eleicnEdit,cloc.eleicnEdit);
		clickIcon(UploadBtn,UploadBtn);
		
		return this;
		
	}
	

}
