package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static driver.DriverSingletone.getDriver;

public class BasePage {
    public WebDriverWait wait;

    public BasePage() {
        wait = new WebDriverWait(getDriver(), 20);
    }

    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    public void click(By elementBy) {
        waitVisibility(elementBy);
        getDriver().findElement(elementBy).click();
    }

    public String letsGetText(By elementBy) {
        waitVisibility(elementBy);
        return getDriver().findElement(elementBy).getText();
    }

}

