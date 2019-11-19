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
	@FindBy(xpath = "//span[text()='Add Familial Restricted Cases']") WebElement elesfAddFamilialRestrictedCases;
	@FindBy(xpath = "//label[text()='Case']") WebElement elelblCase;
	@FindBy(xpath = "//label[text()='Participant']") WebElement elelblParticipant;
	@FindBy(xpath = "//label[text()='Reason']") WebElement elelblReason;
	@FindBy(xpath = "//label[text()='User ID']") WebElement elelblUser;
	
	
	//Dropdown Red Highlight check
	@FindBy(xpath= "//label[text()='Case']/following::div[1]")WebElement eleddCase;
	@FindBy(xpath= "//label[text()='Participant']/following::div[1]")WebElement eleddParticipant;
	//@FindBy(xpath= "//label[text()='User ID']/following::div[1]")WebElement eletxtUserID;
	
	//Case and Particpant dropdown check
	@FindBy(xpath = "//span[@class='ui-multiselect-label ui-corner-all']") WebElement eleddCaseParticipant;
	
	
	//Enter or selection of fields
	@FindBy(id="caseId") WebElement eletxtCase;
	@FindBy(id="personId") WebElement eletxtParticipant;
	@FindBy(xpath = "//label[text()='Reason']/following::div[1]") WebElement eleddReason;
	@FindBy(id="userName") WebElement eletxtUserID;
	
	//Multiselect checkbox for case/participant
	@FindBy(xpath = "//div[contains(@class,'ui-chkbox ui-widget ng-tns-c')]/div[2]")  WebElement elecbCaseParticipant;
	@FindBy(xpath = "//a[@class='ui-multiselect-close ui-corner-all']/span") WebElement eleicncloseCaseParticipant;
	

	
	public AddFamilialRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(elesfAddFamilialRestrictedCases,elesfAddFamilialRestrictedCases);
		verifyDisplayed(elelblCase,eletxtCase);
		verifyRequiredField(elelblCase);
		verifyDisplayed(elelblParticipant,eletxtParticipant);
		verifyRequiredField(elelblParticipant);
		verifyDisplayed(elelblUser,eletxtUserID);
		verifyRequiredField(elelblUser);
		verifyDisplayed(elelblReason,eleddReason);
		verifyRequiredField(elelblReason);
		
		return this;
		
	}
	
	
	public AddFamilialRestrictedCasesPage AddwithNullfields() throws Exception
	{

	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Participant","Enter Required Fields","User ID","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eletxtCase,eletxtParticipant,eleddReason,eletxtUserID);
	    return this;
	    
	}
	
	
	public AddFamilialRestrictedCasesPage CheckCaseTab() throws Exception
	{

	    clearAndType(eletxtCase,elelblCase,"3200000001");
	    pressKey(eletxtCase,"Keys.TAB");
	    verifyExactText(eleddCaseParticipant,"Choose");
	    
	    return this;
	    
	}
	
	public AddFamilialRestrictedCasesPage CheckParticipantTab() throws Exception
	{

	    clearAndType(eletxtParticipant,elelblParticipant,"1000000001");
	    pressKey(eletxtParticipant,"Keys.TAB");
	    verifyExactText(eleddCaseParticipant,"Choose");
	    
	    return this;
	    
	}
	
	public AddFamilialRestrictedCasesPage AddwithCase() throws Exception
	{

	    clearAndType(eletxtCase,elelblCase,"3200000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Participant","Enter Required Fields","User ID","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleddParticipant,eleddReason,eletxtUserID);
	    
	    return this;
	    
	}

	
	public AddFamilialRestrictedCasesPage AddwithParticipant() throws Exception
	{

	    clearAndType(eletxtParticipant,elelblParticipant,"1000000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","User ID","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleddCase,eleddReason,eletxtUserID);
	    
	    return this;
	    
	}
	
	
	public AddFamilialRestrictedCasesPage AddwithUser() throws Exception
	{

	    clearAndType(eletxtUserID,elelblUser,"AARUL");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Participant","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eletxtCase,eletxtParticipant,eleddReason);
	    
	    return this;
	    
	}
	
	
	public AddFamilialRestrictedCasesPage AddwithMultiParticipant() throws Exception
	{

	    clearAndType(eletxtCase,elelblCase,"3200000001");
	    click(eleddCaseParticipant);
	    
	    clickIcon(elecbCaseParticipant,elecbCaseParticipant);
	    
	    clearAndType(eletxtUserID,elelblUser,"AARUL");
	    
	    setFocus(eleddReason);
	    selectRandomDropdownValue(eleddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}
	
	public AddFamilialRestrictedCasesPage AddwithMultiCase() throws Exception
	{

	    clearAndType(eletxtParticipant,elelblParticipant,"1000000001");
	    click(eleddCaseParticipant);
	    
	    clickIcon(elecbCaseParticipant,elecbCaseParticipant);
	    
	    clickIcon(eleicncloseCaseParticipant,eleicncloseCaseParticipant);
	    
	    clearAndType(eletxtUserID,elelblUser,"AARUL");
	    
	    setFocus(eleddReason);
	    selectRandomDropdownValue(eleddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}

	

}
