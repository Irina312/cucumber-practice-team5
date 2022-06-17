package step_definitions;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.WebDriverManager;

import java.util.List;

public class HomeSteps {
    @Then("Verify {string} link is displayed")
    public void verifyLinkIsDisplayed(String dashboard) {
        Assert.assertTrue((WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, dashboard)))));
}
