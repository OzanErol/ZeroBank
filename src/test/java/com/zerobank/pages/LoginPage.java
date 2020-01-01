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


        public void Login(String username, String password){
            username_box.sendKeys(username);
            password_box.sendKeys(password);
            submit_button.click();
        }
    }

