package stepDefinitions;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjectModel.CartPage;
import PageObjectModel.CheckoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutSteps {
	    WebDriver driver;
	    CartPage cartPage;
	    CheckoutPage checkoutPage;

	    @Given("I am at the checkout page")
	    public void i_am_at_the_checkout_page() {
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        driver = new ChromeDriver();
	        driver.get("https://www.demoblaze.com/");
	        driver.manage().window().maximize();
	        cartPage = new CartPage(driver);
	        checkoutPage = new CheckoutPage(driver);
	       // cartPage.goToCart();
	        cartPage.proceedToCheckout();
	    }

	    @When("I enter shipping details: {string}, {string}, {string}, {string}, {string}, {string}")
	    public void i_enter_shipping_details(String name, String country, String city, String card, String month, String year) {
	        checkoutPage.enterShippingDetails(name, country, city, card, month, year);
	    }

	    @When("I select the payment method and place the order")
	    public void i_select_the_payment_method_and_place_the_order() {
	        checkoutPage.placeOrder();
	    }
	       //driver.quit();
 }
