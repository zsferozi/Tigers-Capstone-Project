package step.definition;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;

public class RetailStepDefinition extends Base {
	/**
	 * I created an object of retailPageObject to access to the methods and glue it
	 * to that class
	 */
	RetailPageObject retailpageobj = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		retailpageobj.getEnviromentText();
		// logger is used to log the result of each steps
		logger.info("user is on Retail web Page.");
	}

	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
		retailpageobj.clickMyAccount();
		logger.info("User click on my account.");

	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailpageobj.clickOnlogin();
		logger.info("User click on Login button successfully.");
	}

	/**
	 * Every-time, I run the retail test cases I should create and register a new
	 * email address in order to execute our test
	 * 
	 * Also I should change only my email address in RetailPage.feature in scenario
	 * 4
	 */
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String email, String password) {
		retailpageobj.enterEmail("zoe100@gmail.com");
		retailpageobj.enterpassword("12345");
		logger.info("User enter username and password successfully.");
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailpageobj.clickonLoginButton();
		logger.info("User click on Login button successfully");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		retailpageobj.getMyAccountDash();
		logger.info("User click on MyAccount dashboard successfully");
	}

	/**
	 * We should not use thread.sleep in our automation testing there are many other
	 * waits such as fluent wait, implicit and explicit waits which are called smart
	 * wait that I already have it in my Base class however, I used it in here in
	 * order to click on the link with throws InterruptedException to click on it
	 */
	@When("User click on {string} link")
	public void user_click_on_link(String string) {
		retailpageobj.clickOnAffiliatelink();
		logger.info("User click on the link successfully");

	}

	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) {
		/**
		 * List is an interface is a collection of data which have generic data type.
		 * Map is also an interface and it is based on key and value of String(key)
		 * String(value) This is easier to read. I multiple rows of data can be pass in
		 * the same step.
		 */
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.enterCompanyName(data.get(0).get("company"));
		retailpageobj.websiteName(data.get(0).get("website"));
		retailpageobj.taxIdField(data.get(0).get("taxID"));
		retailpageobj.paymentMethods(data.get(0).get("paymentMethod"));
		retailpageobj.chequePayeeField(data.get(0).get("ChequePayeeName"));
		logger.info("User fill the information successfully");
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retailpageobj.aboutUs();
		logger.info("User check on About us check box successfully");
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retailpageobj.clickOncontinueButton();
		logger.info("User click on the continue button successfully");
	}

	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retailpageobj.getSucessText("sucessText");
		logger.info("User verify success message");

	}

	@When("User click onn {string} link")
	public void user_click_onn_link(String string) {
		retailpageobj.clickOnEditAffiliateInformation();
		logger.info("User click on the link successfully");

	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailpageobj.clickOnBankTransfer();
		logger.info("User click on Bank Transfer radio button successfully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.getBankName(data.get(0).get("bankName"));
		retailpageobj.getAbaNumbers(data.get(0).get("abaNumber"));
		retailpageobj.getSwiftcode(data.get(0).get("swiftCode"));
		retailpageobj.getAccountName(data.get(0).get("accountName"));
		retailpageobj.getAccountNumbers(data.get(0).get("accountNumber"));
		logger.info("User fill bank infomation successfully");

	}

	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailpageobj.getFirstName(data.get(0).get("firstname"));
		retailpageobj.getLastName(data.get(0).get("lastName"));
		retailpageobj.getEmail(data.get(0).get("email"));
		retailpageobj.getTelephoneNumber(data.get(0).get("telephone"));
		logger.info("User add information successfully");
	}

	@When("User click on {string} linkk")
	public void user_click_on_linkk(String string) {
		retailpageobj.clickonEditedAffiliateInfo();
		logger.info("User click on the link successfully");

	}

	@When("User click on continue button1")
	public void user_click_on_continue_button1() {
		retailpageobj.clickContinue();
		logger.info("User click on continue button successfully");
	}

	@Then("User should see a message {string}")
	public void user_should_see_a_message(String string) {
		retailpageobj.seeSuccessMessage();
		logger.info("User verify success message successfully");
	}
}