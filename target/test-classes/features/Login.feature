 @ZB-6789
Feature: Log in
  User should only log in with valid credentials

  @Positive
  Scenario: User should be able to log in with valid credentials
    Given User should be on the main page
    When User clicks on the sign in button
    Then User logs in with valid "valid_username" and "valid_password"
    And User verifies that "Zero - Account Summary" page name is displayed

  @Negative @Invalid
  Scenario: User should not be able to log in with invalid credentials
    Given User should be on the main page
    When User clicks on the sign in button
    Then User should not logs in with valid "invalid_username" and "invalid_password"
    And User verifies that "Zero - Account Summary" page name is not displayed
    And Verify that "Login and/or password are wrong." message is displayed

    @Negative @Blank_username
    Scenario: User should not be able to log in with blank credentials
      Given User should be on the main page
      When User clicks on the sign in button
      Then User should not logs in with valid "blank" and "invalid_password"
      And User verifies that "Zero - Account Summary" page name is not displayed
      And Verify that "Login and/or password are wrong." message is displayed

  @Negative @Blank_password
  Scenario: User should not be able to log in with blank credentials
    Given User should be on the main page
    When User clicks on the sign in button
    Then User should not logs in with valid "invalid_username" and "blank"
    And User verifies that "Zero - Account Summary" page name is not displayed
    And Verify that "Login and/or password are wrong." message is displayed
