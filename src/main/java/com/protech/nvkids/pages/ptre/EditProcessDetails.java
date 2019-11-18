package com.protech.nvkids.pages.ptre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class EditProcessDetails extends SeleniumBase {

	CommonLocators cloc = new CommonLocators();

	public EditProcessDetails(){
		PageFactory.initElements(driver, this);
	}


	// Edit Screen function Name - BreadCrumb
	@FindBy(xpath = "//p-breadcrumb/descendant::a/span[text()='View Process Details']") public WebElement eleViewBreadCrumbHeader;
	@FindBy(xpath = "//p-breadcrumb/descendant::a/span[text()='Edit Process Details']") public WebElement eleEditBreadCrumbHeader;

	@FindAll(
			{
				@FindBy(xpath = "//p-breadcrumb/descendant::a/span[text()='View Process Details']"),
				@FindBy(xpath = "//p-breadcrumb/descendant::a/span[text()='Edit Process Details']")
			}) public WebElement eleComHeaderPanel;

	// Edit Screen Detail section - Controls
	@FindAll(value = { @FindBy(xpath="//div[@class='p-col-12 HeaderHighlight']/descendant::lib-label-value") }) public List <WebElement> eleHeaderPanel; //labeltext - Field Naem,getTExt = value
	@FindBy(xpath = "//label[text()='Manual Start']") public WebElement eleManualStart;
	@FindBy(xpath = "//lib-radio-input[@label='Allowed']") public WebElement eleAllowedRadioBtn;
	@FindBy(xpath = "//lib-radio-input[@label='Not Allowed']") public WebElement eleNotAllowedRadioBtn;
	@FindBy(xpath = "//lib-radio-input[@label='Allowed']/descendant::label") public WebElement eleAllowedRadioBtnclick;
	@FindBy(xpath = "//lib-radio-input[@label='Not Allowed']/descendant::label") public WebElement eleNotAllowedRadioBtnclick;

	// Edit Screen Controls

	@FindBy(xpath = "//span[text()='Refresh']") public WebElement eleRefresh;
	@FindBy(xpath = "//span[text()='Save']") public WebElement eleSave;
	@FindBy(xpath = "//lib-button/descendant::button/span[contains(@class,'close')]") public WebElement eleCloseIcon;
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/div/span") public WebElement eleEditPTREStatusBar;
	@FindBy(xpath="//div[contains(@class,'errorContainer')]/span") public WebElement eleEditPTREStatusBarDone;




	// Confirmation Popup:
	@FindBy(xpath = "//lib-confirm-dialog/descendant::span") public WebElement elePopUpTitle;
	@FindBy(xpath = "//lib-confirm-dialog/descendant::a") public WebElement elePopUpCloseIcon;
	@FindBy(xpath = "//div[contains(@class,'confirmDialog')]/descendant::lib-label/div") public WebElement elePopuContent;
	@FindBy(xpath = "//lib-confirm-dialog/descendant::span[text()='Yes']") public WebElement eleYesIcon;
	@FindBy(xpath = "//lib-confirm-dialog/descendant::span[text()='No']") public WebElement eleNoIcon;


	public void selectAllowed(){

		click(eleAllowedRadioBtnclick);
	}

	public void selectNotAllowed(){
		//clickIcon(eleNotAllowedRadioBtnclick,eleNotAllowedRadioBtnclick);
		click(eleNotAllowedRadioBtnclick);
	}


	public ViewProcessDetails clickSave(){
		click(eleSave);
		//clickIcon(eleSave,eleSave);
		return new ViewProcessDetails();
	}
	public void clickRefersh(){
		clickIcon(eleRefresh,eleRefresh);
	}

	public ViewProcessDetails clickCloseIcon() throws InterruptedException{
		Actions actions = new Actions(driver); 
		actions.moveToElement(eleCloseIcon);
		Thread.sleep(1500);
		clickIcon(eleCloseIcon,eleCloseIcon);
		return new ViewProcessDetails();
	}
	public void selRadioBtn(WebElement ele){
		clickIcon(ele,ele);
	}

	public void verifyEditProcessDetailsAppearance() throws Exception
	{

		verifyPanelFields("Process ID","Process","Category","Updated On","Updated By");
		verifyDisplayed(eleManualStart, eleManualStart);
		verifyDisplayed(eleAllowedRadioBtn, eleAllowedRadioBtn);
		verifyDisplayed(eleNotAllowedRadioBtn, eleNotAllowedRadioBtn);
		verifyDisplayed(eleSave, eleSave);
		verifyDisplayed(eleRefresh, eleRefresh);
		verifyDisplayed(eleCloseIcon, eleCloseIcon);

	}
	public void verifyUpdateWithoutChanges() throws Exception
	{

		clickSave();
		verifyExactText(eleEditPTREStatusBar, "No Value Was Changed or Added or Deleted");

	}

	public void verifyUpdateWithChanges() throws Exception
	{   


		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){
			selectNotAllowed();
		}
		else{
			selectAllowed();
		}

		clickSave();
		verifyExactText(eleEditPTREStatusBar, "Saved Successfully.");
	}

	public void clickRefershwithoutSavingChanges() throws Exception
	{   

		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){
			selectNotAllowed();
		}
		else{
			selectAllowed();
		}

		clickRefersh();
		verifyExactText(elePopUpTitle, "Unsaved Information");
		verifyDisplayed(elePopUpCloseIcon, elePopUpCloseIcon);
		verifyExactText(elePopuContent, "You have unsaved information. Do you want to Refresh anyway?");
		verifyDisplayed(eleYesIcon, eleYesIcon);
		verifyDisplayed(eleNoIcon, eleNoIcon);

	}
	public void clickRefershwithoutSavingChangesClickYes() throws Exception
	{   
		WebElement SelectToBeSelected;


		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){

			SelectToBeSelected = eleNotAllowedRadioBtnclick;
		}
		else{
			SelectToBeSelected = eleAllowedRadioBtnclick;
		}
		click(SelectToBeSelected);
		clickRefersh();
		verifyExactText(elePopUpTitle, "Unsaved Information");
		verifyDisplayed(elePopUpCloseIcon, elePopUpCloseIcon);
		verifyExactText(elePopuContent, "You have unsaved information. Do you want to Refresh anyway?");
		verifyDisplayed(eleYesIcon, eleYesIcon);
		verifyDisplayed(eleNoIcon, eleNoIcon);
		click(eleYesIcon);

		if(SelectToBeSelected.getAttribute("class").contains("ui-label-active")==false){
			reportStep("Changes are reverted", "pass");
		}
		else{
			reportStep("Changes are still present", "fail");
		}

	}
	public void clickRefershwithoutSavingChangesClickNo() throws Exception
	{   
		WebElement SelectToBeSelected;


		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){

			SelectToBeSelected = eleNotAllowedRadioBtnclick;
		}
		else{
			SelectToBeSelected = eleAllowedRadioBtnclick;
		}
		click(SelectToBeSelected);
		clickRefersh();
		verifyExactText(elePopUpTitle, "Unsaved Information");
		verifyDisplayed(elePopUpCloseIcon, elePopUpCloseIcon);
		verifyExactText(elePopuContent, "You have unsaved information. Do you want to Refresh anyway?");
		verifyDisplayed(eleYesIcon, eleYesIcon);
		verifyDisplayed(eleNoIcon, eleNoIcon);
		click(eleNoIcon);

		if(SelectToBeSelected.getAttribute("class").contains("ui-label-active")==true){
			reportStep("Changes are Still Present", "pass");
		}
		else{
			reportStep("Changes are reverted", "fail");
		}

	}

	public void clickCancelwithoutSavingChanges() throws Exception
	{   

		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){
			selectNotAllowed();
		}
		else{
			selectAllowed();
		}
		executeJavaScript(eleCloseIcon);
		Thread.sleep(3000);
		verifyExactText(elePopUpTitle, "Screen Navigation");
		verifyDisplayed(elePopUpCloseIcon, elePopUpCloseIcon);
		verifyExactText(elePopuContent, "You have unsaved information. Do you want to navigate anyway?");
		verifyDisplayed(eleYesIcon, eleYesIcon);
		verifyDisplayed(eleNoIcon, eleNoIcon);

	}

	public void clickClickYesInNavigationPopup() throws Exception
	{   
		WebElement SelectToBeSelected;


		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){
			SelectToBeSelected = eleNotAllowedRadioBtnclick;
		}
		else{
			SelectToBeSelected = eleAllowedRadioBtnclick;
		}
		click(SelectToBeSelected);
		executeJavaScript(eleCloseIcon);
		Thread.sleep(3000);
		verifyExactText(elePopUpTitle, "Screen Navigation");
		verifyDisplayed(elePopUpCloseIcon, elePopUpCloseIcon);
		verifyExactText(elePopuContent, "You have unsaved information. Do you want to navigate anyway?");
		verifyDisplayed(eleYesIcon, eleYesIcon);
		verifyDisplayed(eleNoIcon, eleNoIcon);
		click(eleYesIcon);

		String Actualtext = eleComHeaderPanel.getText();
		if(Actualtext.equals("View Process Details")){
			reportStep("Sucessfully Navigate to: "+ Actualtext, "pass");
		}
		else if(Actualtext.equals("Edit Process Details")){
			reportStep("Still on the Same Screen: "+ Actualtext, "fail");
		}

	}

	public void clickClickNoInNavigationPopup() throws Exception
	{   
		WebElement SelectToBeSelected;


		if(eleAllowedRadioBtnclick.getAttribute("class").contains("ui-label-active") == true){
			SelectToBeSelected = eleNotAllowedRadioBtnclick;
		}
		else{
			SelectToBeSelected = eleAllowedRadioBtnclick;
		}
		click(SelectToBeSelected);
		executeJavaScript(eleCloseIcon);
		Thread.sleep(3000);
		verifyExactText(elePopUpTitle, "Screen Navigation");
		verifyDisplayed(elePopUpCloseIcon, elePopUpCloseIcon);
		verifyExactText(elePopuContent, "You have unsaved information. Do you want to navigate anyway?");
		verifyDisplayed(eleYesIcon, eleYesIcon);
		verifyDisplayed(eleNoIcon, eleNoIcon);
		click(eleNoIcon);

		String Actualtext = eleComHeaderPanel.getText();
		if(Actualtext.equals("View Process Details")){
			reportStep("Sucessfully Navigate to: "+ Actualtext, "pass");
		}
		else if(Actualtext.equals("Edit Process Details")){
			reportStep("Still on the Same Screen: "+ Actualtext, "fail");
		}

	}
	public void clickCancelwithoutAnyChanges() throws Exception
	{   

		Thread.sleep(1000);
		executeJavaScript(eleCloseIcon);
		Thread.sleep(3000);
		verifyExactText(eleEditPTREStatusBarDone, "Done");

	}


	public void verifyPanelFields(String...expected){
		ArrayList<String> Headers = new ArrayList<String>();
		ArrayList<String> expec = new ArrayList<String>();
		for (String exp : expected){

			expec.add(exp);

		}


		try{
			for (WebElement col : eleHeaderPanel){
				Headers.add(col.getAttribute("labeltext").trim());
			}
			if (expec.equals(Headers)) 
			{
				log.info("Panel Header is present");
				for(String display : expected){
					System.out.println(display);
					reportStep("Grid Header "+ display  +" is present", "pass");
				}

			}
			else{

				log.info("Panel Header is not present");
				reportStep("Panel Header is not present", "fail");
				Assert.fail();
			}
		}
		catch (Exception e) 
		{
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable Panel header --> " + error, "fail");
			log.error("Unable to Panel headers --> " + error);
			System.err.println("Unable to Panel headers");
			Assert.fail();
		}
		finally 
		{
			takeSnap();
		}



	}




}