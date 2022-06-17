package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import utils.WebDriverManager;

import java.util.Map;

import static pages.CommonPage.XPATH_TEMPLATE_BUTTON;
import static pages.CommonPage.XPATH_TEMPLATE_INPUT_FIELD;

public class LoginSteps {
    @When("User enters following credentials:")
    public void user_enters_following_credentials(Map<String, String> data) {
        for(String key: data.keySet()){
            WebDriverManager.sendKeys(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key)), data.get(key));
        }
    }

    @When("User clicks on {string} button")
    public void user_clicks_on_button(String btn) {
        WebDriverManager.click(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn)));
    }

}
