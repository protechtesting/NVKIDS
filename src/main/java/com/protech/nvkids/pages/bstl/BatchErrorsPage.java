package com.protech.nvkids.pages.bstl;


import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class BatchErrorsPage extends SeleniumBase 
{
	public BatchErrorsPage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	CommonLocators cloc=new CommonLocators();
	//Screen functions
	@FindBy(xpath = "//span[text()='Print Queue Errors']") WebElement elesfPrintQueueErrors;
	@FindBy(xpath = "//span[text()='Batch Status Logs']") WebElement elesfBatchStatusLogs;
	
	//Filter Section
	@FindBy(id="effectiveRunDate") WebElement eletxtProcessDate;
	@FindBy(xpath="//label[text()='Process Date' ]") WebElement elelblProcessDate;
	
	//Grid Section
	@FindBy(xpath="//label[text()=' Process Date ']") WebElement elehdrProcessDate;
	@FindBy(xpath="//label[text()=' Job ID ']") WebElement elehdrJobID;
	@FindBy(xpath="//label[text()=' Job Description ']") WebElement elehdrJobDescription;
	@FindBy(xpath="//label[text()=' Batch Name ']") WebElement elehdrBatchName;
	@FindBy(xpath="//label[text()=' Message Type ']") WebElement elehdrMessageType;
	@FindBy(xpath="//label[text()=' Create Date ']") WebElement elehdrCreateDate;
	
	//Grid Accordion section
	@FindBy(xpath="//label[text()=' Key Values ']") WebElement elealblKeyValues;
	@FindBy(xpath="//label[text()=' Error Description ']") WebElement elealblErrorDescription;
	
			
	// Grid Data
	@FindBy(xpath = "//table/tbody/tr/td/span") WebElement EleGridData;
		
			
	public void verifyCharacterAllowancePositiveScenario()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		VerifyChar_allowance(eletxtProcessDate,"11/01/2019");
	}
		
		
	public void verifyCharacterAllowanceNegativeScenario()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		VerifyChar_NotAllowance(eletxtProcessDate,"abcd");
		VerifyChar_NotAllowance(eletxtProcessDate,"^*&&*^*");
	}
	
	public void verifyFieldLength() throws AWTException
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		copypaste(eletxtProcessDate, "12345678", 8);
	}
	
	public void verifyCopyPasteAllowance() throws AWTException
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		copypaste(eletxtProcessDate, "12345678", 8);
	}
		
	public void inquirewithProcessDate()
	{
		clearAndType(eletxtProcessDate,elelblProcessDate, "11042019");
		click(cloc.eleicnSearch);
	}
	
	public PrintQueueErrorsPage navigateToPrintQueueErrors() throws InterruptedException 
	{
		clickLink(elesfPrintQueueErrors);
		Thread.sleep(3000);
		return new PrintQueueErrorsPage();
	}
		
	public BatchStatusLogsPage navigateToBatchStatusLogs() throws InterruptedException 
	{
		clickLink(elesfBatchStatusLogs);
		Thread.sleep(3000);
		return new BatchStatusLogsPage();
	}
		
	public BatchErrorsPage verifyFieldsPresent() throws Exception
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		verifyDisplayed(eletxtProcessDate,elelblProcessDate);
		verifyDisplayed(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyDisplayed(cloc.eleicnClear,cloc.eleicnClear);
		/*verifyDisplayed(elehdrProcessDate,elehdrProcessDate);
		verifyDisplayed(elehdrJobDescription,elehdrJobDescription);
		verifyDisplayed(elehdrBatchName,elehdrBatchName);
		verifyDisplayed(elehdrMessageType,elehdrMessageType);
		verifyDisplayed(elehdrCreateDate,elehdrCreateDate);*/
		verifyGridHeaders("Process Date","Job Description","Batch Name","Message Type","Create Date");
		inquirewithProcessDate();		
		click(cloc.eleicnOpenAccordion);
		verifyDisplayed(elealblKeyValues,elealblKeyValues);
		verifyDisplayed(elealblErrorDescription,elealblErrorDescription);
		return this;
	}
	
	
	public void inquireWithNoProcessDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clear(eletxtProcessDate);
		click(cloc.eleicnSearch);
		verifyExactText(cloc.eleErrStatusBar, "Process Date :  Enter Required Fields");
	}
	
	public void verifyInvalidProcessDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtProcessDate,elelblProcessDate, "321321");
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "Process Date :  Invalid Date");
	}
	
	
	public void verifyFutureProcessDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		setFutureDate(eletxtProcessDate);
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "Process Date :  Future Date is not Allowed");
	}
	
	public void verifyNoMatchRecords() throws InterruptedException
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtProcessDate,elelblProcessDate, "10012019");
		click(cloc.eleicnSearch);	
		Thread.sleep(2000);
		verifyExactText(cloc.eleErrStatusBar, "No Matching Records Found");
	}
	
	public void verifySuccessfulInquiry()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtProcessDate,elelblProcessDate, "11042019");
		click(cloc.eleicnSearch);		
		VerifyGridHasData(EleGridData);
	}

}
