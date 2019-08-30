package com.protech.nvkids.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class ASelbasePage extends SeleniumBase  {
	
	public ASelbasePage() {
		PageFactory.initElements(driver,this); 
	}
	

	@FindBy(how=How.ID, using="txtLoginID")
	public  WebElement eleUserName;
	@FindBy(how=How.ID, using="txtPassword")  
	public WebElement elePassWord;
	@FindBy(how=How.ID, using="btnLogin") 
	public WebElement eleLogin;
	
	@FindBy(how=How.ID, using="select-demo") 
	public WebElement eleLOVSelectDay;
	
	@FindBy(how=How.NAME, using="cusid") 
	public WebElement eletextCusID;

	@FindBy(how=How.XPATH, using="//button[text()='Click me!']/following::button") 
	public WebElement elebuttonGenAlert;
	
	
	
	
	

}
