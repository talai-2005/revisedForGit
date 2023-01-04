package pages;

import driver.DriverSingletone;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import static driver.DriverSingletone.getDriver;


public class LinoleumPage extends BasePage {
    public LinoleumPage(WebDriver driver) {
        super(driver);
    }

    By promoCodeTearDown = By.xpath("//div[@class='popmechanic-close']");
    By interiorAndDecor = (By.xpath("/html/body/main/section[1]/div[1]/a[1]"));
    By laminat = By.xpath("//a[contains(text(), 'Ламинат')]");
    By addToCart = By.xpath("//*[@id=\"data-ga__catalog-products-grid\"]/div[1]/div[6]/div[1]/span/button/span/span[2]");
    By plusOneButton = By.xpath("//*[@id=\"data-ga__catalog-products-grid\"]/div[1]/div[6]/div[2]/button/span");
    By oformitButton = By.xpath("//*[@id=\"data-ga__catalog-products-grid\"]/div[1]/div[6]/div[2]/a");
    By emptyClick = By.xpath("//*[@id=\"data-ga__category-products\"]/div[2]/div[1]/div/h1");
    By thirtyTwo = By.xpath("//*[@id=\"data-ga__category-products\"]/div[2]/div[2]/ul/li[1]/a");
    By kamenagorskayButton = By.xpath("//*[@id=\"comp_491473fa3f74303826c9622811966a6a\"]/div[1]/span[2]/span[3]/span/span[1]/a");


    public LinoleumPage addProductToCart() {

        click(kamenagorskayButton);
        click(interiorAndDecor);
        click(promoCodeTearDown);
        click(laminat);
        click(emptyClick);
        click(thirtyTwo);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 500);");
        click(addToCart);

        click(plusOneButton);
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ESCAPE).build().perform();
        click(plusOneButton);
        action.sendKeys(Keys.ESCAPE).build().perform();
        click(plusOneButton);
        action.sendKeys(Keys.ESCAPE).build().perform();
        click(plusOneButton);
        action.sendKeys(Keys.ESCAPE).build().perform();
        click(oformitButton);
        return this;
    }

    public CartPage goToCartPage() {
        return new CartPage(getDriver());
    }
}

