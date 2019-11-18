package com.protech.nvkids.testcases.rstr;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class ViewHighProfileRestrictedCasesTestCase extends SeleniumBase

{
	
	@Test(priority=1,description="Navigate to View High Profile Restricted Cases screen function")
	public void navigateToViewHighProfileRestrictedCases() throws Exception 
	{
			new LoginPage().login().quickNavigation_RSTR().verifyFieldsPresent();
	}
	
	@Test(priority=2,description="Inquire with null values in CASE and PARTICIPANT fields present in the Select Filters")
	public void InquirewithNull() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithNull();
	}
	
	@Test(priority=3,description="Inquire with Invalid Case ID")
	public void InquirewithInvalidCaseID() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithInvalidCaseID();
	}
	@Test(priority=4,description="Inquire with Invalid Participant ID")
	public void InquirewithInvalidParticipantID() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithInvalidParticipantID();
	}
	
	@Test(priority=5,description="Enter with Max Length in Case ID")
	public void EnterMaxLengthCaseID() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().EnterMaxLengthCaseID();
	}
	
	@Test(priority=6,description="Enter with Max Length in Participant ID")
	
	public void EnterMaxLengthParticipantID() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().EnterMaxLengthParticipantID();
	}
	
	
	@Test(priority=7,description="Inquire with values in CASE field present in the Select Filters. - Without Records")
	public void InquirewithNoMatchingCase() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithNoMatchingCase();
	}
	
	@Test(priority=8,description="Inquire with values in PARTICIPANT field present in the Select Filters. - Without Records")
	public void InquirewithNoMatchingParticipant() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithNoMatchingParticipant();
	}
	
	@Test(priority=9,description="Inquire with values in CASE field present in the Select Filters. - With Records")
	public void InquirewithCase() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithCase();
	}
	
	@Test(priority=10,description="Inquire with values in PARTICIPANT field present in the Select Filters. - With Records")
	public void InquirewithParticipant() throws Exception 
	{
		new LoginPage().login().quickNavigation_RSTR().InquirewithParticipant();
	}
	

}
