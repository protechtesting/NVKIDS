package com.protech.nvkids.testcases.refm;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class AddReferencePercentagesTestcase extends SeleniumBase
{
	//@Test(priority=49,description="Navigate to Add Reference Percentages screen function and verify fields present")
	public void navigateToViewReferenceCodes() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyFieldsPresent();
	}
	
	//@Test(priority=50,description="Verify the Max length of Percentage Code field")
	public void verifyMaxLengthOfPercentageCode() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyMaxLengthOfPercentageCode();
	}
	
	//@Test(priority=51,description="Verify the Max length of Percentage Description field")
	public void verifyMaxLengthOfPercentageDesc() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyMaxLengthOfPercentageDesc();
	}
	
	//@Test(priority=52,description="Verify the Max length of Percentage field")
	public void verifyMaxLengthOfPercentage() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyMaxLengthOfPercentage();
	}
	
	//@Test(priority=53,description="Verify the Max length of Begin Date field")
	public void verifyMaxLengthOfBeginDate() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyMaxLengthOfBeginDate();
	}
	
	//@Test(priority=54,description="Verify the Max length of End Date field")
	public void verifyMaxLengthOfEndDate() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyMaxLengthOfEndDate();
	}
	
	//@Test(priority=55,description="Verify Add Mode with No Values entered")
	public void verifyAddWithNoValues() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyAddWithNullValues();
	}
	
	//@Test(priority=55,description="Verify Add Mode with No Percentage Code")
	public void verifyAddWithNoPercentageCode() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyAddWithNoPercentageCode();
	}
	
	//@Test(priority=56,description="Verify Add Mode with No Values entered")
	public void verifyfieldproperty() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferencePercentages().navigatetoAddReferencePercentages().verifyAddWithNoPercentageCode();
	}
}
