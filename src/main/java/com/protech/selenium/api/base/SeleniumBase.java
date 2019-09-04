package com.protech.selenium.api.base;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.protech.selenium.api.design.Browser;
import com.protech.selenium.api.design.Element;

import utils.DataLibrary;
import utils.Reporter;

public class SeleniumBase extends Reporter implements Browser, Element {

	public static RemoteWebDriver driver;
	public static WebDriverWait wait;
	int i = 1;
	
	int l=1,m=1,n=2;

	public ExtentReports extent;
	ExtentTest logger;

	@AfterMethod
	public void afterMethod() {
		driver.close();

	}

	@BeforeMethod
	public void beforeMethod() throws IOException {
		
		

		startApp("chrome", "http://192.168.111.183:81/#/login");
		testcaseName = DataLibrary.readdata("Test Execution", 0, l, m);
		testcaseDec = DataLibrary.readdata("Test Execution", 0, l, n);
		l++;

	}

	// ******INITIAL SETUP************

	
	public void startApp(String browser, String url) {

		try { 
			
		

			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				// NgWebDriver ngdriver = new NgWebDriver((JavascriptExecutor) driver);
				// NgWebDriver ngWebDriver = new NgWebDriver(driver);
				// ngWebDriver.waitForAngularRequestsToFinish();
				// driver.findElement(ByAngular.(�name�)).sendKeys(�NSE�);
			} else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			} else if (browser.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
			driver.navigate().to(url);
			
			System.out.println("URL PASSED");

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
			//reportStep("The Browser Launched successfully", "pass");
			System.out.println("end start appp");
		} catch (Exception e) {
			System.err.println("The Browser Could not be Launched. Hence Failed");
			//reportStep("TThe Browser Could not be Launched. Hence Failed", "fail");
			
			
		} finally {
			takeSnap();
		}

	}

	// ******ACTIONS************

	@Override
	public void click(WebElement ele) {
		try {

			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			reportStep("The Element " + ele.toString().substring(68) + " clicked", "pass");

		} catch (Exception e) {

			System.out.println(e);

			int a = e.toString().indexOf("Exception:");

			String str = e.toString().substring(0, a + 10);

			System.out.println("reached click catch block");
			reportStep("The Element " + ele + " could not be clicked - " + str, "fail");
			System.out.println(e.getMessage());
			
		} finally {
			takeSnap();
		}

	}

	public void submit(WebElement ele) {
		try {

			wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			ele.submit();
			reportStep("The Element submit button " + ele + " clicked", "pass");

		} catch (Exception e) {

			System.out.println(e);

			int a = e.toString().indexOf("Exception:");

			String str = e.toString().substring(0, a + 10);

			System.out.println("reached click catch block");
			reportStep("The Element submit button" + ele + " could not be clicked - " + str, "fail");
			System.out.println(e.getMessage());
		
		} finally {
			takeSnap();
		}

	}

	@Override
	public void clear(WebElement ele) {
		try {

			ele.clear();
			System.out.println("The field is cleared Successfully");

			reportStep("The Data :" + ele + " data cleared Successfully", "pass");
		} catch (ElementNotInteractableException e) {

			reportStep("The Data :" + ele + " data not cleared Successfully", "fail");
			System.err.println("The field is not Interactable");

		} finally {
			takeSnap();
		}
	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		try {

			ele.clear();
			ele.sendKeys(data);
			reportStep("The Data :" + data + " entered Successfully", "pass");
			
		} catch (Exception e) {
			reportStep("The Element " + ele + " is not Interactable", "fail");
			
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {

		try {

			new Select(ele).selectByVisibleText(value);

			reportStep("The dropdownvalue " + value + " is successfully selected", "pass");
		} catch (Exception e) {
			reportStep("The dropdownvalue " + value + " is not selected", "fail");
		} finally {
			takeSnap();
		}

	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {

		new Select(ele).selectByIndex(index);

		try {
			new Select(ele).selectByIndex(index);

			reportStep("The  " + index + 1 + " th dropdownvalue is successfully selected", "pass");
		} catch (Exception e) {
			reportStep("The  " + index + 1 + " th dropdownvalue is not selected", "fail");
		} finally {
			takeSnap();
		}

	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {

		try {

			new Select(ele).selectByValue(value);

			reportStep("The dropdowntext contains value is " + value + "   successfully selected", "pass");
		} catch (Exception e) {
			reportStep("The dropdowntext contains value is " + value + "   not selected", "fail");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void switchToAlert() {

		
		try {
			Alert alert = driver.switchTo().alert();

			reportStep("Successfully switched to Alert window", "pass");
		} catch (Exception e) {

			reportStep("failed to switch Alert window", "fail");

		}

	}

	@Override
	public void acceptAlert() {
		String text = "";
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.accept();
			System.out.println("The alert " + text + " is accepted.");
			reportStep("Alert successfully accepted", "pass");
		} catch (NoAlertPresentException e) {
			System.out.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
			reportStep("Failed to Accept Alert", "fail");
		}

	}

	@Override
	public void dismissAlert() {
		String text = "";
		try {
			Alert alert = driver.switchTo().alert();
			text = alert.getText();
			alert.dismiss();
			System.out.println("The alert " + text + " is accepted.");
			reportStep("Alert successfully dismissed", "pass");
		} catch (NoAlertPresentException e) {
			System.out.println("There is no alert present.");
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
			reportStep("Failed to dismiss Alert", "fail");
		}

	}

	@Override
	public void typeAlert(String data) {
		try {
			driver.switchTo().alert().sendKeys(data);
			reportStep("The data" + data + "entered on Alert window", "pass");
		} catch (Exception e) {
			reportStep("The data" + data + "not entered on Alert window", "fail");
		}

	}

	public void windowhandlings(int windowid) {

		try {
			String next = null;
			Set<String> windowHandles = driver.getWindowHandles();
			Iterator<String> iterator = windowHandles.iterator();

			for (int i = 1; i <= windowid; i++) {
				iterator.next();
			}

			driver.switchTo().window(next);
			reportStep("successfully switched to the window ID" + windowid, "pass");
		} catch (Exception e) {
			reportStep("failed to switch to the window ID" + windowid, "fail");
		}

	}

	@Override
	public void switchToWindow(int index) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			List<String> allhandles = new ArrayList<>(allWindows);
			String exWindow = allhandles.get(index);
			driver.switchTo().window(exWindow);
			System.out.println("The Window With index: " + index + " switched successfully");
			reportStep("successfully switched to the window index" + index, "pass");
		} catch (NoSuchWindowException e) {
			System.err.println("The Window With index: " + index + " not found");
			reportStep("successfully switched to the window index" + index, "pass");
		}
	}

	@Override
	public void switchTo_AllWindow(String title) {
		try {
			Set<String> allWindows = driver.getWindowHandles();
			for (String eachWindow : allWindows) {
				driver.switchTo().window(eachWindow);
				if (driver.getTitle().equals(title)) {
					break;
				}
			}
			System.out.println("The Window With Title: " + title + "is switched ");
		} catch (NoSuchWindowException e) {
			System.err.println("The Window With Title: " + title + " not found");
		} finally {
			takeSnap();
		}
	}

	@Override
	public void switchToFrame(int index) {

		try {
			driver.switchTo().frame(index);
			reportStep("successfully switched to the frame", "pass");

		} catch (Exception e) {
			reportStep("failed to switch to the frame", "fail");
		}

	}

	@Override
	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);

		try {
			driver.switchTo().frame(ele);
			reportStep("successfully switched to the frame", "pass");

		} catch (Exception e) {
			reportStep("failed to switch to the frame", "fail");
		}

	}

	@Override
	public void switchToFrame(String idOrName) {

		try {
			driver.switchTo().frame(idOrName);
			reportStep("successfully switched to the frame", "pass");

		} catch (Exception e) {
			reportStep("failed to switch to the frame", "fail");
		}

	}

	@Override
	public void defaultContent() {

		try {
			driver.switchTo().defaultContent();
			reportStep("successfully switched to the default frame", "pass");

		} catch (Exception e) {
			reportStep("failed to switch to the default frame", "fail");
		}

	}

	@Override
	public long takeSnap() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		try {
			FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),
					new File("./reports/images/" + number + ".jpg"));
		} catch (WebDriverException e) {
			System.out.println("The browser has been closed");
		} catch (IOException e) {
			System.out.println("The snapshot could not be taken");
		}
		return number;
	}

	public void setcurrentDate(WebElement element) {

		try {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Date date = new Date();

			String systemdateandtime = dateFormat.format(date);

			element.sendKeys(systemdateandtime);

			System.out.println("Current date and time: --- " + systemdateandtime);

			reportStep("current date successfully entered", "pass");
		} catch (Exception e) {
						e.printStackTrace();

			reportStep("failed to enter current date", "fail");
		}

	}

	public void setFutureDate(WebElement element) {

		try {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Date currentDate = new Date();
			System.out.println(dateFormat.format(currentDate));

			// convert date to calendar
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);
			c.add(Calendar.DATE, 1);

			String futuredateandtime = dateFormat.format(c.getTime());

			element.sendKeys(futuredateandtime);

			System.out.println("Future date and time: --- " + futuredateandtime);

			reportStep("future date successfully entered", "pass");
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("fail to enter future date", "fail");
		}

	}

	public void setPastDate(WebElement element) {

		try {
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Date currentDate = new Date();
			System.out.println(dateFormat.format(currentDate));

			// convert date to calendar
			Calendar c = Calendar.getInstance();
			c.setTime(currentDate);
			c.add(Calendar.DATE, -1);

			String pastdateandtime = dateFormat.format(c.getTime());

			element.sendKeys(pastdateandtime);

			System.out.println("Future date and time: --- " + pastdateandtime);
			reportStep("PAST date successfully entered", "pass");
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("Failed to Enter Past date", "fail");
		}

	}

	public void uploadFile(String path) throws IOException {

		try {
			// precondition :AutoIT executable file must be exist
			Runtime.getRuntime().exec(path);
			reportStep("File uploaded suuceesfully", "pass");
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("Failed to upload File", "fail");
		}

	}

	public void PressKey(WebElement ele, String key) throws IOException {

		// pass data as "Keys.TAB"
		try {
			ele.sendKeys(key);
			reportStep("Successfully pressed the key  " + key + "from the keyboard", "pass");
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("Failed to press the key  " + key + "from the keyboard", "fail");
		}

	}

	public void Delay(int waittime) throws IOException, InterruptedException {

		Thread.sleep(waittime);

	}

	public void closeBrowser() {
		driver.close();
	}

	public void deleteAllcookies() {
		driver.manage().deleteAllCookies();
	}

	public void ExecuteJavaScript(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
			System.out.println("The element" + element + "clicked successfully");
		} catch (Exception e) {
			System.err.println("The JS couldn't click " + element + "element");
		}
	}

	public void forWard() {
		driver.navigate().forward();
		System.out.println("Page forwarded");
	}

	public void reFresh() {
		driver.navigate().refresh();
		System.out.println("Page refreshed");
	}

	public void scrolltoPosition(String value) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(value);

		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	public void elementscrollPosition(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}

	public void killBrowser(String killpath) throws IOException {
		Runtime.getRuntime().exec(killpath);
		/*
		 * Every java app has this instance of runtime class that allows the application
		 * to interface with the environment in which the application is running. exec()
		 * it executes a string command in a separate process
		 */
		System.out.println("Browser killed successfully");
	}

	public void deselectAlloptions(int waittime, WebElement... elements) {
		try {
			WebElement checkElement = null;
			if (elements.length > 0) {
				for (WebElement currentElement : elements) {
					currentElement = checkElement;
					WebDriverWait wait = new WebDriverWait(driver, waittime);
					wait.until(ExpectedConditions.elementToBeClickable(currentElement));
					WebElement checkbox = currentElement;
					if (checkbox.isSelected()) {
						System.out.println("The Element " + currentElement + "is checked");
					} else
						checkbox.click();

					reportStep("All options deselected", "pass");
				}
			}
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("Not able to deselect all options", "fail");
		}

	}

	@Override
	public void close() {
		driver.close();

	}

	@Override
	public void quit() {
		driver.quit();

	}

	public void RightClick(WebElement ele) {

		try {
			Actions actions = new Actions(driver);
			actions.contextClick(ele).perform();
			System.out.println("Right Click Performed on" + ele);

			reportStep(ele + " is right clicked", "pass");
		} catch (NoSuchElementException e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to right click " + ele + "--> " + error, "fail");
			System.err.println("Unable to do right click on " + ele);
			throw new RuntimeException();
		}
	}

	@Override
	public void setFocus(WebElement ele) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			/*
			 * wait = new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.elementToBeClickable(ele));
			 */
			if ("input".equals(ele.getTagName())) {
				ele.sendKeys("");
				reportStep("The Element " + ele + " focussed", "pass");
				System.out.println("The Element " + ele + " focussed");

			} else if ("select".equals(ele.getTagName())) {
				ele.sendKeys("");
				reportStep("The Element " + ele + " focussed", "pass");
				System.out.println("The Element " + ele + " focussed");
			} else if ("button".equals(ele.getTagName())) {
				ele.sendKeys("");
				reportStep("The Element " + ele + " focussed", "pass");
				System.out.println("The Element " + ele + " focussed");
			} else if ("a".equals(ele.getTagName())) {
				ele.sendKeys("");
				reportStep("The Element " + ele + " focussed", "pass");
				System.out.println("The Element " + ele + " focussed");
			}

		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("The Element " + ele + " could not be focussed --> " + error, "fail");
			System.err.println("The Element " + ele + " with tag name " + ele.getTagName() + " could not be focussed");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	@Override
	public String decode(String data) {
		byte[] decoded = Base64.decodeBase64(data);
		return new String(decoded);
	}

	@Override
	public void clickOffset(WebElement ele, int xOffset, int yOffset) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			/*
			 * wait = new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.elementToBeClickable(ele));
			 */
			Actions build = new Actions(driver);
			build.moveToElement(ele, xOffset, yOffset).click().build().perform();
			reportStep("The Element " + ele + " clicked", "pass");
			System.out.println("The Element " + ele + " clicked");
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("The Element " + ele + " could not be clicked --> " + error, "fail");
			System.err.println("The Element " + ele + " could not be clicked");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	@Override
	public void doDoubleClick(WebElement ele) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			/*
			 * wait = new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.elementToBeClickable(ele));
			 */
			Actions build = new Actions(driver);
			build.doubleClick(ele).build().perform();
			reportStep("The Element " + ele + " clicked", "pass");
			System.out.println("The Element " + ele + " clicked");
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("The Element " + ele + " could not be clicked --> " + error, "fail");
			System.err.println("The Element " + ele + " could not be clicked");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	// ******RETURN VALUES USING GETMETHODS************

	@Override
	public void getElementWidth(WebElement ele) {
		try {
			int width = ele.getSize().getWidth();
			System.out.println("Element Width is " + width + " pixels");
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to find element --> " + error, "fail");
			System.err.println("Unable to find element");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	@Override
	public void getElementHeight(WebElement ele) {
		try {
			int height = ele.getSize().getHeight();
			System.out.println("Element Height is " + height + " pixels");
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to find element --> " + error, "fail");
			System.err.println("Unable to find element");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	@Override
	public String getElementText(WebElement ele) {

		try {

			return ele.getText();
		} catch (Exception e) {
			
			reportStep("failed to get element text " + ele, "pass");
			e.printStackTrace();
		}
		reportStep("Successfully got element text ", "pass");

		return ele.getText();

	}

	@Override
	public String getBackgroundColor(WebElement ele) {

		try {
			String s = ele.getCssValue("color");
			reportStep("successfully got element backround color" + ele, "pass");
			return s;
		} catch (Exception e) {
			
			reportStep("failed to get element backround color", "pass");
			e.printStackTrace();
		}

		return ele.getCssValue("color");
	}

	@Override
	public String getTypedText(WebElement ele) {

		try {
			String s = ele.getAttribute("value");
			reportStep("successfully got entered text on field " + ele, "pass");
			return s;
		} catch (Exception e) {
			

			e.printStackTrace();
		}
		reportStep("failed to get entered text " + ele, "fail");

		return ele.getAttribute("value");

	}

	@Override
	public String getAlertText() {
		Alert alert = driver.switchTo().alert();
		try {
			String s = alert.getText();
			reportStep("successfully got Alert Text", "pass");
			return s;
		} catch (NoAlertPresentException e) {
			System.out.println("There is no alert present.");
			reportStep("failed to get alert text", "fail");
		} catch (WebDriverException e) {
			reportStep("failed to get alert text", "fail");
			System.out.println("WebDriverException : " + e.getMessage());
			reportStep("failed to get alert text", "fail");

		}
		return null;
	}

	@Override
	public WebElement locateElement(String value) {
		try {
			WebElement findElementById = driver.findElementById(value);
			reportStep("The element " + value + "is successfully located", "pass");
			return findElementById;
		} catch (Exception e) {
			
			reportStep("The element " + value + "is failed to locate", "fail");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<WebElement> locateElements(String type, String value) {
		try {
			switch (type.toLowerCase()) {
			case "id":
				List<WebElement> ele = driver.findElementsById(value);
				reportStep("Elements located using " + type + "", "pass");
				return ele;
			case "name":
				List<WebElement> ele1 = driver.findElementsByName(value);
				reportStep("Elements located using " + type + "", "pass");
				return ele1;
			case "class":
				List<WebElement> ele2 = driver.findElementsByClassName(value);
				reportStep("Elements located using " + type + "", "pass");
				return ele2;
			case "link":
				List<WebElement> ele3 = driver.findElementsByLinkText(value);
				reportStep("Elements located using " + type + "", "pass");
				return ele3;
			case "xpath":
				List<WebElement> ele4 = driver.findElementsByXPath(value);
				reportStep("Elements located using " + type + "", "pass");
				return ele4;

			}
		} catch (Exception e) {
			System.err.println("The Element with locator:" + type + " Not Found with value: " + value);
			throw new RuntimeException();
		}
		return null;
	}

	public String GetAttribute(WebElement ele, String data) throws IOException {

		try {
			String s = ele.getAttribute(data);
			reportStep("succesfully got" + ele + "  attribute value for " + data + "", "pass");
			return s;
		} catch (Exception e) {
			
			reportStep("failed to get" + ele + "  attribute value for " + data + "", "pass");
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public ArrayList<String> findAllLinksOnPage() {

		ArrayList<String> data = new ArrayList<String>();
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			List<WebElement> allLinks = driver.findElements(By.tagName("a"));
			System.out.println("Total No.of Links in the page: " + allLinks.size());
			for (WebElement link : allLinks) {
				System.out.println(link.getText());
				data.add(link.getText());
			}

			reportStep("Links are fetched", "pass");
			System.out.println("Links are fetched");
			return data;
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to get all the links --> " + error, "fail");
			System.err.println("Unable to get all the links");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}
	}

	public String getURL() {

		try {
			String s = driver.getCurrentUrl();
			reportStep("successfully got current URL ", "pass");
			return s;
		} catch (Exception e) {
			reportStep("getting  current URL failed ", "fail");
			e.printStackTrace();
		} finally {
			takeSnap();
		}
		return null;

	}

	// ******VERIFY TEXT************

	@Override
	public boolean VerifyElementHasAttribute(WebElement ele, String attribute) {
		Boolean result = false;
		try {
			String value = ele.getAttribute(attribute);
			if (value != null) {
				result = true;
				reportStep("Element has the attribute " + attribute, "pass");
				System.out.println("Element has the attribute: " + attribute);
			}
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to verify attribute --> " + error, "fail");
			System.err.println("Unable to verify attribute");
			throw new RuntimeException();
		}

		return result;

	}

	@Override
	public void verifyUrl(String url) {

		try {
			assertEquals(driver.getCurrentUrl(), url);
			reportStep("URL matched", "pass");
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("URL not matched", "fail");
		}

	}

	@Override
	public void verifyTitle(String title) {
		try {
			assertEquals(driver.getTitle(), title);
			reportStep("Title matched", "pass");
		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("Title not matched", "fail");
		}
	}

	@Override
	public void verifyExactText(WebElement ele, String expectedText) {
		try {
			assertEquals(ele.getText(), expectedText);
			reportStep("The expected text contains the actual " + expectedText, "pass");

		} catch (Exception e) {
			
			e.printStackTrace();
			reportStep("The expected text doesn't contain the actual " + expectedText, "fail");
		}
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		try {
			if (ele.getText().contains(expectedText)) {
				System.out.println("The expected text contains the actual " + expectedText);
				return true;
			} else {
				System.out.println("The expected text doesn't contain the actual " + expectedText);
			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Text");
		}

		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		try {
			if (ele.getAttribute(attribute).equals(value)) {
				System.out.println("The expected attribute :" + attribute + " value contains the actual " + value);
				return true;
			} else {
				System.out.println(
						"The expected attribute :" + attribute + " value does not contains the actual " + value);
			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Attribute Text");
			return false;
		}
		return false;
	}

	@Override
	public boolean verifyPartialAttribute(WebElement ele, String attribute, String value) {

		try {
			if (ele.getAttribute(attribute).contains(value)) {
				System.out.println("The expected attribute :" + attribute + " value contains the actual " + value);
				return true;
			} else {
				System.out.println(
						"The expected attribute :" + attribute + " value does not contains the actual " + value);

			}
		} catch (WebDriverException e) {
			System.out.println("Unknown exception occured while verifying the Attribute Text");
			return false;

		}
		return false;
	}

	@Override
	public void verifyAssociatedScreensOnPage(WebElement... screens) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			/*
			 * wait = new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.elementToBeClickable(ele));
			 */
			for (WebElement screen : screens) {
				if (screen.getTagName().equals("a") && screen.isDisplayed() && screen.isEnabled()) {
					reportStep("Associated screen " + screen.getText() + " is present", "pass");
					System.out.println("Associated screen " + screen.getText() + " is present");
				} else
					continue;
			}
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to verify associated screens --> " + error, "fail");
			System.err.println("Unable to verify associated screens");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}

	// ******VERIFY FIELDS VISIBILTY************

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		try {
			if (ele.isDisplayed()) {
				System.out.println("The element " + ele + " is visible");
				return true;
			} else {
				System.out.println("The element " + ele + " is not visible");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
			return false;
		}
		return false;

	}

	@Override
	public boolean verifyDisappeared(WebElement ele) {
		return false;

	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		try {
			if (ele.isEnabled()) {
				System.out.println("The element " + ele + " is Enabled");
				return true;
			} else {
				System.out.println("The element " + ele + " is not Enabled");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
			return false;
		}
		return false;
	}

	@Override
	public boolean verifySelected(WebElement ele) {
		try {
			if (ele.isSelected()) {
				System.out.println("The element " + ele + " is selected");
				return true;
			} else {
				System.out.println("The element " + ele + " is not selected");
			}
		} catch (WebDriverException e) {
			System.out.println("WebDriverException : " + e.getMessage());
			return false;
		}
		return false;

	}

	public Boolean VerifyNumberEqual(WebElement ele, int number) throws IOException, InterruptedException {

		if (ele.getText().equals(number))
			return true;
		else
			return false;

	}

	public WebElement locateElement(String locatorType, String value) {
		try {
			switch (locatorType.toLowerCase()) {
			case "id":
				return driver.findElementById(value);
			case "name":
				return driver.findElementByName(value);
			case "class":
				return driver.findElementByClassName(value);
			case "link":
				return driver.findElementByLinkText(value);
			case "xpath":
				return driver.findElementByXPath(value);
			}
		} catch (NoSuchElementException e) {
			System.err.println("The Element with locator:" + locatorType + " Not Found with value: " + value);
			throw new RuntimeException();
		}
		return null;
	}

	public boolean verifyAlertNotPresent() {
		try {
			if (driver.switchTo().alert() != null) {
				System.out.println("Here alert is present");
				return false;
			} else {
				
				return true;
			}
		} catch (Exception e) {
			System.out.println("Here alert is not presented");
		}
		return false;

	}

	public boolean verifyAlertPresent() {
		if (driver.switchTo().alert() != null) {
			System.out.println("Here alert is present");
		}
		return true;
	}

	@Override
	public void verifyOptionalField(WebElement ele) {
		try {
			if (!ele.getAttribute("span").equals("*")) {
				reportStep("Element " + ele + " is optional field", "pass");
				System.out.println("The verified field " + ele + " is a optional field");
			} else {
				reportStep("Element " + ele + " is not a optional field", "pass");
				System.err.println("Element " + ele + "is not optional");
			}
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to verify the field --> " + error, "fail");
			System.err.println("Unable to verify the field ");
			throw new RuntimeException();
		}
	}

	@Override
	public void verifyRequiredField(WebElement ele) {
		try {
			if (ele.getAttribute("span").equals("*")) {
				reportStep("Element " + ele + " is a required field", "pass");
				System.out.println("Element " + ele + "is required");
			} else {
				reportStep("Element " + ele + " is not a required field, Asterisk(*) missing", "fail");
				System.err.println("Element " + ele + " is not a required field, Asterisk(*) missing");
			}
		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to verify the field --> " + error, "fail");
			System.err.println("Unable to verify the field ");
			throw new RuntimeException();
		}
	}

	public void verifyElementNotChecked(WebElement ele) {

		try {
			assertTrue(ele.isSelected());
			reportStep("Element is checked", "pass");
		} catch (Exception e) {
			
			reportStep("Element not checked", "fail");
			e.printStackTrace();
		}

	}

	@Override
	public int getTotalDropDownOptions(WebElement ele) {
		try {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			/*
			 * wait = new WebDriverWait(driver, 10);
			 * wait.until(ExpectedConditions.elementToBeClickable(ele));
			 */
			Select dropdownoptions = new Select(ele);
			int totalOptions = dropdownoptions.getOptions().size() - 1;
			reportStep("Total no.of dropdown options retrieved", "pass");
			System.out.println("Total no.of dropdown options: " + totalOptions);
			return totalOptions;

		} catch (Exception e) {
			int position = e.toString().indexOf("Exception:");
			String error = e.toString().substring(0, position + 10);
			reportStep("Unable to get total dropdown options --> " + error, "fail");
			System.err.println("Unable to get total dropdown options");
			throw new RuntimeException();
		} finally {
			takeSnap();
		}

	}
	
	
	public void verifycursorfocus(WebElement ele) throws IOException, InterruptedException {
		Thread.sleep(3000);
	
	WebElement focusedElement = driver.switchTo().activeElement();	
			
	
	//System.out.println("bbbbbbbbbbbbbbbbbbbbbbbbbb");
	
	if (focusedElement.equals(ele))
	{	
			System.out.println("username focused");
			reportStep("cursor focus  in the "+ele, "pass");
	}
	else if(focusedElement!=(ele))
	{
		    System.out.println("username not in focus");
		    reportStep("cursor focus not in the "+ele, "fail");
			}
	else {
		
	}
	
		
	

}

}
