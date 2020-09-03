import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;

import java.io.IOException;

public class HomePage extends Base {


    @Test
    public void homePageNavigation() throws IOException {

        driver = initializeDriver();
        driver.get("http://www.qaclickacademy.com/");
        LandingPage lp = new LandingPage(driver);
        lp.getLogin().click();
        LoginPage l = new LoginPage(driver);
        l.getUserNAme().sendKeys("deepak");
        l.getUserpassword().sendKeys("password");
        l.getsubmit().click();


    }
}
