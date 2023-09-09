package Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import static Tests.WebDriverSingleton.driver;

public class BaseTest {
    @BeforeClass
    public void startDriver()
    {
        driver().navigate().to("https://www.google.com");
        driver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver().manage().window().maximize();
    }
@AfterClass
    public void closeDriver() { driver().quit(); }
    public void resetCache() {
        driver().manage().deleteAllCookies();
    }
}



