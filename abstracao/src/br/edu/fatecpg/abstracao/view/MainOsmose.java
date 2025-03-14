package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Osmose;


public class MainOsmose{
    public static void main(String[]args){
        
        Osmose osmose = new Osmose();
        
        osmose.local = "Água";
        osmose.tipo_osmose ="Endosmose";

        osmose.localização();
        osmose.tipo();
        
        System.out.println("O local que ocorre a osmose é na "+osmose.local );
        System.out.println("O seu tipo de osmose é: "+osmose.tipo_osmose);
}
}
