package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Cinema;

public class MainCine {
	public static void main(String[] args) {
		Cinema cine = new Cinema(); 
		
		cine.local = "Praia Grande";
		cine.nome_filme = "Ainda Estou Aqui";
		cine.valor_ingresso = 33;
		
		cine.localização();
		cine.filme();
		cine.ingresso();
		
		System.out.println("A localização do seu cinema: "+cine.local);
		System.out.println("O nome do filme que você deseja assistir: "+cine.nome_filme);
		System.out.println("O valor a ser pago é de: "+cine.valor_ingresso);
		
		
	}
}
