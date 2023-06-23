package com.sura.saucedemo.stepdefinitions;

import com.sura.saucedemo.pages.PageIngreso;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.sura.saucedemo.stepdefinitions.Hooks.driver;

public class IngresoCredecialesIncorrectas {

    @Dado("El usuario accede a la pagina del aplicativo")
    public void elUsuarioAccedeALaPaginaDelAplicativo() {
        String title = driver.getTitle();
        System.out.println("El titulo de la pagina es : " + title);
        Assertions.assertEquals("Swag Labs", title, "El titulo no es el mismo");
    }

    @Cuando("diligencia el formulario de login y se intenta autenticar")
    public void diligenciaElFormularioDeLoginYSeIntentaAutenticar() {
        Faker faker = new Faker();
        PageIngreso PageIngreso = PageFactory.initElements(driver, PageIngreso.class);
        PageIngreso.sendUserName(faker.name().firstName());
        PageIngreso.sendPassword(faker.name().lastName());
        PageIngreso.clickBtnSubmitCreate();
    }

    @Entonces("se verifica que la autenticacion es fallida")
    public void seVerificaQueLaAutenticacionEsFallida() {
        WebElement elementName = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[contains(text(),'')]")));
        String textName = elementName.getText();
        System.out.println("El mensaje obtenido es: " + textName);
        Assertions.assertEquals("Epic sadface: Username and password do not match any user in this service", textName, "El mensaje entregado no es el mismo");
    }
}
