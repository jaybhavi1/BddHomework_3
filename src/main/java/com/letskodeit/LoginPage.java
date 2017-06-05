package com.letskodeit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay Vaghani on 05/06/2017.
 */
public class LoginPage extends Utils{


    @FindBy (id = "user_email")
    WebElement _userEmail;

    @FindBy(id = "user_password")
    WebElement _userPassword;

    @FindBy(xpath = "//form[@id='new_user']/div[3]/input")
    WebElement _loginButton;

    public void enterEmailId(String email)
    {
        _userEmail.sendKeys(email);
    }

    public void enterPassword(String password){
        _userPassword.sendKeys(password);
    }

    public void clickOnLoginButton(){

       _loginButton.click();
    }


}
