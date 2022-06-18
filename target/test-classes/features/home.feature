Feature: Home page related scenarios

  Scenario Outline: User verifies dashboards are displayed
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button
    Then Verify "<dashboards>" are displayed
    Examples:
      | dashboards  |
      | All Topics  |
      | Coding      |
      | Soft skills |



