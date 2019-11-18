package com.protech.nvkids.pages.proc;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;


public class ViewProcessDetails extends SeleniumBase 
{
	public ViewProcessDetails() 
	{
		PageFactory.initElements(driver, this); 
	}
    
	//Screen functions
	@FindBy(xpath="//span[text()='Maintain Process']") WebElement elelnkPROC_ProcessDetails;
	@FindBy(xpath = "//span[text()='View Process Details']") WebElement eleViewProcessDetails;
	@FindBy(xpath = "//span[text()='View Documents Associated']") WebElement eleViewDocumentsAssociated;
	@FindBy(xpath = "//span[text()='Add Documents Associated']") WebElement eleAddDocumentsAssociated;
	@FindBy(xpath = "//span[text()='Edit Documents Associated']") WebElement eleEditDocumentsAssociated;
	
	
	//Filter Section
	@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']")  WebElement eleicnSelectFilter;	
	@FindBy(xpath="//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted'][contains(text(),'Filter')]") WebElement elelblSelectFilter;
	
	@FindBy(xpath="//input[@id='processCode']") WebElement elelovProcessName;
	
	@FindBy(xpath="//span[text()='Search']") WebElement elebtnSearch;
	@FindBy(xpath="//span[text()='Clear']") WebElement elebtnClear;
	
	
	//Grid section
	@FindBy(xpath="//label[text()=' Role ']") WebElement elehdrRole;
	@FindBy(xpath="//label[text()=' Task ID ']") WebElement elehdrTaskID;
	@FindBy(xpath="//label[text()=' Task ']") WebElement elehdrTask;
	@FindBy(xpath="//label[text()=' Evaluate ']") WebElement elehdrEvaluate;
	@FindBy(xpath="//label[text()=' Outcome ']") WebElement elehdrOutcome;
	@FindBy(xpath="//label[text()=' Next Task ID ']") WebElement elehdrNextTaskID;
	@FindBy(xpath="//label[text()=' Next Task ']") WebElement elehdrNextTask;
	@FindBy(xpath="//label[text()=' Docs ']") WebElement elehdrDoc;
	
	//Error Panel
    @FindBy(xpath = "//div[@class='p-grid']/div/app-status-bar/div/span[2]")  public WebElement eleErrorPanel;	
	@FindBy(xpath = "//app-core/app-layout//div/div/app-status-bar/div/span")  public WebElement eleErrorPanelNoMatch;
	

	//Filter icon
	@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']") WebElement EleicnOpenFilter;
}
	