package com.protech.nvkids.testcases.refm;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class AddReferenceCodesTestcase extends SeleniumBase
{
	@Test(priority=14,description="Navigate to Add Reference Codes screen function")
	public void navigateToAddReferenceCodes() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes();
	}
	
	@Test(priority=15,description="Verify the fields present in Add Reference Codes screen function")
	public void verifyAddReferenceCodesFields() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddReferenceCodesFields();
	}
	
	@Test(priority=16,description="Verify the maximum length of reference entity field")
	public void verifyMaxLengthofReferenceEntity() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyMaxlengthofReferenceEntity();
	}
	
	@Test(priority=17,description="Verify the maximum length of reference attribute field")
	public void verifyMaxLengthofReferenceAttribute() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyMaxlengthofReferenceAttribute();
	}
	
	@Test(priority=18,description="Verify the maximum length of Code field")
	public void verifyMaxLengthofCode() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyMaxlengthofCode();
	}
	
	@Test(priority=19,description="Verify the maximum length of Code description field")
	public void verifyMaxLengthofCodeDescription() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyMaxlengthofCodeDescription();
	}
	
	@Test(priority=20,description="Verify the Code field with invalid length")
	public void verifyCodeWithInvalidLength() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyInvalidCodeLength();
	}
	
	@Test(priority=21,description="Verify Add mode with Null values")
	public void verifyAddWithNullValues() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithNullValues();
	}
	
	@Test(priority=21,description="Verify Add mode with Null value in Reference Entity")
	public void verifyWithNullReferenceEntity() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithNullReferenceEntity();
	}
	
	@Test(priority=22,description="Verify Add mode with Null value in Reference Attribute")
	public void verifyWithNullReferenceAttribute() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithNullReferenceAttribute();
	}
	
	@Test(priority=23,description="Verify Add mode with Null value in Code")
	public void verifyWithNullCode() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithNullCode();
	}
	
	@Test(priority=24,description="Verify Add mode with Null value in Code Description")
	public void verifyWithNullCodeDescription() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithNullCodeDescription();
	}
	
	@Test(priority=25,description="Verify Add mode with Invalid value in Reference Entity and Reference Attribute")
	public void verifyWithInvalidValueinReferenceEntityAndAttribute() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithInvalidReferenceEntityAndAttribute();
	}
	
	@Test(priority=26,description="Verify Add mode with Existing Code")
	public void verifyAddWithExistingCode() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithExistingCode();
	}
	
	@Test(priority=27,description="Verify Add mode with Existing Code Description")
	public void verifyAddWithExistingCodeDescription() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifyAddWithExistingCodeDescription();
	}
	
	@Test(priority=28,description="Verify Successful Add")
	public void verifySuccessfulAdd() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoAddReferenceCodes().verifySuccessfulAdd();
	}
	
}
