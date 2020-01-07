package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.pages.Pages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AccountActivityNavigationStepDefinitions {
    Pages pages =new Pages();
    LoginPage loginPage =new LoginPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    @Given("the user clicks on Savings link on the Account Summary page")
    public void the_user_clicks_on_Savings_link_on_the_Account_Summary_page() {
       loginPage.saving_button.click();
    }

    @Given("User verify that default account menu option is {string} on page")
    public void user_verify_that_default_account_menu_option_is_on_page(String defaultExpected) {
        Assert.assertEquals(defaultExpected,accountActivityPage.defaultOfDropdown());
    }

    @When("the user clicks on Brokerage link on the Account Summary page")
    public void the_user_clicks_on_Brokerage_link_on_the_Account_Summary_page() {
        loginPage.brokerage_button.click();
    }

    @When("the user clicks on Checking link on the Account Summary page")
    public void the_user_clicks_on_Checking_link_on_the_Account_Summary_page() {
       loginPage.checking_button.click();
    }

    @When("the user clicks on Credit card link on the Account Summary page")
    public void the_user_clicks_on_Credit_card_link_on_the_Account_Summary_page() {
       loginPage.creditCard_button.click();
    }

}
