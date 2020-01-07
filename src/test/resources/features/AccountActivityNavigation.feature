@1111
Feature: Navigating to specific accounts in Accounts Activity
  Background:
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"

  Scenario: Savings account redirect

    Given the user clicks on Savings link on the Account Summary page
    Then User verifies that "Zero - Account Activity" page name is displayed
    Then User verify that default account menu option is "Savings" on page

  Scenario: Brokerage account redirect
    When the user clicks on Brokerage link on the Account Summary page
    Then User verifies that "Zero - Account Activity" page name is displayed
    Then User verify that default account menu option is "Brokerage" on page

  Scenario: Checking account redirect

    When the user clicks on Checking link on the Account Summary page
    Then User verifies that "Zero - Account Activity" page name is displayed
    Then User verify that default account menu option is "Checking" on page

  Scenario: Credit Card account redirect
    When the user clicks on Credit card link on the Account Summary page
    Then User verifies that "Zero - Account Activity" page name is displayed
    Then User verify that default account menu option is "Credit Card" on page
