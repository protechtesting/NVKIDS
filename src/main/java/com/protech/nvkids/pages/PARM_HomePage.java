package com.protech.nvkids.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.protech.selenium.api.base.SeleniumBase;


public class PARM_HomePage  extends SeleniumBase
{
	public PARM_HomePage() 
	{
	       PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted']") WebElement eleFilterIcon;
	@FindBy(how=How.XPATH, using="//label[text()='Select Filters']/following::button[@class='searchBtn ui-button-warn ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']") WebElement eleJobIDLOV;
	@FindBy(how=How.XPATH, using="//span[text()='Select Job ID']/following::input") WebElement eleJobIDLOVSearch;
	@FindBy(how=How.XPATH, using="//span[text()='Select Job ID']/following::span[text()='Search']") WebElement eleJobIDLOVSearchButton;
	@FindBy(how=How.XPATH, using="//span[text()=' Code ']/following::td/span[text()=' NVB0014 ']") WebElement eleJobIDLOVValueClick;
	@FindBy(how=How.XPATH, using="//span[text()='OK']") WebElement eleJobIDLOVOk;
	@FindBy(how=How.XPATH, using="//span[text()='Search123']") WebElement eleFilterSearchButton;
	//@FindBy(how=How.XPATH, using="//table/tbody/tr/td[1]/span[text)=' NVB001412 ']") WebElement eleGridResult;
	@FindBy(how=How.XPATH, using="//table/tbody/tr/td[1]/span[text()=' NVB0014 ']") WebElement eleGridResult;
	
	
	public PARM_HomePage PARM_Inquiry() throws InterruptedException 
	{
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		Thread.sleep(3000);
		click(eleFilterIcon); 
		Thread.sleep(3000);
		click(eleJobIDLOV);
		Thread.sleep(3000);
		clearAndType(eleJobIDLOVSearch, "NVB0014");
		click(eleJobIDLOVSearchButton);
		Thread.sleep(2000);
		click(eleJobIDLOVValueClick);
		click(eleJobIDLOVOk);
		Thread.sleep(2000);
		click(eleFilterSearchButton);
		return this;
		
	}
	
	public PARM_HomePage getResult()
	{
		String jobID= getElementText(eleGridResult);
		Assert.assertEquals(jobID, "NVB0014");
		return this;
		
		
	}
	
	
	
	
	
}
