package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    WebDriver driver;

    private By addToCartButton = By.xpath("//a[text()='Add to cart']");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean verifyProductDisplayed(String expectedProduct) {
        WebElement product = driver.findElement(By.xpath("//h4[contains(text(),'" + expectedProduct + "')]"));
        return product.isDisplayed();
    }
}
