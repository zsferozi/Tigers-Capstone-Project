package step.definition;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;

public class HomePageStepDefinition extends Base {

	HomePageObject homepageobj = new HomePageObject();

	@When("User click on Currency")
	public void user_click_on_currency() {
		homepageobj.clickOnCurrency();
		logger.info("User click on Currency successfully.");

	}

	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		homepageobj.selectEuro();
		logger.info("user chose euro successfully.");

	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		homepageobj.changingCurrencyToEuro();
		logger.info("User change currency to euro successfully.");

	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {
		homepageobj.EmptyCard();
		logger.info("User verify empty card successfully.");

	}

	@Then("{string} message should display")
	public void message_should_display(String string) {
		homepageobj.clickOnTheCart();
		logger.info("User shopping card is empty");

	}

}
