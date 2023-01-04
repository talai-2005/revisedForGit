package pages;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import static driver.DriverSingletone.getDriver;

public class PopUpPage extends BasePage {
    public PopUpPage() {
        super();
    }
    By consentButton = By.xpath("//button[contains(text(), 'Согласен')]");

    public void acceptCookies() {
        String parentWindowHandler = getDriver().getWindowHandle();
        String subWindowHandler = null;

        Set<String> handles = getDriver().getWindowHandles();
        Iterator<String> iterator = handles.iterator();
        while (iterator.hasNext()){
            subWindowHandler = iterator.next();
        }
        getDriver().switchTo().window(subWindowHandler);
        click(consentButton);
        getDriver().switchTo().window(parentWindowHandler);
    }
}
