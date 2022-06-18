package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.CommonPage;
import pages.DashboardPage;
import utils.WebDriverManager;

public class DashboardStepts implements CommonPage {
    DashboardPage dashboardPage;

    public DashboardStepts(){

        dashboardPage = new DashboardPage();
    }

    @Given("User click on {string} button")
    public void user_click_on_button(String coding) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, coding))).click();
    }


    @And("User summit {string} question")
    public void userSummitQuestion(String msg) {
        WebDriverManager.sendKeys(dashboardPage.contentInput, msg);
    }

    @Then("User should see {string} question is displayed")
    public void user_should_see_question_is_displayed(String question) {
        Assert.assertEquals(question, WebDriverManager.getText(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, question))));
    }


}
