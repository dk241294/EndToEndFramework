import org.testng.annotations.Test;
import pageObject.LandingPage;

import java.io.IOException;

public class HomePage extends Base {


    @Test
    public void homePageNavigation() throws IOException {

       driver= initializeDriver();
       driver.get("http://www.qaclickacademy.com/");
        LandingPage lp=new LandingPage(driver);
        lp.getLogin().click();

    }
}
