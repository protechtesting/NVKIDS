package com.protech.nvkids.testcases.bstl;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.protech.selenium.api.base.SeleniumBase;

import com.protech.nvkids.pages.bstl.BatchStatusLogsPage;
import com.protech.nvkids.pages.login.LoginPage;


public class BatchStatusLogsTestcase extends SeleniumBase 
{
	

	@Test(priority=1, description="Navigate to BSTL  - Batch Status Logs screen function and verify all the fields present")
	public void TC1_verifyfieldspresent() throws Exception
	{
	
		new LoginPage().login().quickNavigation_BSTL().verifyFieldsPresent();	
		

	}
	
	
	@Test(priority=2, description="Verify Alpha Charecter Allowance in the FromDate field")
	public void TC2_VerifyCharAllowance_PositiveScenario() throws Exception
	{
						
		new LoginPage().login().quickNavigation_BSTL().verifyCharecterAllowancePositiveScenario();
	
	}
	
	@Test(priority=3, description="Verify Alpha Charecter Allowance in the FromDate field")
	public void TC3_VerifyCharAllowance_NegativeScenario() throws Exception
	{
			
			
		new LoginPage().login().quickNavigation_BSTL().verifyCharecterAllowanceNegativeScenario();
	
	}
	
	@Test(priority=4, description="verify fields length")
	public void TC4_VerifyFieldsLength() throws Exception
	{
				
			
		new LoginPage().login().quickNavigation_BSTL().VerifyFieldLength();
	
	}
	
		
	@Test(priority=5, description="verify the fields present in Batch Status Logs screen")
	public void TC5_Inquirewith_nullFromDate() throws Exception
	{

		new LoginPage().login().quickNavigation_BSTL().verifyError_NullFromDate();
		
	}
	
	@Test(priority=6, description="verify the fields with verifyInvalidToDate")
	public void TC6_Inquirewith_InvalidFromDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyInvalidFromDate();
	
	}
	
	@Test(priority=7, description="verify the fields with verifyInvalidToDate")
	public void TC7_Inquirewith_InvalidToDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyInvalidToDate();
	
	}
	
	@Test(priority=8,description="verify the NoMatchingRecords")	
	public void TC8_InquireWith_FutureFromDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyFutureFromDate();
		
	}

	@Test(priority=9,description="InquireWith_FutureThroughDate")	
	public void TC9_InquireWith_FutureThroughDate() throws Exception
	{	
		new LoginPage().login().quickNavigation_BSTL().verifyFutureToDate();
	
	}

	@Test(priority=10,description="VerifyFuturetodate")
	public void TC10_verifyValidation_VerifygGreaterThroughDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyGreaterThroughDate();
		
	}
	
		
	@Test(priority=11,description="verify the fields with _NoMatchingRecords")
	public void TC11_verify_NoMatchingRecords() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyNoMatchRecords();
		
	}
	
	@Test(priority=12,description="verify the fields with _NoMatchingRecords")
	public void TC12_verify_SuccesfulInquiry() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifySuccesfulInquiry();
		
	}
	
	@Test(priority=12,description="verify copy paste allowance in From & To Date field")
	public void TC12_verify_CopyPasteAllowance() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().VerifyCopyPasteAllowance();
		
	}




}