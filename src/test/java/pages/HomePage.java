package pages;

import org.openqa.selenium.WebDriver;

import static driver.DriverSingletone.getDriver;

public class HomePage extends BasePage {
    String baseURL = "https://www.oma.by/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage goToHomePage() {
        driver.get(baseURL);
        return this;
    }

    public PopUpPage goToPopUpPage() {
        return new PopUpPage(getDriver());
    }

}
