Feature: Account Summary page

  Background:
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"

@Account_summary_title
   Scenario: Account Summary page title
     Given  User verifies that "Zero - Account Summary" page name is displayed

  @Account_modules
  Scenario Outline: Account Summary modules
    Given Verify that Summary Page has "<modules>"
    Examples:
              |modules            |
              |Cash Accounts      |
              |Investment Accounts|
              |Credit Accounts    |
              |Loan Accounts      |