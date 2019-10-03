package extractMethod;

import java.util.ArrayList;

public class Divida {
	private Pedidos pedidos;
	private String nome;

	void imprimeDivida() {
		imprimeCabecalho();
		double divida = getDivida();
		imprimeDetalhes(divida);
	}

	private void imprimeDetalhes(double divida) {
		System.out.println("nome: " + nome);
		System.out.println("divida total: " + divida);
	}

	private double getDivida() {
		double divida = 0.0;
		int i = 0;
		ArrayList<Itens> e = pedidos.getPedidos();
		while (i < e.size()) {
			Itens cada = (Itens) e.get(i);
			divida += cada.getValor();
		}
		return divida;
	}

	private void imprimeCabecalho() {
		System.out.println("***************************");
		System.out.println("*** Dívidas do Cliente ****");
		System.out.println("***************************");
	}
}
