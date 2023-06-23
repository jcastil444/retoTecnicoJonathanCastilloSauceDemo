package com.sura.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFacturacion {

    WebDriver driver;

    public PageFacturacion(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='summary_info']//*[contains(@class,'summary_info_label')and contains(text(),'Payment Information')]")
    WebElement txtPayment;

    @FindBy(xpath = "//*[@class='summary_info']//*[contains(@class,'summary_info_label')and contains(text(),'Shipping Information')]")
    WebElement txtShipping;

    @FindBy(xpath = "//*[@class='summary_info']//*[contains(@class,'summary_info_label')and contains(text(),'Price Total')]")
    WebElement txtPrice;

    @FindBy(xpath = "//*[@class='summary_info']//*[contains(@class,'summary_value_label')and contains(text(),'Free Pony Express Delivery!')]")
    WebElement txtShip;

    public void check() {
        txtPayment.isDisplayed();
        txtShipping.isDisplayed();
        txtPrice.isDisplayed();
        txtShip.isDisplayed();
    }

    @FindBy(id = "finish")
    WebElement btnFinish;

    @FindBy(id = "back-to-products")
    WebElement btnCheckOrder;


    public void finish() {
        btnFinish.click();
    }

    public void checkFinish() {
        btnCheckOrder.isDisplayed();
    }
}
