package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Tigre;

public class MainTigre {

	public static void main(String[] args) {
		Tigre tig = new Tigre();
        tig.raça_tigre = "Siberiano";
        tig.cor_tigre = "Laranja";
        tig.habitat_tigre = "Sibéria";
        tig.raça();
        tig.cor();
        tig.habitat();
        System.out.println("A raça do tigre é: "+tig.raça_tigre);
        System.out.println("A cor do tigre é: "+tig.cor_tigre);
        System.out.println("O habitat do tigre é: "+tig.habitat_tigre);

	}

}
