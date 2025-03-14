package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.IdadeMedia;


public class MainIdadeMedia {

    public static void main(String [] args){
        
        IdadeMedia media = new IdadeMedia();
        
        media.eventos ="Queda do Império Romano do Ocidente";
        media.periodo ="Quatrocentos anos DC";
        
        System.out.println("O evento que houve foi" +media.eventos);
        System.out.println("A época apresentada é" +media.periodo);
        
        
        media.acontecimentos();
        media.epoca();
    }
	
	
}

