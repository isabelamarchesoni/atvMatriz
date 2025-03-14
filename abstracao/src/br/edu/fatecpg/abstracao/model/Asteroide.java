
package br.edu.fatecpg.abstracao.model;

public class Asteroide {

	double tamanho;
	double velocidade;
	double distanciaTerra;
	
	public Asteroide(double tamanho, double velocidade, double distanciaTerra) {
		this.tamanho = tamanho;
		this.velocidade = velocidade;
		this.distanciaTerra = distanciaTerra;
	}
	
	  
    public void calcularVelocidade() {
        System.out.println("A velocidade atual do asteroide é de " + velocidade + " km/h.");
    }

   
    public void verificarRiscoDeColisao() {
        if (distanciaTerra < 7.5) { 
            System.out.println("ALERTA! O asteroide está próximo da Terra e pode representar um risco.");
        } else {
            System.out.println("O asteroide está distante e não representa perigo imediato.");
        }
    }

   
    public void exibirInformacoes() {
        System.out.println("Informações do Asteroide:");
        System.out.println("Tamanho: " + tamanho + " km");
        System.out.println("Velocidade: " + velocidade + " km/h");
        System.out.println("Distância da Terra: " + distanciaTerra + " milhões de km");
    }
}