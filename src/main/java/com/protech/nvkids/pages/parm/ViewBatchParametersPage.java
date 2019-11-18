package com.protech.nvkids.pages.parm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.nvkids.pages.bstl.PrintQueueErrorsPage;
import com.protech.selenium.api.base.SeleniumBase;

public class ViewBatchParametersPage extends SeleniumBase

{
	public ViewBatchParametersPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//Screen functions Navigation
	@FindBy(xpath="//span[text()='Manage Batch Parameters']") WebElement eleBatchParametersScreen;
	
	//View Screen function
	@FindBy(xpath="//label[text()='Job ID']") WebElement eleJobIdLabel;
	@FindBy(xpath="//input[@id='jobCode']") WebElement eleJobIdTextBox;
	@FindBy(xpath="//span[@class='ui-button-icon-left ui-clickable fa fa-search']") WebElement eleJobIdLov;
	@FindBy(xpath="//span[@title='BME SUSPENSION OR REINSTATEMENT OUTGOING']") WebElement eleFirstLovValue;
	@FindBy(xpath="(//span[@class='ui-button-text ui-clickable'])[6]") WebElement eleOkLovButton;
	@FindBy(xpath="//span[@class='fa fa-search ui-clickable ui-button-icon-left ng-star-inserted']") WebElement eleSearchButton;
	@FindBy(xpath="//td[@class='ui-resizable-column ng-star-inserted'][1]") WebElement eleDoubleClickGrid;
	
	//View Screen function - Grid
	@FindBy(xpath="//tr[1]/td[@class='ui-resizable-column ng-star-inserted'][1]") WebElement eleFirstCell;
	@FindBy(xpath="(//i[@class='pi pi-chevron-down'])[1]") WebElement eleOpenArrowGrid;
	@FindBy(xpath="//i[@class='pi pi-chevron-up']") WebElement eleCloseArrowGrid;
	@FindBy(xpath="//th[text()='Job ID ']") WebElement eleJobIdGrid;
	@FindBy(xpath="//th[text()='Job Description ']") WebElement eleJobDescriptionGrid;
	@FindBy(xpath="//th[text()='Job Name ']") WebElement eleJobNameGrid;
	@FindBy(xpath="//th[text()='Run Frequency ']") WebElement eleRunFrequencyGrid;
	@FindBy(xpath="//th[text()='Run Date ']") WebElement eleRunDateGrid;
	
	//View Screen function - Accordion Grid
	@FindBy(xpath="//label[text()='Commit Frequency :']") WebElement eleCommitFrequencyAgrid;
	@FindBy(xpath="//label[text()='Exception Threshold :']") WebElement eleExceptionThresholdAgrid;
	@FindBy(xpath="//label[text()='Agency File Path :']") WebElement eleAgencFilePathAgrid;
	@FindBy(xpath="//label[text()='File I/O Type :']") WebElement eleFileIoTypeAgrid;
	@FindBy(xpath="//label[text()='File Name :']") WebElement eleFileNameAgrid;
	
	//Error Panel
		@FindBy(xpath="//div[@class='messagetextrow'][2]/span") WebElement eleErrorPanel;

	
		public ViewBatchParametersPage verifyFieldsPresent() throws Exception
		{
			verifyDisplayed(eleJobIdGrid);
			verifyDisplayed(eleJobDescriptionGrid);
			verifyDisplayed(eleJobNameGrid);
			verifyDisplayed(eleRunFrequencyGrid);
			verifyDisplayed(eleRunDateGrid);
			return this;
		}
		
	public ViewBatchParametersPage inquirewithInvalidValidJobId()
	{
		
		clearAndType(eleJobIdTextBox, eleJobIdLabel, "KKKKKKK");
		click(eleSearchButton);	
		verifyPartialText(eleErrorPanel, "Invalid Value");
		return this;
	}

	public ViewBatchParametersPage inquirewithValidJobId()
	{
		
		clearAndType(eleJobIdTextBox, eleJobIdLabel, "NVB0014");
		click(eleSearchButton);
		verifyPartialText(eleFirstCell, "NVB0014");
		return this;
		
	}
	
	
	public ViewBatchParametersPage verifyJobIdlength()
	{
		
		clearAndType(eleJobIdTextBox, eleJobIdLabel, "NVB00148");
		verifyFieldLength(eleJobIdTextBox, 7);
		return this;
	}
	
	public ViewBatchParametersPage expandaccordion() throws Exception
	{
		
		clearAndType(eleJobIdTextBox, eleJobIdLabel, "NVB0014");
		click(eleSearchButton);	
		click(eleOpenArrowGrid);
		verifyDisplayed(eleCommitFrequencyAgrid);
		verifyDisplayed(eleExceptionThresholdAgrid);
		verifyDisplayed(eleAgencFilePathAgrid);
		verifyDisplayed(eleFileIoTypeAgrid);
		verifyDisplayed(eleFileNameAgrid);
		return this;
		
	}
	
	public ViewBatchParametersPage collapseccordion()
	{
		
		clearAndType(eleJobIdTextBox, eleJobIdLabel, "NVB0014");
		click(eleSearchButton);
		click(eleOpenArrowGrid);
		click(eleCloseArrowGrid);
		return this;
		
	}
	
	public UpdateBatchParametersPage editpagenavigation()
	{
		
		clearAndType(eleJobIdTextBox, eleJobIdLabel, "NVB0014");
		click(eleSearchButton);	
		doDoubleClick(eleDoubleClickGrid);
		
		return new UpdateBatchParametersPage();
		
	}
	
}
