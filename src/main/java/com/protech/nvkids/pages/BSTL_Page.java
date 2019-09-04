package com.protech.nvkids.pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class BSTL_Page extends SeleniumBase {
	
	
	public BSTL_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.XPATH, using="//span[text()='Batch Status Logs and Errors']")
	public  WebElement eleBSTLLink;
	
	@FindBy(how=How.ID, using="txtLoginID")
	public  WebElement USERID;
	
	@FindBy(how=How.CLASS_NAME, using="pull-right bold text-dark-blue selectFilterbtn ng-star-inserted")
	public  WebElement Filter_Icon;
	
	
	@FindBy(how=How.ID, using="fromDate")
	public  WebElement FROMDATE_Filter;
	
	
	
	
	public BSTL_Page navigatetoBSTL() {
		
		
		click(eleBSTLLink);
		
		return this;
		
		
	}
	
	public BSTL_Page verifyCURSORfocus() throws IOException, InterruptedException {		
		
		try {
        click (Filter_Icon);
		verifycursorfocus(FROMDATE_Filter);
		}catch(Exception e)
		{
			
			reportStep("The Element " + FROMDATE_Filter + " not found", "fail");
			System.out.println("element not in focus");
			
		}
		
		return this;
	}
	


	

}


