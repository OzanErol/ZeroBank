package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.BasePage;
import com.zerobank.pages.Pages;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;


public class FindTransactionsStepDefinitions {
    AccountActivityPage accountActivityPage = new AccountActivityPage();
    BasePage basePage = new BasePage();
    Pages pages = new Pages();
    @Given("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {
        accountActivityPage.Find_transaction_tab.click();
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String string, String string2) {
        BrowserUtils.wait(1);
        accountActivityPage.Date_from.click();
        AccountActivityPage.monthPicker(string,accountActivityPage.Date_from);
        BrowserUtils.waitForVisibility(accountActivityPage.Date_to,5);
        accountActivityPage.Date_to.click();
        AccountActivityPage.monthPicker(string2,accountActivityPage.Date_to);
    }

    @When("clicks search")
    public void clicks_search() {
        System.out.println("befor click");
       BrowserUtils.wait(1);
        Driver.getDriver().findElement(By.xpath("//*[@id=\"find_transactions_form\"]/div[2]/button"));
        System.out.println("after click");
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String string, String string2) {

    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String string) {

    }

}
