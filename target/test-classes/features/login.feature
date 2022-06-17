@loginScenarios
Feature: Login page tests

  Scenario: User will login to the account
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    Then User clicks on "Login" button

