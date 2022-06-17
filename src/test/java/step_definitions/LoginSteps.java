package step_definitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pages.CommonPage;
import utils.WebDriverManager;

import java.util.Map;

public class LoginSteps implements CommonPage {

    @When("User enters following credentials:")
    public void userEntersFollowingCredentials(Map<String, String> data) {
        for(String key: data.keySet()){
            WebDriverManager.sendKeys(By.xpath(String.format(XPATH_TEMPLATE_INPUT_FIELD, key)), data.get(key));
        }

    }
}
