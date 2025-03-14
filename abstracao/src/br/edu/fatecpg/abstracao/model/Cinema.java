package br.edu.fatecpg.abstracao.model;

public class Cinema {

	public String local;
	public String nome_filme;
	public int valor_ingresso;
		
		
	public void localização() {
		System.out.println("Buscando local...");
	}
	public void filme() {
		System.out.println("Buscando nome do filme...");
	}
	public void ingresso() {
		System.out.println("O ingresso custa R$  ,  ");
	}
	
	
}

