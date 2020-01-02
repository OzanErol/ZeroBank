@Account_summary
Feature: Account Summary page

  Background:
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"

  Scenario: Verify the page title
    Then User verifies that "Zero - Account Summary" page name is displayed


  Scenario: Verify account types on Account Summary page
    And user verifies account types are displayed
      |  Cash Accounts       |
      |  Investment Accounts |
      |  Credit Accounts     |
      |  Loan Accounts       |

  @column_names
  Scenario: Verify Credit Accounts table column names
    And user verifies column names
      |Account     |
      |Credit Card |
      |Balance     |