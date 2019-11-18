package com.protech.nvkids.pages.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.bstl.BatchStatusLogsPage;
import com.protech.nvkids.pages.home.HomePage;
import com.protech.selenium.api.base.SeleniumBase;

public class LoginPage extends SeleniumBase {

	public LoginPage() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']") WebElement elelogincheckbox;
	@FindBy(how = How.XPATH, using = "//label[text()='By logging in, I accept the terms above ']") WebElement elelbllogincheckbox;
	@FindBy(how = How.ID, using = "userName") 	WebElement eleUserName;
	@FindBy(how = How.XPATH, using = "//label[text()='User Name']") 	WebElement elelblUserName;
	@FindBy(how = How.XPATH, using = "//label[text()='Password']") 	WebElement elelblPassword;
	@FindBy(how = How.ID, using = "password")	WebElement elePassWord;
	@FindBy(how = How.XPATH, using = "//span[text()='Login']") WebElement eleLogin;
	
	public HomePage login() 
	{
		//clickIcon(elelogincheckbox, elelbllogincheckbox);
		clickIcon(elelogincheckbox,elelbllogincheckbox );
		clearAndType(eleUserName,elelblUserName, "KDUMANSKI");
		clearAndType(elePassWord,elelblPassword, "password");
		click(eleLogin);
		return new HomePage();
		
		//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']
	}
	


}
