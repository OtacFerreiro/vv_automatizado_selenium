package br.unipe.calculadora.ux.pages;

import net.serenitybdd.core.pages.PageObject;

public class PaginaInicialPageObject extends PageObject {

    public void acessarPaginaInicial(){
        this.getDriver().manage().window().maximize();
        this.getDriver().get("http://diegoquirino.pro.br/calculadora");
    }

}
