package com.protech.nvkids.testcases.bstl;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;


public class PrintQueueErrorsTestcase extends SeleniumBase{
	
	@Test(priority=1)
	public void TC16_verifyfieldspresent() throws Exception{
		
		
		testcaseDec = "verify the fields present in Print Queue error Screen";
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors();
		
		System.out.println(Errors);
		if(Errors>0)
		{
			Assert.fail("somme elements not present or Incorrect Element");
		}
		
	
	}
	
	
	public void VerifyCharAllowance_PositiveScenario() throws Exception
	{
			
		testcaseDec = "VerifyAlphaCharAllowanceFromDate";		
		report();	
			
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().verifyCharecterAllowancePositiveScenario();
	
	}
	

	public void VerifyCharAllowance_NegativeScenario() throws Exception
	{
			
		testcaseDec = "VerifyAlphaCharAllowanceFromDate";		
		report();	
			
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().verifyCharecterAllowanceNegativeScenario();
	
	}
	
	
	public void VerifyFieldsLength() throws Exception
	{
			
		testcaseDec = "VerifyFieldsLength";		
		report();	
			
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifyFieldLength();
	
	}
	
	
	@Test(priority=2)
	public void TC17_verifyNullProcessDate() throws Exception{
		
		
		testcaseDec = "verify the fields present in Batch Status Logs screen";
		
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifyError_NullProcessDate();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=3)
	public void TC18_verifyInvalidProcessDate() throws Exception{
		
		
		testcaseDec = "verify the fields with verifyInvalidToDate";
		
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifyInvalidProcessDate();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	
	
	@Test(priority=4)
	public void TC19_verifyValidation_VerifyFutureProcessDate() throws Exception{
		
		
		testcaseDec = "verify the NoMatchingRecords";
		
	
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifyFutureProcessdate();
		
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	
	@Test(priority=5)
	public void TC20_verifyInvalidCaseID() throws Exception{
		
		
		testcaseDec = "verify the fields with verifyInvalidToDate";
		
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifywithInvalidCaseID();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=6)
	public void TC21_verifyInvalidNoticeID() throws Exception{
		
		
		testcaseDec = "verify the fields with verifyInvalidNoticeID";
		
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifyInvalidNoticeID();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=7)
	public void TC22_verify_NoMatchingRecords() throws Exception{
		
		
		testcaseDec = "verify the fields with _NoMatchingRecords";
		
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifyNoMatchRecords();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=8)
	public void TC23_verify_VerifySuccessfulInquiry() throws Exception{
		
		
		testcaseDec = "verify_VerifySuccessfulInquiry";
		
		
		report();
		
		new LoginPage().login().Quicknavigation("BSTL").navigatetoPrintQueueErrors().VerifySucessfulInquiry();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	


}
