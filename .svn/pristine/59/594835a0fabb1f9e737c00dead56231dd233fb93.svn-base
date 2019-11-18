package com.protech.nvkids.pages.home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.nvkids.pages.bstl.BatchErrorsPage;
import com.protech.nvkids.pages.bstl.BatchStatusLogsPage;
import com.protech.nvkids.pages.bstl.PrintQueueErrorsPage;
import com.protech.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	

	// screen & screen function name links
	@FindBy(xpath = "//span[text()='Batch Status Logs and Errors']") WebElement eleBSTLLink;


	public BatchStatusLogsPage navigatetoBSTL() 
	{
		click(eleBSTLLink);
		return  new BatchStatusLogsPage();
	}

}
