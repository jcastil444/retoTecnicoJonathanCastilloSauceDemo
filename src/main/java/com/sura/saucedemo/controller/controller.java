package com.sura.saucedemo.controller;

import com.sura.saucedemo.pages.PagePrincipal;
import com.sura.saucedemo.stepdefinitions.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class controller {

    List<WebElement> addProducts2;

    public static void calculo(List<WebElement> addProducts) {
        List<Integer> addList = new ArrayList<Integer>();

        PagePrincipal pagePrincipal = PageFactory.initElements(Hooks.driver, PagePrincipal.class);

        int n = 0;
        List<Integer> numeros = new ArrayList<Integer>();
        for (int j = 1; j <= 6; j++)
            numeros.add(j);

        int numArticulos = (int) (Math.random() * 6);
        System.out.println("El numero de articulos a aderir al carro es: " + (numArticulos + 1));
        addList.add((0), (numArticulos + 1));
        for (int i = 0; i <= numArticulos; i++) {
            int numAleatorio = (int) (Math.random() * (5 - n));

            int num = numeros.get(numAleatorio);
            System.out.println("El " + (i + 1) + " producto aleatorio obtenido es: " + num);
            numeros.remove(numAleatorio);
            n = (n + 1);
            addList.add((i + 1), (num));

            switch (num) {
                case 1:
                    pagePrincipal.addProducts().get(0).click();
                    break;
                case 2:
                    pagePrincipal.addProducts().get(1).click();
                    break;
                case 3:
                    pagePrincipal.addProducts().get(2).click();
                    break;
                case 4:
                    pagePrincipal.addProducts().get(3).click();
                    break;
                case 5:
                    pagePrincipal.addProducts().get(4).click();
                    break;
                case 6:
                    pagePrincipal.addProducts().get(5).click();
                    break;
            }
        }
    }
}