package com.protech.nvkids.pages.rstr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class EditFamilialRestrictedCasesPage extends SeleniumBase

{
	public EditFamilialRestrictedCasesPage() 
	{
		PageFactory.initElements(driver, this);
	}

	CommonLocators cloc = new CommonLocators();
	//Screen functions
	
	@FindBy(xpath = "//span[text()='Edit Familial Restricted Cases Status']") WebElement elesfEditFamilialRestrictedCasesStatus;
	@FindBy(xpath = "//label[text()=' Case ']") WebElement elelblCase;
	@FindBy(xpath = "//label[text()=' Participant ']") WebElement elelblParticipant;
	@FindBy(xpath = "//label[text()=' User ']") WebElement elelblUser;
	@FindBy(xpath = "//label[text()=' Reason Code ']") WebElement elelblReasonCode;
	@FindBy(xpath = "//label[text()=' Reason ']") WebElement elelblReason;
	@FindBy(xpath = "//label[text()='Status']") WebElement elelblStatus;
	@FindBy(xpath = "//label[text()='Active']") WebElement elelblActive;
	@FindBy(xpath = "//label[text()='Inactive']") WebElement elelblInactive;
	
	@FindBy(xpath = "//label[text()='Active']/preceding::span[1][contains(@class,'radiobutton')]")  WebElement elerbActive;
	@FindBy(xpath = "//label[text()='Inactive']/preceding::span[1][contains(@class,'radiobutton')]")  WebElement elerbInactive;
	
	
	
	public EditFamilialRestrictedCasesPage verifyFieldsPresent() throws Exception
	{
		
		

		verifyDisplayed(elesfEditFamilialRestrictedCasesStatus,elesfEditFamilialRestrictedCasesStatus);
		
		verifyDisplayed(elelblCase,elelblCase);
		verifyDisplayed(elelblParticipant,elelblParticipant);
		verifyDisplayed(elelblReasonCode,elelblReasonCode);
		verifyDisplayed(elelblReason,elelblReason);
		verifyDisplayed(elelblStatus,elelblStatus);
		verifyDisplayed(elelblUser,elelblUser);
		verifyDisplayed(elelblActive,elerbActive);
		verifyDisplayed(elelblInactive,elerbInactive);
		
		
		return this;
	}
	

	public EditFamilialRestrictedCasesPage EditStatus() throws Exception
	{
		
	
    click(elerbInactive);
    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

		return this;
	}
	
	
}
