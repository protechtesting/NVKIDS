package com.protech.nvkids.testcases.refm;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class EditReferenceCodesTestcase extends SeleniumBase
{
	@Test(priority=28,description="Navigate to Edit Reference Codes screen function")
	public void navigateToViewReferenceCodes() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes();
	}
	
	@Test(priority=29,description="Verify the fields in Edit Reference Codes")
	public void verifyEditReferenceCodesFields() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes().verifyEditReferenceCodeFields();
	}
	
	@Test(priority=30,description="Verify the Maximum Length of Code Description Field")
	public void verifyMaxLengthOfCodeDescription() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes().verifyMaxLengthOfCodeDescription();
	}
	
	@Test(priority=31,description="Verify Edit with Existing Code Description")
	public void verifyEditWithExistingCodeDescription() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes().verifyEditWithExistingCodeDescription();
	}
	
	@Test(priority=32,description="Verify Edit with Null Code Description")
	public void verifyEditWithNullCodeDescription() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes().verifyEditWithNullCodeDescription();
	}
	
	@Test(priority=33,description="Verify Edit with No Changes")
	public void verifyEditWithNoChanges() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes().verifyEditWithNoChanges();
	}
	
	@Test(priority=34,description="Verify Edit with Valid Values")
	public void verifyEditWithValidValues() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoEditReferenceCodes().verifyEditWithValidValues();
	}
}
