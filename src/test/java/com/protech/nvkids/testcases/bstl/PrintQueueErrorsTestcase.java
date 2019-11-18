package com.protech.nvkids.testcases.bstl;


import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;


public class PrintQueueErrorsTestcase extends SeleniumBase{
	
	@Test(priority=22, description="verify the fields present in Print Queue error Screen")
	public void TC22_verifyfieldspresent() throws Exception{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors();
		
	
	
	}
	
	
	@Test(priority=23, description="Verify Alpha Charecter Allowance in the ProcessDate field")
	public void TC23_VerifyCharAllowance_PositiveScenario() throws Exception
	{
			
	
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().verifyCharecterAllowancePositiveScenario();
	
	}
	
	@Test(priority=24, description="Verify Alpha Charecter Allowance in the ProcessDate field")
	public void TC24_VerifyCharAllowance_NegativeScenario() throws Exception
	{
			
	
			
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().verifyCharecterAllowanceNegativeScenario();
	
	}
	
	@Test(priority=25, description="Verify field length allowance")
	public void TC25_VerifyFieldsLength() throws Exception
	{
	
			
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyFieldLength();
	
	}
	
	
	@Test(priority=26, description="verify the fields present in Batch Status Logs screen")
	public void TC26_verifyNullProcessDate() throws Exception{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyError_NullProcessDate();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=27,description="verify the fields with verifyInvalidToDate")
	public void TC27_verifyInvalidProcessDate() throws Exception{
		
	
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyInvalidProcessDate();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	
	
	@Test(priority=28,description="verify the NoMatchingRecords")
	public void TC28_verifyValidation_VerifyFutureProcessDate() throws Exception{
		
	
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyFutureProcessdate();
		
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	
	@Test(priority=29,description="verify the fields with verifyInvalidToDate")
	public void TC29_verifyInvalidCaseID() throws Exception{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifywithInvalidCaseID();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=30,description="verify the fields with verifyInvalidNoticeID")
	public void TC30_verifyInvalidNoticeID() throws Exception{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyInvalidNoticeID();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=31,description="verify the fields with _NoMatchingRecords")
	public void TC31_verify_NoMatchingRecords() throws Exception{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyNoMatchRecords();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=32,description="verify_VerifySuccessfulInquiry")
	public void TC32_verify_VerifySuccessfulInquiry() throws Exception{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifySucessfulInquiry();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=32,description="verify copy paste allowance in Process Date, Case Id, Notice ID fields")
	public void TC32_verify_CopyPasteAllowance() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoPrintQueueErrors().VerifyCopyPasteAllowance();
		
	}
	
	


}
