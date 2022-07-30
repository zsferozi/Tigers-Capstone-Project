package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base {
	/**
	 * This is a construction 
	 * we use construction for instantiation of an object 
	 * we us initElement in our PageFactory class. we can initialize the webElement located by @FindBy annotation
	 */
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='TEST ENVIRONMENT']")
	private WebElement testEnvironmenttext;
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccount;
	
	@FindBy(xpath="//ul//a[text()='Login']")
	private WebElement login;
	
	@FindBy(id="input-email")
	private WebElement emailAdress;
	
	@FindBy(id="input-password")
	private WebElement passwordField;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//h2[text()='My Account']")
	private WebElement myAccountDashboard;
	
	@FindBy(xpath = "//a[text()='Register for an affiliate account']")
	private WebElement myAffiliateAccont;
	
	@FindBy(xpath="//a[text()='Register for an affiliate account']")
	private WebElement registerForAnAffiliateAcconut;
	
	@FindBy(id = "input-company")
	private WebElement companyName;
	
	@FindBy(id="input-website")
	private WebElement websiteField;
	
	@FindBy(id="input-tax")
	private WebElement taxIDField;
	
	@FindBy(xpath="//input[@value='bank']")
	private WebElement paymentMethodField;
	
	@FindBy(id="input-cheque")
	private WebElement chequePayeeNameField;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueBttn;
	//
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	
	@FindBy(xpath="//a[text()='Edit your affiliate information']")
	private WebElement editYourAffiliateInfolink;
	//
	@FindBy(xpath="//input[@value='bank']")
	private WebElement bankTransfer;
	
	@FindBy(id="input-bank-name")
	private WebElement bankNameField;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement abaNumberField;
	
	@FindBy(id="input-bank-branch-number")
	private WebElement swiftCodeField;
	
	@FindBy(id="input-bank-account-name")
	private WebElement accountNameField;
	
	@FindBy(id="input-bank-account-number")
	private WebElement accountNumberField;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ContinueButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessage;
	
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement editAccountInformationlink;
	
	@FindBy(id="input-firstname")
	private WebElement firstNameField;
	
	@FindBy(id="input-lastname")
	private WebElement lastNameField;
	
	@FindBy(id="input-email")
	private WebElement emailField;
	
	@FindBy(id="input-telephone")
	private WebElement telephoneField;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement contiueButton;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageAlert;
	
	/*
	 * methods 
	 */
	public String getEnviromentText() {
	String text= testEnvironmenttext.getText();
		return text;
	}
	public void clickMyAccount() {
		myAccount.click();
		
	}
	public void clickOnlogin() {
		login.click();
	}
	public void enterEmail(String email) {
		emailAdress.sendKeys(email);	
	}
	public void enterpassword(String password) {
		passwordField.sendKeys(password);
	}
	public void clickLoginButton() {
		login.click();
	}
	public void clickonLoginButton() {
	loginButton.click();
	
	}
	/*
	 * in this method I used getTextFromUI method that I created in our Utils class
	 */
	public void getMyAccountDash() {
		Utils.getTextFromUI(myAccountDashboard);
	}
	/**
	 * I can use either the .Click() method or I can use JSExcuter to click on locator  
	 */
	public void clickOnAffiliatelink() {
		//myAffiliateAccont.click();
		Utils.clickWithJSE(myAffiliateAccont);
	}

	public void enterCompanyName(String companyNameEnter) {
		companyName.sendKeys(companyNameEnter);
	}
	/**
	 * I can use either the .sendKeys() method or I can use JSExcuter to sendKey
	
	 */
	public void websiteName(String website) {
	//	websiteField.sendKeys(website);
		Utils.sendKeysJSE(websiteField, website);
	}
	public void taxIdField(String taxID) {
		taxIDField.sendKeys(taxID);
		
	}
	public void paymentMethods(String paymentMethod) {
		paymentMethodField.sendKeys(paymentMethod);
	}
	public void chequePayeeField(String ChequePayeeName) {
		chequePayeeNameField.sendKeys(ChequePayeeName);
	}
	/**
	 * we called this method from Utils and it click on check boxes
	 */
	public void aboutUs() {
		Utils.clickOnCheckBoxButton(checkBox);
	}

public void clickOnEditAffiliateInformation() {
	editYourAffiliateInfolink.click();
}
	public String getSucessText(String sucessText) {
	String text= successMessage.getText();
		return text;
	}
	//scenario three
	
	public void clickonEditedAffiliateInfo() {
		editAccountInformationlink.click();
	}
	public void clickOnBankTransfer() {
		bankTransfer.click();
	}
	public void getBankName(String bankName) {
		bankNameField.sendKeys(bankName);
		
	}
	public void getAbaNumbers(String abaNumber) {
		abaNumberField.sendKeys(abaNumber);	
	}
	public void getSwiftcode(String swiftCode) {
		swiftCodeField.sendKeys(swiftCode);
	}
	public void getAccountName(String accountName) {
		accountNameField.sendKeys(accountName);
		
	}
	public void getAccountNumbers(String accountNumber) {
		accountNumberField.sendKeys(accountNumber);
	}
	public void clickOncontinueButton() {
		ContinueButton.click();
	}
	public String getSucessMessage() {
		String text = SuccessMessage.getText();
		return text;
	}
	
	//scenario 4th
	public void clickOnEditAccount() {
		editAccountInformationlink.click();
			
	}
	/**
	 * I use the .clear() method in here to clear or erase the filed in UI then sendKey() our own message 
	 */
	public void getFirstName(String firstname) {
		firstNameField.clear();
		firstNameField.sendKeys(firstname);
	}
	public void getLastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}
	public void getEmail(String email) {
		emailField.clear();
		emailField.sendKeys(email);
	
	}
	public void getTelephoneNumber(String telephone) {
		telephoneField.clear();
		telephoneField.sendKeys(telephone);
	}
	public void clickContinue() {
		contiueButton.click();
	}
	public String seeSuccessMessage() {
		String text = successMessageAlert.getText();
		return text;
		
	}
		
}
