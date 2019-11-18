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
		//log.info(testcaseName);		
		
		new LoginPage().login().Quicknavigation("BSTL").verifyFieldsPresent();	
		
		// all accordions opens on single click
	}
	
	
	
	public void VerifyCharAllowance_PositiveScenario() throws Exception
	{
			
		testcaseDec = "VerifyAlphaCharAllowanceFromDate";		
			
			
		new LoginPage().login().Quicknavigation("BSTL").verifyCharecterAllowancePositiveScenario();
	
	}
	
	
	public void VerifyCharAllowance_NegativeScenario() throws Exception
	{
			
		testcaseDec = "VerifyAlphaCharAllowanceFromDate";		
			
			
		new LoginPage().login().Quicknavigation("BSTL").verifyCharecterAllowanceNegativeScenario();
	
	}
	
	
	public void VerifyFieldsLength() throws Exception
	{
			
		testcaseDec = "VerifyFieldsLength";		
			
			
		new LoginPage().login().Quicknavigation("BSTL").VerifyFieldLength();
	
	}
	
		
	

	@Test(priority=2, description="verify the fields present in Batch Status Logs screen")
	public void TC2_Inquirewith_nullFromDate() throws Exception
	{

		new LoginPage().login().Quicknavigation("BSTL").verifyError_NullFromDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=3, description="verify the fields with verifyInvalidToDate")
	public void TC3_Inquirewith_InvalidFromDate() throws Exception
	{
		new LoginPage().login().Quicknavigation("BSTL").verifyInvalidFromDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=4, description="verify the fields with verifyInvalidToDate")
	public void TC4_Inquirewith_InvalidToDate() throws Exception
	{
		new LoginPage().login().Quicknavigation("BSTL").verifyInvalidToDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=5,description="verify the NoMatchingRecords")	
	public void TC5_InquireWith_FutureFromDate() throws Exception
	{
		new LoginPage().login().Quicknavigation("BSTL").verifyFutureFromDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}

	@Test(priority=6,description="InquireWith_FutureThroughDate")	
	public void TC6_InquireWith_FutureThroughDate() throws Exception
	{	
		new LoginPage().login().Quicknavigation("BSTL").verifyFutureToDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}

	@Test(priority=7,description="VerifyFuturetodate")
	public void TC7_verifyValidation_VerifygGreaterThroughDate() throws Exception
	{
		new LoginPage().login().Quicknavigation("BSTL").verifyGreaterThroughDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=8,description="verify the fields with _NoMatchingRecords")
	public void TC8_verify_NoMatchingRecords() throws Exception
	{
		new LoginPage().login().Quicknavigation("BSTL").verifyNoMatchRecords();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=9,description="verify the fields with _NoMatchingRecords")
	public void TC9_verify_SuccesfulInquiry() throws Exception
	{
		new LoginPage().login().Quicknavigation("BSTL").verifySuccesfulInquiry();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}




}