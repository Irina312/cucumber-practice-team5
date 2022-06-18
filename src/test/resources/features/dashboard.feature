@dashboardScenarios
Feature: Dashboard questions scenarios

  Background: User login to Url
    When User sign in I should be able to see sign out button
      | Enter Username | test@yahoo.com |
      | Enter Password | test123    |
    And User clicks on "Login" button

  @IN-5
  Scenario: Verify add the question on coding
    When User click on "Coding" button
    And User click on "Enter new question " button
    And User summit "#Cucumber55&%*" question
    And User click on "Enter" button
    Then User should see "#Cucumber55&%*" question is displayed

  Scenario: Verify add the question on Soft skills
    When User click on "Soft skills" button
    And User click on "Enter new question " button
    And User summit "#Cucumber55&%*" question
    And User click on "Enter" button
    Then User should see "#Cucumber55&%*" question is displayed


