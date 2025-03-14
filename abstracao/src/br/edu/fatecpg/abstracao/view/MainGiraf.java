package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Girafa;


public class MainGiraf 
{

	public static void main(String[] args) {
		Girafa giraf = new Girafa();
		
        giraf.idade_girafa = "20";
        giraf.tipo_girafa = "Mamífero";
        giraf.habitat_girafa = "Sibéria";
        
        giraf.idade();
        giraf.tipo();
        giraf.habitat();
        
        System.out.println("A idade da Girafa é: "+giraf.idade_girafa);
        System.out.println("O tipo da Girafa é: "+giraf.tipo_girafa);
        System.out.println("O habitat da Girafa é: "+giraf.habitat_girafa);


	}

}
