package com.protech.selenium.api.design;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

public interface Element {


	/**
	 * This method will click the element and take snap
	 * @param ele   - The Webelement (button/link/element) to be clicked
	 * @see locateElement method in Browser Class
	 * @author 
	 * @throws StaleElementReferenceException
	 */
	public void click(WebElement ele);


	/**
	 * This method will enter the value in the given text field 
	 * @param ele   - The Webelement (text field) in which the data to be entered
	 * @param data  - The data to be sent to the webelement
	 * @see locateElement method in Browser Class
	 * @author 
	 * @throws ElementNotInteractable,IllegalArgumentException(throws if keysToSend is null)	
	 */

	public void clear(WebElement ele);

	/**
	 * This method will clear and type the value in the given text field 
	 * @param ele   - The Webelement (text field) in which the data to be entered
	 * @param data  - The data to be sent to the webelement
	 * @see locateElement method in Browser Class
	 * @author Santhosh
	 * @throws ElementNotInteractable,IllegalArgumentException(throws if keysToSend is null)		 
	 */
	public void clearAndType(WebElement ele,WebElement label,String data);

	/**
	 * This method will get the visible text of the element
	 * @param ele   - The Webelement (button/link/element) in which text to be retrieved
	 * @author 
	 * @see locateElement method in Browser Class
	 */
	public String getElementText(WebElement ele);	

	/**
	 * This method will get the Color values of the element
	 * @param ele   - The Webelement (button/link/element) in which text to be retrieved
	 * @see locateElement method in Browser Class
	 * @author Santhosh
	 * @return The visible text of this element.
	 */
	public String getBackgroundColor(WebElement ele);

	/**
	 * This method will get the text of the element textbox
	 * @param ele   - The Webelement (button/link/element) in which text to be retrieved
	 * @see locateElement method in Browser Class
	 * @author 
	 * @return The attribute/property's current value (or) null if the value is not set.
	 */
	public String getTypedText(WebElement ele);


	/**
	 * This method will select the drop down visible text
	 * @param ele   - The Webelement (dropdown) to be selected
	 * @param value The value to be selected (visibletext) from the dropdown
	 * @see locateElement method in Browser Class 
	 * @author 
	 * @throws NoSuchElementException
	 */
	public void selectDropDownUsingText(WebElement ele, String value) ;

	/**
	 * This method will select the drop down using index
	 * @param ele   - The Webelement (dropdown) to be selected
	 * @param index The index to be selected from the dropdown
	 * @see locateElement method in Browser Class
	 * @author  
	 * @throws NoSuchElementException
	 */
	public void selectDropDownUsingIndex(WebElement ele, int index) ;

	/**
	 * This method will select the drop down using index
	 * @param ele   - The Webelement (dropdown) to be selected
	 * @param value - The value to be selected (value) from the dropdown 
	 * @see locateElement method in Browser Class
	 * @author 
	 * @throws NoSuchElementException
	 */
	public void selectDropDownUsingValue(WebElement ele, String value) ;

	/**
	 * This method will verify exact given text with actual text on the given element
	 * @param ele   - The Webelement in which the text to be need to be verified
	 * @param expectedText  - The expected text to be verified
	 * @author 
	 * @see locateElement method in Browser Class
	 * @return true if the given object represents a String equivalent to this string, false otherwise
	 */
	public void verifyExactText(WebElement ele, String expectedText);

	/**
	 * This method will verify given text contains actual text on the given element
	 * @param ele   - The Webelement in which the text to be need to be verified
	 * @param expectedText  - The expected text to be verified
	 * @author 
	 * @see locateElement method in Browser Class
	 * @return true if this String represents the same sequence of characters as the specified string, false otherwise
	 */
	public void verifyPartialText(WebElement ele, String expectedText);

	/**
	 * This method will verify exact given attribute's value with actual value on the given element
	 * @param ele   - The Webelement in which the attribute value to be need to be verified
	 * @param attribute  - The attribute to be checked (like value, href etc)
	 * @param value  - The value of the attribute
	 * @author 
	 * @see locateElement method in Browser Class
	 * @return true if this String represents the same sequence of characters as the specified value, false otherwise
	 */
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value);

	/**
	 * This method will verify partial given attribute's value with actual value on the given element
	 * @param ele   - The Webelement in which the attribute value to be need to be verified
	 * @param attribute  - The attribute to be checked (like value, href etc)
	 * @param value  - The value of the attribute
	 * @author 
	 * @see locateElement method in Browser Class
	 * @return true if this String represents the same sequence of characters as the specified value, false otherwise
	 * 
	 */
	public boolean verifyPartialAttribute(WebElement ele, String attribute, String value);

	/**
	 * This method will verify if the element is visible in the DOM
	 * @param ele   - The Webelement to be checked
	 * @author 
	 * @see locateElement method in Browser Class
	 * @return true if the element is displayed or false otherwise
	 * @throws Exception 
	 */
	public void verifyDisplayed(WebElement label,WebElement ele) throws Exception;

	/**
	 * This method will checking the element to be invisible
	 * @param ele   - The Webelement to be checked
	 * @author 
	 * @see locateElement method in Browser Class
	 */
	public boolean verifyDisappeared(WebElement ele);	

	/**
	 * This method will verify if the input element is Enabled
	 * @param ele   - The Webelement (Radio button, Checkbox) to be verified
	 * @return true - if the element is enabled else false
	 * @author 
	 * @since 3rd Jun 2019
	 * @see locateElement method in Browser Class
	 * @return True if the element is enabled, false otherwise.
	 */
	public boolean verifyEnabled(WebElement ele);	

	/**
	 * This method will verify if the element (Radio button, Checkbox) is selected
	 * @param ele   - The Webelement (Radio button, Checkbox) to be verified
	 * @author 
	 * @since 3rd Jun 2019
	 * @see locateElement method in Browser Class
	 * @return True if the element is currently selected or checked, false otherwise.
	 */
	public boolean verifySelected(WebElement ele);


	void verifyRequiredField(WebElement label);


	void verifyOptionalField(WebElement ele);


	String decode(String data);


	void clickOffset(WebElement ele, int xOffset, int yOffset);


	void doDoubleClick(WebElement ele);


	void setFocus(WebElement ele);


	public ArrayList<String> findAllLinksOnPage();


	int getTotalDropDownOptions(WebElement ele);


	void getElementWidth(WebElement ele);


	void getElementHeight(WebElement ele);


	boolean verifyElementHasAttribute(WebElement ele, String attribute);


	void clickIcon(WebElement ele,WebElement label);


	void clickLink(WebElement ele);


	void verifyUpdatedOn(WebElement ele, WebElement label);


	void verifyUpdatedBy(WebElement ele, WebElement label, WebElement eleloggedInUserName);

	void setCurrentDate(WebElement element);


	String setFutureDate(WebElement ele);


	void setPastDate(WebElement element);


	void uploadFile(String path) throws IOException;


	void pressKey(WebElement ele, String key) throws IOException;


	void delay(int waittime) throws IOException, InterruptedException;


	void closeBrowser();


	void deleteAllcookies();


	void executeJavaScript(WebElement element);


	void forWard();


	void reFresh();


	void scrolltoPosition(String value);


	void elementscrollPosition(WebElement element);


	void killBrowser(String killpath) throws IOException;


	void deselectAlloptions(int waittime, WebElement[] elements);


	void doRightClick(WebElement ele);


	String getAttribute(WebElement ele, String data) throws IOException;


	String getURL();


	void softAssertDisplayed(WebElement ele);


	Boolean verifyNumberEquality(WebElement ele, int number) throws IOException, InterruptedException;


	boolean verifyAlertNotPresent();


	boolean verifyAlertPresent();


	void verifyElementNotChecked(WebElement ele);


	void verifyCursorFocus(WebElement ele) throws IOException, InterruptedException;


	void selectDateFromCalendar(WebElement ele, int date);


	void createHubforGrid();


	void joinAsNodeforGrid();


	void setupGrid();

	int getRandomNumbers();


	void verifyBorderColor(WebElement... elements);


	void verifyGridHeaders(String... expected);


	void verifyAssociatedScreens(String... expected);


	void verifyFieldIsEmpty(WebElement ele);


	void selectDropdownValue(WebElement ele,String value);

	void selectRandomDropdownValue(WebElement ele);

	public void doubleClickGridResult(String data);

	void verifyInnerGridHeaders(String... expected);

	public void verifyInquiredGridResult(String data);
	
	
	/**
	 * This method will verify the list of options available inside Grid Options.
	 * @param String...data --> List of String Data can be passed as parameter using comma separator.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void verifyGridOptions(String...data);
	/**
	 * This method will check Show Filters checkbox if it is unchecked.
	 * @param N/A
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void CheckShowFilters(); 	

	/**
	 * This method will uncheck Show Filters checkbox if it is checked before.
	 * @param N/A
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void UnCheckShowFilters();

	/**
	 * This method used to click on 'Reset Filter' inside the Grid Options when 'Show Filter' is checked.
	 * @param N/A
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void clickResetFilter();
	/**
	 * This method used to verify list of Columns and their visibility(Hidden/Visible).
	 * @param String...data --> List of String Data can be passed as parameter using comma separator.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void verifyShowColumns(String...data);

	/**
	 * This method used to select Show Column check boxes to make it as visible.
	 * @param String data --> Column name which is to be changed as visible.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void selectShowColumn(String data);

	/**
	 * This method used to unselect Show Column check boxes to make it as hidden.
	 * @param String data --> Column name which is to be changed as hidden.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */

	public void UnselectShowColumn(String data);

	/**
	 * This method used to click and expand all rows to view Accordian grid details.
	 * @param N/A.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void ClickExpandAll();
	/**
	 * This method used to click and Collapse all rows to dock Accordian grid details.
	 * @param N/A.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void ClickCollapseAll();
	/**
	 * This method used to verify options available to download grid results in desired format.
	 * @param  String...data --> List of String Data can be passed as parameter using comma separator.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */

	public void verifyDownloadFileOptions(String...data);

	/**
	 * This method used to select an option to download grid results in desired format.
	 * @param  String data -->  Data - format name in which the result to be printed.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see GridOptions
	 * @return null.
	 */
	public void ClickAndDownloadFile(String data);

	/**
	 * This method used to verify the screen navigation by clicking any of the Associated Screen section link.
	 * @param  String ScreenName -->  ScreenName - Name of the Screen to which the navigation to be happened 
	 *                                SFName --> name of the default screen function name.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see verifyCurrenScreen
	 * @return null.
	 */
	public void VerifyAssociatedScreensNavigatoin(String ScreenName , String SFName);
	/**
	 * This method used to verify the Current Screen Name.
	 * @param  String ScreenName -->  ScreenName - Name of the current screen.
	 * @author Protech
	 * @since 19th Nov 2019
	 * @see verifyCurrenScreen
	 * @return null.
	 */

	public void verifyCurrenScreen(String ScreenName);







}
