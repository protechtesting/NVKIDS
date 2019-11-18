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
	@FindBy(id="percentageTypeCode") WebElement eletxtPercentageCode;
	@FindBy(id="percentageTypeDesc") WebElement eletxtPercentageDescription;
	@FindBy(id="referencePct") WebElement eletxtPercentage;
	@FindBy(id="beginDate") WebElement eletxtBeginDate;
	
	public void verifyErrors()
	{
		clickIcon(cloc.eleicnSave,cloc.eleicnSave);
		verifyErrorsInPanel("Percentage Code","Enter Required Fields","Percentage Description","Enter Required Fields","Percentage %","Enter Required Fields","Begin Date","Enter Required Fields");
	
	}
	
}
