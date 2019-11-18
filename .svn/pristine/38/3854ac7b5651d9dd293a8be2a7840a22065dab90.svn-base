package com.protech.nvkids.pages.refm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class ViewReferenceAmountsPage extends SeleniumBase
{
	public ViewReferenceAmountsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Add New']") WebElement eleicnAddNew;
	
	public AddReferenceAmountsPage navigatetoAddReferenceAmounts()
	{
		clickIcon(eleicnAddNew, eleicnAddNew);
		return new AddReferenceAmountsPage();
	}
}
