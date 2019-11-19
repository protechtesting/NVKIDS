package com.protech.nvkids.pages.proc;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;


public class ViewDocumentsAssociated extends SeleniumBase 
{
	public ViewDocumentsAssociated() 
	{
		PageFactory.initElements(driver, this); 
	}
    
		
	//Grid section
	@FindBy(xpath="//label[text()='  ']") WebElement elehdrDeleteCheckbox;
	@FindBy(xpath="//label[text()=' Document ID ']") WebElement elehdrDocumentID;
	@FindBy(xpath="//label[text()=' Document Description ']") WebElement elehdrDocumentDescription;
	

	//Accordion icon
	@FindBy(xpath = "(//i[contains(@class,'pi pi-chevron-down')])[1]") WebElement Eleicnaccordion;
	
	
	//Accordion Section
	@FindBy(xpath="//label[text()='  ']") WebElement elehdrDeleteCheckboxAcc;
	@FindBy(xpath="//label[text()=' Recipient Type ']") WebElement elehdrRecipientType;
	@FindBy(xpath="//label[text()=' Print Method ']") WebElement elehdrPrintMethod;
	@FindBy(xpath="//label[text()=' Delivery Method ']") WebElement elehdrDeliveryMethod;
	
	
	//Error Panel
    @FindBy(xpath = "//div[@class='p-grid']/div/app-status-bar/div/span[2]")  public WebElement eleErrorPanel;	
	@FindBy(xpath = "//app-core/app-layout//div/div/app-status-bar/div/span")  public WebElement eleErrorPanelNoMatch;
	
					
}
