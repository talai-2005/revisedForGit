package stepDefinitions;

import pages.CartPage;
import pages.HomePage;
import pages.LinoleumPage;

import static driver.DriverSingletone.getDriver;


public abstract class AbstractStepDefinitionClass {
    HomePage homePage = new HomePage();
    LinoleumPage linoleumPage = new LinoleumPage();
    CartPage cartPage = new CartPage();
}
