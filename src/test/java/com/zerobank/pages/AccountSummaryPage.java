package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage {



        @FindBy(css = "div h2")
        public List<WebElement> subTitles;

        @FindBy(xpath = "//h2[text()='Credit Accounts']/following-sibling::div[1]/div/table/thead/tr/th")
        public List<WebElement> columnNamesOfCreditAccounts;



        public List<String> getSubTitle(){

                return BrowserUtils.getListOfString(subTitles);
        }

        public List<String> getColumnNamesOfCreditAccounts(){
                return BrowserUtils.getListOfString(columnNamesOfCreditAccounts);
        }




}