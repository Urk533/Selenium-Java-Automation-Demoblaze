package stepDefinitions;

import PageObjectModel.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeSteps {
    WebDriver driver;
    HomePage homePage;

    @Given("I launch the Demoblaze website")
    public void iLaunchTheDemoblazeWebsite() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        homePage = new HomePage(driver);
    }

    @When("I navigate to the {string} section")
    public void iNavigateToTheSection(String section) {
        homePage.navigateToSection(section);
    }
}
