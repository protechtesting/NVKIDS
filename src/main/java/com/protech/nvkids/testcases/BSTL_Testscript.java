package com.protech.nvkids.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.BSTL_Page;
import com.protech.nvkids.pages.LOGIN_Page;
import com.protech.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class BSTL_Testscript extends SeleniumBase {
	
	@BeforeClass
	public void beforeCLASS() {
		author = "ProtechTesting";
		category = "smoke";
	}
	
	
	@Test
	public void VerifyLogin() throws IOException {		
				
			
		System.out.println(testcaseName);
		System.out.println(testcaseDec);
		
		
		report();
		new LOGIN_Page().login().navigatetoBSTL();;	
		

	}
	@Test
	public void verifyCURSORfocus_SET() throws IOException, InterruptedException {
			
		
		System.out.println(testcaseName);
		System.out.println(testcaseDec);
	
		report();
		new LOGIN_Page().login().navigatetoBSTL().verifyCURSORfocus();
	
	}


	
	
}
