$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Account_activity"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_be_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with valid \"valid_username\" and \"valid_password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the page title",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Account_activity"
    }
  ]
});
formatter.step({
  "name": "User verifies that \"Zero - Account Activity\" page name is displayed1",
  "keyword": "Then "
});
formatter.match({
  "location": "AccountActivityStepDefinitions.user_verifies_that_page_name_is_displayed1(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User should be on the main page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_be_on_the_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the sign in button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginStepDefinitions.user_clicks_on_the_sign_in_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User logs in with valid \"valid_username\" and \"valid_password\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinitions.user_logs_in_with_valid_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account menu default option",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Account_activity"
    }
  ]
});
formatter.step({
  "name": "User verify that default account menu option is \"Savings\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountActivityStepDefinitions.user_verify_that_default_account_menu_option_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});