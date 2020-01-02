package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.Pages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {
    Pages pages = new Pages();

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("user verifies account types are displayed")
    public void user_verifies_account_types_are_displayed(List<String> dataTable) {

        System.out.println(dataTable);
        BrowserUtils.wait(2);
        Assert.assertEquals(dataTable,accountSummaryPage.getSubTitle());

    }
    @When("user verifies column names")
    public void user_verifies_column_names(List<String> dataTable) {
        BrowserUtils.wait(2);
        System.out.println(dataTable);
        BrowserUtils.wait(1);
        Assert.assertEquals(dataTable,accountSummaryPage.getColumnNamesOfCreditAccounts());
    }

}
