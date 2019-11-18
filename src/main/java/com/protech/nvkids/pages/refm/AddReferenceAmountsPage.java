package com.protech.nvkids.pages.refm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class AddReferenceAmountsPage extends SeleniumBase 
{
	public AddReferenceAmountsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//label[text()='Begin Date']/preceding::span[1]") WebElement eleicnDropdown;
	@FindBy(xpath = "//label[text()='Frequency']") WebElement elelblFrequency;
	@FindBy(xpath = "//span[text()='--Select--']") WebElement eledrpFrequency;

	public AddReferenceAmountsPage selectfreqdropdownvalue()
	{
		clickIcon(eleicnDropdown, elelblFrequency);
		selectRandomDropdownValue();
		return this;
	}
}
