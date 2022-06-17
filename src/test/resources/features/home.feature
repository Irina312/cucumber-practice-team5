@homeScenarios
Feature: Home page related scenarios

  Scenario: Verify header of the page is Automation with Selenium

#    hardcoded parameter, don't use this way
  @AUT-6 @smoke @regression @miniRegression
  Scenario: Verify all links are displayed
    Then Verify PHP Travels link is displayed

#    parameterize step, with dynamic parameter
  @linkTest
  Scenario: Verify following link is displayed
    Then Verify "Saucedemo" link is displayed

  @scenarioOutlineExample @regression
  Scenario Outline: Verify following link is displayed
    Then Verify "<linkText>" link is displayed
    Examples:
      | linkText    |
      | Saucedemo   |
      | PHP Travels |
      | Internet    |
      | E-commerce  |

  Scenario Outline: Verify button is enabled
    Then Verify "<pageLink>" is enabled
    Examples:
      | pageLink   |
      | Home       |
      | Curriculum |
#      | Notes      |
#      | Inputs     |

  @AUT-4-1
  Scenario: Verify option to add a statement in Do's section Statements should take only letters and number.
  Given The user should be able to click Do's section
  Then Verify "Add do" section is enabled to click
  Then Perform enter the value as a letter
  Then perform enter the value as a number
  Then Perform click on "Enter" button and verify is clickable
  @AUT-4-2
  Scenario: Verify option to add a statement in Don't section Statements should take only letters and number
    Given The user should be able to click Don't section
    Then Verify "Add Don't" section is enabled to click
    Then Perform enter the value as a letter
    Then perform enter the value as a number
    Then Perform click on "Enter" button and verify is clickable





