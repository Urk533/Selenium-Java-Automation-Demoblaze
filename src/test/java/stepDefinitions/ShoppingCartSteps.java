package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModel.CartPage;
import PageObjectModel.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShoppingCartSteps {
    WebDriver driver;
    HomePage homePage;
    CartPage cartPage;

    @Given("I have added {string} to the cart")
    public void i_have_added_to_the_cart(String product) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "\"C:\\\\Users\\\\Shubham.Yetonde\\\\Selenium_Assignment_File\\\\BrowserDrivers\\\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        
        homePage.selectProduct(product);
        Thread.sleep(2000);  // Wait for page load
        homePage.addToCart();
        Thread.sleep(2000);  // Wait for add to cart action
    }

    @When("I remove {string} from the cart")
    public void i_remove_from_the_cart(String product) {
        cartPage.removeFromCart(product);
    }

    @Then("the total price should be updated correctly")
    public void the_total_price_should_be_updated_correctly() {
        cartPage.verifyPriceCalculation();
        driver.quit();
    }
}
