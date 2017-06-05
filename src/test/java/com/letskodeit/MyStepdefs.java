package com.letskodeit;

import cucumber.annotation.en.And;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import org.openqa.selenium.By;

/**
 * @author Jay Vaghani on 26/04/2017.
 */

public class MyStepdefs extends Utils
{
    HomePage homePage;
    LoginPage loginPage;

    public void before(){

    }


    @Given("^I am on Home page$")
    public void iAmOnHomePage()
    {
    }

    @When("^I Click on Login Tab$")
    public void iClickOnLoginTab()
    {
        homePage = new HomePage();
        homePage.clickOnLoginTab();
    }

    @Then("^I navigate to Login Page Successfully$")
    public void iNavigateToLoginPageSuccessfully()
    {
        assertTrueContains("h1","css","Log In to Let's Kode It","User is not on Login Page");
    }

    @Given("^I am on login page$")
    public void iAmOnLoginPage()
    {
        homePage = new HomePage();
        homePage.clickOnLoginTab();
    }

    @When("^I enter username$")
    public void iEnterUsername()
    {
        loginPage = new LoginPage();
        loginPage.enterEmailId("abc1@yahoo.com");
    }

    @And("^I enter password$")
    public void iEnterPassword()
    {
        loginPage.enterPassword("38abc1");
    }

    @And("^I click on login Button$")
    public void iClickOnLoginButton()
    {
        loginPage.clickOnLoginButton();
    }

    @Then("^I am login successfully$")
    public void iAmLoginSuccessfully()
    {
//        assertTrueContains("//a[contains(text(),'My Courses')]","xpath","My Courses","User should not Login ");
    }


//    @When("^I click on User Tab$")
//    public void iClickOnUserTab()
//    {
//        clickOnElement(By.cssSelector("img.gravatar"));
//    }
//
//    @And("^I click on Edit Profile link$")
//    public void iClickOnEditProfileLink()
//    {
//        clickOnElement(By.linkText("Edit Profile"));
//    }
//
//
//    @Then("^I am on Edit Profile page$")
//    public void iAmOnEditProfilePage()
//    {
//        assertTrueContains("h2.section-title","css","Edit Profile","User not on Edit Profile page");
//        driver.quit();
//    }
}
