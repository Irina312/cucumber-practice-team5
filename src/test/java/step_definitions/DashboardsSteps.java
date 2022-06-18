package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import pages.CommonPage;
import pages.DashboardPage;
import utils.WebDriverManager;

import java.util.NoSuchElementException;


public class DashboardsSteps implements CommonPage {
    DashboardPage dashboardPage;

    public DashboardsSteps() {
        dashboardPage = new DashboardPage();
    }

    @When("User click on {string} app")
    public void user_click_on_app(String button) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, button))).click();
    }

    @When("User clicks on {string} button in coding question")
    public void user_clicks_on_button_in_coding_question(String btn) {
        WebDriverManager.getDriver().findElement(By.xpath(String.format(XPATH_TEMPLATE_BUTTON, btn))).click();
    }

    @When("User submits a {string} question")
    public void user_submits_a_question(String msg) {
        WebDriverManager.sendKeys(dashboardPage.txtInputField, msg);
    }

    @When("User clicks on edit message icon")
    public void user_clicks_on_edit_message_icon() {
        WebDriverManager.click(dashboardPage.editMsgBtn);
    }

    @When("User enters edited {string} question")
    public void user_enters_edited_question(String message) {
        new Actions(WebDriverManager.getDriver()).moveToElement(dashboardPage.newQuestionField).doubleClick().click().sendKeys(message).perform();
    }

    @When("User confirms the changes made")
    public void user_confirms_the_changes_made() {
        WebDriverManager.click(dashboardPage.confirmNewQuestionBtn);
    }

    @And("User clicks the delete button")
    public void userClicksTheDeleteButton() {
        WebDriverManager.click(dashboardPage.deleteMsgBtn);
    }

    @Then("User should see {string} question displayed")
    public void userShouldSeeQuestionDisplayed(String question) {
        Assert.assertThrows(NoSuchElementException.class, () -> {
            WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, question)));
        });
    }

    @Then("User will not see the {string} question displayed")
    public void userWillNotSeeTheQuestionDisplayed(String string) {
        Assert.assertThrows(NoSuchElementException.class, () -> {
            WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, string)));
        });
    }
}
