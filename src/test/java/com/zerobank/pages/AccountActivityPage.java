package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
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

    @FindBy(css = "#tabs > ul > li:nth-child(2) > a")
    public WebElement Find_transaction_tab;

    @FindBy(id = "aa_description")
    public WebElement Ft_Description_box;

    @FindBy(id = "aa_fromDate")
    public  WebElement Date_from;

    @FindBy(id = "aa_toDate")
    public  WebElement Date_to;

    @FindBy(id = "aa_fromAmount")
    public  WebElement Amounts_from;

    @FindBy(id = "aa_toAmount")
    public  WebElement Amounts_to;

    @FindBy(id = "aa_type")
    public  WebElement Type_box;

    @FindBy(className = "btn btn-primary")
    public WebElement Find_box;


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

    public static void monthPicker (String dateInput, WebElement date_box ){
        date_box.click();
        int month = Integer.parseInt(dateInput.substring(0, 2));
        int defaultMonth = 1;
        int defaultYear= 2020;
        int year = Integer.parseInt(dateInput.substring(6));
        if(defaultYear<year){
            while (defaultYear < year) {
                for(int i = 0; i<12 ; i++){
                Driver.getDriver().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();}
                defaultYear++;
            }
        }else {
            while (defaultYear > year) {
            for(int i = 0; i<12 ; i++){
                Driver.getDriver().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();}
            defaultYear--;
        }

        }
        while (defaultMonth < month) {
            Driver.getDriver().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
            defaultMonth++;
        }
        int day = Integer.parseInt(dateInput.substring(3, 5));
        String dayLocator = "//*[.=\"" + day + "\"]";
        Driver.getDriver().findElement(By.xpath(dayLocator)).click();
    }

    public  void selectTypeBox(String string){
        Select select = new Select(Type_box);
        BrowserUtils.waitForVisibility(Type_box, 5);
        select.selectByVisibleText(string);
    }


}
