package com.protech.nvkids.pages.bstl;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class BatchErrorsPage extends SeleniumBase 
{
	public BatchErrorsPage() 
	{
		PageFactory.initElements(driver, this);
	}
	

	
	
	
	//Screen functions
	@FindBy(xpath="//span[text()='Batch Status Logs and Errors']") WebElement elelnkBSTL_batchstatuslogs;
	@FindBy(xpath = "//span[text()='Print Queue Errors']") WebElement elePrintQueueErrors;
	@FindBy(xpath = "//span[text()='Batch Status Logs']") WebElement eleBatchStatusLogs;
	
	//Filter Section
	
	@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']")  WebElement eleicnSelectFilter;	
	@FindBy(xpath="//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted'][contains(text(),'Filter')]") WebElement elelblSelectFilter;
	
	@FindBy(id="effectiveRunDate") WebElement eledtProcessDate;
	@FindBy(xpath="//label[text()='Process Date' ]") WebElement eledtlblProcessDate;
	
	@FindBy(xpath="//span[text()='Search']") WebElement elebtnSearch;
	@FindBy(xpath="//span[text()='Clear']") WebElement elebtnClear;
	
	//Grid Section
	@FindBy(xpath="//span[text()=' Process Date ']") WebElement elehdrProcessDate;
	@FindBy(xpath="//span[text()=' Job ID ']") WebElement elehdrJobID;
	@FindBy(xpath="//span[text()=' Job Description ']") WebElement elehdrJobDescription;
	@FindBy(xpath="//span[text()=' Batch Name ']") WebElement elehdrBatchName;
	@FindBy(xpath="//span[text()=' Message Type ']") WebElement elehdrMessageType;
	@FindBy(xpath="//span[text()=' Create Date ']") WebElement elehdrCreateDate;
	
	//Grid Accordion section
	@FindBy(xpath="//label[text()=' Key Values']") WebElement eledispKeyValues;
	@FindBy(xpath="//label[text()=' Error Description ']") WebElement eledispErrorDescription;
	
	//Error Panel
	@FindBy(xpath="//div[@class='messagetextrow'][2]/span") WebElement eleErrorPanel;
	
	
	
	//Filter and Accordion icon
		@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']") WebElement EleicnOpenFilter;
		@FindBy(xpath = "(//i[contains(@class,'pi pi-chevron-down')])[1]") WebElement Eleicnaccordion;
		
		
		
		
		public void inquirewithProcessDate(){
			
			
			clearAndType(eledtProcessDate,eledtlblProcessDate, "09/16/2019");
			click(elebtnSearch);
			
		}
		
		
		public PrintQueueErrorsPage navigateToPrintQueueErrors() throws InterruptedException 
		{
			clickLink(elePrintQueueErrors);
			Thread.sleep(3000);
			return new PrintQueueErrorsPage();
		}
		
		public BatchStatusLogsPage navigateToBatchStatusLogs() throws InterruptedException 
		{
			clickLink(eleBatchStatusLogs);
			Thread.sleep(3000);
			return new BatchStatusLogsPage();
		}
	
	
	public BatchErrorsPage verifyFieldsPresent() throws Exception
	{
		clickIcon(eleicnSelectFilter, elelblSelectFilter);
		verifyDisplayed(eledtProcessDate);
		//verifyDisplayed(elehdrJobID);
		verifyDisplayed(elebtnSearch);
		verifyDisplayed(elebtnClear);
	
		
		verifyDisplayed(elehdrProcessDate);
		//verifyDisplayed(elehdrJobID);
		verifyDisplayed(elehdrJobDescription);
		verifyDisplayed(elehdrBatchName);
		verifyDisplayed(elehdrMessageType);
		verifyDisplayed(elehdrCreateDate);
		
		
		inquirewithProcessDate();		
		click(elebtnSearch);
		
		
		verifyDisplayed(eledispKeyValues);
		verifyDisplayed(eledispErrorDescription);
	
		return this;
		
	}
	
	

	
	
	public void verifyError_NullProcessDate()
	{
		clickIcon(eleicnSelectFilter, elelblSelectFilter);
		clear(eledtProcessDate);
		click(elebtnSearch);
		verifyPartialText(eleErrorPanel, "Enter Required Fields");
	}
	
	
	
	public void verifyInvalidProcessDate()
	{
		clickIcon(eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtProcessDate,eledtlblProcessDate, "321321");
		click(elebtnSearch);		
		verifyPartialText(eleErrorPanel, "Invalid Date");
	}
	
	
	public void verifyFutureProcessdate()
	{
		clickIcon(eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtProcessDate,eledtlblProcessDate, "321321");
		click(elebtnSearch);		
		verifyPartialText(eleErrorPanel, "FUTURE DATE NOT ALLOWED");
	}
	
	public void verifyNoMatchRecords()
	{
		clickIcon(eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtProcessDate,eledtlblProcessDate, "321321");
		click(elebtnSearch);		
		verifyPartialText(eleErrorPanel, "No Matching Records Found");
	}
	
	public void verifySuccessfulInquiry()
	{
		clickIcon(eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtProcessDate,eledtlblProcessDate, "321321");
		click(elebtnSearch);		
		verifyPartialText(eleErrorPanel, "Done");
	}



}
