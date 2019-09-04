package com.protech.nvkids.testcases;


import java.io.IOException;

import org.testng.annotations.Test;
import com.protech.nvkids.pages.LOGIN_Page;
import com.protech.selenium.api.base.SeleniumBase;

public class LOGIN_Testscript extends SeleniumBase {

	@Test()
	public void VerifyLogin() throws IOException {
		
		System.out.println("going to start firsttestcase");
		
		testcaseName = "TC001_Test Login functionality";
		testcaseDec = "InquiryandValidate";
		author = "ProtechTesting";
		category = "smoke";
		
		report();
		new LOGIN_Page().login();	
		

	}
	
	
	

}