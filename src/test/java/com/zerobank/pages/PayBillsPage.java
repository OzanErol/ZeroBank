package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBillsPage extends BasePage {


    public PayBillsPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }
        String dayLocator;

        @FindBy(xpath = "//*[@id=\"pay_bills_tab\"]/a")
        public WebElement Pay_bills_button;

        @FindBy(xpath = "//*[@id=\"alert_content\"]/span")
        public WebElement alert_message;

        @FindBy(xpath = "//*[@id=\"alert_content\"]/span")
         public List<WebElement> alert_messageS;


        @FindBy(id = "sp_payee")
        public WebElement Payee_type;

        @FindBy(id = "sp_account")
        public WebElement Account;

        @FindBy(id = "sp_amount")
        public WebElement Amount;

        @FindBy(id = "sp_date")
        public WebElement Date;

        @FindBy(id = "sp_description")
        public WebElement Description;

        @FindBy(id = "pay_saved_payees")
        public WebElement Pay_button;


        public boolean isAmountEntered () {
            return Amount.getText() != null;
        }

        public boolean isDateEntered () {
            return Date.getText() != null;
        }

        public void enterPayee (String payee){
            Select select = new Select(Payee_type);
            BrowserUtils.waitForVisibility(Payee_type, 5);
            select.selectByVisibleText(payee);
        }

        public void enterAccount (String account){
            Select select = new Select(Account);
            BrowserUtils.waitForVisibility(Account, 5);
            select.selectByVisibleText(account);
        }
        public static void monthPicker (String dateInput){
            Driver.getDriver().findElement(By.xpath("//*[@id=\"sp_date\"]")).click();
            int month = Integer.parseInt(dateInput.substring(0, 2));
            int defaultMonth = 1;
            while (defaultMonth < month) {
                Driver.getDriver().findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
                defaultMonth++;
            }
            int day = Integer.parseInt(dateInput.substring(3, 5));
            String dayLocator = "//*[.=\"" + day + "\"]";
            Driver.getDriver().findElement(By.xpath(dayLocator)).click();
        }
        public  String getHtmlMessage(WebElement element){
            JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
            Boolean is_valid = (Boolean)js.executeScript("return arguments[0].checkValidity();", element);
            return  (String)js.executeScript("return arguments[0].validationMessage;", element);
        }


    }

