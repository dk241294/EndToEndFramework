import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {
    WebDriver driver;



    public WebDriver initializeDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream fs = new FileInputStream("C:\\Users\\DEEPAK\\Documents\\GitHub\\EndToEndFramework\\Selenium\\src\\main\\dataProperties");
        prop.load(fs);
        String browserName = prop.getProperty("browser");
        if (browserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();


        } else if (browserName.equals("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver = new FirefoxDriver();
            driver.get("");
        }
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }
}
