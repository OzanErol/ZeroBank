package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.Pages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefinitions {
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    BasePage basePage = new BasePage();
    Pages pages = new Pages();

    @Then("User verifies that {string} page name is displayed1")
    public void user_verifies_that_page_name_is_displayed1(String pageTitle) {
        basePage.navigateModule("Account Activity");
        Assert.assertEquals(pageTitle,pages.loginPage().getPageTitle());
    }

    @Given("User verify that default account menu option is {string}")
        public void user_verify_that_default_account_menu_option_is(String defaultExpected) {
        basePage.navigateModule("Account Activity");
        Assert.assertEquals(defaultExpected,accountActivityPage.defaultOfDropdown());
    }

    @Then("User verify that account menu has following options")
    public void user_verify_that_account_menu_has_following_options(List<String> dataTable) {
        BrowserUtils.wait(1);
        System.out.println(accountActivityPage.getAccountDropDownOptions());
        Assert.assertEquals(dataTable,accountActivityPage.getAccountDropDownOptions());
    }
    @Given("User is on the Account Activity page")
    public void user_is_on_the_Account_Activity_page() {
    accountActivityPage.accountActivityButton.click();
    }

    @Then("User verify that account transaction menu has following options")
    public void user_verify_that_account_transaction_menu_has_following_options(List<String> dataTable) {
       Assert.assertEquals(dataTable,accountActivityPage.getTransactionsTable());
    }



}
