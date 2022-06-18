package step_definitions;

import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.WebDriverManager;

import java.util.Map;

public class LoginSteps implements CommonPage {

    @When("User open the url should see Title {string}")
    public void user_open_the_url_should_see_title(String title) {
        Assert.assertEquals(title, WebDriverManager.getDriver().getTitle());
    }
}
