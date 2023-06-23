package com.sura.saucedemo.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageValidacionProcesoCompra {

    WebDriver driver;

    public PageValidacionProcesoCompra(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(id = "first-name")
    WebElement txtUserName;

    @FindBy(id = "last-name")
    WebElement txtLastName;

    @FindBy(id = "postal-code")
    WebElement txtPostalCode;

    @FindBy(id = "continue")
    WebElement btnContinue;

    public void sendUserName(String userName) { txtUserName.sendKeys(userName); }

    public void sendLastName(String lastName) { txtLastName.sendKeys(lastName); }

    public void sendPostalCode(String postalCode) { txtPostalCode.sendKeys(postalCode); }

    public void clickBtnContinue() { btnContinue.click(); }

}
