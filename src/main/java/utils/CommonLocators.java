package utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

public class CommonLocators extends SeleniumBase
{
	public CommonLocators()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/div") public WebElement eleErrStatusBar;
	@FindBy(xpath="//div[contains(@class,'errorContainer')]") public WebElement eleStatusBar;
	@FindBy(xpath="//a[contains(@class,'selectFilter')]") public WebElement eleicnFilter;
	@FindBy(xpath="//span[text()='Search']") public WebElement eleicnSearch;
	@FindBy(xpath="//span[text()='Clear']") public WebElement eleicnClear;
	@FindBy(xpath="//span[text()='Save']") public WebElement eleicnSave;
	@FindBy(xpath="//span[text()='Add']") public WebElement eleicnAdd;
	@FindBy(xpath="//span[text()='Add New']") public WebElement eleicnAddNew;
	@FindBy(xpath="//span[text()='Add Revision']") public WebElement eleicnAddRevision;
	@FindBy(xpath="//span[text()='Edit']") public WebElement eleicnEdit;
	@FindBy(xpath="(//i[@class='pi pi-chevron-down'])[1]") public WebElement eleicnOpenAccordion;
	@FindBy(xpath="//i[@class='pi pi-chevron-up'][1]") public WebElement eleicnCloseAccordion;
	@FindBy(xpath="//span[@title='Grid Options']") public WebElement eleicnGridOptions;
	@FindBy(xpath="//span[text()='Show Columns ']") public WebElement eleicnShowColumns;
	
	
	
}
