@RetailPage
Feature: Retail Page

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  @AffiliateReg
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on 'Register for an Affiliate Account' link
    And User fill affiliate form with below information
      | company | website           | taxID | paymentMethod | ChequePayeeName |
      | Adams   | www.tekschool.com |   456 | cheque        | Checked         |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

  @editAffiliate
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click onn 'Edit your affiliate information' link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName   | abaNumber | swiftCode | accountName | accountNumber |
      | CaptialOne |     09876 |      2347 | Saving      | 2345576545324 |
    And User click on Continue button
    Then User should see a success message

  @editAccount
  Scenario: Edit your account Information
    When User click on 'Edit your account information' linkk
    And User modify below information
      | firstname | lastName | email               | telephone |
      | Adam      | Ferozi   | zahal503@gmail.com | 572350298 |
    And User click on continue button1
    Then User should see a message 'Success: Your account has been successfully updated.'
