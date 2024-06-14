package com.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutOveriewPage extends BasePage{

    @FindBy(xpath = "//div[@class='summary_total_label']")
    public WebElement totalPrice;

    @FindBy(id = "finish")
    public WebElement finishBox;
}
