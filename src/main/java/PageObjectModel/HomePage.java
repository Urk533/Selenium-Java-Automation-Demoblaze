package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    private By searchBox = By.id("search_query_top"); 
    private By searchButton = By.xpath("//button[@class='btn btn-default']"); 
    private By addToCartButton = By.xpath("//a[text()='Add to cart']"); 

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void searchProduct(String productName) {
        driver.findElement(searchBox).sendKeys(productName);
        driver.findElement(searchButton).click();
    }

    public void navigateToSection(String section) {
        By sectionLocator = By.xpath("//a[contains(text(),'" + section + "')]");
        driver.findElement(sectionLocator).click();
    }

    public void selectProduct(String product) {
        By productLocator = By.xpath("//a[contains(text(),'" + product + "')]");
        driver.findElement(productLocator).click();
    }

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }
}
