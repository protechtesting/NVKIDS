package com.protech.nvkids.testcases.ptre;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.nvkids.pages.ptre.EditProcessDetails;
import com.protech.nvkids.pages.ptre.ViewProcessDetails;
import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewTaskDetails extends SeleniumBase{

	CommonLocators  cloc = new CommonLocators();

	@Test(priority=1,description="NavigateToViewProcessDetails and Verify the fields in View Task Details screen")
	public void VerifyScreenFields() throws Exception
	{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyScreenFields();
	}

	@Test(priority=2,description="Undock Filter Section and verify fields")
	public void VerifySelectFilters() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifySelectFilters();
	}
	@Test(priority=3,description="Verify field size allowance in TASK LOV field")
	public void VerifySizeAllowanceinTask() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifySizeAllowanceinTask();

	}

	@Test(priority=4,description="Verify alpha characters allowance in TASK LOV field")
	public void VerifyAlphaCharAllowanceinTask() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyAlphaCharAllowanceinTask();
	}


	@Test(priority=5,description="Verify numeric characters allowance in TASK LOV field")
	public void VerifyNumericCharAllowanceinTask() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyNumericCharAllowanceinTask();
	}

	@Test(priority=6,description="Verify Special characters allowance in TASK LOV field")
	public void VerifySpecialCharAllowanceinTask() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifySpecialCharAllowanceinTask();
	}

	@Test(priority=7,description="Inquire with InvalidValue in TASK ID field")
	public void InquireInvalidValueinTask() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().InquireInvalidValueinTask();

	}
	@Test(priority=8,description="Inquire with InvalidValue in TASK Description field")
	public void InquireInvalidValueinProcessDescription() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().InquireInvalidValueinProcessDescription();

	}

	@Test(priority=9,description="VerifyClearIcon in SelectFilters")
	public void VerifyClearValueinFilter() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyClearValueinFilter();

	}
	@Test(priority=10,description="Verify ShowColumns")
	public void VerifyGridOptionsValues() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyGridOptionsValues();
	}

	@Test(priority=11,description="VerifyClearIcon in SelectFilters")
	public void InquireValidValue() throws Exception{
		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().InquireValidValue();


	}

	@Test(priority=12,description="Expanding the grid and verify")
	public void VerifyInnderGridValues() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyInnderGridValues();

	}

	@Test(priority=13,description="Collapse the grid and verify")
	public void VerifyCollapseGrid() throws Exception{

		new LoginPage().login().quickNavigation_PTRE().navigateToViewTaskDetails().VerifyCollapseGrid();


	}









}
