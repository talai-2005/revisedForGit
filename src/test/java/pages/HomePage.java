package pages;

import org.openqa.selenium.WebDriver;

import static driver.DriverSingletone.getDriver;

public class HomePage extends BasePage {
    String baseURL = "https://www.oma.by/";

    public HomePage() {
        super();
    }

    public HomePage goToHomePage() {
        getDriver().get(baseURL);
        return this;
    }

    public PopUpPage goToPopUpPage() {
        return new PopUpPage();
    }

}
