package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {
    private static WebDriverSingleton webDriverSingleton = null;
    private WebDriver driver;

    private WebDriverSingleton() {
        driver = new ChromeDriver();
    }

    public static WebDriverSingleton getInstance() {
        if(webDriverSingleton == null) webDriverSingleton = new WebDriverSingleton();
      return webDriverSingleton;
    }
    public WebDriver getDriver()
   {
    return driver;
   }
   public static WebDriver driver()
   {
      return WebDriverSingleton.getInstance().getDriver();
   }
}
