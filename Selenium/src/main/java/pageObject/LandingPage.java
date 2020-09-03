package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    WebDriver driver;
    By signIn = By.cssSelector("a[href*='sign_in']");

    public LandingPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getLogin() {
        return driver.findElement(signIn);
    }
}
