package br.unipe.calculadora.ux.REQ001_CalcularDesconto;

import java.util.Map;

import net.thucydides.core.annotations.Steps;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class REQ001_CalcularDescontoGWT {

	@Steps
	REQ001_CalcularDescontoSteps steps;

	@Dado("^que estou na página inicial do sistema$")
	public void que_estou_na_página_inicial_do_sistema() {
		steps.acesso_pagina_inicial();
	}

	@E("^que acessei a listagem de produtos$")
	public void verifico_se_estou_listagem_de_produtos(String tituloPagina) throws Exception {
		steps.verifico_estou_listagem_de_produtos(tituloPagina);
	}
	
	@E("^que a listagem de produtos possui pelo menos um produto$")
	public void verifico_se_listagem_de_produtos_possui_produto(String idProduto) throws Exception {
		steps.verifico_se_listagem_de_produtos_possui_produto(idProduto);
	}
	
	@E("^ que seleciono o produto para calcular desconto$")
	public void seleciono_produto_para_calcular_desconto() throws Exception {
		steps.clico_no_botao_calcular_desconto_de_produto();
	}
	
	@E("^ que estou na pagina de calculo de desconto para produto$")
	public void verifico_se_estou_na_pagina_de_desconto_para_produto(String titulo) throws Exception {
		steps.verifico_estou_calculo_desconto_produto(titulo);
	}
	
	@Quando("^ seleciono o tipo de cliente$")
	public void seleciono_tipo_cliente(String tipoCliente) throws Exception {
		steps.seleciono_tipo_cliente(tipoCliente);
	}
	
	@E("^ preencho a quantidade do produto$")
	public void preencho_quantidade_produto(String quantidade) throws Exception {
		steps.preencho_quantidade(quantidade);
	}
	
	@E("^ clico em Calcular Desconto$")
	public void clico_no_botao_calcular_desconto() throws Exception {
		steps.clico_no_botao_calcular_desconto();
	}
	
	@E("^ a mensagem for de sucesso$")
	public void verifico_se_mensagem_de_sucesso(String mensagemSucesso) throws Exception {
		steps.verifico_se_calculo_foi_realizado(mensagemSucesso);
	}
	
	@Entao("^ verifico se o fator obtido esta correto$")
	public void verifico_se_fator_obtido(String fatorObtido) throws Exception {
		steps.verifico_fator_obtido(fatorObtido);
	}
}
