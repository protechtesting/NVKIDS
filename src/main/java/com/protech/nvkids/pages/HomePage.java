package com.protech.nvkids.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;


public class HomePage extends SeleniumBase{ 

	public HomePage() {
       PageFactory.initElements(driver, this);
	} 

	@FindBy(how=How.XPATH, using="//span[text()='Manage Batch Parameters']") WebElement elePARMScreen;
	public PARM_HomePage clickPARMScreen() {
		//WebElement eleLogout = locateElement("class", "decorativeSubmit");
		click(elePARMScreen);  
		return new PARM_HomePage();

	}

}







