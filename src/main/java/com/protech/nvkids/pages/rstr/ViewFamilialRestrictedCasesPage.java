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
	@FindBy(xpath="//div[text()=' Familial Restricted Cases ']") WebElement eleFamilialRestrictedCasesScreenFunction;
	
	//Filter Section
	@FindBy(xpath ="//label[text()='Case']") WebElement elelblCaseID;
	@FindBy(id="caseId") WebElement eleFilterCaseID;
	@FindBy(xpath ="//label[text()='Participant']") WebElement elelblParticipantID;
	@FindBy(id="personId") WebElement eleFilterParticipantID;
	@FindBy(xpath ="//label[text()='User']") WebElement elelblUser;
	@FindBy(id="userName") WebElement eleFilterUser;
	
	//AddScreenFunction
	@FindBy(xpath = "//span[text()='Add']") WebElement EleAddicon;
	
	
	//edit double click
	@FindBy(xpath = "//tr[1]/td[1]/div/div") WebElement elegridrow;
	
	//Navigate to Familial Restricted Cases
	
	@FindBy(xpath = "//span[text()='Familial Restricted Cases']") WebElement NavigatetoFamilialSF;

	public ViewFamilialRestrictedCasesPage verifyFieldsPresent() throws Exception
	{

		verifyDisplayed(eleFamilialRestrictedCasesScreenFunction,eleFamilialRestrictedCasesScreenFunction);
		verifyGridHeaders(" Case "," Participant "," User "," Reason "," Status ");
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNull() throws Exception
	{
		
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clear(eleFilterCaseID);
		clear(eleFilterParticipantID);
		clear(eleFilterUser);

		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNoMatchingCase() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eleFilterCaseID,elelblCaseID, "3200000002");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNoMatchingParticipant() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eleFilterParticipantID,elelblParticipantID, "1000000005");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithNoMatchingUser() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eleFilterUser,elelblUser, "BATCH");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleErrStatusBar, "No Matching Records Found");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithCase() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eleFilterCaseID,elelblCaseID, "3200000001");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithParticipant() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eleFilterParticipantID,elelblParticipantID, "1000000002");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	public ViewFamilialRestrictedCasesPage InquirewithUser() throws Exception
	{

        
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eleFilterUser,elelblUser, "VJAGADEESAN");
		
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyPartialText(cloc.eleStatusBar, "Done");
		
		return this;
	}
	
	
	
	public AddFamilialRestrictedCasesPage NavigatetoAddFamilialRSTR() throws Exception
	{
		clickIcon(EleAddicon,EleAddicon);
		return new AddFamilialRestrictedCasesPage();
	}
	
	public EditFamilialRestrictedCasesPage NavigatetoEditFamilialRSTR() throws Exception
	{
		doDoubleClick(elegridrow);
		return new EditFamilialRestrictedCasesPage();
	}
	

}