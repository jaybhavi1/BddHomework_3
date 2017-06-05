package com.letskodeit;

import cucumber.annotation.After;
import cucumber.annotation.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * @author Jay Vaghani on 26/04/2017.
 */
public class BaseTest extends BasePage
{
    @Before
    public void openBrowser()
    {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://letskodeit.teachable.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

}
