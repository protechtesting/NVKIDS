package com.protech.nvkids.testcases.bstl;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;


public class PrintQueueErrorsTestcase extends SeleniumBase{
	
	@Test(priority=1)
	public void verifyfieldspresent() throws Exception{
		
		
		testcaseDec = "verify the fields present in Print Queue error Screen";
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors();
		
		System.out.println(Errors);
		if(Errors>0)
		{
			Assert.fail("somme elements not present or Incorrect Element");
		}
		
	
	}
	
	
	
	@Test(priority=2)
	public void verifyNullProcessDate() throws Exception{
		
		
		testcaseDec = "verify the fields present in Batch Status Logs screen";
		
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifyError_NullProcessDate();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=3)
	public void verifyInvalidProcessDate() throws Exception{
		
		
		testcaseDec = "verify the fields with verifyInvalidToDate";
		
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifyInvalidProcessDate();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	
	
	@Test(priority=5)
	public void verifyValidation_VerifyFutureProcessDate() throws Exception{
		
		
		testcaseDec = "verify the NoMatchingRecords";
		
	
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifyFutureProcessdate();
		
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	
	@Test(priority=3)
	public void verifyInvalidCaseID() throws Exception{
		
		
		testcaseDec = "verify the fields with verifyInvalidToDate";
		
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifywithInvalidCaseID();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=3)
	public void verifyInvalidNoticeID() throws Exception{
		
		
		testcaseDec = "verify the fields with verifyInvalidNoticeID";
		
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifyInvalidNoticeID();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=4)
	public void verify_NoMatchingRecords() throws Exception{
		
		
		testcaseDec = "verify the fields with _NoMatchingRecords";
		
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifyNoMatchRecords();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	
	@Test(priority=4)
	public void verify_VerifySuccessfulInquiry() throws Exception{
		
		
		testcaseDec = "verify the fields with _NoMatchingRecords";
		
		
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoPrintQueueErrors().VerifySucessfulInquiry();
		
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	


}
