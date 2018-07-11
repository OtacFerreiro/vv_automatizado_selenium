package br.unipe.teste.controller;

public class DescontoUtils {

	public double calcularFatorDeDesconto(String tipoCliente, int qdade) {
		double desc = 0;

		if(tipoCliente.equals("A")) {
			if(qdade < 100) {
				desc = 0.9;
			} else if(qdade >= 100 && qdade < 1000) {
				desc = 0.95;
			} else if(qdade >= 1000){
				desc = 1;
			}
		} else if(tipoCliente.equals("B")) {
			if(qdade < 100) {
				desc = 0.85;
			} else if(qdade >= 100 && qdade < 1000) {
				desc = 0.9;
			} else if(qdade >= 1000){
				desc = 0.95;
			}
		} else if(tipoCliente.equals("C")) {
			if(qdade < 100) {
				desc = 0.8;
			} else if(qdade >= 100 && qdade < 1000) {
				desc = 0.85;
			} else if(qdade >= 1000){
				desc = 0.9;
			}
		}

		return desc;
	}	

}
