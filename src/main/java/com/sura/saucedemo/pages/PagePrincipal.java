package com.sura.saucedemo.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class PagePrincipal {

    WebDriver driver;

    public PagePrincipal(WebDriver driver) {
        this.driver = driver;
    }

    @FindBys(@FindBy(xpath = "//div[@class='pricebar']/button"))
    List<WebElement> addProducts;


    @FindBy(id = "checkout")
    WebElement btnCheck;

    @FindBy(className = "shopping_cart_link")
    WebElement addCart;

    public void check() {
        btnCheck.isDisplayed();
    }

    public void checkout() {
        btnCheck.click();
    }

    public void cart() {
        addCart.click();
    }

    public List<WebElement> addProducts() {
        return addProducts;
    }


}