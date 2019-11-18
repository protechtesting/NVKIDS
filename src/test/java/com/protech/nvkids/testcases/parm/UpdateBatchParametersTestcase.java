package com.protech.nvkids.testcases.parm;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class UpdateBatchParametersTestcase extends SeleniumBase
{
	@Test(priority=1)
	public void editfieldsverify() throws Exception
	{
		
			testcaseDec = "Verify the fields in edit screen function";
		    report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().editfieldsverify();

	}
	
	@Test(priority=2)
	public void nullcommitfreq() throws Exception
	{
		
			testcaseDec = "Save the screen with null value in Commit Frequency field";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().nullcommitfreq();

	}
	
	@Test(priority=3)
	public void invalidcommitfreq() throws Exception
	{
		
			testcaseDec = "Save the screen with invalid value in Commit Frequency field";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().invalidcommitfreq();

	}
	
	@Test(priority=4)
	public void verifylength() throws Exception
	{
		
			testcaseDec = "Verifing the field length of Commit Frequency, Exception Threshold, Agency File Path, File Name fields";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().verifylength();

	}
	
	@Test(priority=5)
	public void nullexceptionthreshold() throws Exception
	{
		
			testcaseDec = "Save the screen with null value in Exception Threshold field";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().nullexceptionthreshold();

	}
	
	@Test(priority=6)
	public void invalidexceptionthreshold() throws Exception
	{
		
			testcaseDec = "Save the screen with invalid value in Exception Threshold field";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().invalidexceptionthreshold();

	}
	
	@Test(priority=7)
	public void updatearecord() throws Exception
	{
		
			testcaseDec = "Modify the screen with records";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().updatearecord();

	}
	
	@Test(priority=8)
	public void novaluechanges() throws Exception
	{
		
			testcaseDec = "Modify the screen with no records changed";
		report();
		
		new LoginPage().login().QuicknavigationToPARM("PARM").editpagenavigation().novaluechanges();

	}
	
}
