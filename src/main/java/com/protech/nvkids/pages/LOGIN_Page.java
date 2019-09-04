package com.protech.nvkids.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class LOGIN_Page extends SeleniumBase {

	public LOGIN_Page() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//div[@ng-reflect-klass='ui-chkbox-box ui-widget ui-cor']")
	WebElement logincheckbox;

	@FindBy(how = How.ID, using = "userName")
	WebElement eleUserName;
	@FindBy(how = How.ID, using = "password")
	WebElement elePassWord;
	@FindBy(how = How.XPATH, using = "//span[text()='Login']")
	WebElement eleLogin;

	public BSTL_Page login() {

		System.out.println("entyered to login methid");
		click(logincheckbox);
		clearAndType(eleUserName, "KDUMANSKI");
		clearAndType(elePassWord, "password");
		click(eleLogin);
		return new BSTL_Page();
	}

}
