@homeScenarios
Feature: Home page related scenarios
  @IN-2
  Scenario: Verify user will see "Sign out" button and should not see "Manage Access" button
    When User sign in I should be able to see sign out button
      | Enter Username | test@yahoo.com |
      | Enter Password | test123    |
    And User clicks on "Login" button
    Then Verify "Sign out" link is displayed
    Then User should not have access to "Manage Access" button

