@dashboardScenarios
Feature: Dashboard question test
  Background: user logs in to the web app
    Given  User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button

  Scenario: User should be able to edit the question that was added
    When User click on "Coding" app
    And User clicks on "Enter new question " button in coding question
    And User submits a "What's new in Java" question
    And User clicks on "Enter" button
    And User clicks on edit message icon
    And User enters edited "What's new in Java" question
    And User confirms the changes made
    Then User should see "What's new in Java" question displayed


  Scenario: User should be able to delete the question that was added
    When User click on "Coding" app
    And User clicks on "Enter new question " button in coding question
    And User submits a "What's new in Java" question
    And User clicks on "Enter" button
    And User clicks the delete button
    Then User will not see the "What's new in Java" question displayed


