package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import static org.junit.Assert.assertEquals;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {
        super(driver);
    }
    By kontactnyeDannye = By.xpath("//*[@id=\"comp_00f9e84c7b800503addb1802e11daa53\"]/div/div/form/h2");

    public void assertCartPageWorks(String text) {
       assertEquals(letsGetText(kontactnyeDannye), text);
    }

}
