package com.protech.nvkids.pages.dref;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class ViewDocumentAttributesPage extends SeleniumBase 
{
	public ViewDocumentAttributesPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Screen functions
	@FindBy(xpath="//span[text()='Document Reference']") WebElement elelnkDREF_Documentattributes;
	
	//Filter Section
	@FindBy(xpath = "//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted']")  WebElement eleicnSelectFilter;	
	@FindBy(xpath="//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted'][contains(text(),'Filter')]") WebElement elelblSelectFilter;	
	@FindBy(xpath="//input[@id='documentIdc']") WebElement eletxtDocuemntid;	
	@FindBy(xpath="//label[text()='Document ID']") WebElement elelblDocumentid;
	@FindBy(xpath="//input[@id='documentDesc']") WebElement eletxtDocuemntName;	
	@FindBy(xpath="//label[text()='Document Name']") WebElement elelblDocumentName;
	@FindBy(xpath="//label[@class='ng-tns-c38-49 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']") WebElement eleddUntitledsearch;
	@FindBy(xpath="//label[@class='ng-tns-c38-50 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']") WebElement eleddCategory;
	@FindBy(xpath="//label[text()='Category']") WebElement elelblCategory;
	@FindBy(xpath="//label[@class='ng-tns-c38-51 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']") WebElement eleddType;
	@FindBy(xpath="//label[text()='Type']") WebElement elelblType;
	@FindBy(xpath="//button/span[text()='Search']") WebElement elebtnSearch;
	@FindBy(xpath="//button/span[text()='Clear']") WebElement elebtnClear;
	
	//Grid Section
	@FindBy(xpath="//label[text()=' Document ID ']") WebElement elehdrDocumentID;	
	@FindBy(xpath="//label[text()=' Document Name ']") WebElement elehdrDocumentName;
	@FindBy(xpath="//label[text()=' Category Code ']") WebElement elehdrCategoryCode;
	@FindBy(xpath="//label[text()=' Category ']") WebElement elehdrCategory;
	@FindBy(xpath="//label[text()=' Notice Type Code ']") WebElement elehdrTypeCode;
	@FindBy(xpath="//label[text()=' Type ']") WebElement elehdrType;	
	
	//Grid Accordion section
	@FindBy(xpath="//label[text()=' Recipient Type Code ']") WebElement eledispRecipientTypeCode;
	@FindBy(xpath="//label[text()=' Recipient Type ']") WebElement eledispRecipientType;
	@FindBy(xpath="//label[text()=' Print Method Code ']") WebElement eledispPrintMethodCode;
	@FindBy(xpath="//label[text()=' Print Method ']") WebElement eledispPrintMethod;
	@FindBy(xpath="//label[text()=' Delivery Method Code ']") WebElement eledispDeliveryMethodCode;
	@FindBy(xpath="//label[text()=' Delivery Method ']") WebElement eledispDeliveryMethod;
	@FindBy(xpath="//label[text()=' Updated By ']") WebElement eledispUpdatedBy;
	@FindBy(xpath="//label[text()=' Updated On ']") WebElement eledispUpdatedOn;
	@FindBy(xpath="//span[text()='Add Recipients']") WebElement eleicnAddRecipients;
	@FindBy(xpath="//span[text()='Delete']") WebElement eleicnDelete;
	
	//Error Panel
	//@FindBy(xpath="//div[@class='messagetextrow'][2]/span") WebElement eleErrorPanel;	
	@FindBy(xpath = "//span[@class='ng-star-inserted'][2]")  public WebElement eleErrorPanel;
	@FindBy(xpath = "//span[@class='ng-star-inserted']")  public WebElement eleErrorPanelNoMatch;
	
	
	//Accordion icon
	@FindBy(xpath = "(//i[contains(@class,'pi pi-chevron-down')])[1]") WebElement Eleicnaccordion;
		
	// Grid Data		
	@FindBy(xpath = "//table/tbody/tr/td/span") WebElement EleGridData;
		
		
}
