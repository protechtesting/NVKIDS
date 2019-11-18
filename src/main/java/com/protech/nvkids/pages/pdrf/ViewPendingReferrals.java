package com.protech.nvkids.pages.pdrf;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;
import com.protech.selenium.api.base.SeleniumBase;

public class ViewPendingReferrals extends SeleniumBase 
{
	public ViewPendingReferrals() 
	{
		PageFactory.initElements(driver, this);
	}	
	//---------Screen functions---------------
		@FindBy(xpath="//span[text()='Maintain Pending Referrals']") WebElement elelnkPDRF_maintainpendingreferrals;
		@FindBy(xpath = "//span[text()='Process Pending Referrals']") WebElement eleViewPendingReferrals;		
	
		//---------------Filter Section-------------
		@FindBy(xpath = "//span[@class='fa fa-angle-double-down downIcon']")  WebElement eleicnSelectFilter;	
		@FindBy(xpath="//a[@class='pull-right bold text-dark-blue selectFilterbtn ng-star-inserted'][contains(text(),'Filter')]") WebElement elelblSelectFilter;
		
		//Program Type
		@FindBy(xpath="//label[text()='Program Type']") WebElement elelblProgramType;
		@FindBy(xpath = "label[@class='ng-tns-c38-172 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted')]") WebElement eleddProgramType;
		
		//IV-D Office
		@FindBy(xpath = "//label[text()='IV-D Office']") WebElement elelbIVDOffice;
		@FindBy(id="welfareOfficeCode") WebElement eletxtIVDOffice;
		@FindBy(xpath = "//span[@class='ui-button-icon-left ui-clickable fa fa-search']") WebElement elelovIVDOffice;
		
		//Status
		@FindBy(xpath="//label[text()='Status']") WebElement elelbStatus;
		@FindBy(xpath = "//label[@class='ng-tns-c38-173 ui-dropdown-label ui-inputtext ui-corner-all ng-star-inserted']") WebElement eleddStatus;
		
		//From Date
		@FindBy(xpath ="//label[text()='From Date']") WebElement elelbFromDate;
		@FindBy(id = "fromDate") WebElement eletxtFromDate;
		@FindBy(xpath = "//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c59-170 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']") WebElement eledtFromDate;
		
		//Through Date
		@FindBy(xpath ="//label[text()='Through Date']") WebElement elelbThroughDate;
		@FindBy(id="toDate") WebElement eletxtThroughDate;
		@FindBy(xpath = "//button[@class='ui-datepicker-trigger ui-calendar-button ng-tns-c59-171 ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ng-star-inserted']") WebElement eledtThroughDate;
				
		@FindBy(xpath="//span[text()='Search']") WebElement elebtnSearch;
		@FindBy(xpath="//span[text()='Clear']") WebElement elebtnClear;
		
		//--------------Grid Section-----------------------------
		@FindBy(xpath="//label[text()='Referral Date']") WebElement elehdrReferralDate;
		@FindBy(xpath="//label[text()='Program Case ID']") WebElement elehdrProgramCaseID;
		@FindBy(xpath="//label[text()='CST Name']") WebElement elehdrCSTName;
		@FindBy(xpath="//label[text()='NCP Name']") WebElement elehdrNCPName;
		@FindBy(xpath="//label[text()='IV-D Office]") WebElement elehdrIVDOffice;
		@FindBy(xpath="//label[text()='Program Type']") WebElement elehdrProgramType;
		@FindBy(xpath="//label[text()='Program Member ID']") WebElement elehdrProgramMemberID;
		@FindBy(xpath="//label[text()='Good Cause']") WebElement elehdrGoodCause;
		@FindBy(xpath="//label[text()='Reason']") WebElement elehdrReason;
		@FindBy(xpath="//label[text()='Status']") WebElement elehdrStatus;
		
		//-------------Grid Accordion section----------------------
		@FindBy(id="ui-accordiontab-0") WebElement elepnlCaseDetails;
		@FindBy(id = "ui-accordiontab-1") WebElement elepnlCaseParticipantDetails;
		@FindBy(id = "ui-accordiontab-2") WebElement elepnlParticipantAdditionalDetails;
		
		//-------------Grid Accordion section - Case Details panel----------------------
		@FindBy(xpath="//div[contains('/div/app-case-details/div/div[1]/lib-label-value[3]/div/span']") WebElement eledsoProgramType;
		@FindBy(xpath="//span[contains('#ui-accordiontab-0-content > div > app-case-details > div > div:nth-child(1) > lib-label-value:nth-child(2) > div > span']") WebElement eledsoReferralOffice;
		
		
		
		
		
		
}
