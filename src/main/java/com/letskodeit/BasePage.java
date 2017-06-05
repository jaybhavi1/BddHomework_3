package com.letskodeit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Jay Vaghani on 26/04/2017.
 * This is the base page
 */
public class BasePage
{
    public static WebDriver driver;

    BasePage(){
        PageFactory.initElements(driver,this);
    }
}
