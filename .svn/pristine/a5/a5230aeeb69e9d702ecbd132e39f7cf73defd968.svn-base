package com.protech.nvkids.pages.refm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewReferenceCodesPage extends SeleniumBase
{
	public ViewReferenceCodesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	CommonLocators cloc=new CommonLocators();
	
	//Associated screens section
	@FindBy(xpath="//span[text()='Note Processor']") WebElement elelinkNoteProcessor;
	
	//screen functions
	@FindBy(xpath="//span[text()='Reference Percentages']") WebElement elelinkReferencePercentages;
	@FindBy(xpath="//span[text()='Reference Amounts']") WebElement elelinkReferenceAmounts;
	@FindBy(xpath="//span[text()='Performance Measure Goals']") WebElement elelinkPerformanceMeasureGoals;
	
	//Select Filter section
	
	@FindBy(xpath="//input[@id='entityName']") WebElement eletxtReferenceEntity;
	@FindBy(xpath="//input[@id='entityName']/following::span[1]") WebElement eleReferenceEntityLOV;
	@FindBy(xpath="//label[text()=' Entity Name ']/following::td[1]") WebElement eleReferenceEntityLOVValue;
	@FindBy(xpath="//input[@id='attributeName']/following::span[1]") WebElement eleReferenceAttributeLOV;
	@FindBy(xpath="//label[text()=' Attribute Name ']/following::td[1]") WebElement eleReferenceAttributeLOVValue;
	
		
	@FindBy(xpath="//input[@id='attributeName']") WebElement eletxtReferenceAttribute;
	@FindBy(xpath="//input[@id='attributeDesc']") WebElement eletxtReferenceDescription;
	@FindBy(xpath="//input[@id='fromDate']") WebElement eletxtFromDate;
	@FindBy(xpath="//label[text()='From Date']") WebElement elelblFromDate;
	@FindBy(xpath="//label[text()='Through Date']") WebElement elelblThroughDate;
	
	@FindBy(xpath="//input[@id='toDate']") WebElement eletxtThroughDate;
	
		
	//Grid section
	@FindBy(xpath="//label[text()=' Reference Entity ']") WebElement elelblReferenceEntity;
	@FindBy(xpath="//label[text()=' Reference Attribute ']") WebElement elelblReferenceAttribute;
	@FindBy(xpath="//label[text()=' Reference Description ']") WebElement elelblReferenceDescription;
	@FindBy(xpath="//label[text()=' Code ']") WebElement elelblCode;
	@FindBy(xpath="//label[text()=' Code Description ']") WebElement elelblCodeDescription;
	@FindBy(xpath="//label[text()=' Updated On ']") WebElement elelblUpdatedOn;
	@FindBy(xpath="//label[text()=' Updated By ']") WebElement elelblUpdatedBy;
	@FindBy(xpath="//label[text()=' Reference Entity ']/following::td[1]") WebElement eledsoReferenceEntity;
	@FindBy(xpath="//label[text()=' Reference Entity ']/following::td[2]") WebElement eledsoReferenceAttribute;
	
	@FindBy(xpath="(//label[text()=' Reference Entity '])[2]") WebElement eleaccdnReferenceEntity;
	@FindBy(xpath="(//label[text()=' Reference Attribute '])[2]") WebElement eleaccdnReferenceAttribute;
	@FindBy(xpath="(//label[text()=' Reference Description '])[2]") WebElement eleaccdnReferenceDescription;
	@FindBy(xpath="(//label[text()=' Code '])[2]") WebElement eleaccdnCode;
	@FindBy(xpath="(//label[text()=' Code Description '])[2]") WebElement eleaccdnCodeDescription;
	@FindBy(xpath="(//label[text()=' Updated On '])[2]") WebElement eleaccdnUpdatedOn;
	@FindBy(xpath="(//label[text()=' Updated By '])[2]") WebElement eleaccdnUpdatedBy;
	
	
	
	public ViewReferenceCodesPage verifyFieldsPresent() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		verifyDisplayed(elelblReferenceEntity,eletxtReferenceEntity);
		verifyDisplayed(elelblReferenceAttribute,eletxtReferenceAttribute);
		verifyDisplayed(elelblReferenceDescription,eletxtReferenceDescription);
		verifyDisplayed(elelblFromDate,eletxtFromDate);
		verifyDisplayed(elelblThroughDate,eletxtThroughDate);
		//verifyGridHeaders(" Reference Entity "," Reference Attribute "," Reference Description "," Code "," Code Description "," Updated On "," Updated By ");
		verifyAssociatedScreens("Note Processor");
		return this;
	}
	
	public ViewReferenceCodesPage inquireWithValidValues()
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtReferenceEntity,elelblReferenceEntity, "ASSET");
		setFocus(eletxtReferenceAttribute);
		clearAndType(eletxtReferenceAttribute,elelblReferenceAttribute, "TYPE");
		pressEnterKey(eletxtReferenceAttribute);
		verifyExactText(eledsoReferenceEntity, "ASSET");
		return this;
	}
	
	
	public ViewReferenceCodesPage verifyAccordionSectionFields() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtReferenceEntity,elelblReferenceEntity, "ASSET");
		setFocus(eletxtReferenceAttribute);
		clearAndType(eletxtReferenceAttribute,elelblReferenceAttribute, "TYPE");
		pressEnterKey(eletxtReferenceAttribute);
		click(cloc.eleicnOpenAccordion);
		verifyDisplayed(elelblReferenceEntity,eleaccdnReferenceEntity);
		verifyDisplayed(elelblReferenceAttribute,eleaccdnReferenceAttribute);
		verifyDisplayed(elelblReferenceDescription,eleaccdnReferenceDescription);
		verifyDisplayed(elelblCode,eleaccdnCode);
		verifyDisplayed(elelblCodeDescription,eleaccdnCodeDescription);
		verifyDisplayed(elelblUpdatedOn,eleaccdnUpdatedOn);
		verifyDisplayed(elelblUpdatedBy,eleaccdnUpdatedBy);
		return this;
	}
	
	public ViewReferenceCodesPage inquireWithNullReferenceEntity() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		/*clearAndType(eletxtReferenceEntity, "ASSET");
		setFocus(eletxtReferenceAttribute);
		Thread.sleep(2000);
		clearAndType(eletxtReferenceAttribute, "TYPE");
		clear(eletxtReferenceEntity);
		clickIcon(eleicnSearch, eleicnSearch);
		verifyExactText(eleStatusBar, "One or More Error Occured. Update and Retry");*/
		clickIcon(eleReferenceEntityLOV, elelblReferenceEntity);
		doDoubleClick(eleReferenceEntityLOVValue);
		clickIcon(eleReferenceAttributeLOV, elelblReferenceAttribute);
		doDoubleClick(eleReferenceAttributeLOVValue);
		clear(eletxtReferenceEntity);
		pressEnterKey(eletxtReferenceEntity);
		verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
		verifyBorderColor(eletxtReferenceEntity,eletxtReferenceAttribute);
		return this;
	}
	
	public ViewReferenceCodesPage inquireWithNullReferenceAttribute() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clickIcon(eleReferenceEntityLOV, elelblReferenceEntity);
		doDoubleClick(eleReferenceEntityLOVValue);
		pressEnterKey(eletxtReferenceEntity);
		verifyExactText(cloc.eleStatusBar, "Reference Attribute :  Enter Required Fields");
		Thread.sleep(2000);
		verifyBorderColor(eletxtReferenceAttribute);
		return this;
	}
	
	public ViewReferenceCodesPage inquireWithInvalidReferenceEntityAndAttribute() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtReferenceEntity,elelblReferenceEntity, "TEST");
		Thread.sleep(2000);
		setFocus(eletxtReferenceAttribute);
		clearAndType(eletxtReferenceAttribute,elelblReferenceAttribute, "TEST");
		clickIcon(cloc.eleicnSearch, cloc.eleicnSearch);
		verifyExactText(cloc.eleStatusBar, "Reference Entity :  Entered Reference Entity, Reference Attribute Combination Does not Exist");
		verifyBorderColor(eletxtReferenceEntity);
		return this;
	}
			
	public ViewReferenceCodesPage inquireWithInvalidFromDate() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clickIcon(eleReferenceEntityLOV, elelblReferenceEntity);
		doDoubleClick(eleReferenceEntityLOVValue);
		clickIcon(eleReferenceAttributeLOV, elelblReferenceAttribute);
		doDoubleClick(eleReferenceAttributeLOVValue);
		clearAndType(eletxtFromDate,elelblFromDate, "31/31/9999");
		clickIcon(cloc.eleicnSearch, cloc.eleicnSearch);
		verifyExactText(cloc.eleStatusBar, "From Date :  Invalid Date");
		verifyBorderColor(eletxtFromDate);
		return this;
	}
	
	public ViewReferenceCodesPage inquireWithInvalidThroughDate() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clickIcon(eleReferenceEntityLOV, elelblReferenceEntity);
		doDoubleClick(eleReferenceEntityLOVValue);
		clickIcon(eleReferenceAttributeLOV, elelblReferenceAttribute);
		doDoubleClick(eleReferenceAttributeLOVValue);
		clearAndType(eletxtFromDate,elelblFromDate, "01/01/2019");
		clearAndType(eletxtThroughDate,elelblThroughDate, "31/31/9999");
		clickIcon(cloc.eleicnSearch, cloc.eleicnSearch);
		verifyExactText(cloc.eleStatusBar, "Through Date :  Invalid Date");
		verifyBorderColor(eletxtThroughDate);
		return this;
	}
	
	public ViewReferenceCodesPage inquireWithThroughDateLessThanFromDate() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clickIcon(eleReferenceEntityLOV, elelblReferenceEntity);
		doDoubleClick(eleReferenceEntityLOVValue);
		clickIcon(eleReferenceAttributeLOV, elelblReferenceAttribute);
		doDoubleClick(eleReferenceAttributeLOVValue);
		clearAndType(eletxtFromDate,elelblFromDate, "01/01/2019");
		clearAndType(eletxtThroughDate,elelblThroughDate, "12/31/2018");
		clickIcon(cloc.eleicnSearch, cloc.eleicnSearch);
		verifyExactText(cloc.eleStatusBar, "Through Date :  Through Date Must be Greater than or Equal to From Date");
		verifyBorderColor(eletxtThroughDate);
		return this;
	}
	
	public ViewReferenceCodesPage verifyMaxLengthOfReferenceEntity() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		verifyFieldLength(eletxtReferenceEntity, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEF", 30);
		return this;
	}
	
	public ViewReferenceCodesPage verifyMaxLengthOfReferenceAttribute() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clickIcon(eleReferenceEntityLOV, elelblReferenceEntity);
		doDoubleClick(eleReferenceEntityLOVValue);
		verifyFieldLength(eletxtReferenceAttribute, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEF", 30);
		return this;
	}
	
	public ViewReferenceCodesPage verifyMaxLengthOfFromDate() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		verifyFieldLength(eletxtFromDate, "01/01/2019", 10);
		return this;
	}
	
	public ViewReferenceCodesPage verifyMaxLengthOfThroughDate() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		verifyFieldLength(eletxtThroughDate, "01/01/2019", 10);
		return this;
	}
	
	public AddReferenceCodesPage navigatetoAddReferenceCodes() throws Exception
	{
		clickIcon(cloc.eleicnAdd,cloc.eleicnAdd);
		return new AddReferenceCodesPage();
	}
	
	public EditReferenceCodesPage navigatetoEditReferenceCodes() throws Exception
	{
		clickIcon(cloc.eleicnFilter,cloc.eleicnFilter);
		clearAndType(eletxtReferenceEntity,elelblReferenceEntity, "ASSET");
		setFocus(eletxtReferenceAttribute);
		clearAndType(eletxtReferenceAttribute,elelblReferenceAttribute, "TYPE");
		pressEnterKey(eletxtReferenceAttribute);
		Thread.sleep(2000);
		doDoubleClick(eledsoReferenceEntity);
		return new EditReferenceCodesPage();
	}
	
	public ViewReferencePercentagesPage navigatetoViewReferencePercentages() throws Exception
	{
		clickLink(elelinkReferencePercentages);
		return new ViewReferencePercentagesPage();
	}
	
	public ViewReferenceAmountsPage navigatetoViewReferenceAmounts() throws Exception
	{
		clickLink(elelinkReferenceAmounts);
		return new ViewReferenceAmountsPage();
	}
	
	public ViewPerformanceMeasureGoalsPage navigatetoViewPerformanceMeasureGoals() throws Exception
	{
		clickLink(elelinkPerformanceMeasureGoals);
		return new ViewPerformanceMeasureGoalsPage();
	}
	
}
