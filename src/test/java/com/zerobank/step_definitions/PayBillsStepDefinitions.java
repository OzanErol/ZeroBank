package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class PayBillsStepDefinitions {
    BasePage basePage = new BasePage();
    PayBillsPage payBillsPage = new PayBillsPage();

    @Then("User lands on Pay bills page")
    public void user_lands_on_Pay_bills_page() {
        BrowserUtils.waitForClickablility(payBillsPage.Pay_bills_button,5);
        payBillsPage.Pay_bills_button.click();
    }

    @Given("User enters valid payment informations {string} {string} {string} Date {string}")
    public void user_enters_valid_payment_informations_Date(String payee, String account, String amount, String string4) {
       payBillsPage.enterPayee(payee);
       payBillsPage.enterAccount(account);
       payBillsPage.Amount.sendKeys(amount);

       BrowserUtils.waitForVisibility(payBillsPage.alert_message,5);
    }

    @Then("Verify that {string} alert message is displayed")
    public void verify_that_alert_message_is_displayed(String string) {

    }


}
