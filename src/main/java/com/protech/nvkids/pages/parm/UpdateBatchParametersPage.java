package com.protech.nvkids.pages.parm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class UpdateBatchParametersPage extends SeleniumBase 

{
	public UpdateBatchParametersPage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	
		//Error Panel
			@FindBy(xpath="//div[@class='messagetextrow'][2]/span") WebElement eleErrorPanel;
	//Update Screen function
	@FindBy(xpath="//input[@id='commitFreqNumb']") WebElement eleCommitFrequency;
	@FindBy(xpath="//input[@id='exceptionThresholdNumb']") WebElement eleExceptionThreshold;
	@FindBy(xpath="//input[@id='serverPathName']") WebElement eleAgencyFilePath;
	@FindBy(xpath="//input[@id='fileName']") WebElement eleFileName;
	@FindBy(xpath="//span[text()='Save']") WebElement eleSaveButton;
	@FindBy(xpath="label[text()='Commit Frequency']") WebElement eleLabCommitFrequency;
	@FindBy(xpath="label[text()='Exception Threshold']") WebElement eleLabExceptionThreshold;
	@FindBy(xpath="label[text()='Agency File Path']") WebElement eleLabAgencyFilePath;
	@FindBy(xpath="label[text()='File Name']") WebElement eleLabFileName;
	
	
	public UpdateBatchParametersPage editfieldsverify() throws Exception
	{
		verifyDisplayed(eleLabCommitFrequency);
		verifyEnabled(eleCommitFrequency);
		verifyRequiredField(eleCommitFrequency);
		verifyDisplayed(eleLabExceptionThreshold);
		verifyEnabled(eleExceptionThreshold);
		verifyRequiredField(eleExceptionThreshold);
		verifyDisplayed(eleLabAgencyFilePath);
		verifyEnabled(eleAgencyFilePath);
		verifyDisplayed(eleLabFileName);
		verifyEnabled(eleFileName);
		
		return this;
		
	}
	
	
	public UpdateBatchParametersPage nullcommitfreq() throws Exception
	{
		clear(eleCommitFrequency);
		click(eleSaveButton);
		verifyPartialText(eleErrorPanel, "Enter Reqired Field");
		return this;
		
	}
	
	public UpdateBatchParametersPage invalidcommitfreq() throws Exception
	{
		clearAndType(eleCommitFrequency, eleLabCommitFrequency, "3000");
		click(eleSaveButton);
		verifyPartialText(eleErrorPanel, "Invalid Value");
		return this;
		
	}
	
	public UpdateBatchParametersPage verifylength() throws Exception
	{
		clearAndType(eleCommitFrequency, eleLabCommitFrequency, "300000");
		verifyFieldLength(eleCommitFrequency, 5);
		
		clearAndType(eleExceptionThreshold, eleLabExceptionThreshold, "300000");
		verifyFieldLength(eleExceptionThreshold, 5);
		
		
		clearAndType(eleAgencyFilePath, eleLabAgencyFilePath, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
		verifyFieldLength(eleAgencyFilePath, 60);
		
		clearAndType(eleFileName, eleLabFileName, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa2");
		verifyFieldLength(eleFileName, 60);
		
		return this;
		
	}
	
	
	public UpdateBatchParametersPage nullexceptionthreshold() throws Exception
	{
		clear(eleExceptionThreshold);
		click(eleSaveButton);
		verifyPartialText(eleErrorPanel, "Enter Reqired Field");
		return this;
		
	}
	
	public UpdateBatchParametersPage invalidexceptionthreshold() throws Exception
	{
		clearAndType(eleExceptionThreshold, eleLabCommitFrequency, "3000");
		click(eleSaveButton);
		verifyPartialText(eleErrorPanel, "Invalid Value");
		return this;
		
	}
	
	public UpdateBatchParametersPage updatearecord() throws Exception
	{
		clearAndType(eleExceptionThreshold, eleLabCommitFrequency, "57");
		clearAndType(eleCommitFrequency, eleLabCommitFrequency, "68");
		click(eleSaveButton);
		verifyPartialText(eleErrorPanel, "Saved Successfully.");
		return this;
		
	}
	
	public UpdateBatchParametersPage novaluechanges() throws Exception
	{
		click(eleSaveButton);
		verifyPartialText(eleErrorPanel, "No Value Was Changed or Added or Deleted");
		return this;
		
	}
	
	
	
}
