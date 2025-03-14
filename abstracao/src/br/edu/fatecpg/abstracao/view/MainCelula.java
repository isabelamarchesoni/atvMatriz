package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Celula;

	public class MainCelula{
	    public static void main(String[]args){
	        
	        Celula celula = new Celula ();
	        
	        celula.tipo_celula = "Miocitos";
	        celula.funcionalidade = "Comunicar sinais entre o cérebro";
	        celula.quantidade ="86";
	        
	        System.out.println("O tipo da célula buscada foi: "+celula.tipo_celula);
	        System.out.println("Ela tem a função de "+celula.funcionalidade);
	        System.out.println("Há esta quantidade" + celula.quantidade);
	        
	        celula.tipo();
	        celula.funcao();
	        celula.valor();
	    }
	}

