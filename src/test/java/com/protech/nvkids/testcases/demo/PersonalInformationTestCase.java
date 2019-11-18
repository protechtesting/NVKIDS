package com.protech.nvkids.testcases.demo;

import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

public class PersonalInformationTestCase extends SeleniumBase

{

	@Test(priority=1,description="Upload Button")
	
	public void UploadButton() throws Exception 
	{
		new LoginPage().login().quickNavigation_DEMOV2().Upload();
	}
}
