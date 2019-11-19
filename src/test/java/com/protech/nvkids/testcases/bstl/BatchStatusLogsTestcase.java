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
	

	//@Test(testName="TC1_Navigate and Verify Fields",priority=1, description="Navigate to BSTL  - Batch Status Logs screen function and verify all the fields present")
	public void verifyfieldspresent() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyFieldsPresent();	
	}
		 
	@Test(testName="TC2_Verify alpha char allowance",priority=2, description="Verify Alpha Character is Allowed in the From Date field")
	public void verifyCharAllowance_PositiveScenario() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyCharacterAllowancePositiveScenario();
	}
	
	//@Test(testName="TC3_Verify alpha char not allowed",priority=3, description="Verify Alpha Character is not Allowed in the From Date field")
	public void verifyCharAllowance_NegativeScenario() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyCharacterAllowanceNegativeScenario();
	}
	
	//@Test(testName="TC4_Verify Field Lengths",priority=4, description="Verify all fields length")
	public void verifyFieldsLength() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyFieldLength();
	}
	
		
	//@Test(testName="TC5_Inquire With No From Date",priority=5, description="Inquire With Null From Date")
	public void inquirewithNullFromDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyError_NullFromDate();
	}
	
	//@Test(testName="TC6_Inquire With Invalid From Date",priority=6, description="Inquire With Invalid From Date")
	public void inquirewithInvalidFromDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyInvalidFromDate();
	}
	
	//@Test(testName="TC7_Inquire With Invalid Through Date",priority=7, description="Inquire With Invalid Through Date")
	public void inquirewithInvalidToDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyInvalidThroughDate();
	}
	
	//@Test(testName="TC8_Inquire With Future From Date",priority=8,description="Inquire With From Date in future date")	
	public void inquireWithFutureFromDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyFutureFromDate();
	}

	//@Test(testName="TC9_Inquire With Future Through Date",priority=9,description="Inquire With ThroughDate in Future")	
	public void inquireWithFutureThroughDate() throws Exception
	{	
		new LoginPage().login().quickNavigation_BSTL().verifyFutureToDate();
	}

	//@Test(testName="TC10_Inquire With Earlier Through Date",priority=10,description="Inquire With Through Date less than From Date")
	public void verifyEarlierThroughDate() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyEarlierThroughDate();
	}
	
		
	//@Test(testName="TC11_Verify No Matching Records Message",priority=11,description="Verify No Matching Records message")
	public void verifyNoMatchingRecords() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifyNoMatchRecords();
	}
	
	@Test(testName="TC12_Verify Successful Inquiry",priority=12,description="Verify Successful Inquiry")
	public void verifySuccesfulInquiry() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().verifySuccesfulInquiry();
	}
	
	//@Test(testName="TC13_Verify Copy Paste Allowance",priority=13,description="Verify copy paste allowance in From Date & Through Date fields")
	public void verify_CopyPasteAllowance() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().VerifyCopyPasteAllowance();
	}

}
