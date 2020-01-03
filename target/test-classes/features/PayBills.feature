@Pay_bills
Feature: Pay Bills
     Background:
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"
    Then User lands on Pay bills page

  Scenario: Verify the page title
    Then User verifies that "Zero - Pay Bills" page name is displayed

    Scenario: Successful payment submission
      Given User enters valid payment informations "Sprint" "Savings" "100" Date "Descriptions"
      Then Verify that "The payment was successfully submitted." alert message is displayed

