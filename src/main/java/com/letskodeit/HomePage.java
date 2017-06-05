package com.letskodeit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Jay Vaghani on 04/06/2017.
 */
public class HomePage extends Utils{



    @FindBy(linkText = "Login")
    WebElement _loginButton;

    public void clickOnLoginTab(){
        _loginButton.click();
    }
}
