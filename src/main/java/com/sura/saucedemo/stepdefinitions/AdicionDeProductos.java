package com.sura.saucedemo.stepdefinitions;

import com.sura.saucedemo.controller.controller;
import com.sura.saucedemo.pages.PagePrincipal;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AdicionDeProductos {

    public static PagePrincipal pagePrincipal;

    @Cuando("se seleccionan productos deseados de forma aleatoria")
    public void seSeleccionanProductosDeseadosDeFormaAleatoria() {
        pagePrincipal = PageFactory.initElements(Hooks.driver, PagePrincipal.class);
        controller.calculo(pagePrincipal.addProducts());
    }

    @Entonces("se verifica la carga de los productos anadidos al carrito de compras")
    public void seVerificaLaCargaDeLosProductosAnadidosAlCarritoDeCompras() {
        PagePrincipal pagePrincipal = PageFactory.initElements(Hooks.driver, PagePrincipal.class);
        pagePrincipal.cart();
        pagePrincipal.check();
    }
}
