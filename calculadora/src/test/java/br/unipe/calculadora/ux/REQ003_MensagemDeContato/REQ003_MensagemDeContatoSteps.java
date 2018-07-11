package br.unipe.calculadora.ux.REQ003_MensagemDeContato;

import br.unipe.calculadora.ux.pages.MensagemDeContatoPageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import static org.junit.Assert.assertTrue;

public class REQ003_MensagemDeContatoSteps extends ScenarioSteps {

    MensagemDeContatoPageObject page;

    @Step
    public void informar_nome(String nome) {
        page.preencherNome(nome);
    }

    @Step
    public void informar_email(String email) {
        page.preencherEmail(email);
    }

    @Step
    public void informar_tipo_mensagem(String tipo_msg) {
        page.escolherTipoDeMensagem(tipo_msg);
    }

    @Step
    public void informar_idade(String idade) {
        page.escolherIdade(idade);
    }

    @Step
    public void informar_mensagem(String texto_msg) {
        page.preencherMensagem(texto_msg);
    }

    @Step
    public void enviar_mensagem() {
        page.enviar();
    }

    @Step
    public void verificar_msg_sucesso(String msg) {
        assertTrue(page.getConteudo().contains(msg));
    }
}
