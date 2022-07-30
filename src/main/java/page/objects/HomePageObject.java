package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement currency;

	@FindBy(xpath = "//button[text()='€ Euro']")
	private WebElement euro;

	@FindBy(id = "cart-total")
	private WebElement currencyChanged;

	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']")
	private WebElement shoppingCart;

	@FindBy(xpath = "//p[text()='Your shopping cart is empty!']")
	private WebElement yourCardIsEmpty;

	public void clickOnCurrency() {
		currency.click();

	}

	/*
	 * I used action class method in here that I created in my Utils
	 */
	public void selectEuro() {
		Utils.hoverMouseOverElement(euro);
	}

	public void changingCurrencyToEuro() {
		currencyChanged.isDisplayed();

	}

	public void clickOnTheCart() {
		shoppingCart.click();
	}

	public void EmptyCard() {
		yourCardIsEmpty.isDisplayed();
	}

}
