package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    @FindBy(xpath = ("/html/head/title"))
    public WebElement page_title;

    public String getPageTitle(){
        BrowserUtils.wait(3);
        return Driver.getDriver().getTitle();
    }

    public void navigateModule(String moduleName){
        String moduleLocator = "//a[text()='" + moduleName +"']";
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),20);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));

        WebElement module = Driver.getDriver().findElement(By.xpath(moduleLocator));
        BrowserUtils.waitForVisibility(module,5);
        BrowserUtils.waitForClickablility(module,5);
        module.click();

    }
}
