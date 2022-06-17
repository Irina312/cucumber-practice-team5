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