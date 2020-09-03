import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.LandingPage;

import java.io.IOException;

public class ValidateTitle extends Base {
    WebDriver driver;
    @Test
    public void validate() throws IOException {
       // Base b= new Base(driver);
        driver=initializeDriver();
        driver.get("http://www.qaclickacademy.com/");
        LandingPage lp=new LandingPage(driver);
        //lp.getTitle();
        Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES");
        Assert.assertTrue(lp.getnavigationBar().isDisplayed());
    }
}
