package com.protech.nvkids.pages.home;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.nvkids.pages.bstl.BatchErrorsPage;
import com.protech.nvkids.pages.bstl.BatchStatusLogsPage;
import com.protech.nvkids.pages.bstl.PrintQueueErrorsPage;
import com.protech.nvkids.pages.demo.PersonalInformationPage;
import com.protech.nvkids.pages.ptre.ViewProcessDetails;
import com.protech.nvkids.pages.refm.ViewReferenceCodesPage;
import com.protech.nvkids.pages.rstr.ViewHighProfileRestrictedCasesPage;
import com.protech.selenium.api.base.SeleniumBase;

public class HomePage extends SeleniumBase{
	
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	

	// screen & screen function name links
	
	@FindBy(xpath = "//span[@title='Quick Navigation']") WebElement eleQuickNavigation;
	@FindBy(xpath = "(//input[@type='text'])[2]") WebElement eletxtQuickNavigationText;
	
	
	public  BatchStatusLogsPage quickNavigation_BSTL() throws IOException
	{
		
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText, eletxtQuickNavigationText, "BSTL");
		pressEnterKey(eletxtQuickNavigationText);
		return  new BatchStatusLogsPage();
		
	}
	public ViewReferenceCodesPage quickNavigation_REFM() throws IOException
	{
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText, eletxtQuickNavigationText, "REFM");
		pressEnterKey(eletxtQuickNavigationText);
		return  new ViewReferenceCodesPage();
	}
	
	public ViewProcessDetails quickNavigation_PTRE() throws IOException
	{
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText, eletxtQuickNavigationText, "PTRE");
		pressEnterKey(eletxtQuickNavigationText);
		return  new ViewProcessDetails();
	}
	
	public ViewHighProfileRestrictedCasesPage quickNavigation_RSTR() throws IOException
	{
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText, eletxtQuickNavigationText, "RSTR");
		pressEnterKey(eletxtQuickNavigationText);
		return  new ViewHighProfileRestrictedCasesPage();
	}
	
	public PersonalInformationPage quickNavigation_DEMO() throws IOException
	{
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText, eletxtQuickNavigationText, "DEMO");
		pressEnterKey(eletxtQuickNavigationText);
		return  new PersonalInformationPage();
	}
	
	public <T> T getTypedElem() {
	    T output = (T) new BatchStatusLogsPage();
	    System.out.println(output.getClass());
	    return output;
	}


}
