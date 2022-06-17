package pages;

import org.openqa.selenium.support.PageFactory;
import utils.WebDriverManager;

public class DashboardPage {
    public DashboardPage(){

        PageFactory.initElements(WebDriverManager.getDriver(), this);
    }


}
