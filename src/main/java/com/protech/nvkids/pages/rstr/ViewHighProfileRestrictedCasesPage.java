package com.protech.nvkids.pages.rstr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.protech.nvkids.pages.bstl.BatchStatusLogsPage;
import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewHighProfileRestrictedCasesPage extends SeleniumBase
{
	
	public ViewHighProfileRestrictedCasesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	CommonLocators cloc = new CommonLocators();
	//Screen functions
	@FindBy(xpath="//h5[text()='High Profile Restricted Cases']") WebElement elesfHighProfileRestrictedCases;
	
	
	//Filter Section
	@FindBy(xpath ="//label[text()='Case']") WebElement elelblCase;
	@FindBy(id="caseId") WebElement eletxtCaseID;
	@FindBy(xpath ="//label[text()='Participant']") WebElement elelblParticipant;
	@FindBy(id="personId") WebElement eletxtParticipantID;
	

	//edit double click
	@FindBy(xpath = "//tr[1]/td[1]/div/div") WebElement elegridrow;
	
	//Navigate to Familial Restricted Cases
	
	@FindBy(xpath = "//span[text()='Familial Restricted Cases']") WebElement elelinkFamilialRestrictedCase;

	public ViewHighProfileRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(elesfHighProfileRestrictedCases,elesfHighProfileRestrictedCases);
		verifyGridHeaders(" Case "," Participant "," Reason "," Status ");
		verifyAssociatedScreens("Note Processor");
		
		return this;
	}
	
	public ViewHighProfileRestrictedCasesPage InquirewithNull() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clear(eletxtCaseID);
		clear(eletxtParticipantID);

		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewHighProfileRestrictedCasesPage InquirewithInvalidCaseID() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtCaseID,elelblCase, "3123678901");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
		
	}
	
	public ViewHighProfileRestrictedCasesPage InquirewithInvalidParticipantID() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtParticipantID,elelblParticipant, "1000000022");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
		
	}
	
	public ViewHighProfileRestrictedCasesPage EnterMaxLengthCaseID() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		verifyFieldLength(eletxtCaseID, "3123678901", 10);
		
		return this;
		
	}
	
	public ViewHighProfileRestrictedCasesPage EnterMaxLengthParticipantID() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		verifyFieldLength(eletxtParticipantID, "1000000022", 10);
		
		return this;
		
	}
	
	
	public ViewHighProfileRestrictedCasesPage InquirewithNoMatchingCase() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtCaseID,elelblCase, "3200000001");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewHighProfileRestrictedCasesPage InquirewithNoMatchingParticipant() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtParticipantID,elelblParticipant, "1000000003");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewHighProfileRestrictedCasesPage InquirewithCase() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtCaseID,elelblCase, "3200000001");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewHighProfileRestrictedCasesPage InquirewithParticipant() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtParticipantID,elelblParticipant, "1000000002");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public AddHighProfileRestrictedCasesPage NavigatetoAddHighRSTR() throws Exception
	{
		clickIcon(cloc.eleicnAdd,cloc.eleicnAdd);
		return new AddHighProfileRestrictedCasesPage();
	}
	
	public EditHighProfileRestrictedCasesPage NavigatetoEditHighRSTR() throws Exception
	{
		doDoubleClick(elegridrow);
		return new EditHighProfileRestrictedCasesPage();
	}
	
	public ViewFamilialRestrictedCasesPage NavigatetoFamilialScreenFunction() throws Exception
	{
		clickIcon(elelinkFamilialRestrictedCase,elelinkFamilialRestrictedCase);
		return new ViewFamilialRestrictedCasesPage();
	}
	
	
}

