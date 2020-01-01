package com.zerobank.step_definitions;

import com.zerobank.pages.Pages;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {
    Pages pages =new Pages();

    @Given("User should be on the main page")
    public void user_should_be_on_the_main_page() {
        System.out.println(1);
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("User clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() {
        System.out.println(2);
        BrowserUtils.waitForClickablility(pages.loginPage().signin_button,5);
        System.out.println(3);
        pages.loginPage().signin_button.click();
    }
    @Then("User logs in with valid {string} and {string}")
    public void user_logs_in_with_valid_and(String username, String password) {
        System.out.println(3);
        pages.loginPage().username_box.sendKeys(ConfigurationReader.getProperty(username));
        pages.loginPage().password_box.sendKeys(ConfigurationReader.getProperty(password));
        pages.loginPage().submit_button.click();
    }
    @Then("User verifies that {string} page name is displayed")
    public void user_verifies_that_page_name_is_displayed(String pageTitle) {
        Assert.assertEquals(pageTitle,pages.loginPage().getPageTitle());

    }
    @Then("User should not logs in with valid {string} and {string}")
    public void user_should_not_logs_in_with_valid_and(String username, String password) {
        System.out.println(3);
        pages.loginPage().username_box.sendKeys(ConfigurationReader.getProperty(username));
        pages.loginPage().password_box.sendKeys(ConfigurationReader.getProperty(password));
        pages.loginPage().submit_button.click();
    }
    @Then("User verifies that {string} page name is not displayed")
    public void user_verifies_that_page_name_is_not_displayed(String pageTitle) {
        Assert.assertNotEquals(pageTitle,pages.loginPage().getPageTitle());
    }

    @Then("Verify that {string} message is displayed")
    public void verify_that_message_is_displayed(String message) {
        Assert.assertEquals(message,pages.loginPage().error_message.getText());
    }}