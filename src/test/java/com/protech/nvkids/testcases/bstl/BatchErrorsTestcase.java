package com.protech.nvkids.testcases.bstl;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;



public class BatchErrorsTestcase extends SeleniumBase 
{
	
	@Test(priority=13,description="verify the fields present in Batch Errors screen")
	public void TC13_verifyfieldspresent() throws Exception
	{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyFieldsPresent();
		
	}
	
	
	@Test(priority=14,description="VerifyAlphaCharAllowanceFromDate")
	public void TC14_VerifyCharAllowance_PositiveScenario() throws Exception
	{
			
	
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyCharecterAllowancePositiveScenario();
	
	}
	
	@Test(priority=15,description="VerifyAlphaCharAllowanceFromDate")
	public void TC15_VerifyCharAllowance_NegativeScenario() throws Exception
	{
			
	
			
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyCharecterAllowanceNegativeScenario();
	
	}
	
   @Test(priority=16,description="VerifyFieldslength")
	public void TC16_VerifyFieldsLength() throws Exception
	{
			
	
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().VerifyFieldLength();
	
	}
	
	
	@Test(priority=17,description="verify the fnull process date")
	public void TC17_verifyNullProcessDate() throws Exception
	{
		
			
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyError_NullProcessDate();
		
	}
	
	@Test(priority=18,description="verify the fields with verifyInvalidToDate")
	public void TC18_verifyInvalidProcessDate() throws Exception
	{
	
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyInvalidProcessDate();
	
	}
	
	
	@Test(priority=19,description="verifyValidation_VerifyFutureProcessDate")
	public void TC19_verifyValidation_VerifyFutureProcessDate() throws Exception
	{
		
	
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyFutureProcessdate();
	
	}
	
	
	@Test(priority=20,description="verify the fields with _NoMatchingRecords")
	public void TC20_verify_NoMatchingRecords() throws Exception
	{

		
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifyNoMatchRecords();
	
	}
	
	
	@Test(priority=21,description="verify whether the successful inquiry was happended")
	public void TC21_verify_SuccessfulInquiry() throws Exception
	{
		
		
		
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().verifySuccessfulInquiry();
	
	}
	
	@Test(priority=21,description="verify copy paste allowance in Process Date field")
	public void TC21_verify_CopyPasteAllowance() throws Exception
	{
		new LoginPage().login().quickNavigation_BSTL().navigatetoBatchErrors().VerifyCopyPasteAllowance();
		
	}
	

}


