package com.saucedemo.step_definitions;

import com.saucedemo.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class EndToEndTest_StpDefs {
    DashboardPage dashboardPage = new DashboardPage();
    YourCartPage yourCartPage = new YourCartPage();
    YourInformationPage yourInformationPage = new YourInformationPage();
    CheckoutOveriewPage checkoutOveriewPage = new CheckoutOveriewPage();
    CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage();

    @When("user sorts products {string}")
    public void user_sorts_products(String sortType) {
        new Select(dashboardPage.sortDropDown).selectByVisibleText(sortType);
    }
    @When("user adds the cheapest as {string} and the second costliest as {string} product")
    public void user_adds_the_cheapest_as_and_the_second_costliest_as_product(String preis1, String preis2) {
        dashboardPage.addProducts(preis1,preis2);
    }
    @When("user opens basket")
    public void user_opens_basket() {
        dashboardPage.basket.click();
    }
    @When("user clicks on checkout")
    public void user_clicks_on_checkout() {
        yourCartPage.checkoutBox.click();
    }
    @When("user enters details as {string} and {string} and {string}")
    public void user_enters_details_as_and_and(String firstName, String lastName, String zipCode) {
        yourInformationPage.saveForm(firstName,lastName,zipCode);
    }
    @Then("user verifies that the price is {string}")
    public void user_verifies_that_the_price_is(String totalPrice) {
        Assert.assertEquals(totalPrice,checkoutOveriewPage.totalPrice.getText());
    }
    @Then("user clicks on finish button")
    public void user_clicks_on_finish_button() {
        checkoutOveriewPage.finishBox.click();
    }
    @Then("user should be able to see confirmation message as {string}")
    public void user_should_be_able_to_see_confirmation_message_as(String message) {
        Assert.assertEquals(message,checkoutCompletePage.message.getText());
    }

}
