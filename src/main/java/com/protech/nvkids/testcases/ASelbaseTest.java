package com.protech.nvkids.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.ASelbasePage;
import com.protech.selenium.api.base.SeleniumBase;

public class ASelbaseTest extends ASelbasePage {
	
	
	
	 
		
	
	
	@Test(priority=1)
	public void Test_LaunchURL() throws IOException
	{
		
		
		testcaseName = "TC001_Test_LaunchURL";		
		testcaseDec = "This Test Case will launch the Issue Tracker URL";
		author = "ProtechTesting";
		category = "smoke";
		report();
		startApp("chrome", "http://intranet.protechsolutions.com/issuetracker/Login.aspx");
		 
		reportStep("IssueTracker URL Lanched", "pass");
		
	}
	
	
	@Test(priority=2)
	public void Test_Click_Functionality() throws IOException, InterruptedException
	{
		
		
		testcaseName = "TC002_Test_Click_Functionality";		
		testcaseDec = "This Test Case will test the click functionality working or not";
		author = "ProtechTesting";
		category = "smoke";
		report();		
		startApp("chrome", "http://intranet.protechsolutions.com/issuetracker/Login.aspx");
		
		Thread.sleep(5000);
		click(new ASelbasePage().eleLogin);
	
	}
	
	@Test(priority=3)
	public void Test_Clear_Functionality() throws IOException, InterruptedException
	{
		
		
		testcaseName = "TC003_Test_Clear_Functionality";		
		testcaseDec = "This Test Case will test the clear functionality working or not";
		author = "ProtechTesting";
		category = "smoke";
		report();		
		startApp("chrome", "http://intranet.protechsolutions.com/issuetracker/Login.aspx");
		
		Thread.sleep(5000);
		clearAndType(new ASelbasePage().eleUserName, "duraipandi");
		clear(new ASelbasePage().eleUserName);
	
		
	}
	
	@Test(priority=4)
	public void Test_Selectdorpdownvalue_usingText() throws IOException, InterruptedException
	{
		
		
		testcaseName = "TC004_Test_Selectdorpdownvalue_usingTexT";		
		testcaseDec = "This Test Case will test selecting dropdown values by using visible text";
		author = "ProtechTesting";
		category = "smoke";
		report();		
		startApp("chrome", "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		
		selectDropDownUsingText(new ASelbasePage().eleLOVSelectDay, "Tuesday");
	
		
	}
	
	
	@Test(priority=5)
	public void Test_Selectdorpdownvalue_usingIndex() throws IOException, InterruptedException
	{
		
		
		testcaseName = "TC005_Test_Selectdorpdownvalue_using_INDEX";		
		testcaseDec = "This Test Case will test selecting dropdown values by using INDEX VALUE";
		author = "ProtechTesting";
		category = "smoke";
		report();		
		startApp("chrome", "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
		
		
		selectDropDownUsingIndex(new ASelbasePage().eleLOVSelectDay, 03);
	
		
	}
	
	@Test(priority=6)
	public void Test_Selectdorpdownvalue_using_value() throws IOException, InterruptedException
	{
		
		
		testcaseName = "TC006_Test_Selectdorpdownvalue_using_VALUE";		
		testcaseDec = "This Test Case will test selecting dropdown values by using  VALUE";
		author = "ProtechTesting";
		category = "smoke";
		report();		
		startApp("chrome", "https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");	
		
		
		selectDropDownUsingValue(new ASelbasePage().eleLOVSelectDay, "Tuesday");
	
	}
	
	
	@Test(priority=7)
	public void Test_VerifySwitchTO_AlertWindow() throws IOException, InterruptedException
	{
		
		
		try {
		testcaseName = "TC007_Test_VerifySwitchTO_AlertWindow";		
		testcaseDec = "This Test Case will verify whether we can able to switch to Alert window";
		author = "ProtechTesting";
		category = "smoke";
		report();		
		startApp("chrome", "https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");	
		
		
		Thread.sleep(3000);
		click(new ASelbasePage().elebuttonGenAlert);
		Thread.sleep(3000);
		switchToAlert();
		}
		catch(Exception e)
		{
			
		}
		
		
	
	}
	
	

	
	
	
	

	
	

}
