package com.protech.nvkids.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.HomePage;
import com.protech.nvkids.pages.LoginPage;
import com.protech.nvkids.pages.PARM_HomePage;
import com.protech.selenium.api.base.SeleniumBase;


public class PARM_TestCases extends SeleniumBase{
	
	
	
	/*
	 * @BeforeTest public void setData() {
	 * 
	 * testcaseName = "TC001_PARM_InquireAndVerifyRecord"; testcaseDec =
	 * "InquiryandValidate"; author = "ProtechTesting"; category = "smoke";
	 * //excelFileName = "TC001";
	 * 
	 * 
	 * }
	 */

	//@Test(dataProvider="fetchData")
	@Test(priority=1)
	public void TC_001_inquireAndValidate() throws Exception 
	{
		testcaseName = "TC001_PARM_InquireAndVerifyRecord";
		testcaseDec = "InquiryandValidate";
		author = "ProtechTesting";
		category = "smoke";
		report();
		 new HomePage()
		.clickPARMScreen()
		.PARM_Inquiry()
		.getResult();
		 
		 
	}
	
	@Test(priority=2)
	
	public void TC_002_VerifyFieldsPresent() throws Exception 
	{
		testcaseName = "TC_002_VerifyFieldsPresent(";
		testcaseDec = "VerifyFieldsPresent";
		author = "ProtechTesting";
		category = "smoke";
		report();
		 throw new Exception();
	}
	
	
	@Test(priority=3)
	public void TC_003_VerifyFieldsLength() throws Exception 
	{
		
		testcaseName = "TC_003_VerifyFieldsLength(";
		testcaseDec = "VerifyFieldsLength";
		author = "ProtechTesting";
		category = "smoke";
		report();
		
		throw new Exception();
		 
	}
	
	@Test(priority=4)
	public void TC_004_VerifyFieldsLocation() throws Exception 
	{
		testcaseName = "TC_004_VerifyFieldsLocation(";
		testcaseDec = "VerifyFieldsLocation";
		author = "ProtechTesting";
		category = "smoke";
		report();
		
		 
	}
	
	
	
	
	
	
	
}






