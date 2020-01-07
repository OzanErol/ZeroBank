package com.zerobank.step_definitions;

import com.zerobank.pages.BasePage;
import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsStepDefinitions {
    BasePage basePage = new BasePage();
    PayBillsPage payBillsPage = new PayBillsPage();

    @Then("User lands on Pay bills page")
    public void user_lands_on_Pay_bills_page() {
        BrowserUtils.waitForClickablility(payBillsPage.Pay_bills_button,5);
        payBillsPage.Pay_bills_button.click();
    }

    @Given("User enters valid payment informations {string} {string} {string} {string} {string}")
    public void user_enters_valid_payment_informations_Date(String payee, String account, String amount, String date,String description) {
       BrowserUtils.waitForStaleElement(payBillsPage.Payee_type);
       payBillsPage.enterPayee(payee);
        BrowserUtils.waitForStaleElement(payBillsPage.Account);
        payBillsPage.enterAccount(account);
        BrowserUtils.waitForStaleElement(payBillsPage.Account);
        payBillsPage.Amount.sendKeys(amount);
        BrowserUtils.waitForStaleElement(payBillsPage.Date);
        PayBillsPage.monthPicker(date);
        BrowserUtils.waitForStaleElement(payBillsPage.Description);
        payBillsPage.Description.sendKeys(description);
        BrowserUtils.waitForStaleElement(payBillsPage.Pay_button);
        payBillsPage.Pay_button.click();

    }

    @Given("User enters invalid payment informations {string} {string} {string} {string} {string}")
    public void user_enters_invalid_payment_informations_Date(String payee, String account, String amount, String date,String description) {
        BrowserUtils.waitForStaleElement(payBillsPage.Payee_type);
        payBillsPage.enterPayee(payee);
        BrowserUtils.waitForStaleElement(payBillsPage.Account);
        payBillsPage.enterAccount(account);
        BrowserUtils.waitForStaleElement(payBillsPage.Account);
        payBillsPage.Amount.sendKeys(amount);
        BrowserUtils.waitForStaleElement(payBillsPage.Date);
        PayBillsPage.monthPicker(date);
        BrowserUtils.waitForStaleElement(payBillsPage.Description);
        payBillsPage.Description.sendKeys(description);
        BrowserUtils.waitForStaleElement(payBillsPage.Pay_button);
        payBillsPage.Pay_button.click();

    }

    @Then("Verify that {string} alert message is displayed")
    public void verify_that_alert_message_is_displayed(String alertExpected) {
        BrowserUtils.waitForStaleElement(payBillsPage.alert_message);
        Assert.assertEquals(alertExpected,payBillsPage.alert_message.getText());

    }

    @Then("Verify that {string} alert message is displayed (negative)")
    public void verify_that_alert_message_is_displayed_negative(String alertExpected) {
        System.out.println(4);
        BrowserUtils.wait(1);
        System.out.println(payBillsPage.getHtmlMessage(payBillsPage.Amount));

//        String message = payBillsPage.Amount.getAttribute("validationMessage");
//        String message2 = payBillsPage.Date.getAttribute("validationMessage");
        System.out.println(payBillsPage.alert_messageS.size());
        if(payBillsPage.alert_messageS.size()<1) {
            Assert.assertEquals(alertExpected, payBillsPage.getHtmlMessage(payBillsPage.Amount));
        }else Assert.assertFalse(true);
    }
    @Then("Verify that {string} alert message is displayed character")
    public void verify_that_alert_message_is_displayed_character(String alertExpected) {
        System.out.println(4);
        BrowserUtils.wait(1);
//        String message = payBillsPage.Amount.getAttribute("validationMessage");
//        String message2 = payBillsPage.Date.getAttribute("validationMessage");
        System.out.println(payBillsPage.alert_messageS.size());
        if(payBillsPage.alert_messageS.size()==0) {
            Assert.assertTrue(true);
            System.out.println("Character is not accepted");
        }else {
            System.out.println("Character is accepted, which is wrong");
            Assert.assertFalse(true);
        }
    }


}
