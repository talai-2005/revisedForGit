package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartAddStepsDefinition extends AbstractStepDefinitionClass{

    @Given("open browser")
    public void open_browser() {
        homePage.goToHomePage().goToPopUpPage().acceptCookies();

    }
    @When("user goes to cart")
    public void user_goes_to_cart() {
        linoleumPage.addProductToCart().goToCartPage();

    }
    @Then("product is added to cart")
    public void product_is_added_to_cart() {
        cartPage.assertCartPageWorks("Вход или регистрация");
    }
}
