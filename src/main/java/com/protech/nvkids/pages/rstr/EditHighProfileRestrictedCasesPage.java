package com.protech.nvkids.pages.rstr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class EditHighProfileRestrictedCasesPage extends SeleniumBase

{
	public EditHighProfileRestrictedCasesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	CommonLocators cloc = new CommonLocators();
	//Screen functions
	
	@FindBy(xpath = "//span[text()='Edit High Profile Restricted Cases Status']") WebElement eleEditScreenName;
	@FindBy(xpath = "//label[text()=' Case ']") WebElement elelblCase;
	@FindBy(xpath = "//label[text()=' Participant ']") WebElement elelblParticipant;
	@FindBy(xpath = "//label[text()=' Reason Code ']") WebElement elelblReasonCode;
	@FindBy(xpath = "//label[text()=' Reason ']") WebElement elelblReason;
	@FindBy(xpath = "//label[text()='Status']") WebElement elelblStatus;
	@FindBy(xpath = "//label[text()='Active']") WebElement elelblActive;
	@FindBy(xpath = "//label[text()='Inactive']") WebElement elelblInactive;
	
	@FindBy(xpath = "//label[text()='Active']/preceding::span[1][contains(@class,'radiobutton')]")  WebElement eleActiveRadio;
	@FindBy(xpath = "//label[text()='Inactive']/preceding::span[1][contains(@class,'radiobutton')]")  WebElement eleInactiveRadio;
	
	
	
	public EditHighProfileRestrictedCasesPage verifyFieldsPresent() throws Exception
	{
		
		

		verifyDisplayed(eleEditScreenName,eleEditScreenName);
		
		verifyDisplayed(elelblCase,elelblCase);
		verifyDisplayed(elelblParticipant,elelblParticipant);
		verifyDisplayed(elelblReasonCode,elelblReasonCode);
		verifyDisplayed(elelblReason,elelblReason);
		verifyDisplayed(elelblStatus,elelblStatus);
		verifyDisplayed(elelblActive,eleActiveRadio);
		verifyDisplayed(elelblInactive,eleInactiveRadio);
		
		
		return this;
	}
	

	public EditHighProfileRestrictedCasesPage EditStatus() throws Exception
	{
		
	
    click(eleInactiveRadio);
    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");
    
		return this;
	}
	
	
	
	
	
	
}
