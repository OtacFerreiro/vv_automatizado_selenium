package br.unipe.teste.model;

import java.util.HashMap;
import java.util.Map;

import br.unipe.teste.controller.DescontoUtils;

public class CalculadoraDesconto {

	private Cliente cliente;

	private Map<Produto, Integer> produtos;

	public CalculadoraDesconto() {
		super();
		this.produtos = new HashMap<Produto, Integer>();
	}

	public Map<Produto, Integer> getProdutos() {
		if(produtos == null) {
			produtos = new HashMap<Produto, Integer>();
		}

		return produtos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addProdutos(Produto p, Integer qdade) {
		if(!getProdutos().containsKey(p)) {
			getProdutos().put(p, qdade);
		}
	}

	public double calcularDesconto(Produto p) {
		DescontoUtils descontoUtils = new DescontoUtils();
		
		Double valorComDesconto = 0d;
		
		for(Produto prod: getProdutos().keySet()) {
			if(p.equals(prod)) {
				valorComDesconto = prod.getValor() *
						descontoUtils.calcularFatorDeDesconto(getCliente().getTipoCliente(),
								produtos.get(prod));
			}
		}
		
		return valorComDesconto;
	}
}
