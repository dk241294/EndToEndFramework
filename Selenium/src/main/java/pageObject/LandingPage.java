package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
    WebDriver driver;
    By signIn = By.cssSelector("a[href*='sign_in']");
    By title = By.xpath("//h2[contains(text(),'Featured Courses')]");
    By navigationbar= By.xpath("//div[@role='navigation']");

    public LandingPage(WebDriver driver) {
        this.driver=driver;
    }

    public WebElement getLogin() {
        return driver.findElement(signIn);
    }
    public WebElement getTitle() {
        return driver.findElement(title);
    }
    public WebElement getnavigationBar() {
        return driver.findElement(navigationbar);
    }
}
