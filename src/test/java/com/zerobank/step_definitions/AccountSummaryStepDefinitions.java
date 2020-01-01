package com.zerobank.step_definitions;

import com.zerobank.pages.Pages;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AccountSummaryStepDefinitions {
    Pages pages = new Pages();

    @Given("Verify that Summary Page has {string}")
    public void verify_that_Summary_Page_has(String string) {
        String ali = Driver.getDriver().findElement(By.xpath("//*[text() = 'Cash Accounts']")).getText();
        Assert.assertEquals(string,ali);
    }


}
