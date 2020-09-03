package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    By userName = By.id("user_email");
    By password = By.id("user_password");
    By login = By.xpath("//input[@type='submit']");

    public WebElement getUserNAme() {
        return driver.findElement(userName);
    }

    public WebElement getUserpassword() {
        return driver.findElement(password);
    }

    public WebElement getsubmit() {
        return driver.findElement(login);
    }
}
