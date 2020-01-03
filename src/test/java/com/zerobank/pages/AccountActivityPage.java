package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {
    public AccountActivityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[@id=\"account_activity_tab\"]/a")
    public WebElement accountActivityButton;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement accountSelectionBox;

    @FindBy(css = "table thead tr th")
    public List<WebElement> transactionsColumnsNames;

    public String defaultOfDropdown(){
        Select select = new Select(accountSelectionBox);
        BrowserUtils.waitForVisibility(accountSelectionBox,5);
        return select.getFirstSelectedOption().getText();
    }
    public List<String> getAccountDropDownOptions(){
        Select select = new Select(accountSelectionBox);
        BrowserUtils.waitForVisibility(accountSelectionBox,5);
        BrowserUtils.waitForClickablility(accountSelectionBox,5);
        accountSelectionBox.click();
        List<WebElement > options = select.getOptions();
        return BrowserUtils.getListOfString(options);
    }
    public List<String> getTransactionsTable(){
        BrowserUtils.wait(2);
        return BrowserUtils.getListOfString(transactionsColumnsNames);
    }


}
