package com.protech.nvkids.testcases.bstl;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;



public class BatchErrorsTestcase extends SeleniumBase 
{
	
	@Test(testName="TC14_Navigate and Verify Fields",priority=14,description="Navigate to Batch Errors screen and verify the fields present")
	public void verifyfieldspresent() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyFieldsPresent();
	}
	
	@Test(testName="TC15_Verify alpha char allowance",priority=15,description="Verify Alphachar allowed in From Date Field")
	public void verifyCharAllowance_PositiveScenario() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyCharacterAllowancePositiveScenario();
	}
	
	@Test(testName="TC16_Verify alpha char not allowed",priority=16,description="Verify Alphachar not allowed in From Date Field")
	public void verifyCharAllowance_NegativeScenario() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyCharacterAllowanceNegativeScenario();
	}
	
    @Test(testName="TC17_Verify Field Lengths",priority=17,description="Verify Field length")
	public void verifyFieldsLength() throws Exception
	{
    	new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyFieldLength();
	}
	
	@Test(testName="TC18_Inquire With No Process Date",priority=18,description="Inquire With No Process Date")
	public void verifyNullProcessDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().inquireWithNoProcessDate();
	}
	
	@Test(testName="TC19_Inquire With Invalid Process Date",priority=19,description="Inquire With Invalid Process Date")
	public void verifyInvalidProcessDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyInvalidProcessDate();
	}
	
	
	@Test(testName="TC20_Inquire With Future Process Date",priority=20,description="Inquire With Future Date in Process Date Field")
	public void InquireWithFutureProcessDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyFutureProcessDate();
	}
	
	@Test(testName="TC21_Inquire With Date having no data",priority=21,description="Verify No Matching Records Found Message")
	public void verifyNoMatchingRecords() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyNoMatchRecords();
	}
	
	@Test(testName="TC22_Perform Successful Inquiry",priority=22,description="Verify Successful inquiry is done")
	public void verifySuccessfulInquiry() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifySuccessfulInquiry();
	}
	
	@Test(testName="TC22_Verify Copy Paste allowed",priority=23,description="Verify copy paste allowance in Process Date field")
	public void verifyCopyPasteAllowance() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyCopyPasteAllowance();
	}
	
}


