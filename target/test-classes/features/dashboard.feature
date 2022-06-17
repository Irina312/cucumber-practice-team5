Feature: Dashboard page scenarios

  Scenario: User will login to the account
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    Then User clicks on "Login" button

  Scenario Outline: Verify 3 dashboards present
    Given User opens login page
    When User switches to the dashboard page
    Then User verifies "<dashboards>" are present
    Examples:
    |All Topics |
    |Coding     |
    |Soft skills|