Feature: Home page related scenarios

  Scenario Outline: User verifies dashboards are displayed
    When User enters following credentials:
      | Enter Username | test@yahoo.com |
      | Enter Password | test123        |
    And User clicks on "Login" button
    And Verify "<dashboards>" are displayed
    Examples:
      | dashboards  |
      | All Topics  |
      | Coding      |
      | Soft skills |



  @IN-4-1
  Scenario: User should add a statement in Do's section Statements should take only letters and number.
  Given User click on Do's section
  When User Verify "Add do" section is enabled to click
  And User enter the value as a letter
  And User enter the value as a number
  Then User click on "Enter" button and verify is clickable

  @IN-4-2
  Scenario: User should add a statement in Don't section Statements should take only letters and number
    Given User click on Don't section
    When User Verify "Add Don't" section is enabled to click
    And User enter the value as a letter
    And User  enter the value as a number
    Then User click on "Enter" button and verify is clickable







