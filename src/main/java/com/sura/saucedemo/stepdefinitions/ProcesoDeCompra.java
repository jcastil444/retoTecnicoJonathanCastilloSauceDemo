package com.sura.saucedemo.stepdefinitions;

import com.github.javafaker.Faker;
import com.sura.saucedemo.pages.PagePrincipal;
import com.sura.saucedemo.pages.PageValidacionProcesoCompra;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.support.PageFactory;

import static com.sura.saucedemo.stepdefinitions.Hooks.driver;

public class ProcesoDeCompra {

    @Cuando("ingresa los datos personales solicitados")
    public void ingresaLosDatosPersonalesSolicitados() {
        PagePrincipal pagePrincipal = PageFactory.initElements(Hooks.driver, PagePrincipal.class);
        pagePrincipal.cart();
        pagePrincipal.checkout();
        Faker faker = new Faker();
        PageValidacionProcesoCompra pageValidacionProcesoCompra = PageFactory.initElements(driver, PageValidacionProcesoCompra.class);
        pageValidacionProcesoCompra.clickBtnContinue();
        pageValidacionProcesoCompra.sendUserName(faker.name().firstName());
        pageValidacionProcesoCompra.sendLastName(faker.name().lastName());
        pageValidacionProcesoCompra.sendPostalCode(faker.address().zipCode());
    }

    @Entonces("se procede a continuar el proceso de compra")
    public void seProcedeAContinuarElProcesoDeCompra() {
        PageValidacionProcesoCompra pageValidacionProcesoCompra = PageFactory.initElements(driver, PageValidacionProcesoCompra.class);
        pageValidacionProcesoCompra.clickBtnContinue();
    }
}
