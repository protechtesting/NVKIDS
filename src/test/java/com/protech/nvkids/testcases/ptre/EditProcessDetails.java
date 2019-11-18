package com.protech.nvkids.testcases.ptre;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.protech.nvkids.pages.login.LoginPage;
import com.protech.nvkids.pages.ptre.ViewProcessDetails;
import com.protech.selenium.api.base.SeleniumBase;

import utils.CommonLocators;

public class EditProcessDetails extends SeleniumBase  {

	CommonLocators  cloc = new CommonLocators();


	@Test(priority=1,description="NavigateToViewProcessDetails and Verify the fields in Edit Process Details screen")
	public void verifyEditProcessDetailsAppearance() throws Exception
	{
		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().verifyEditProcessDetailsAppearance();

	}


	@Test(priority=2,description="Edit without making any changes")
	public void verifyUpdateWithoutChanges() throws Exception
	{
		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().verifyUpdateWithoutChanges();

	}



	@Test(priority=3,description="Edit with making any changes")
	public void verifyUpdateWithChanges() throws Exception
	{   

		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().verifyUpdateWithChanges();
	}

	@Test(priority=4,description="Click Refresh withoutSaving  changes")
	public void clickRefershwithoutSavingChanges() throws Exception
	{   

		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickRefershwithoutSavingChanges();

	}

	@Test(priority=5,description="Click Refresh withoutSaving  changes and click Yes")
	public void clickRefershwithoutSavingChangesClickYes() throws Exception
	{   
		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickRefershwithoutSavingChangesClickYes();

	}


	@Test(priority=6,description="Click Refresh withoutSaving  changes and click No")
	public void clickRefershwithoutSavingChangesClickNo() throws Exception
	{   
		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickRefershwithoutSavingChangesClickNo();
	}

	@Test(priority=5,description="Click Refresh without Any  changes")
	public void clickRefershwithoutAnyChanges() throws Exception
	{   

		com.protech.nvkids.pages.ptre.EditProcessDetails editPTRE = new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails();
		editPTRE.clickRefersh();
		Thread.sleep(3000);
		verifyExactText(editPTRE.eleEditPTREStatusBarDone, "Done");


	}
	@Test(priority=6,description="Click close without Save changes")
	public void clickCancelwithoutSavingChanges() throws Exception
	{   

		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickCancelwithoutSavingChanges();

	}

	@Test(priority=6,description="Click close without Save changes and Select YEs")
	public void clickClickYesInNavigationPopup() throws Exception
	{   
		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickClickYesInNavigationPopup();
			
	}
	@Test(priority=6,description="Click close without Save changes and Select No")
		public void clickClickNoInNavigationPopup() throws Exception
		{   
		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickClickNoInNavigationPopup();
				
		}
	
	@Test(priority=7,description="Click close without any  changes")
	public void clickCancelwithoutAnyChanges() throws Exception
	{   

		new LoginPage().login().quickNavigation_PTRE().navigateToEditProcessDetails().clickCancelwithoutAnyChanges();

	}



}