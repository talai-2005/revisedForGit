package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class DriverSingletone {
    private static WebDriver driver;

    private DriverSingletone() {
    }

    public static WebDriver getDriver() {
        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--window-size=1366,768");
            driver = new ChromeDriver(options);
            driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }
}
