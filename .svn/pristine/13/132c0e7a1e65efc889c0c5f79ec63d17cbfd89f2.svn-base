package com.protech.nvkids.pages.refm;

import java.util.HashMap;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class AddReferenceCodesPage extends SeleniumBase
{
	public AddReferenceCodesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	ViewReferenceCodesPage v=new ViewReferenceCodesPage();
	CommonLocators cloc=new CommonLocators();
	@FindBy(id="referenceCode") WebElement eletxtCode;
	@FindBy(id="referenceDesc") WebElement eletxtCodeDescription;
	
	public AddReferenceCodesPage verifyAddReferenceCodesFields() throws Exception
	{
		verifyDisplayed(v.elelblReferenceEntity,v.eletxtReferenceEntity);
		verifyDisplayed(v.elelblReferenceAttribute,v.eletxtReferenceAttribute);
		verifyDisplayed(v.elelblReferenceDescription,v.eletxtReferenceDescription);
		verifyDisplayed(v.elelblCode,eletxtCode);
		verifyDisplayed(v.elelblCodeDescription,eletxtCodeDescription);
		return this;
	}
	
	public AddReferenceCodesPage verifyMaxlengthofReferenceEntity()
	{
		verifyFieldLength(v.eletxtReferenceEntity, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDE", 30);
		return this;
	}
	
	public AddReferenceCodesPage verifyMaxlengthofReferenceAttribute()
	{
		verifyFieldLength(v.eletxtReferenceAttribute, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDE", 30);
		return this;
	}
	
	public AddReferenceCodesPage verifyMaxlengthofCode()
	{
		verifyFieldLength(eletxtCode, "ABCDEFGHIJKL", 10);
		return this;
	}
	
	public AddReferenceCodesPage verifyMaxlengthofCodeDescription()
	{
		verifyFieldLength(eletxtCode, "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRST", 70);
		return this;
	}
	
	public AddReferenceCodesPage verifyInvalidCodeLength()
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TYPE");
		clearAndType(eletxtCode,v.elelblCode, "123");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Code :  Code Length Exceeds the Maximum for Reference Entity and Reference Attribute Combination");
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithNullValues()
	{
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
		verifyBorderColor(v.eletxtReferenceEntity,v.elelblReferenceAttribute,eletxtCode,eletxtCodeDescription);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithNullReferenceEntity()
	{
		clearAndType(eletxtCode,v.elelblCode, "12");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "One or More Error Occured. Update and Retry");
		verifyBorderColor(v.eletxtReferenceEntity,v.eletxtReferenceAttribute);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithNullReferenceAttribute()
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		clearAndType(eletxtCode,v.elelblCode, "12");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Reference Attribute :  Enter Required Fields");
		verifyBorderColor(v.eletxtReferenceAttribute);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithNullCode() 
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TYPE");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Code :  Enter Required Fields");
		verifyBorderColor(eletxtCode);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithNullCodeDescription()
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TYPE");
		clearAndType(eletxtCode,v.elelblCode, "12");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Code Description :  Enter Required Fields");
		verifyBorderColor(eletxtCodeDescription);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithInvalidReferenceEntityAndAttribute() 
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "TEST");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TEST");
		clearAndType(eletxtCode,v.elelblCode, "12");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Reference Entity :  Entered Reference Entity, Reference Attribute Combination Does not Exist");
		verifyBorderColor(v.eletxtReferenceEntity);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithExistingCode() 
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TYPE");
		clearAndType(eletxtCode,v.elelblCode, "01");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Code :  Code Value Already Exists for the Selected Reference Entity and Reference Attribute");
		verifyBorderColor(eletxtCode);
		return this;
	}
	
	public AddReferenceCodesPage verifyAddWithExistingCodeDescription() 
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TYPE");
		clearAndType(eletxtCode,v.elelblCode, "19");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "SAVINGS ACCOUNT");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Code Description :  Code Description Already Exists for the Selected Reference Entity and Reference Attribute");
		verifyBorderColor(eletxtCodeDescription);
		return this;
	}

	public ViewReferenceCodesPage verifySuccessfulAdd() 
	{
		clearAndType(v.eletxtReferenceEntity,v.elelblReferenceEntity, "ASSET");
		setFocus(v.eletxtReferenceAttribute);
		clearAndType(v.eletxtReferenceAttribute,v.elelblReferenceAttribute, "TYPE");
		clearAndType(eletxtCode,v.elelblCode, "16");
		clearAndType(eletxtCodeDescription,v.elelblCodeDescription, "TEST ACCOUNTS");
		clickIcon(cloc.eleicnSave, cloc.eleicnSave);
		verifyExactText(cloc.eleStatusBar, "Saved Successfully.");
		return new ViewReferenceCodesPage();
	}
	
}
