package com.castlehill.pages;

import com.castlehill.utilitiy.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//input[@id='user-name']")
    private WebElement userNameInput;

    @FindBy(xpath="//input[@id='password']")
    private WebElement passWordInput;

    @FindBy(xpath="//input[@value='Login']")
    private WebElement loginButton;

    //this method will send the username to user input
    public void typeUserName(String userName){
        userNameInput.sendKeys(userName);
    }

    //this method will send the password to password input
    public void typePassWord(String passWord){
        passWordInput.sendKeys(passWord);
    }

    //this method will click on button
    public void clickButton(){
        loginButton.click();
    }
}

