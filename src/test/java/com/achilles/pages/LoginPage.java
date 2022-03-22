package com.achilles.pages;

import com.achilles.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id ="Email")
    public WebElement username;
    @FindBy (className = "button-submit")
    public WebElement submitButton;
    @FindBy(id ="PasswordHash")
    public WebElement password;

    public void login(String userName, String Password) {

        username.sendKeys(userName);
        submitButton.click();
        password.sendKeys(Password);
        submitButton.click();
    }



}
