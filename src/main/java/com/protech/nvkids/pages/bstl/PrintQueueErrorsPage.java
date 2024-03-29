package com.protech.nvkids.pages.bstl;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class PrintQueueErrorsPage extends SeleniumBase {

	public PrintQueueErrorsPage() {
		PageFactory.initElements(driver, this);
	}

	// Filter Section
	@FindBy(xpath = "//span[text()='Batch Status Logs and Errors']")
	WebElement elelnkBSTL_batchstatuslogs;

	@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']")
	WebElement eleicnSelectFilter;
	@FindBy(xpath = "//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted'][contains(text(),'Filter')]")
	WebElement elelblSelectFilter;

	@FindBy(id = "effectiveRunDate")
	WebElement eledtPocessDate;
	@FindBy(xpath = "//label[text()='Process Date' ]")
	WebElement eledtlblProcessDate;

	@FindBy(id = "caseId")
	WebElement eletxtCaseID;
	@FindBy(xpath = "//label[text()='Case ID']")
	WebElement elelblCaseID;

	@FindBy(id = "documentIdc")
	WebElement eletxtNoticeID;
	@FindBy(xpath = "//label[text()='Notice ID']")
	WebElement elelblNoticeID;

	@FindBy(xpath = "//span[text()='Search']")
	WebElement elebtnSearch;
	@FindBy(xpath = "//span[text()='Clear']")
	WebElement elebtnClear;

	// Grid Section
	@FindBy(xpath = "//label[text()=' Process Date ']")
	WebElement elehdrProcessDate;
	@FindBy(xpath = "//label[text()=' Job ID ']")
	WebElement elehdrJobID;
	@FindBy(xpath = "//label[text()=' Job Description ']")
	WebElement elehdrJobDescription;
	@FindBy(xpath = "//label[text()=' Batch Name ']")
	WebElement elehdrBatchName;
	@FindBy(xpath = "//label[text()=' Message Type ']")
	WebElement elehdrMessageType;
	@FindBy(xpath = "//label[text()=' Create Date ']")
	WebElement elehdrCreateDate;

	// Grid Accordion section
	@FindBy(xpath = "//label[text()=' Key Values ']")
	WebElement eledispKeyValues;
	@FindBy(xpath = "//label[text()=' Error Description ']")
	WebElement eledispErrorDescription;

	@FindBy(xpath = "//span[text()='Batch Errors']")
	WebElement eleBatchErrors;

	@FindBy(xpath = "//span[text()='Batch Status Logs']")
	WebElement eleBatchStatusLogs;

	// Error Panel
	@FindBy(xpath = "//div[@class='p-grid']/div/app-status-bar/div/span[2]")
	public WebElement eleErrorPanel;
	@FindBy(xpath = "//app-core/app-layout//div/div/app-status-bar/div/span")
	public WebElement eleErrorPanelNoMatch;

	// Filter and Accordion icon
	@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']")
	WebElement EleicnOpenFilter;
	@FindBy(xpath = "(//i[contains(@class,'pi pi-chevron-down')])[1]")
	WebElement Eleicnaccordion;

	// Grid Data

	@FindBy(xpath = "//table/tbody/tr/td/span") WebElement EleGridData;
	
	BatchStatusLogsPage b=new BatchStatusLogsPage();

	public void MakeWebElementsLis() {
		List<WebElement> list = null;

		list.add(elehdrProcessDate);
		list.add(elehdrJobID);
		list.add(elehdrJobDescription);
		list.add(elehdrBatchName);
		list.add(elehdrMessageType);
		list.add(elehdrCreateDate);

		list.add(eledispKeyValues);
		list.add(elehdrCreateDate);
	}

	public BatchStatusLogsPage navigatetoBatchStatusLogs() throws InterruptedException {

		clickLink(eleBatchStatusLogs);
		Thread.sleep(3000);

		return new BatchStatusLogsPage();

	}

	public BatchErrorsPage navigatetoBatchErrors() throws InterruptedException {

		clickLink(eleBatchErrors);
		Thread.sleep(3000);

		return new BatchErrorsPage();

	}

	public PrintQueueErrorsPage VerifyFieldspresent() throws Exception {

		verifyDisplayed(elehdrProcessDate,elehdrProcessDate);
		verifyDisplayed(elehdrJobID,elehdrJobID);
		verifyDisplayed(elebtnSearch,elebtnSearch);
		verifyDisplayed(elebtnClear,elebtnClear);
		verifyDisplayed(elebtnClear,elebtnClear);

		verifyDisplayed(elehdrProcessDate,elehdrProcessDate);
		verifyDisplayed(elehdrJobID,elehdrJobID);
		verifyDisplayed(elehdrJobDescription,elehdrJobDescription);
		verifyDisplayed(elehdrBatchName,elehdrBatchName);
		verifyDisplayed(elehdrMessageType,elehdrMessageType);
		verifyDisplayed(elehdrCreateDate,elehdrCreateDate);

		inquirewithProcessDate();
		click(elebtnSearch);

		verifyDisplayed(eledispKeyValues,eledispKeyValues);
		verifyDisplayed(eledispErrorDescription,eledispErrorDescription);

		return this;

	}

	public void verifyCharecterAllowancePositiveScenario() {

		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);

		VerifyChar_allowance(eledtPocessDate, "11/01/2019");

		VerifyChar_allowance(eletxtCaseID, "235235");
		VerifyChar_allowance(eletxtNoticeID, "235235");
		VerifyChar_allowance(eletxtNoticeID, "sdfsdfsdf");
		VerifyChar_allowance(eletxtNoticeID, "&*%^*&*()");

	}

	public void verifyCharecterAllowanceNegativeScenario() {

		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		VerifyChar_NotAllowance(eledtPocessDate, "abcd");
		VerifyChar_NotAllowance(eledtPocessDate, "^*&&*^*");

		VerifyChar_NotAllowance(eletxtCaseID, "sdfsdfsdf");
		VerifyChar_NotAllowance(eletxtCaseID, "&*%^*&*()");
	}

	

	public void VerifyFieldLength() {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		verifyFieldLength(eledtPocessDate, "11/01/2019", 10);
		verifyFieldLength(eletxtCaseID, "12345678", 8);
		verifyFieldLength(eletxtNoticeID, "12345678", 8);

	}

	public void VerifyCopyPasteAllowance() throws AWTException {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		copypaste(eledtPocessDate, "12345678", 8);
		copypaste(eletxtCaseID, "12345678", 8);
		copypaste(eletxtNoticeID, "12345678", 8);

	}

	public void inquirewithProcessDate() {

		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtPocessDate, eledtlblProcessDate, "11042019");

	}

	public PrintQueueErrorsPage VerifyError_NullProcessDate() {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		clear(eledtPocessDate);
		click(elebtnSearch);

		verifyPartialText(b.eleErrorPanel, "Enter Required Fields");

		return this;
	}

	public PrintQueueErrorsPage VerifyInvalidProcessDate() {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtPocessDate, eledtlblProcessDate, "35299999");
		click(elebtnSearch);
		verifyPartialText(b.eleErrorPanel, "Invalid Date");
		return this;

	}

	public PrintQueueErrorsPage VerifywithInvalidCaseID() throws InterruptedException {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		setPastDate(eledtPocessDate);
		clearAndType(eletxtCaseID,eletxtCaseID, "12");
		click(elebtnSearch);
		Thread.sleep(2000);
		verifyPartialText(b.eleErrorPanel, "Invalid Case ID");

		return this;
	}

	public PrintQueueErrorsPage VerifyInvalidNoticeID() {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		setPastDate(eledtPocessDate);
		clearAndType(eletxtNoticeID,eletxtNoticeID, "12");
		click(elebtnSearch);
		verifyPartialText(b.eleErrorPanel, "Invalid Document ID");

		return this;
	}

	public PrintQueueErrorsPage VerifyFutureProcessdate() {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		// clearAndType(elehdrProcessDate,eledtlblProcessDate, "321321");
		setFutureDate(eledtPocessDate);
		click(elebtnSearch);
		verifyPartialText(b.eleErrorPanel, "Future Date is not Allowed");
		return this;

	}

	public PrintQueueErrorsPage VerifyNoMatchRecords() throws InterruptedException {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtPocessDate, eledtlblProcessDate, "10012019");
		click(elebtnSearch);
		Thread.sleep(2000);
		verifyPartialText(b.eleErrorPanelNoMatch, "No Matching Records Found");
		return this;

	}

	public PrintQueueErrorsPage VerifySucessfulInquiry() {
		clickIcon(b.eleicnSelectFilter, elelblSelectFilter);
		clearAndType(eledtPocessDate, eledtlblProcessDate, "11042019");
		click(elebtnSearch);
		VerifyGridHasData(EleGridData);
		return this;

	}

}
