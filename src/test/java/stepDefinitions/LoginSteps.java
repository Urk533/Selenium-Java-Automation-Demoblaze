package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import PageObjectModel.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    WebDriver driver;
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
       // System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
       WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid credentials {string} and {string}")
    public void i_enter_valid_credentials(String username, String password) {
        loginPage.enterCredentials(username, password);
    }

    @Then("I should be redirected to the dashboard")
    public void i_should_be_redirected_to_the_dashboard() {
        Assert.assertTrue("Login failed!", loginPage.verifyLogin());
    }
 
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
