package com.protech.nvkids.pages.ptre;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.nvkids.pages.refm.ViewReferenceCodesPage;
import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewProcessDetails extends SeleniumBase

{
	CommonLocators cloc = new CommonLocators();
	public ViewProcessDetails() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@title='Quick Navigation']") WebElement eleQuickNavigation;
	@FindBy(xpath = "(//input[@type='text'])[2]") WebElement eletxtQuickNavigationText;

	//Screen functions Navigation
	@FindBy(xpath="//span[ text()='Task Details']") public WebElement eleTaskDetails;
	@FindBy(xpath="") public WebElement eleEditProcessDetails;

	//Select Filers:
	@FindBy(xpath="//span[text()='Search']") public WebElement eleicnSearch;
	@FindBy(xpath="//span[text()='Clear']") public WebElement eleicnClear;
	@FindBy(xpath="//input[@id='processCode']") public WebElement eleFltrProcessID;
	@FindBy(xpath="//input[@id='processCode']/following::button") public WebElement eleFltrProcessLOV;
	@FindBy(xpath="//tbody[@class='ui-table-tbody']") public WebElement eleLOVTable;


	// Grid Column

	@FindBy(xpath="//span[@title='Grid Options']") public WebElement eleGridOptions;
	@FindBy(xpath="(//div[@class='ui-overlaypanel-content']/div/child::p-checkbox)[1]") public WebElement eleShowFilter;
	@FindBy(xpath="//span[text()='Show Columns ']") public WebElement eleShowColumn;
	@FindBy(xpath="//span[text()='Download File']") public WebElement eleDownloadFile;
	@FindAll(value = { @FindBy(xpath="//div[@class='ui-overlaypanel-content']/div/child::p-checkbox//child::label") }) public List <WebElement> eleShowColumOptions;
	@FindAll(value = { @FindBy(xpath="//div[@class='ui-overlaypanel-content']/div[@class='filterItems']") }) public List <WebElement> eleDownloadFileOptions;
	@FindBy(xpath="//div[@class='ui-overlaypanel-content']/div[contains(@class,'filterItems')]/descendant::span") public List <WebElement> eleGridOptionsPanel;
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/div/span") public WebElement eleStatusBarInfo;

	//Status Bar:
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/div") public WebElement eleEditPTREStatusBar;
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/span[text()=' Done']") public WebElement eleEditPTREStatusBarDone;



	public ViewProcessDetails quickNavigation_PTREagain() throws IOException
	{
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText,eletxtQuickNavigationText, "PTRE");
		pressEnterKey(eletxtQuickNavigationText);
		return  this;
	}

	public EditProcessDetails navigateToEditProcessDetails() throws IOException, InterruptedException
	{   

		openFilter();
		enterProcessID("CASS");
		clickSearch();
		Thread.sleep(3000);
		doubleClickGridResult("CASS");
		Thread.sleep(3000);
		return  new EditProcessDetails();
	}

	public ViewTaskDetails navigateToViewTaskDetails() throws IOException, InterruptedException
	{   
		click(eleTaskDetails);
		return  new ViewTaskDetails();
	}


	public void openFilter(){

		clickIcon(cloc.eleicnFilter, cloc.eleicnFilter);

	}

	public ViewProcessDetails enterProcessID(String data){
		clearAndType(eleFltrProcessID,eleFltrProcessID, data);
		return this;
	}

	public ViewProcessDetails clickSearch(){
		clickIcon(cloc.eleicnSearch,cloc.eleicnSearch);
		return this;
	}

	public void  clickClear(){
		clickIcon(cloc.eleicnClear, cloc.eleicnClear);

	}
	public ViewProcessDetails viewStatusBar(String expectedText){
		verifyExactText(cloc.eleStatusBar, expectedText);
		return this;

	}

	public void VerifyScreenFields() throws Exception
	{


		Thread.sleep(3000);
		verifyAssociatedScreens("Maintain Process","Case Processor");
		verifyDisplayed(cloc.eleicnFilter,cloc.eleicnFilter);
		verifyGridHeaders("Process ID","Process","Category","Manual Start","Updated On","Updated By");
	}
	public void RenavigationtoPTRE() throws Exception{

		Thread.sleep(3000);
		quickNavigation_PTREagain();
		verifyExactText(eleStatusBarInfo, "You are on this screen");

	}

	public void VerifySizeAllowanceinProcessID() throws Exception{


		Thread.sleep(3000);
		openFilter();
		verifyFieldLength(eleFltrProcessID, "ADASFSADFSDFAS", 4);

	}

	public void VerifySelectFilters() throws Exception{

		Thread.sleep(3000);
		openFilter();
		Thread.sleep(3000);
		verifyDisplayed(eleicnSearch,eleicnSearch);
		verifyDisplayed(eleicnClear,eleicnClear);
		verifyDisplayed(eleFltrProcessID,eleFltrProcessID);
	}

	public void VerifyAlphaCharAllowanceinProcessID() throws Exception{

		Thread.sleep(3000);
		openFilter();
		VerifyChar_allowance(eleFltrProcessID, "AGDC");
	}
	public void VerifyNumericCharAllowanceinProcessID() throws Exception{

		Thread.sleep(3000);
		openFilter();
		VerifyChar_allowance(eleFltrProcessID, "1234");
	}
	public void VerifySpecialCharAllowanceinProcessID() throws Exception{


		Thread.sleep(3000);
		openFilter();
		VerifyChar_NotAllowance(eleFltrProcessID, "@#$%");
	}
	public void InquireInvalidValueinProcessID() throws Exception{

		Thread.sleep(3000);
		openFilter();
		setFocus(eleFltrProcessID);
		enterProcessID("abcd");
		clickIcon(eleicnSearch, eleicnSearch);
		verifyExactText(eleEditPTREStatusBar, "Process ID :  Invalid Process Code");
		verifyBorderColor(eleFltrProcessID);

	}
	public void InquireInvalidValueinProcessDescription() throws Exception{


		Thread.sleep(3000);
		openFilter();
		setFocus(eleFltrProcessID);
		enterProcessID("CASS");
		eleFltrProcessID.sendKeys(Keys.TAB);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		eleFltrProcessID.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		eleFltrProcessID.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(1000);
		eleFltrProcessID.sendKeys(Keys.BACK_SPACE);			
		Thread.sleep(1000);
		click(eleicnSearch);
		verifyExactText(eleEditPTREStatusBar, "Process ID :  Invalid Value");
		verifyBorderColor(eleFltrProcessID);

	}
	public void VerifyClearValueinFilter() throws Exception{


		Thread.sleep(3000);
		openFilter();
		enterProcessID("AGDC");
		clickClear();
		verifyFieldIsEmpty(eleFltrProcessID);

	}
	public void InquireValidValue() throws Exception{


		Thread.sleep(3000);
		openFilter();
		enterProcessID("CASS");
		clickSearch();
		Thread.sleep(3000);
		verifyInquiredGridResult("CASS");


	}
	public void InquirewithNoValue() throws Exception{


		Thread.sleep(3000);
		openFilter();
		Thread.sleep(1000);
		clickSearch();
		Thread.sleep(3000);
		verifyInquiredGridResult("CASS");
	}
	public void VerifyGridOptionsValues() throws Exception{

		Thread.sleep(3000);
		click(eleGridOptions);
		Thread.sleep(3000);
		verifyGridOptions("Show Columns","Download File");
	}


	public void verifyGridOptions(String...data) {
		try 
		{
			ArrayList<String> GridOptions = new ArrayList<String>();
			ArrayList<String> expec = new ArrayList<String>();
			List<WebElement> GridValues = eleGridOptionsPanel;
			for (WebElement col : GridValues){
				if(col.getText().contains("Download") == true ){
					break;
				}
				else{
					GridOptions.add(col.getText().trim());
					//System.out.println(col.findElement(By.tagName("label")).getText());
				}

				for(String exp : data ){
					expec.add(exp.trim());

				}

				if (expec.equals(GridOptions)) 
				{
					log.info("Grid Options present");
					for(String display : data){
						System.out.println(display);
						reportStep("Grid Options "+ display  +" is present", "pass");
					}


				}
				else{

					log.info("Grid Options is not present");
					reportStep("Grid Options is not present", "fail");
				}
			}
		}
		catch (Exception e) 
		{
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable find grid options --> " + error, "fail");
			log.error("Unable to find grid options --> " + error);
			System.err.println("Unable to find grid options");
			throw new RuntimeException();
		}
		finally 
		{
			takeSnap();
		}

	}




}
