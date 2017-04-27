
@SmokeTest
Feature: As a user
  I want to to login as a existing user and I want navigate to Edit profile page


  Scenario: I am able to navigate login Page successfully
    Given I am on Home page
    When I Click on Login Tab
    Then I navigate to Login Page Successfully

  Scenario: I should login successfully as a existing user
    Given I am on login page
    When I enter username
    And I enter password
    And I click on login Button
    Then I am login successfully

  Scenario: I should navigate to Edit profile page Successfully
    When I click on User Tab
    And I click on Edit Profile link
    Then I am on Edit Profile page