package com.protech.nvkids.pages.rstr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewFamilialRestrictedCasesPage extends SeleniumBase
{
	
	public ViewFamilialRestrictedCasesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	CommonLocators cloc = new CommonLocators();
	//Screen functions
	@FindBy(xpath="//div[text()=' Familial Restricted Cases ']") WebElement elesfFamilialRestrictedCases;
	
	//Filter Section
	@FindBy(xpath ="//label[text()='Case']") WebElement elelblCase;
	@FindBy(id="caseId") WebElement eletxtCaseID;
	@FindBy(xpath ="//label[text()='Participant']") WebElement elelblParticipant;
	@FindBy(id="personId") WebElement eletxtParticipantID;
	@FindBy(xpath ="//label[text()='User']") WebElement elelblUser;
	@FindBy(id="userName") WebElement eletxtUser;
	
	//edit double click
	@FindBy(xpath = "//tr[1]/td[1]/div/div") WebElement elegridrow;
	


	public ViewFamilialRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(elesfFamilialRestrictedCases,elesfFamilialRestrictedCases);
		verifyGridHeaders(" Case "," Participant "," User "," Reason "," Status ");
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNull() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clear(eletxtCaseID);
		clear(eletxtParticipantID);
		clear(eletxtUser);

		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNoMatchingCase() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtCaseID,elelblCase, "3200000002");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNoMatchingParticipant() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtParticipantID,elelblParticipant, "1000000005");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNoMatchingUser() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtUser,elelblUser, "BATCH");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithCase() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtCaseID,elelblCase, "3200000001");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithParticipant() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtParticipantID,elelblParticipant, "1000000002");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithUser() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtUser,elelblUser, "VJAGADEESAN");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	
	
	public AddFamilialRestrictedCasesPage NavigatetoAddFamilialRSTR() throws Exception
	{
		clickIcon(cloc.eleicnAdd,cloc.eleicnAdd);
		return new AddFamilialRestrictedCasesPage();
	}
	
	public EditFamilialRestrictedCasesPage NavigatetoEditFamilialRSTR() throws Exception
	{
		doDoubleClick(elegridrow);
		return new EditFamilialRestrictedCasesPage();
	}
	

}
