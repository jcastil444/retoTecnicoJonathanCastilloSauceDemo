package com.sura.saucedemo.stepdefinitions;

import com.sura.saucedemo.pages.PageFacturacion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.openqa.selenium.support.PageFactory;

public class FacturacionYEnvio {

    @Cuando("verifico los datos de facturacion")
    public void verificoLosDatosDeFacturacion() {
        PageFacturacion pageFacturacion = PageFactory.initElements(Hooks.driver, PageFacturacion.class);
        pageFacturacion.check();
    }

    @Entonces("finalizo la compra y valido que el pedido fue enviado")
    public void finalizoLaCompraYValidoQueElPedidoFueEnviado() {
        PageFacturacion pageFacturacion = PageFactory.initElements(Hooks.driver, PageFacturacion.class);
        pageFacturacion.finish();
        pageFacturacion.checkFinish();
    }
}
