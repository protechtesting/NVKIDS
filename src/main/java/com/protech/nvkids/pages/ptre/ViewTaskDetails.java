package com.protech.nvkids.pages.ptre;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewTaskDetails extends SeleniumBase
{
	CommonLocators cloc = new CommonLocators();
	public ViewTaskDetails() 
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@title='Quick Navigation']") WebElement eleQuickNavigation;
	@FindBy(xpath = "(//input[@type='text'])[2]") WebElement eletxtQuickNavigationText;

	//Screen functions Navigation
	@FindBy(xpath="//span[ text()='Task Details']") public WebElement eleProcessDetails;
	@FindBy(xpath="") public WebElement eleEditProcessDetails;


	// Grid Column
	@FindBy(xpath="//span[@title='Grid Options']") public WebElement eleGridOptions;
	//@FindAll(value = { @FindBy(xpath="//div[@class='ui-overlaypanel-content']/div[contains(@class,'filterItems')]") }) public List <WebElement> eleGridOptionsPanel;
	@FindBy(xpath="(//div[@class='ui-overlaypanel-content']/div/child::p-checkbox)[1]") public WebElement eleShowFilter;
	@FindBy(xpath="(//tr/td[@class='text-center ng-star-inserted'])[1]/descendant::i") public WebElement eleExpandCollapse;


	@FindBy(xpath="//span[text()='Show Columns ']") public WebElement eleShowColumn;
	@FindBy(xpath="//span[text()='Download File']") public WebElement eleDownloadFile;

	@FindAll(value = { @FindBy(xpath="//div[@class='ui-overlaypanel-content']/div/child::p-checkbox//child::label") }) public List <WebElement> eleShowColumOptions;
	@FindAll(value = { @FindBy(xpath="//div[@class='ui-overlaypanel-content']/div[@class='filterItems']") }) public List <WebElement> eleDownloadFileOptions;

	@FindAll(value = { 
			//@FindBy(xpath="//div[@class='ui-overlaypanel-content']/descendant::div[contains(@class,'filterItems')]//label"),
			@FindBy(xpath="//div[@class='ui-overlaypanel-content']/div[contains(@class,'filterItems')]") 

	}) public List <WebElement> eleGridOptionsPanel;

	// Select Filters - fields
	@FindBy(xpath="//input[@id='taskCode']") public WebElement eleFltrTask;
	@FindBy(xpath="//span[text()='ui-btn']") public WebElement eleFltrTaskLOV;
	@FindBy(xpath="") public WebElement eleLOVTable;
	@FindBy(xpath="//a[contains(@class,'selectFilter')]") public WebElement eleFilterIcn;
	@FindBy(xpath="//span[text()='Search']") public WebElement eleSearchFilter;
	@FindBy(xpath="//span[text()='Clear']") public WebElement eleClearFilter;



	//Status Bar:
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/div") public WebElement eleTasStatusBar;
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/span[text()=' Done']") public WebElement eleTaskBarDone;



	public ViewTaskDetails quickNavigation_PTREagain() throws IOException
	{
		clickIcon(eleQuickNavigation, eleQuickNavigation);
		clearAndType(eletxtQuickNavigationText,eletxtQuickNavigationText, "PTRE");
		pressEnterKey(eletxtQuickNavigationText);
		return  this;
	}



	public void openFilter(){
		click(cloc.eleicnFilter);
	}

	public ViewTaskDetails enterTask(String data){
		clearAndType(eleFltrTask,eleFltrTask, data);
		return this;
	}

	public ViewTaskDetails clickSearch(){
		click(eleSearchFilter);
		return this;
	}

	public void  clickClear(){
		click(eleClearFilter);

	}
	public ViewTaskDetails viewStatusBar(String expectedText){
		verifyExactText(cloc.eleStatusBar, expectedText);
		return this;

	}

	public void VerifyScreenFields() throws Exception
	{


		Thread.sleep(3000);
		verifyDisplayed(eleFilterIcn,eleFilterIcn);
		verifyAssociatedScreens("Maintain Process","Case Processor");
		verifyGridHeaders(" Task ID "," Task "," No. of Days to Complete "," Task Type "," Updated On "," Updated By ");
	}
	public void VerifySelectFilters() throws Exception{


		Thread.sleep(3000);
		openFilter();
		verifyDisplayed(eleSearchFilter,eleSearchFilter);
		verifyDisplayed(eleClearFilter,eleClearFilter);
		verifyDisplayed(eleFltrTask,eleFltrTask);
	}
	public void VerifySizeAllowanceinTask() throws Exception{

		openFilter();
		verifyFieldLength(eleFltrTask, "ADASFSADFSDFAS", 5);

	}

	public void VerifyAlphaCharAllowanceinTask() throws Exception{


		openFilter();
		VerifyChar_allowance(eleFltrTask, "AGDDC");
	}



	public void VerifyNumericCharAllowanceinTask() throws Exception{

		openFilter();
		VerifyChar_allowance(eleFltrTask, "12345");
	}


	public void VerifySpecialCharAllowanceinTask() throws Exception{
		openFilter();
		VerifyChar_NotAllowance(eleFltrTask, "@#^$%");
	}


	public void InquireInvalidValueinTask() throws Exception{

		openFilter();
		setFocus(eleFltrTask);
		enterTask("abcd");
		click(eleSearchFilter);
		verifyExactText(cloc.eleStatusBar, "Task ID :  Invalid Task Code");
		verifyBorderColor(eleFltrTask);

	}

	public void InquireInvalidValueinProcessDescription() throws Exception{


		Thread.sleep(3000);
		openFilter();
		setFocus(eleFltrTask);
		enterTask("VPSSN");
		eleFltrTask.sendKeys(Keys.TAB);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_SHIFT);
		eleFltrTask.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		robot.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		eleFltrTask.sendKeys(Keys.ARROW_RIGHT);
		Thread.sleep(1000);
		eleFltrTask.sendKeys(Keys.BACK_SPACE);			
		Thread.sleep(1000);
		click(eleSearchFilter);
		verifyExactText(eleTasStatusBar, "Task ID :  Invalid Value");
		verifyBorderColor(eleFltrTask);

	}


	public void VerifyClearValueinFilter() throws Exception{

		openFilter();
		enterTask("AGDC");
		clickClear();
		verifyFieldIsEmpty(eleFltrTask);

	}

	public void VerifyGridOptionsValues() throws Exception{

		click(eleGridOptions);
		verifyGridOptions("Show Filters","Show Columns","Expand All","Download File");
	}


	public void InquireValidValue() throws Exception{
		openFilter();
		enterTask("ADCAP");
		clickSearch();
		Thread.sleep(3000);
		verifyInquiredGridResult("ADCAP");


	}


	public void VerifyInnderGridValues() throws Exception{


		if(eleExpandCollapse.getAttribute("class").contains("chevron-down")){
			click(eleExpandCollapse);
			reportStep("Grid Expanded Successfully", "pass");
		}
		else{
			reportStep("Grid Already Expanded", "fail");

		}

		verifyInnerGridHeaders(" Role Code "," Role "," Category code "," Category "," Process Code "," Process ");

	}


	public void VerifyCollapseGrid() throws Exception{


		if(eleExpandCollapse.getAttribute("class").contains("chevron-down")){
			click(eleExpandCollapse);
			reportStep("Grid Expanded Successfully", "pass");
			click(eleExpandCollapse);
			reportStep("Grid Collapsed Successfully", "pass");
		}
		else if (eleExpandCollapse.getAttribute("class").contains("chevron-down")){
			click(eleExpandCollapse);
			reportStep("Grid Collapsed Successfully", "pass");
		}
		else{
			reportStep("Grid Already Collapsed", "fail");
		}

	}

	public void verifyGridOptions(String...data) {
		try 
		{
			ArrayList<String> GridOptions = new ArrayList<String>();
			ArrayList<String> expec = new ArrayList<String>();
			List<WebElement> GridValues = eleGridOptionsPanel;
			for (WebElement col : GridValues){
				String s = col.getText().trim().replaceAll("[^a-z A-Z]", "");
				GridOptions.add(s.trim());

			}

			for(String exp : data ){
				expec.add(exp.trim());
				//System.out.println(exp);
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

		catch (Exception e) 
		{
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable find grid options --> " + error, "fail");
			log.error("Unable to find grid options --> " + error);
			System.err.println("Unable to find grid options");
			Assert.fail("Unable to find grid options");
		}
		finally 
		{
			takeSnap();
		}

	}

}
