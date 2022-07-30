package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class LaptopNoteBooksPageObject extends Base {

	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopAndNotebook;

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;

	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;

	@FindBy(id = "input-quantity")
	private WebElement quantity;

	@FindBy(id = "button-cart")
	private WebElement addingToCart;
	
	@FindBy(id = "cart-total")
	private WebElement cartTotal;

	@FindBy(id = "cart-total")
	private WebElement viewCart;

	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement remove;

	@FindBy(id = "cart-total")
	private WebElement totalCart;

	// scenario 2+++++++++++++++++++++++++++++++++++++++++++++++++
	
	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[2]")
	private WebElement comparMacbook;

	@FindBy(xpath = "(//button[@data-original-title='Compare this Product'])[3]")
	private WebElement toMacbookAir;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMesage;

	@FindBy(id ="compare-total")
	private WebElement productsComparison;

	@FindBy(xpath = "//html//body//div[2]")
	private WebElement viewChart;

	// scenario 3 +++++++++++++++++++
	
	@FindBy(xpath = "//html//body/div[2]")
	private WebElement productCompareItem;

	@FindBy(xpath = "//div[4]/div[5]/div/div[2]/div[2]/button[2]")
	private WebElement clickOnWishbutton;

	@FindBy(xpath = "//*[text()=' You must ']")
	private WebElement youMustLogin;

	// scenario 4+++++++++++++++++++++++++++++++++++++

	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;

	@FindBy(xpath = "(//h2)[2]")
	private WebElement priceTag;

	// methods

	public void clickLaptopAndNotebook() {
		laptopAndNotebook.click();
	}

	public void clickOnshowAllLaptopsAndNotebooks() {
		showAllLaptopsAndNotebooks.click();
	}

	public void clickMacBooklink() {
		macBook.click();
	}

	public void itemAddToCart() {
		quantity.clear();
		quantity.sendKeys("1");
	}

	public void clickAddToCart() {
		addingToCart.click();
	}

	public void getCartTotal() {
		cartTotal.getText();
	}

	public void clickOnCartOption() {
		viewCart.click();
	}

	public void clickOnXButton() {
		remove.click();
	}

	public void getTotalCart() {
		Utils.getText(totalCart);
	}

	// scenario 2+++++++++++++++++++++++
	
	public void clickOnMacbookCamparison() {
		comparMacbook.click();
	}

	public void clickOnMacbookAirCamparsion() {
		toMacbookAir.click();
	}

	public void getSucessMesageComparison() {
		Utils.getTextFromUI(successMesage);
	}

	public void clickOnProductsComparisonlink() {
		productsComparison.click();
	}

	public void getChartComparison() {
		viewChart.isDisplayed();
	}

	// scenario 3+++++++++++++++++++++++++++++++++
	
	public void productCompareItem() {
		productCompareItem.isDisplayed();
	}

	public void clickOnwishbutton() {
		clickOnWishbutton.click();
	}

	public void youMustLogin() {
		youMustLogin.isDisplayed();
	}

	// scenario 4+++++++++++++++++++++++++++++++++
	
	public void clickOnMacBookProlink() {
		macBookPro.click();
	}

	public void getPriceTagOfMacbookPro() {
		priceTag.isDisplayed();
	}

}
