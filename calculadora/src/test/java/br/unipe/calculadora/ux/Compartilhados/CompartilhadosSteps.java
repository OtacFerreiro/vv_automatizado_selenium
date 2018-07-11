package br.unipe.calculadora.ux.Compartilhados;

import br.unipe.calculadora.ux.pages.CompartilhadosPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CompartilhadosSteps extends ScenarioSteps {

    CompartilhadosPageObject page;

    @Step
    public void acesso_a_funcionalidade_do_sistema(String linkText) {
        switch (linkText){
            case "Ajuda" : page.acessarLinkMenuAjuda(); break;
            case "Contato" : page.acessarLinkMenuContato(); break;
            case "Calcular Desconto" : page.acessarLinkMenuDesconto(); break;
        }
    }

}
