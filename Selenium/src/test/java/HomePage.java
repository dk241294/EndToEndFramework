import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObject.LandingPage;
import pageObject.LoginPage;

import java.io.IOException;

public class HomePage extends Base {

    @Test(dataProvider = "getData")
    public void homePageNavigation(String username,String Password) throws IOException {
        driver = initializeDriver();
        driver.get(prop.getProperty("url"));
        LandingPage lp = new LandingPage(driver);
        lp.getLogin().click();
        LoginPage l = new LoginPage(driver);
        l.getUserNAme().sendKeys(username);
        l.getUserpassword().sendKeys(Password);
        l.getsubmit().click();

    }

    @DataProvider
    public Object[] getData() {
        Object[][] data = new Object[2][2];
        data[0][0] = "deepak kumar";
        data[0][1] = "kumar";
        data[1][0] = "sallu";
        data[1][1] = "khan";
        return data;
    }
}
