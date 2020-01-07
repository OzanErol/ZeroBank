@2222
Feature: Find Transactions in Account Activity

  Background:
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"
    Then User verifies that "Zero - Account Activity" page name is displayed1

  Scenario: Search date range
  Given the user accesses the Find Transactions tab
  When the user enters date range from "09/01/2012" to "09/06/2012"
  And clicks search
