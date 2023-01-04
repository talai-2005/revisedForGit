package stepDefinitions;

import pages.CartPage;
import pages.HomePage;
import pages.LinoleumPage;

import static driver.DriverSingletone.getDriver;


public abstract class AbstractStepDefinitionClass {
    HomePage homePage = new HomePage(getDriver());
    LinoleumPage linoleumPage = new LinoleumPage(getDriver());
    CartPage cartPage = new CartPage(getDriver());
}
