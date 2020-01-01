package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {

    @FindBy(xpath = ("/html/head/title"))
    public WebElement page_title;

    public String getPageTitle(){
        BrowserUtils.wait(3);
        return Driver.getDriver().getTitle();
    }
}
