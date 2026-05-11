package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.HomePage;
import PageObjectModel.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ProductSearchStep {
    WebDriver driver;
    HomePage homePage;
    ProductPage productPage;

    @Given("I am on the homepage")
    public void i_am_on_the_homepage() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
    }

    @When("I search for a product {string}")
    public void i_search_for_a_product(String productName) {
        homePage.searchProduct(productName);
    }

    @Then("the results should display the product {string}")
    public void the_results_should_display_the_product(String expectedProduct) {
        Assert.assertTrue("Product not displayed", productPage.verifyProductDisplayed(expectedProduct));
        driver.quit();
    }
}
