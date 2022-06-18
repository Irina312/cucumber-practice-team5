package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import utils.WebDriverManager;

import java.util.List;

import static pages.CommonPage.XPATH_TEMPLATE_TEXT_CONTAINS;

public class HomeSteps implements CommonPage {
    @Then("Verify {string} link is displayed")
    public void verifyLinkIsDisplayed(String dashboard) {
        Assert.assertTrue((WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, dashboard)))));
    }
    @Given("User click on Do's section")
    public void user_click_on_do_s_section(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))).click();
    }
    @When("User Verify {string} section is enabled to click")
    public void user_verify_section_is_enabled_to_click(String typ) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, typ))).click();
    }
    @When("User enter the value as a letter")
    public void user_enter_the_value_as_a_letter(String addletter) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, addletter))).click();
    }
    @When("User enter the value as a number")
    public void user_enter_the_value_as_a_number(String addnumber) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, addnumber))).click();
    }
    @Then("User click on {string} button and verify is clickable")
    public void user_click_on_button_and_verify_is_clickable(String enter) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, enter))).click();
    }

    }


