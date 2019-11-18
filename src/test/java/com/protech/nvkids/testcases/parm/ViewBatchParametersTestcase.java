package com.protech.nvkids.testcases.parm;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class ViewBatchParametersTestcase extends SeleniumBase

{

	@Test(priority=1)
	public void verifyfieldspresent() throws Exception
	{
		
			testcaseDec = "verify the fields present in PARM screen";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").verifyFieldsPresent();
	}
	
	@Test(priority=2)
	public void inquireinvalidjobid() throws Exception
	{
		
			testcaseDec = "Inquire the screen with invalid Job ID";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").inquirewithInvalidValidJobId();

	}
	
	@Test(priority=3)
	public void inquirewithValidJobId() throws Exception
	{
		
			testcaseDec = "Inquire the screen with valid Job ID";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").inquirewithValidJobId();

	}
	
	@Test(priority=4)
	public void verifyJobIdlength() throws Exception
	{
		
			testcaseDec = "Verify the field length on Job ID field";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").verifyJobIdlength();

	}
	
	@Test(priority=5)
	public void expandaccordion() throws Exception
	{
		
			testcaseDec = "Expanding the grid";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").expandaccordion();

	}
	
	@Test(priority=6)
	public void collapseccordion() throws Exception
	{
		
			testcaseDec = "Collapsing the grid";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").collapseccordion();

	}
	
	@Test(priority=7)
	public void editpagenavigation() throws Exception
	{
		
			testcaseDec = "7a.Navigating to edit screen function";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation();

	}
	
	
}
