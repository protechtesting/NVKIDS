package com.protech.testng.api.base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.protech.selenium.api.base.SeleniumBase;

import utils.DataLibrary;

public class Annotations extends SeleniumBase {
	
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return DataLibrary.readExcelData(excelFileName);
	}	
  
  @BeforeMethod
  public void beforeMethod() {
	
	  //startApp("chrome", "http://intranet.protechsolutions.com/issuetracker/Login.aspx");
	  startApp("chrome", "http://10.50.120.22:81/nvkids/#/tools/maintanance/overview");
	 
	
  }

 /* @AfterMethod
  public void afterMethod() {
	  close();
  } */

}
