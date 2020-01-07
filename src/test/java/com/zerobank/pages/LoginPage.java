package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
        public LoginPage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }
        @FindBy(id = "signin_button")
        public WebElement signin_button;

        @FindBy(id = "user_login")
        public WebElement username_box;

        @FindBy(id = "user_password")
        public WebElement password_box;

        @FindBy(name = "submit")
        public WebElement submit_button;

        @FindBy(xpath = "//*[@id=\"login_form\"]/div[1]")
        public WebElement error_message;

        @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/tbody/tr[1]/td[1]/a")
        public WebElement saving_button;

        @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/table/tbody/tr/td[1]/a")
        public WebElement brokerage_button;
    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/tbody/tr[2]/td[1]/a")
    public WebElement creditCard_button;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[3]/div/table/tbody/tr[1]/td[1]/a")
    public WebElement checking_button;



        public void Login(String username, String password){
            username_box.sendKeys(username);
            password_box.sendKeys(password);
            submit_button.click();
        }

        public void clickTo(WebElement str){
            str.click();
        }
    }

