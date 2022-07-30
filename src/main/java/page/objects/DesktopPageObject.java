package page.objects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	// background 1

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktopTab;

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;

	@FindBy(tagName = "img")
	private List<WebElement> items;

	// scenario 1++++++++++++++++++++++
	@FindBy(xpath = "(//span[text()='Add to Cart'])[3]")
	private WebElement addToCartOPtion;

	@FindBy(id = "input-quantity")
	private WebElement quantity;

	// scenario 2++++++++++++++++++++++++++
	@FindBy(xpath = "(//span[text()='Add to Cart'])[2]")
	private WebElement addCameraToCart;
	//
	@FindBy(id = "input-option226")
	private WebElement selectOption;

	@FindBy(xpath = "//option[@value='15']")
	private WebElement redColor;

	// scenario 3++++++++++++++++++++++++
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement canonEOS5DCamera;

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement writeReviewlink;

	@FindBy(id = "input-name")
	private WebElement name;

	@FindBy(id = "input-review")
	private WebElement canonReview;

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> rating;

	@FindBy(id = "button-review")
	private WebElement reviewContinueButton;

	@FindBy(xpath = "//div[text()=' Thank you for your review. It has been submitted to the webmaster for approval.'] ")
	private WebElement reviewSuccessMessage;

	// methods for scenario 1

	public void clickOnDesktopTab() {
		desktopTab.click();

	}

	public void clickOnShowAllDesktop() {
		showAllDesktop.click();
	}

	public List<WebElement> desktopItems() {
		List<WebElement> itemDesk = items;
		return itemDesk;

	}

	public void clickOnAddToCartOption() {
		addToCartOPtion.click();
	}

	public void addOneItemToCart() {
		quantity.clear();
		quantity.sendKeys("1");

	}

	// scen 3
	public void clickAddingCameraToCart() {
		addCameraToCart.click();
	}

	public void clickOnSelectOption() {
		selectOption.click();
	}

	public void clickOnRedValue() {
		redColor.click();

	}

	// scen 4
	public void clickOnCanonCameralink() {
		canonEOS5DCamera.click();
	}

	public void clickOnReviewLink() {
		writeReviewlink.click();

	}

	public void enterYourName(String nameValue) {
		name.sendKeys(nameValue);
	}

	public void enterYourReview(String reviewValue) {
		canonReview.sendKeys(reviewValue);
	}

	/*
	 * I used List in here to get all the rating from 1-5 in one list. If next time
	 * I change my rating value in feature file it will automatically change it to
	 * my prefer value
	 */
	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = rating;
		for (WebElement element : ratingElements) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}
		}

	}

	public void clickOnContinueButton() {
		reviewContinueButton.click();
	}

	public String getSuccessReviewMessage() {
		String text = reviewSuccessMessage.getText();
		return text;
	}

}
