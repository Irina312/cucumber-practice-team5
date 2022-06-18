@loginScenarios
Feature: Dashboard question test
  Background: user logs in to the web app
    Given  User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button

  Scenario: User will login to the account
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button
    Then User verifies the title of the page is "Interview App"



