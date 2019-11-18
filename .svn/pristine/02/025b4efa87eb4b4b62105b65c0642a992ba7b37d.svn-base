package com.protech.nvkids.testcases.bstl;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;



public class BatchErrorsTestcase extends SeleniumBase 
{
	
	@Test(priority=1)
	public void verifyfieldspresent() throws Exception
	{
		
			testcaseDec = "verify the fields present in Batch Errors screen";
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoBatchErrors().verifyFieldsPresent();
			//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=2)
	public void verifyNullProcessDate() throws Exception
	{
		
		testcaseDec = "verify the fields present in Batch Status Logs screen";
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoBatchErrors().verifyError_NullProcessDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	@Test(priority=3)
	public void verifyInvalidProcessDate() throws Exception
	{
	
		testcaseDec = "verify the fields with verifyInvalidToDate";
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoBatchErrors().verifyInvalidProcessDate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=4)
	public void verifyValidation_VerifyFutureProcessDate() throws Exception
	{
		
		testcaseDec = "verifyValidation_VerifyFutureProcessDate";
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoBatchErrors().verifyFutureProcessdate();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=5)
	public void verify_NoMatchingRecords() throws Exception
	{

		testcaseDec = "verify the fields with _NoMatchingRecords";
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoBatchErrors().verifyNoMatchRecords();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	
	
	@Test(priority=6)
	public void verify_SuccessfulInquiry() throws Exception
	{
		
		testcaseDec = "verify whether the successful inquiry was happended";
		report();
		
		new LoginPage().login().navigatetoBSTL().navigatetoBatchErrors().verifySuccessfulInquiry();
		//new BatchStatusLogs_page().VerifyFieldspresent();
	}
	

}


