package com.saucedemo.pages;

import com.saucedemo.utilities.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage extends BasePage{

    @FindBy(id = "first-name")
    public WebElement firstNameBox;

    @FindBy(id = "last-name")
    public WebElement lastNameBox;

    @FindBy(id = "postal-code")
    public WebElement zipUndPostalCodeBox;

    @FindBy(id = "continue")
    public WebElement continueBox;

    public void saveForm (String firstName,String lastName, String zipCode){
        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        zipUndPostalCodeBox.sendKeys(zipCode);
        continueBox.click();
    }
}
