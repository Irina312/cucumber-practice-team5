package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.CucumberLogUtils;
import utils.WebDriverManager;

import javax.xml.bind.Element;
import java.util.List;
import java.util.Map;

public class HomeSteps implements CommonPage {
    HomePage homePage;

    public HomeSteps(){

        homePage = new HomePage();
    }

    @When("User sign in I should be able to see sign out button")
    public void user_sign_in_i_should_be_able_to_see_sign_out_button(Map<String, String> data) {
        for(String key: data.keySet()){
            WebDriverManager.sendKeys(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key)), data.get(key));
        }
    }
    @When("User clicks on {string} button")
    public void user_clicks_on_button(String login) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, login))).click();

    }
    @Then("Verify {string} link is displayed")
    public void verify_link_is_displayed(String signout) {

        Assert.assertTrue(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_SIGNOUT_BUTTON, signout))));
    }

    @Then("User should not have access to {string} button")
    public void userShouldNotHaveAccessToButton(String manageAccess) {

        Assert.assertFalse(WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT,manageAccess))));
    }

}
