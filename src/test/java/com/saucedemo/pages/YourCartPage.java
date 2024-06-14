package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourCartPage extends BasePage {
    @FindBy(id = "checkout")
    public WebElement checkoutBox;
}
