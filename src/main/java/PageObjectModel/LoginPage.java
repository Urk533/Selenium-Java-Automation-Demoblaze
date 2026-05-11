package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

public class LoginPage {
    WebDriver driver;

    private By usernameField = By.id("loginusername");
    private By passwordField = By.id("loginpassword");
    private By loginButton = By.cssSelector(".button[onclick=\"logIn()\"]");
    private By loginSuccessElement = By.id("nameofuser"); // Example success indicator

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String Shubham) {
        driver.findElement(usernameField).sendKeys(Shubham);
    }

    public void enterPassword(String pass) {
        driver.findElement(passwordField).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }

    public void enterCredentials(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLogin();
    }

    public boolean verifyLogin() {
        try {
            WebElement userElement = driver.findElement(loginSuccessElement);
            return userElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
