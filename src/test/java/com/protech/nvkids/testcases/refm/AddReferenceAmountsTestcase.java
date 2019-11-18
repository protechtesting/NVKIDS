package com.protech.nvkids.testcases.refm;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class AddReferenceAmountsTestcase extends SeleniumBase 
{
	@Test(priority=1,description="Navigate to Add Reference Amounts screen function")
	public void navigateToViewReferenceCodes() throws Exception 
	{
		new LoginPage().login().quickNavigation_REFM().navigatetoViewReferenceAmounts().navigatetoAddReferenceAmounts().selectfreqdropdownvalue();
	}
}
