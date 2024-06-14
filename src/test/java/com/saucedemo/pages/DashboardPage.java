package com.saucedemo.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{

    @FindBy (xpath = "//span[text()='Products']")
    public WebElement title;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    public WebElement sortDropDown;

    @FindBy (xpath = "//div[@class='pricebar']/button")
    public List<WebElement> addToCartButtons;
    @FindBy (xpath = "//div[@class='pricebar']")
    public List<WebElement> preises;


    @FindBy (id = "shopping_cart_container")
    public WebElement basket;

    public void addProducts(String cheapest, String costLiests){
        Assert.assertTrue(preises.get(preises.size()-1).getText().contains(cheapest));
        addToCartButtons.get(addToCartButtons.size()-1).click();

        Assert.assertTrue(preises.get(1).getText().contains(costLiests));
        addToCartButtons.get(1).click();


    }



}
