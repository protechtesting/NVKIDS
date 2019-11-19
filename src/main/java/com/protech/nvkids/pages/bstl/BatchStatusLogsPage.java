package com.protech.nvkids.pages.bstl;


import java.awt.AWTException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class BatchStatusLogsPage extends SeleniumBase 
{
	public BatchStatusLogsPage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	CommonLocators cloc=new CommonLocators();
	
	//Filter Section
			
	@FindBy(xpath="//span[text()='Batch Status Logs and Errors']")  WebElement elelnkBSTL_batchstatuslogs;		
	@FindBy(id="fromDate") WebElement eletxtFromDate;	
	@FindBy(xpath="//label[text()='From Date' ]") WebElement elelblFromDate;
	@FindBy(id="toDate")  WebElement eletxtThroughDate;	
	@FindBy(xpath="//label[text()='Through Date' ]") WebElement elelblThroughDate;
		
	//Grid Section
	@FindBy(xpath="//label[text()=' Process Date ']") WebElement elehdrProcessDate;	
	@FindBy(xpath="//label[text()=' Job ID ']") WebElement elehdrJobID;	
	@FindBy(xpath="//label[text()=' Job Description ']") WebElement elehdrJobDescription;
	@FindBy(xpath="//label[text()=' Batch Name ']") WebElement elehdrBatchName;
	@FindBy(xpath="//label[text()=' Start Time ']") WebElement elehdrStartTime;
	@FindBy(xpath="//label[text()=' End Time ']") WebElement elehdrEndTime;
	@FindBy(xpath="//label[text()=' Record Count ']") WebElement elehdrRecordCount;
	@FindBy(xpath="//label[text()=' Batch Status ']") WebElement elehdrBatchStatus;
	
	
	//Grid Accordion section
	@FindBy(xpath="//label[text()=' Procedure Name ']") WebElement elealblProcedureName;
	@FindBy(xpath="//label[text()=' Error/Seq ']") WebElement elealblErrorSeq;
	@FindBy(xpath="//label[text()=' Worker ']") WebElement elealblWorker;
	@FindBy(xpath="//label[text()=' Cursor Location ']") WebElement elealblCursorLocation;
	@FindBy(xpath="//label[text()=' Execution Location ']") WebElement elealblExecutionLocation;
	@FindBy(xpath="//label[text()=' Key Values ']") WebElement elealblKeyValues;
	@FindBy(xpath="//label[text()=' Error Description ']") WebElement elealblErrorDescription;
	
		
	//Screen Functions
	@FindBy(xpath = "//span[text()='Batch Status Logs and Errors']") WebElement eleBatchErrorsExpandLink;
	@FindBy(xpath = "//span[text()='Batch Errors']") WebElement elesfBatchErrors;	
	@FindBy(xpath = "//span[text()='Print Queue Errors']") WebElement elesfPrintQueueErrors;
	
	
	// Grid Data
	@FindBy(xpath = "//table/tbody/tr/td/span") WebElement EleGridData;
	
	
	public BatchErrorsPage navigatetoBatchErrors() throws InterruptedException 
	{
		clickLink(eleBatchErrorsExpandLink);
		clickLink(elesfBatchErrors);
		Thread.sleep(3000);
		return new BatchErrorsPage();
	}
	
	
	public PrintQueueErrorsPage navigatetoPrintQueueErrors() throws InterruptedException 
	{
		clickLink(eleBatchErrorsExpandLink);
		clickLink(elesfPrintQueueErrors);
		Thread.sleep(3000);
		return new PrintQueueErrorsPage();
	}
	
	public BatchStatusLogsPage verifyFieldsPresent() throws Exception
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		verifyDisplayed(eletxtFromDate,elelblFromDate);
		verifyDisplayed(eletxtThroughDate,elelblThroughDate);
		verifyDisplayed(cloc.eleicnSearch,cloc.eleicnSearch);
		verifyDisplayed(cloc.eleicnClear,cloc.eleicnClear);
		/*verifyDisplayed(elehdrProcessDate,elehdrProcessDate);
		verifyDisplayed(elehdrJobDescription,elehdrJobDescription);
		verifyDisplayed(elehdrBatchName,elehdrBatchName);
		verifyDisplayed(elehdrStartTime,elehdrStartTime);
		verifyDisplayed(elehdrEndTime,elehdrEndTime);
		verifyDisplayed(elehdrRecordCount,elehdrRecordCount);
		verifyDisplayed(elehdrBatchStatus,elehdrBatchStatus);*/
		verifyGridHeaders("Process Date","Job Description","Batch Name","Start Time","End Time","Record Count","Batch Status");
		inquirewithFromDate();
		click(cloc.eleicnOpenAccordion);
		verifyDisplayed(elealblProcedureName,elealblProcedureName);
		verifyDisplayed(elealblErrorSeq,elealblErrorSeq);
		verifyDisplayed(elealblWorker,elealblWorker);
		verifyDisplayed(elealblCursorLocation,elealblCursorLocation);
		verifyDisplayed(elealblExecutionLocation,elealblExecutionLocation);
		verifyDisplayed(elealblKeyValues,elealblKeyValues);
		verifyDisplayed(elealblErrorDescription,elealblErrorDescription);
		return this;
	}
	
	public BatchStatusLogsPage verifyCharacterAllowancePositiveScenario()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);		
		VerifyChar_allowance(eletxtFromDate,"11/01/2019");
		VerifyChar_allowance(eletxtThroughDate,"11/07/2019");
		return this;
	}
	
	
	public BatchStatusLogsPage verifyCharacterAllowanceNegativeScenario()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		VerifyChar_NotAllowance(eletxtFromDate,"abcd");
		VerifyChar_NotAllowance(eletxtFromDate,"^*&&*^*");
		VerifyChar_NotAllowance(eletxtThroughDate,"abcd");
		VerifyChar_NotAllowance(eletxtThroughDate,"^*&&*^*");
		return this;
	}
	
	
	public BatchStatusLogsPage verifyFieldLength()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		verifyFieldLength(eletxtFromDate, "12345678", 10);
		verifyFieldLength(eletxtThroughDate, "12345678", 10);
		return this;
	}
	
	public BatchStatusLogsPage VerifyCopyPasteAllowance() throws AWTException
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		copypaste(eletxtFromDate, "11/01/2019", 8);
		copypaste(eletxtThroughDate, "11/07/2019", 8);
		return this;
	}
	
	
	
	public BatchStatusLogsPage inquirewithFromDate()
	{
		clearAndType(eletxtFromDate,elelblFromDate, "10312019");
		setPastDate(eletxtThroughDate);
		click(cloc.eleicnSearch);
		return this;
	}
	
		
	public BatchStatusLogsPage verifyError_NullFromDate() throws InterruptedException
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clear(eletxtFromDate);
		Thread.sleep(1000);
		click(cloc.eleicnSearch);
		verifyExactText(cloc.eleErrStatusBar, "From Date :  Enter Required Fields");
		return this;
	}
	
	public BatchStatusLogsPage verifyInvalidFromDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtFromDate,elelblFromDate, "321321");
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "From Date :  Invalid Date");
		return this;
	}
		
	public BatchStatusLogsPage verifyInvalidThroughDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		System.out.println("********1***************");
		setPastDate(eletxtFromDate);
		clearAndType(eletxtThroughDate,elelblThroughDate, "34/53/4534");
		System.out.println("********2***************");
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "Through Date :  Invalid Date");
		return this;
	}
	
	
	public BatchStatusLogsPage verifyFutureFromDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);		
		setFutureDate(eletxtFromDate);
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "From Date :  Future Date is not Allowed");
		return this;
	}
	
	public BatchStatusLogsPage verifyFutureToDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);	
		setPastDate(eletxtFromDate);
		setFutureDate(eletxtThroughDate);
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "Through Date :  Future Date is not Allowed");
		return this;
	}
	
	
	public BatchStatusLogsPage verifyEarlierThroughDate()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);		
		setCurrentDate(eletxtFromDate);
		setPastDate(eletxtThroughDate);	
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "Through Date :  Through Date Must be Greater than or Equal to From Date");
		return this;
	}

	public BatchStatusLogsPage verifyNoMatchRecords()
	{
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		setCurrentDate(eletxtFromDate);
		setCurrentDate(eletxtThroughDate);
		click(cloc.eleicnSearch);		
		verifyExactText(cloc.eleErrStatusBar, "No Matching Records Found");
		return this;
	}
	
	
	public BatchStatusLogsPage verifySuccesfulInquiry() throws InterruptedException
	{
		Thread.sleep(2000);
		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);
		clearAndType(eletxtFromDate,elelblFromDate, "11012019");
		clearAndType(eletxtThroughDate,elelblThroughDate, "11192019");
		click(cloc.eleicnSearch);
		VerifyGridHasData(EleGridData);
		return this;
	}

}
