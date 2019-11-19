package com.protech.nvkids.testcases.ptre;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Rotatable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;


import utils.CommonLocators;

public class ViewProcessDetails extends SeleniumBase 

{   

	CommonLocators  cloc = new CommonLocators();

	//@Test(priority=1,description="NavigateToViewProcessDetails and Verify the fields in View Process Details screen")
	public void VerifyScreenFields() throws Exception
	{
		new LoginPage().login().quickNavigation_PTRE().VerifyScreenFields();

	}



	//@Test(priority=2,description = "Navigate to the PTRE screen while on the PTRE screenn")
	public void RenavigationtoPTRE() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().RenavigationtoPTRE();

	}

	//@Test(priority=3,description="Undock Filter Section and verify fields")
	public void VerifySelectFilters() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().VerifySelectFilters();
	}
	//@Test(priority=4,description="Verify field size allowance in PROCESS LOV field")
	public void VerifySizeAllowanceinProcessID() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().VerifySizeAllowanceinProcessID();

	}

	//@Test(priority=5,description="Verify alpha characters allowance in PROCESS LOV field")
	public void VerifyAlphaCharAllowanceinProcessID() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().VerifyAlphaCharAllowanceinProcessID();
	}


	//@Test(priority=6,description="Verify numeric characters allowance in PROCESS LOV field")
	public void VerifyNumericCharAllowanceinProcessID() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().VerifyNumericCharAllowanceinProcessID();
	}

	//@Test(priority=7,description="Verify Special characters allowance in PROCESS LOV field")
	public void VerifySpecialCharAllowanceinProcessID() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().VerifySpecialCharAllowanceinProcessID();
	}

	//@Test(priority=8,description="Inquire with InvalidValue in PROCESS ID field")
	public void InquireInvalidValueinProcessID() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().InquireInvalidValueinProcessID();

	}


	//@Test(priority=9,description="Inquire with InvalidValue in PROCESS Description field")
	public void InquireInvalidValueinProcessDescription() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().InquireInvalidValueinProcessDescription();

	}


	//@Test(priority=10,description="VerifyClearIcon in SelectFilters")
	public void VerifyClearValueinFilter() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().VerifyClearValueinFilter();

	}

	//@Test(priority=10,description="Inquiry with records. in SelectFilters")
	public void InquireValidValue() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().InquireValidValue();

	}

	//@Test(priority=11,description="Inquiry with records. in SelectFilters")
	public void InquirewithNoValue() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().InquirewithNoValue();
	}

	@Test(priority=12,description="Verify Grid Options")
	public void VerifyGridOptions() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().VerifyGridOptionsValues();
	}

































}