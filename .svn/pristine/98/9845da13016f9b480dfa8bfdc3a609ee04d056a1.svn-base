package com.protech.nvkids.testcases.rstr;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class AddHighProfileRestrictedCasesTestCase extends SeleniumBase
{
	//@Test(priority=7,description="Navigate to Add High Profile Restricted Cases screen function")
	
	public void navigateToAddHighProfileRestrictedCases() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().verifyFieldsPresent();
	}
	
    @Test(priority=8,description="Add without entering the required fields")
	
	public void Addwithnullfields() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().AddwithNullfields();
	}
    //@Test(priority=9,description="Check Case field")
	
	public void CheckParticipantTab() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().CheckParticipantTab();
	}
    //@Test(priority=10,description="Check Participant field")
	
	public void CheckCaseTab() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().CheckCaseTab();
	}
	//@Test(priority=11,description="Add with value in the CASE field")
	
	public void AddwithCase() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().AddwithCase();
			
	}
	
	//@Test(priority=12,description="Add with value in the PARTICIPANT field")
	
	public void AddwithParticipant() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().AddwithParticipant();
		
		
	}
    @Test(priority=13,description="Add with CASE and Multiple PARTICIPANT's")
	
	public void AddwithMultiParticipant() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().AddwithMultiParticipant();
		
		
	}
	
  @Test(priority=14,description="Add with PARTICIPANT and Multiple CASE's")

   public void AddwithMultiCase() throws Exception 
   {
	new LoginPage().login().quickNavigation_RSTR().NavigatetoAddHighRSTR().AddwithMultiCase();
    }

	    
    
    
    
}
