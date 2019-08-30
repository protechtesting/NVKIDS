package com.protech.nvkids.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;


public class LoginPage extends SeleniumBase{ 
	
	public LoginPage() {
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy(how=How.ID, using="txtLoginID")  WebElement eleUserName;
	@FindBy(how=How.ID, using="txtPassword")  WebElement elePassWord;
	@FindBy(how=How.ID, using="btnLogin") WebElement eleLogin;
	
	public LoginPage enterUserName(String data) {
		//WebElement eleUserName = locateElement("id", "username");
		System.out.println(data);
		clearAndType(eleUserName, data);  
		return this; 
	}
	
	public LoginPage enterPassWord(String data) {
		//WebElement elePassWord = locateElement("id", "password");
		System.out.println("ENTERED INTO ENTER PASSWORD METHID");
		System.out.println(data);
		clearAndType(elePassWord, data); 
		return this; 
	}
	
	public HomePage clickLogin() {
		//WebElement eleLogin = locateElement("class", "decorativeSubmit");
          click(eleLogin);  
          return new HomePage();
	}
	
}







