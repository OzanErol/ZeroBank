package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class Pages {
    private LoginPage loginPage;
    private BasePage basePage;
    private AccountSummaryPage accountSummaryPage;

public Pages(){
    PageFactory.initElements(Driver.getDriver(),this);
}

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }

    public AccountSummaryPage accountSummaryPage() {
        if (accountSummaryPage == null) {
            accountSummaryPage = new AccountSummaryPage();
        }
        return accountSummaryPage;
    }


}