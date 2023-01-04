package tests;

import driver.DriverSingletone;
import io.cucumber.messages.types.Scenario;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    @Before
    public void setUp() {
        DriverSingletone.getDriver();
    }

    @After
    public void stopBrowser(Scenario scenario) {
        DriverSingletone.closeDriver();
    }
}

