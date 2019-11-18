package com.protech.nvkids.pages.proc;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;


public class EditDocumentsAssociated extends SeleniumBase 
{
	public EditDocumentsAssociated() 
	{
		PageFactory.initElements(driver, this); 
	}
    
	//Document Details Section
	@FindBy(xpath="//label[text()='  ']") WebElement elelovDocumentID;
	@FindBy(xpath="//label[text()='  ']") WebElement eledsoDocumentDescription;
	
	//Select Recipients Section
	@FindBy(xpath="//label[text()='  ']") WebElement elelovRecipientType;
	@FindBy(xpath="//label[text()='  ']") WebElement eleddPrintMethod;
	@FindBy(xpath="//label[text()='  ']") WebElement eleddDeliveryMethod;

	@FindBy(xpath="//span[text()='Clear']") WebElement elebtnRefresh;
	@FindBy(xpath="//span[text()=' ']") WebElement elebtnSave;
	@FindBy(xpath="//span[text()=' ']") WebElement elebtnClose;
	@FindBy(xpath="//span[text()='']") WebElement elebtnAddMoreRecipients;
	
	
	//Error Panel
    @FindBy(xpath = "//div[@class='p-grid']/div/app-status-bar/div/span[2]")  public WebElement eleErrorPanel;	
	@FindBy(xpath = "//app-core/app-layout//div/div/app-status-bar/div/span")  public WebElement eleErrorPanelNoMatch;
	
}