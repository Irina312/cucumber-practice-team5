package step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.WebDriverManager;

import static pages.CommonPage.XPATH_TEMPLATE_TEXT_CONTAINS;

 public class HomeSteps implements CommonPage {
    HomePage homePage;
    public  HomeSteps () {

        homePage = new HomePage();
    }

     @Then("Verify {string} are displayed")
     public void verifyAreDisplayed(String dashboard) {
         Assert.assertTrue((WebDriverManager.isDisplayed(By.xpath(String.format(XPATH_TEMPLATE_TEXT_CONTAINS, dashboard)))));
     }
 }

