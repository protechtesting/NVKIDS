package com.protech.nvkids.pages.smsg;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class ViewSystemMessages extends SeleniumBase{
	
	public ViewSystemMessages(){
		PageFactory.initElements(driver, this);
	}
	
	// Screen Functions
	@FindBy(xpath = "//a[contains(@title,'SMSG')]") WebElement eleSMSG_SystemMessages;
	@FindBy(xpath = "(//span[text()='System Messages'])[2]/preceding-sibling::span/parent::a") WebElement eleSMSG_Sub_SystemMessages;
	@FindBy(xpath = "(//span[text()='Broadcast Messages'])[1]/preceding-sibling::span/parent::a") WebElement eleSMSG_Sub_BroadcastMessages;
	
	//Filter Section
	@FindBy(xpath = "//span[@class='nv-filter filterIcon']/parent::a") WebElement ele_lbl_SelectFilter;
	@FindBy(xpath = "(//span[@class='ng-star-inserted']/parent::label)[1]/ancestor::p-dropdown") WebElement ele_lbl_MessageType;
	@FindBy(id = "errorCode") WebElement ele_lbl_MessageID;
	@FindBy(id = "errorDesc") WebElement ele_lbl_MessageDescription;
	@FindBy(xpath = "(//label[@class='fieldLabel'])[3]/following-sibling::p-dropdown") WebElement ele_lbl_SearchByCode;
	@FindBy(xpath = "//span[text()='Clear']/parent::button") WebElement ele_lbl_ClearButton;
	@FindBy(xpath = "(//span[contains(text(),'Search')])[1]/ancestor::p-button") WebElement ele_lbl_SearchButton;
	
	//View System Messages Grid
	@FindBy(xpath = "//label[contains(text(),'Message ID')]/parent::th") WebElement ele_hdr_MessageID;
	@FindBy(xpath = "//label[contains(text(),'Description')]/parent::th") WebElement ele_hdr_Description;
	@FindBy(xpath = "//label[contains(text(),' Message Type Code ')]/parent::th") WebElement ele_hdr_MessageTypeCode;
	@FindBy(xpath = "//label[contains(text(),' Updated On ')]/parent::th") WebElement ele_hdr_UpdateOn;
	@FindBy(xpath = "//label[contains(text(),' Updated By')]/parent::th") WebElement ele_hdr_UpdatedBy;
	
	//Grid Options
	@FindBy(xpath = "//span[@title='Grid Options']") WebElement ele_icon_GridOptionsIcon;
	@FindBy(xpath = "//span[text()='Show Columns ']") WebElement ele_opt_GridOptionShowColumn;
	@FindBy(xpath = "//label[text()='Message ID']/parent::p-checkbox") WebElement ele_SC_MessageID;
	@FindBy(xpath = "//label[text()='Description']/parent::p-checkbox") WebElement ele_SC_Description;
	@FindBy(xpath = "//label[text()='Message Type Code']/parent::p-checkbox") WebElement ele_SC_MessageTypeCode;
	@FindBy(xpath = "//label[text()='Updated On']/parent::p-checkbox") WebElement ele_SC_UpdatedOn;
	@FindBy(xpath = "//label[text()='Updated By']/parent::p-checkbox") WebElement ele_SC_UpdatedBy;	
	@FindBy(xpath = "//span[contains(text(),'Download File')]/parent::div") WebElement ele_DownloadFile;
	@FindBy(xpath = "//div[contains(text(),' Download XLS ')]") WebElement ele_Download_XLS;
	
	/*public void inquire(){
		
		CommonLocators cloc = new CommonLocators();
		
		clickIcon(cloc.eleicnFilter, ele_lbl_SelectFilter);
		
		selectDropDownUsingText(ele_lbl_MessageType, "India");
		selectDropDownUsingText(ele_lbl_MessageType, "India");
		
	}
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
}
