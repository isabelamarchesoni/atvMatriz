
package br.edu.fatecpg.abstracao.model;

public class TaxaJuros {

    double valorPrincipal;
    double taxaAnual; 
    int periodo; 

    public TaxaJuros(double valorPrincipal, double taxaAnual, int periodo) {
        this.valorPrincipal = valorPrincipal;
        this.taxaAnual = taxaAnual;
        this.periodo = periodo;
    }


    public void calcularJurosSimples() {
        double juros = valorPrincipal * taxaAnual * periodo / 100;
        System.out.println("Juros Simples: R$" + juros);
    }


    public void calcularJurosCompostos() {
        double montante = valorPrincipal * Math.pow(1 + taxaAnual / 100, periodo);
        double jurosCompostos = montante - valorPrincipal;
        System.out.println("Juros Compostos: R$" + jurosCompostos);
    }


    public void exibirDetalhesJuros() {
        System.out.println("Valor Principal: R$" + valorPrincipal);
        System.out.println("Taxa de Juros Anual: " + taxaAnual + "%");
        System.out.println("Período: " + periodo + " anos");
    }
}
