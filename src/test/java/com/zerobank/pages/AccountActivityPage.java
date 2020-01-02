package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AccountActivityPage extends BasePage {
    public AccountActivityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//select[@id='aa_accountId']")
    WebElement dropdown_menu;



    public String defaultOfDropdown(){
        Select select = new Select(dropdown_menu);
        BrowserUtils.waitForVisibility(dropdown_menu,5);
        return select.getFirstSelectedOption().getText();
    }


}
