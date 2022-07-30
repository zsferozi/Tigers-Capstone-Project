package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;

public class LaptopNoteBooksStepDefinition extends Base {

	LaptopNoteBooksPageObject object = new LaptopNoteBooksPageObject();

	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		object.clickLaptopAndNotebook();
		logger.info("User click on laptop and NoteBook successfully.");
	}

	@When("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		object.clickOnshowAllLaptopsAndNotebooks();
		logger.info("User click on show all laptop and notebook successfully.");

	}

	@When("User click on MacBook item")
	public void user_click_on_mac_book_item() {
		object.clickMacBooklink();
		logger.info("User click on MacBook link successfully.");

	}

	@When("User click add to Cart button")
	public void user_click_add_to_cart_button() {
		object.clickAddToCart();
		logger.info("User click on add to cart successfully.");

	}

	@Then("User should see {int} item\\(s){double} showed to the cart")
	public void user_should_see_item_s_showed_to_the_cart(Integer int1, Double double1) {
		object.getCartTotal();
		logger.info("User should see 1 item on the cart.");

	}

	@Then("User click on cart option")
	public void user_click_on_cart_option() {
		object.clickOnCartOption();
		logger.info("User click on cart option.");

	}

	@Then("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		object.clickOnXButton();
		logger.info("User removed one item from cart.");

	}

	@Then("item should be removed and cart should show {int} item\\(s)")
	public void item_should_be_removed_and_cart_should_show_item_s(Integer int1) {
		object.getTotalCart();
		logger.info("Cart got empty successfully.");

	}

	// Scen 2+++++++++++++++++++++++++++++++++++++++++++++++++

	@When("User click on product comparison icon on {string}")
	public void user_click_on_product_comparison_icon_on(String string) {
		object.clickOnMacbookCamparison();
		object.clickOnMacbookAirCamparsion();
		logger.info("User click on Macbook and Macbook Comparison button.");
	}

	@Then("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {
		object.clickOnProductsComparisonlink();
		logger.info("User click on product comparison link successfully.");
	}

	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		object.getChartComparison();
		logger.info("Product comaprison chart is displayed successfully.");

	}

	// Scen 3++++++++++++++++++++++++

	@When("User click on heart icon to add 'Sony VaIO' laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list() {
		object.clickOnwishbutton();
		logger.info("user add Sony VaIO to wish list");

	}

	@Then("User should get a message {string}")
	public void user_should_get_a_message(String string) {
		object.youMustLogin();
		logger.info("user need to login to his account");
	}

	@When("User click on heart icon to add {string} laptop to wish list")
	public void user_click_on_heart_icon_to_add_laptop_to_wish_list(String string) {
		object.clickOnwishbutton();
	}

	@When("User click on {string} item")
	public void user_click_on_item(String string) {
		object.clickOnMacBookProlink();
		logger.info("User click on the item successfully");
	}

	@Then("User should see {string} price tag is present on UI.")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
		object.getPriceTagOfMacbookPro();
		logger.info("User verify the price tag in the UI");
	}

}
