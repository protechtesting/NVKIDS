package com.protech.nvkids.pages.rstr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class AddHighProfileRestrictedCasesPage extends SeleniumBase
{
	
	public AddHighProfileRestrictedCasesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	CommonLocators cloc = new CommonLocators();
	//Add labels and required fields check
	@FindBy(xpath = "//span[text()='Add High Profile Restricted Cases']") WebElement eleAddScreenName;
	@FindBy(xpath = "//label[text()='Case']") WebElement elelblCase;
	@FindBy(xpath = "//label[text()='Case']/span") WebElement elelblReqCase;
	
	@FindBy(xpath = "//label[text()='Participant']") WebElement elelblParticipant;
	@FindBy(xpath = "//label[text()='Participant']/span") WebElement elelblReqParticipant;
	
	@FindBy(xpath = "//label[text()='Reason']") WebElement elelblReason;
	@FindBy(xpath = "//label[text()='Reason']/span") WebElement elelblReqReason;
	
	
	//Dropdown Red Highlight check
	@FindBy(xpath= "//label[text()='Case']/following::div[1]")WebElement eleReqCaseDrop;
	@FindBy(xpath= "//label[text()='Participant']/following::div[1]")WebElement eleReqParticipantDrop;
	
	//Case and Particpant dropdown check
	@FindBy(xpath = "//span[@class='ui-multiselect-label ui-corner-all']") WebElement eleAddCaseParticipantRequiredDropdown;
	
	
	//Enter or selection of fields
	@FindBy(id="caseId") WebElement eleAddCaseID;
	@FindBy(id="personId") WebElement eleAddParticipantID;
	@FindBy(xpath = "//label[text()='Reason']/following::div[1]") WebElement eleAddReason;
	
	//Multiselect checkbox for case/participant
	@FindBy(xpath = "//div[contains(@class,'ui-chkbox ui-widget ng-tns-c')]/div[2]")  WebElement eleMultichbx;
	@FindBy(xpath = "//a[@class='ui-multiselect-close ui-corner-all']/span") WebElement eleMulticlose;
	
	
	@FindBy(xpath = "//ul[@role='listbox']/p-dropdownitem") WebElement eleSelectValue;
	
	public AddHighProfileRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(eleAddScreenName,eleAddScreenName);
		verifyDisplayed(elelblCase,eleAddCaseID);
		verifyRequiredField(elelblReqCase,elelblCase);
		verifyDisplayed(elelblParticipant,eleAddParticipantID);
		verifyRequiredField(elelblReqParticipant,elelblParticipant);
		verifyDisplayed(elelblReason,eleAddReason);
		verifyRequiredField(elelblReqReason,elelblReason);
		
		return this;
		
	}
	
	
	public AddHighProfileRestrictedCasesPage AddwithNullfields() throws Exception
	{

	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Participant","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleAddCaseID,eleAddParticipantID,eleAddReason);
	    return this;
	    
	}
	
	
	public AddHighProfileRestrictedCasesPage CheckCaseTab() throws Exception
	{

	    clearAndType(eleAddCaseID,elelblCase,"3200000001");
	    pressKey(eleAddCaseID,"Keys.TAB");
	    verifyExactText(eleAddCaseParticipantRequiredDropdown,"Choose");
	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage CheckParticipantTab() throws Exception
	{

	    clearAndType(eleAddParticipantID,elelblParticipant,"1000000001");
	    pressKey(eleAddParticipantID,"Keys.TAB");
	    verifyExactText(eleAddCaseParticipantRequiredDropdown,"Choose");
	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage AddwithCase() throws Exception
	{

	    clearAndType(eleAddCaseID,elelblCase,"3200000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Participant","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleReqParticipantDrop,eleAddReason);
	    
	    return this;
	    
	}

	
	public AddHighProfileRestrictedCasesPage AddwithParticipant() throws Exception
	{

	    clearAndType(eleAddParticipantID,elelblParticipant,"1000000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleReqCaseDrop,eleAddReason);
	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage AddwithMultiParticipant() throws Exception
	{

	    clearAndType(eleAddCaseID,elelblCase,"3200000002");
	    click(eleAddCaseParticipantRequiredDropdown);
	    
	    clickIcon(eleMultichbx,eleMultichbx);
	    
	    setFocus(eleAddReason);
	    selectRandomDropdownValue(eleAddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage AddwithMultiCase() throws Exception
	{

	    clearAndType(eleAddParticipantID,elelblParticipant,"1000000001");
	    click(eleAddCaseParticipantRequiredDropdown);
	    
	    clickIcon(eleMultichbx,eleMultichbx);
	    
	    clickIcon(eleMulticlose,eleMulticlose);
	    
	    setFocus(eleAddReason);
	    selectRandomDropdownValue(eleAddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}

	
	
}
