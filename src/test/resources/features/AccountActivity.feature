@Account_activity
Feature: Account Activity page

  Background:
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"

  Scenario: Verify the page title
    Then User verifies that "Zero - Account Activity" page name is displayed1

    Scenario: Account menu default option
      Given User git addverify that default account menu option is "Savings"