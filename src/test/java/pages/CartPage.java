package pages;

import org.openqa.selenium.By;


import static org.junit.Assert.assertEquals;

public class CartPage extends BasePage {
    public CartPage() {
        super();
    }
    By kontactnyeDannye = By.xpath("//*[@id=\"comp_00f9e84c7b800503addb1802e11daa53\"]/div/div/form/h2");

    public String assertCartPageWorks() {
       return letsGetText(kontactnyeDannye);
    }

}
