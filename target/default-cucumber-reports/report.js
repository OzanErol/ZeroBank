$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/FindTransactions.feature");
formatter.feature({
  "name": "Find Transactions in Account Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@2222"
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
formatter.scenario({
  "name": "Search date range",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@2222"
    }
  ]
});
formatter.step({
  "name": "the user accesses the Find Transactions tab",
  "keyword": "Given "
});
formatter.match({
  "location": "FindTransactionsStepDefinitions.the_user_accesses_the_Find_Transactions_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters date range from \"09/01/2012\" to \"09/06/2012\"",
  "keyword": "When "
});
formatter.match({
  "location": "FindTransactionsStepDefinitions.the_user_enters_date_range_from_to(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks search",
  "keyword": "And "
});
formatter.match({
  "location": "FindTransactionsStepDefinitions.clicks_search()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});