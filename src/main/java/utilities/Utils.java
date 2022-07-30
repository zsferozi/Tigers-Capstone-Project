package utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import io.cucumber.java.Scenario;

public class Utils extends Base {

	public static Scenario verify;

	/**
	 * This is an action class method that hover mouse over the drop downs
	 */
	public static void hoverMouseOverElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	/**
	 * This method is to get text from UI
	 */
	public static String getTextFromUI(WebElement element) {
		String textFromUI = element.getText();
		return textFromUI;
	}

	/**
	 * This method is to click on Radio Button
	 */
	public static void clickOnRadioButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				element.click();
			} else {
				System.out.println("One of the conditions did not return expected value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method click on the check boxes
	 */

	public static void clickOnCheckBoxButton(WebElement element) {
		try {
			if (element.isDisplayed() == true && element.isEnabled() == true && element.isSelected() == false) {
				element.click();
			} else {
				System.out.println("One of the conditions did not return expected value");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * JSExecutor methods start if the .click() does not work, then we get the help
	 * JSExecuter
	 */
	public static void clickWithJSE(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * if the sendKeys(). wont work we can use JSExecuter to sendKey
	 */
	public static void sendKeysJSE(WebElement element, String value) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='" + value + "'", element);
	}

	/**
	 * This method will select the value from static Dropdown by visible value
	 */
	public static void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	/**
	 * This method will select value from static Dropdown by index
	 */
	public static void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * This method will select value from static dropdown by value
	 */
	public static void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * This method accepts alerts
	 */
	public static void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public static void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	/**
	 * This method will switch webdriver from parent window to child
	 */
	public static void switchToWindow() {
		Set<String> WindowsHandles = driver.getWindowHandles();
		Iterator<String> it = WindowsHandles.iterator();
		String window = it.next();
		driver.switchTo().window(window);
	}

	/**
	 * This method will return text of element
	 */
	public static String getText(WebElement ele) {
		String ElementText = ele.getText();
		return ElementText;
	}

	/**
	 * This method will drag and drop using Actions class
	 */
	public static void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		Actions action = new Actions(driver);
		action.dragAndDrop(sourceElement, targetElement).perform();

	}

	// read test data from testData.properties file

	public static String getData(String key) {
		String testDataPath = ".\\src\\test\\resoursces\\input\\testData.properties";
		Properties property = null;
		try {
			FileReader reader = new FileReader(testDataPath);
			property = new Properties();
			property.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return property.getProperty(key);

	}

	public static void hardWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This method is used for screenshot. It takes pictures with date and time
	 * format and we will call it in our initializer after hook so it will take
	 * pictures after each scenarios
	 */

	public static String screenshotName() {
		Date date = new Date();
		String screenShot = date.toString().replace(":", "_").replace(" ", "_");
		return screenShot;
	}

	public static void takeScreenshots() {
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(file, new File(".\\output\\screenshots\\" + screenshotName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
