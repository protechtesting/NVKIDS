package com.protech.nvkids.pages.rstr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class AddFamilialRestrictedCasesPage extends SeleniumBase
{
	
	public AddFamilialRestrictedCasesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	CommonLocators cloc = new CommonLocators();
	
	//Add labels and required fields check
	@FindBy(xpath = "//span[text()='Add Familial Restricted Cases']") WebElement eleAddScreenName;
	@FindBy(xpath = "//label[text()='Case']") WebElement elelblCase;
	@FindBy(xpath = "//label[text()='Case']/span") WebElement elelblReqCase;
	
	@FindBy(xpath = "//label[text()='Participant']") WebElement elelblParticipant;
	@FindBy(xpath = "//label[text()='Participant']/span") WebElement elelblReqParticipant;
	
	@FindBy(xpath = "//label[text()='Reason']") WebElement elelblReason;
	@FindBy(xpath = "//label[text()='Reason']/span") WebElement elelblReqReason;
	
	@FindBy(xpath = "//label[text()='User ID']") WebElement elelblUser;
	@FindBy(xpath = "//label[text()='User ID']/span") WebElement elelblReqUser;
	
	
	//Dropdown Red Highlight check
	@FindBy(xpath= "//label[text()='Case']/following::div[1]")WebElement eleReqCaseDrop;
	@FindBy(xpath= "//label[text()='Participant']/following::div[1]")WebElement eleReqParticipantDrop;
	@FindBy(xpath= "//label[text()='User ID']/following::div[1]")WebElement eleReqUserIDLOV;
	
	//Case and Particpant dropdown check
	@FindBy(xpath = "//span[@class='ui-multiselect-label ui-corner-all']") WebElement eleAddCaseParticipantRequiredDropdown;
	
	
	//Enter or selection of fields
	@FindBy(id="caseId") WebElement eleAddCaseID;
	@FindBy(id="personId") WebElement eleAddParticipantID;
	@FindBy(xpath = "//label[text()='Reason']/following::div[1]") WebElement eleAddReason;
	@FindBy(id="userName") WebElement eleAddUserID;
	
	//Multiselect checkbox for case/participant
	@FindBy(xpath = "//div[contains(@class,'ui-chkbox ui-widget ng-tns-c')]/div[2]")  WebElement eleMultichbx;
	@FindBy(xpath = "//a[@class='ui-multiselect-close ui-corner-all']/span") WebElement eleMulticlose;
	
	
	@FindBy(xpath = "//ul[@role='listbox']/p-dropdownitem") WebElement eleSelectValue;
	
	public AddFamilialRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(eleAddScreenName,eleAddScreenName);
		verifyDisplayed(elelblCase,eleAddCaseID);
		verifyRequiredField(elelblReqCase,elelblCase);
		verifyDisplayed(elelblParticipant,eleAddParticipantID);
		verifyRequiredField(elelblReqParticipant,elelblParticipant);
		verifyDisplayed(elelblUser,eleAddUserID);
		verifyRequiredField(elelblReqUser,elelblUser);
		verifyDisplayed(elelblReason,eleAddReason);
		verifyRequiredField(elelblReqReason,elelblReason);
		
		return this;
		
	}
	
	
	public AddFamilialRestrictedCasesPage AddwithNullfields() throws Exception
	{

	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Participant","Enter Required Fields","User ID","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleAddCaseID,eleAddParticipantID,eleAddReason,eleAddUserID);
	    return this;
	    
	}
	
	
	public AddFamilialRestrictedCasesPage CheckCaseTab() throws Exception
	{

	    clearAndType(eleAddCaseID,elelblCase,"3200000001");
	    pressKey(eleAddCaseID,"Keys.TAB");
	    verifyExactText(eleAddCaseParticipantRequiredDropdown,"Choose");
	    
	    return this;
	    
	}
	
	public AddFamilialRestrictedCasesPage CheckParticipantTab() throws Exception
	{

	    clearAndType(eleAddParticipantID,elelblParticipant,"1000000001");
	    pressKey(eleAddParticipantID,"Keys.TAB");
	    verifyExactText(eleAddCaseParticipantRequiredDropdown,"Choose");
	    
	    return this;
	    
	}
	
	public AddFamilialRestrictedCasesPage AddwithCase() throws Exception
	{

	    clearAndType(eleAddCaseID,elelblCase,"3200000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Participant","Enter Required Fields","User ID","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleReqParticipantDrop,eleAddReason,eleAddUserID);
	    
	    return this;
	    
	}

	
	public AddFamilialRestrictedCasesPage AddwithParticipant() throws Exception
	{

	    clearAndType(eleAddParticipantID,elelblParticipant,"1000000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","User ID","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleReqCaseDrop,eleAddReason,eleAddUserID);
	    
	    return this;
	    
	}
	
	
	public AddFamilialRestrictedCasesPage AddwithUser() throws Exception
	{

	    clearAndType(eleAddUserID,elelblUser,"AARUL");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Participant","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleAddCaseID,eleAddParticipantID,eleAddReason);
	    
	    return this;
	    
	}
	
	
	public AddFamilialRestrictedCasesPage AddwithMultiParticipant() throws Exception
	{

	    clearAndType(eleAddCaseID,elelblCase,"3200000001");
	    click(eleAddCaseParticipantRequiredDropdown);
	    
	    clickIcon(eleMultichbx,eleMultichbx);
	    
	    clearAndType(eleAddUserID,elelblUser,"AARUL");
	    
	    setFocus(eleAddReason);
	    selectRandomDropdownValue(eleAddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}
	
	public AddFamilialRestrictedCasesPage AddwithMultiCase() throws Exception
	{

	    clearAndType(eleAddParticipantID,elelblParticipant,"1000000001");
	    click(eleAddCaseParticipantRequiredDropdown);
	    
	    clickIcon(eleMultichbx,eleMultichbx);
	    
	    clickIcon(eleMulticlose,eleMulticlose);
	    
	    clearAndType(eleAddUserID,elelblUser,"AARUL");
	    
	    setFocus(eleAddReason);
	    selectRandomDropdownValue(eleAddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}

	

}