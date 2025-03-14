package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.TaxaJuros;


public class MainTax {

	public static void main(String[] args) {
		        TaxaJuros taxa = new TaxaJuros(1000, 5, 2);
		        taxa.exibirDetalhesJuros();
		        taxa.calcularJurosSimples();

	}

}
