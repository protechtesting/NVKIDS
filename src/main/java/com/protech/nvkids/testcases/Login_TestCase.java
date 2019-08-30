package com.protech.nvkids.testcases;



	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.protech.nvkids.pages.HomePage;
	import com.protech.nvkids.pages.LoginPage;
	import com.protech.nvkids.pages.PARM_HomePage;
import com.protech.selenium.api.base.SeleniumBase;

	
	public class Login_TestCase  extends SeleniumBase{
		
		
		
	/*
	 * @BeforeTest public void setData() { testcaseName = "Login Page Test Cases";
	 * testcaseDec = "VerifyLogin"; author = "ProtechTesting"; category = "smoke";
	 * //excelFileName = "TC001";
	 * 
	 * 
	 * }
	 */

		//@Test(dataProvider="fetchData")
		@Test
		public void VerifyLogin() throws Exception 
		{
			
			testcaseName = "TC001_login Test";
			testcaseDec = "InquiryandValidate";
			author = "ProtechTesting";
			category = "smoke";
			
			report();

			 new LoginPage()
			.enterUserName("duraipandi")
			.enterPassWord("duraipandi")
			.clickLogin();

			 
		}
		
		//@Test(priority=1)
		public void TC_001_VerifyLogin() throws Exception 
		{
			
			testcaseName = "TC001_login Test";
			testcaseDec = "InquiryandValidate";
			author = "ProtechTesting";
			category = "smoke";
			report();

			 new LoginPage()
			.enterUserName("duraipandi")
			.enterPassWord("duraipandi")
			.clickLogin();

			 
		}
		
		//@Test(priority=2)
		public void Tc_002_VerifyLogo() throws Exception 
		{
			
			testcaseName = "TC001_login Test";
			testcaseDec = "InquiryandValidate";
			author = "ProtechTesting";
			category = "smoke";
			
			report();

			 

			 
		}
		
		//@Test(priority=3)
		public void TC_003_VerifyFieldslength() throws Exception 
		{
			testcaseName = "TC001_login Test";
			testcaseDec = "InquiryandValidate";
			author = "ProtechTesting";
			category = "smoke";
			 

			 
		}
		
		
		
		
	}