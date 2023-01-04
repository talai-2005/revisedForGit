package pages;

import driver.DriverSingletone;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class PopUpPage extends BasePage {
    public PopUpPage(WebDriver driver) {
        super(driver);
    }
    By consentButton = By.xpath("//button[contains(text(), 'Согласен')]");

    public void acceptCookies() {
        String parentWindowHandler = DriverSingletone.getDriver().getWindowHandle();
        String subWindowHandler = null;

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        driver.switchTo().window(subWindowHandler);
        click(consentButton);
        driver.switchTo().window(parentWindowHandler);
    }
}
