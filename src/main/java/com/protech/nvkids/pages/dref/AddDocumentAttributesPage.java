package com.protech.nvkids.pages.dref;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class AddDocumentAttributesPage extends SeleniumBase
{
	
	public AddDocumentAttributesPage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	// Add Recipients Page
	@FindBy(xpath="//input[@id='recipientCode']") WebElement elelovRecipientType;
	@FindBy(xpath="//label[text()='Recipient Type']") WebElement elelblRecipientType;
	@FindBy(xpath="//label[@class='ng-tns-c38-108 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']") WebElement eleddPrintMethod;
	@FindBy(xpath="//label[text()='Print Method']") WebElement elelblPrintMethod;
	@FindBy(xpath="//label[@class='ng-tns-c38-109 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']") WebElement eleddDeliveryMethod;
	@FindBy(xpath="//label[text()='Delivery Method']") WebElement elelblDeliveryMethod;
		
}
