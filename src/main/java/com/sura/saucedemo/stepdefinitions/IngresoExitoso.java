package com.sura.saucedemo.stepdefinitions;

import com.sura.saucedemo.data.User;
import com.sura.saucedemo.data.UserDTO;
import com.sura.saucedemo.pages.PageCreacionCuenta;
import com.sura.saucedemo.pages.PageIngreso;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

import static com.sura.saucedemo.stepdefinitions.Hooks.driver;

public class IngresoExitoso {

    Map<Integer, User> userMap = new UserDTO().getUsers();

    @Dado("El usuario accede a la pagina principal del aplicativo")
    public void elUsuarioAccedeALaPaginaPrincipalDelAplicativo() {
        String title = driver.getTitle();
        System.out.println("El titulo de la pagina es : " + title);
        Assertions.assertEquals("Swag Labs", title, "El titulo no es el mismo");
    }

    @Cuando("diligencia el formulario de login y se autentica")
    public void diligenciaElFormularioDeLoginYSeAutentica() {
        PageIngreso pageIngreso = PageFactory.initElements(driver, PageIngreso.class);
        pageIngreso.sendUserName(userMap.get(1).getUserName());
        pageIngreso.sendPassword(userMap.get(1).getPassword());
        pageIngreso.clickBtnSubmitCreate();
    }

    @Entonces("se verifica que la autenticacion es exitosa")
    public void seVerificaQueLaAutenticacionEsExitosa() {
        PageCreacionCuenta pageCreacionCuenta = PageFactory.initElements(driver, PageCreacionCuenta.class);
        final String EXPECTED_TEXT = "Products";
        String currentText = pageCreacionCuenta.getH1CreateAnAccountText();
        Assertions.assertEquals(EXPECTED_TEXT, currentText);
    }
}
