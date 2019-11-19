package com.protech.nvkids.pages.refm;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class AddReferencePercentagesPage extends SeleniumBase
{
	public AddReferencePercentagesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	CommonLocators cloc=new CommonLocators();
	@FindBy(xpath="//label[text()='Percentage Code']") WebElement elelblPercentageCode;
	@FindBy(xpath="//label[text()='Percentage Description']") WebElement elelblPercentageDescription;
	@FindBy(xpath="//label[text()='Percentage %']") WebElement elelblPercentage;
	@FindBy(xpath="//label[text()='Begin Date']") WebElement elelblBeginDate;
	@FindBy(xpath="//label[text()='End Date']") WebElement elelblEndDate;
	@FindBy(xpath="//label[text()='Updated On']") WebElement elelblUpdatedOn;
	@FindBy(xpath="//label[text()='Updated By']") WebElement elelblUpdatedBy;
	
	@FindBy(id="percentageTypeCode") WebElement eletxtPercentageCode;
	@FindBy(id="percentageTypeDesc") WebElement eletxtPercentageDescription;
	@FindBy(id="referencePct") WebElement eletxtPercentage;
	@FindBy(id="beginDate") WebElement eletxtBeginDate;
	@FindBy(id="endDate") WebElement eletxtEndDate;
	@FindBy(id="beginValidityDttm") WebElement eledsoUpdatedOn;
	@FindBy(id="updatedByName") WebElement eledsoUpdatedBy;
		
	
			
	public AddReferencePercentagesPage verifyFieldsPresent() throws Exception
	{
		verifyDisplayed(elelblPercentageCode, eletxtPercentageCode);
		verifyDisplayed(elelblPercentageDescription, eletxtPercentageDescription);
		verifyDisplayed(elelblPercentage, eletxtPercentage);
		verifyDisplayed(elelblBeginDate, eletxtBeginDate);
		verifyDisplayed(elelblEndDate, eletxtEndDate);
		verifyDisplayed(elelblUpdatedOn, eledsoUpdatedOn);
		verifyDisplayed(elelblUpdatedBy, eledsoUpdatedBy);
		verifyRequiredField(elelblPercentageCode);
		verifyOptionalField(elelblEndDate);
		return this;
	}
	
	public AddReferencePercentagesPage verifyMaxLengthOfPercentageCode() throws Exception
	{
		verifyFieldLength(eletxtPercentageCode, "ABCDE", 4);
		return this;
	}
	
	public AddReferencePercentagesPage verifyMaxLengthOfPercentageDesc() throws Exception
	{
		verifyFieldLength(eletxtPercentageDescription, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRST", 70);
		return this;
	}
	
	public AddReferencePercentagesPage verifyMaxLengthOfPercentage() throws Exception
	{
		verifyFieldLength(eletxtPercentage, "1234567", 5);
		return this;
	}
	
	public AddReferencePercentagesPage verifyMaxLengthOfBeginDate() throws Exception
	{
		verifyFieldLength(eletxtBeginDate, "01/01/2019", 10);
		return this;
	}
	
	public AddReferencePercentagesPage verifyMaxLengthOfEndDate() throws Exception
	{
		verifyFieldLength(eletxtEndDate, "01/01/2019", 10);
		return this;
	}
	
	public AddReferencePercentagesPage verifyAddWithNullValues()
	{
		clickIcon(cloc.eleicnSave,cloc.eleicnSave);
		verifyErrorsInPanel("Percentage Code","Enter Required Fields","Percentage Description","Enter Required Fields","Percentage %","Enter Required Fields","Begin Date","Enter Required Fields");
		return this;
	}
	
	public AddReferencePercentagesPage verifyAddWithNoPercentageCode()
	{
		clearAndType(eletxtPercentageDescription, elelblPercentageDescription, "TEST DATA");
		clearAndType(eletxtPercentage, elelblPercentage, "98.50");
		setFutureDate(eletxtBeginDate);
		clickIcon(cloc.eleicnSave,cloc.eleicnSave);
		verifyExactText(cloc.eleErrStatusBar, "Percentage Code :  Enter Required Fields");
		return this;
	}
	
}
