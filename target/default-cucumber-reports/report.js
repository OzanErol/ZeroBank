$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountSummary.feature");
formatter.feature({
  "name": "Account Summary page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Account Summary modules",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Account_modules"
    }
  ]
});
formatter.step({
  "name": "Verify that Summary Page has \"\u003cmodules\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "modules"
      ]
    },
    {
      "cells": [
        "Cash Accounts"
      ]
    },
    {
      "cells": [
        "Investment Accounts"
      ]
    },
    {
      "cells": [
        "Credit Accounts"
      ]
    },
    {
      "cells": [
        "Loan Accounts"
      ]
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
  "name": "Account Summary modules",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Account_modules"
    }
  ]
});
formatter.step({
  "name": "Verify that Summary Page has \"Cash Accounts\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.verify_that_Summary_Page_has(String)"
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
  "name": "Account Summary modules",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Account_modules"
    }
  ]
});
formatter.step({
  "name": "Verify that Summary Page has \"Investment Accounts\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.verify_that_Summary_Page_has(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Investment] Accounts\u003e but was:\u003c[Cash] Accounts\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.zerobank.step_definitions.AccountSummaryStepDefinitions.verify_that_Summary_Page_has(AccountSummaryStepDefinitions.java:15)\n\tat ✽.Verify that Summary Page has \"Investment Accounts\"(file:src/test/resources/features/AccountSummary.feature:14)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
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
  "name": "Account Summary modules",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Account_modules"
    }
  ]
});
formatter.step({
  "name": "Verify that Summary Page has \"Credit Accounts\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.verify_that_Summary_Page_has(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cC[redit] Accounts\u003e but was:\u003cC[ash] Accounts\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.zerobank.step_definitions.AccountSummaryStepDefinitions.verify_that_Summary_Page_has(AccountSummaryStepDefinitions.java:15)\n\tat ✽.Verify that Summary Page has \"Credit Accounts\"(file:src/test/resources/features/AccountSummary.feature:14)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded1.png", null);
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
  "name": "Account Summary modules",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Account_modules"
    }
  ]
});
formatter.step({
  "name": "Verify that Summary Page has \"Loan Accounts\"",
  "keyword": "Given "
});
formatter.match({
  "location": "AccountSummaryStepDefinitions.verify_that_Summary_Page_has(String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Loan] Accounts\u003e but was:\u003c[Cash] Accounts\u003e\n\tat org.junit.Assert.assertEquals(Assert.java:115)\n\tat org.junit.Assert.assertEquals(Assert.java:144)\n\tat com.zerobank.step_definitions.AccountSummaryStepDefinitions.verify_that_Summary_Page_has(AccountSummaryStepDefinitions.java:15)\n\tat ✽.Verify that Summary Page has \"Loan Accounts\"(file:src/test/resources/features/AccountSummary.feature:14)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
});