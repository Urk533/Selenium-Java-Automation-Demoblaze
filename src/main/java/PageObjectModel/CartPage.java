package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver;

    private By cartButton = By.id("cartur");
    private By placeOrderButton = By.xpath("//button[text()='Place Order']");
    private By deleteItemButton = By.xpath("//a[text()='Delete']");
    private By totalPrice = By.id("totalp"); // Updated locator for total price

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {
        driver.findElement(cartButton).click();
    }

    public void removeItem() {
        driver.findElement(deleteItemButton).click();
    }

    public void proceedToCheckout() {
        driver.findElement(placeOrderButton).click();
    }

    public void removeFromCart(String product) {
        openCart();  // Open the cart first
        removeItem(); // Click delete (Assumes single item delete scenario)
    }

    public void verifyPriceCalculation() {
        openCart(); 
        String priceText = driver.findElement(totalPrice).getText();
        System.out.println("Total Price after item removal: " + priceText);
    }
}
