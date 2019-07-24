package com.protech.nvkids.testcases;



	import org.testng.Assert;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.protech.nvkids.pages.HomePage;
	import com.protech.nvkids.pages.LoginPage;
	import com.protech.nvkids.pages.PARM_HomePage;
	import com.protech.testng.api.base.Annotations;

	public class Login_TestCase  extends Annotations{
		
		
		
		@BeforeTest
		public void setData() {
			testcaseName = "Login Page Test Cases";
			testcaseDec = "VerifyLogin";
			author = "ProtechTesting";
			category = "smoke";
			//excelFileName = "TC001";
			
			 
		} 

		//@Test(dataProvider="fetchData")
		@Test
		public void VerifyLogin() throws Exception 
		{

			 new LoginPage()
			.enterUserName("duraipandi")
			.enterPassWord("duraipandi")
			.clickLogin();

			 
		}
		
		@Test(priority=1)
		public void TC_001_VerifyLogin() throws Exception 
		{

			 new LoginPage()
			.enterUserName("duraipandi")
			.enterPassWord("duraipandi")
			.clickLogin();

			 
		}
		
		@Test(priority=2)
		public void Tc_002_VerifyLogo() throws Exception 
		{

			 

			 
		}
		
		@Test(priority=3)
		public void TC_003_VerifyFieldslength() throws Exception 
		{

			 

			 
		}
		
		
		
		
	}