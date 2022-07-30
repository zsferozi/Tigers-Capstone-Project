package step.definition;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopObj = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopObj.clickOnDesktopTab();
		logger.info("User click on desktops tab successfully.");
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() {
		desktopObj.clickOnShowAllDesktop();
		logger.info("User click on Show all desktops sucessfully.");

	}

	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() {
		desktopObj.desktopItems();
		logger.info("User was able to see all the items are present in desktop.");

	}

	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopObj.clickOnAddToCartOption();
		logger.info("LP3065 item was add to cart successfully.");
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopObj.addOneItemToCart();
		logger.info("User successfully add one item to the cart");

	}

	// scenario 3
	@When("User click  ADD TO CART option on Canon EOS 5D item")
	public void user_click_add_to_cart_option_on_canon_eos_5d_item() {
		desktopObj.clickAddingCameraToCart();
		logger.info("User click Canon EOS 5D item.");

	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopObj.clickOnSelectOption();
		desktopObj.clickOnRedValue();
		logger.info("User select Red color camera successfully.");

	}
	// scenario 4

	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopObj.clickOnCanonCameralink();
		logger.info("User click on Canon Camera sucessfully.");

	}

	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopObj.clickOnReviewLink();
		logger.info("User click on review link successfully.");

	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(DataTable dataTable) {
		/*
		 * I used List because return type of cucumber datatable is List of Map. I used
		 * cucumber datatable to add multiple parameter in tabular format instead of
		 * putting all parameters in the Ghirkin statement. This is easier to read; and
		 * multiple rows of data can be pass in the same step.
		 */
		List<Map<String, String>> reviewInfo = dataTable.asMaps(String.class, String.class);
		desktopObj.enterYourName(reviewInfo.get(0).get("yourname"));
		desktopObj.enterYourReview(reviewInfo.get(0).get("yourReview"));
		desktopObj.selectRating(reviewInfo.get(0).get("Rating"));
		Utils.
		logger.info("user write a review successfully.");

	}

	@When("User click on Continue Button")
	public void user_click_on_continue_button() {
		desktopObj.clickOnContinueButton();
		logger.info("User clicked on continue button sucessfully.");

	}

	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) {
		desktopObj.getSuccessReviewMessage();
		logger.info("User verify success Message of reviewing successfully.");

	}

}
