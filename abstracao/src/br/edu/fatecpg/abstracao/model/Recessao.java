package br.edu.fatecpg.abstracao.model;

		public class Recessao {

		    double quedaPIB; 
		    double aumentoTaxaDesemprego; 
		    double reducaoInvestimento;

		    public Recessao(double quedaPIB, double aumentoTaxaDesemprego, double reducaoInvestimento) {
		        this.quedaPIB = quedaPIB;
		        this.aumentoTaxaDesemprego = aumentoTaxaDesemprego;
		        this.reducaoInvestimento = reducaoInvestimento;
		    }

		   
		    public void calcularQuedaPib() {
		        System.out.println("A queda do PIB foi de " + quedaPIB + "%.");
		        if (quedaPIB > 3.0) {
		            System.out.println("A recessão está severa.");
		        } else {
		            System.out.println("A recessão ainda é moderada.");
		        }
		    }


		    public void analisarDesemprego() {
		        System.out.println("O aumento na taxa de desemprego foi de " + aumentoTaxaDesemprego + "%.");
		        if (aumentoTaxaDesemprego > 5.0) {
		            System.out.println("O desemprego está em um nível crítico.");
		        } else {
		            System.out.println("O desemprego está subindo, mas ainda sob controle.");
		        }
		    }


		    public void projetarInvestimentoFuturo() {
		        double recuperacao = reducaoInvestimento * 0.8; // Supondo uma recuperação de 80% no próximo período
		        System.out.println("A redução nos investimentos foi de " + reducaoInvestimento + "%.");
		        System.out.println("Espera-se que os investimentos recuperem " + recuperacao + "% no próximo ciclo econômico.");
		    }
		  


}