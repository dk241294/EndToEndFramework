import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObject.LandingPage;

import java.io.IOException;

public class ValidateNAvigationBar extends Base {
  //  WebDriver driver;
    @BeforeTest
    public void initialize() throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
    }

    @Test
    public void validate()  throws IOException {
        // Base b= new Base(driver);

        LandingPage lp=new LandingPage(driver);
        //lp.getTitle();
       // Assert.assertEquals(lp.getTitle().getText(),"FEATURED COURSES");
        Assert.assertTrue(lp.getnavigationBar().isDisplayed());
    } @AfterTest
    public void tearDown(){
        driver.close();
    }
}
