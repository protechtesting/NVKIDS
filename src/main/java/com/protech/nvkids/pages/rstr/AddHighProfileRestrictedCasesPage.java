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
	@FindBy(xpath = "//span[text()='Add High Profile Restricted Cases']") WebElement elesfAddHighProfileRestrictedCases;
	@FindBy(xpath = "//label[text()='Case']") WebElement elelblCase;
	@FindBy(xpath = "//label[text()='Participant']") WebElement elelblParticipant;
	@FindBy(xpath = "//label[text()='Reason']") WebElement elelblReason;
	
	//Dropdown Red Highlight check
	@FindBy(xpath= "//label[text()='Case']/following::div[1]")WebElement eleddCase;
	@FindBy(xpath= "//label[text()='Participant']/following::div[1]")WebElement eleddParticipant;
	
	//Case and Particpant dropdown check
	@FindBy(xpath = "//span[@class='ui-multiselect-label ui-corner-all']") WebElement eleddCaseParticipant;
	
	
	//Enter or selection of fields
	@FindBy(id="caseId") WebElement elextxtCase;
	@FindBy(id="personId") WebElement eletxtParticipant;
	@FindBy(xpath = "//label[text()='Reason']/following::div[1]") WebElement eleddReason;
	
	//Multiselect checkbox for case/participant
	@FindBy(xpath = "//div[contains(@class,'ui-chkbox ui-widget ng-tns-c')]/div[2]")  WebElement elecbCaseParticipant;
	@FindBy(xpath = "//a[@class='ui-multiselect-close ui-corner-all']/span") WebElement eleicncloseCaseParticipant;
	
	
	public AddHighProfileRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(elesfAddHighProfileRestrictedCases,elesfAddHighProfileRestrictedCases);
		verifyDisplayed(elelblCase,elextxtCase);
		verifyRequiredField(elelblCase);
		verifyDisplayed(elelblParticipant,eletxtParticipant);
		verifyRequiredField(elelblParticipant);
		verifyDisplayed(elelblReason,eleddReason);
		verifyRequiredField(elelblReason);
		
		return this;
		
	}
	
	
	public AddHighProfileRestrictedCasesPage AddwithNullfields() throws Exception
	{

	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Participant","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(elextxtCase,eletxtParticipant,eleddReason);
	    return this;
	    
	}
	
	
	public AddHighProfileRestrictedCasesPage CheckCaseTab() throws Exception
	{

	    clearAndType(elextxtCase,elelblCase,"3200000001");
	    pressKey(elextxtCase,"Keys.TAB");
	    verifyExactText(eleddCaseParticipant,"Choose");
	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage CheckParticipantTab() throws Exception
	{

	    clearAndType(eletxtParticipant,elelblParticipant,"1000000001");
	    pressKey(eletxtParticipant,"Keys.TAB");
	    verifyExactText(eleddCaseParticipant,"Choose");
	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage AddwithCase() throws Exception
	{

	    clearAndType(elextxtCase,elelblCase,"3200000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Participant","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleddParticipant,eleddReason);
	    
	    return this;
	    
	}

	
	public AddHighProfileRestrictedCasesPage AddwithParticipant() throws Exception
	{

	    clearAndType(eletxtParticipant,elelblParticipant,"1000000001");
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyErrorsInPanel("Case","Enter Required Fields","Reason","Enter Required Fields");
	    verifyExactText(cloc.eleErrStatusBar, "One or More Error Occured. Update and Retry");
	    verifyBorderColor(eleddCase,eleddReason);
	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage AddwithMultiParticipant() throws Exception
	{

	    clearAndType(elextxtCase,elelblCase,"3200000002");
	    click(eleddCaseParticipant);
	    
	    clickIcon(elecbCaseParticipant,elecbCaseParticipant);
	    
	    setFocus(eleddReason);
	    selectRandomDropdownValue(eleddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    Thread.sleep(1500);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}
	
	public AddHighProfileRestrictedCasesPage AddwithMultiCase() throws Exception
	{

	    clearAndType(eletxtParticipant,elelblParticipant,"1000000001");
	    click(eleddCaseParticipant);
	    
	    clickIcon(elecbCaseParticipant,elecbCaseParticipant);
	    
	    clickIcon(eleicncloseCaseParticipant,eleicncloseCaseParticipant);
	    
	    setFocus(eleddReason);
	    selectRandomDropdownValue(eleddReason);
	    
	    clickIcon(cloc.eleicnSave, cloc.eleicnSave);
	    verifyExactText(cloc.eleErrStatusBar, "Saved Successfully.");

	    
	    return this;
	    
	}

	
	
}
