
package br.edu.fatecpg.abstracao.model;

public class Telescopio {
    
	public String aumento;
	public String tipo;
	public String abertura;
    
    public void captar() {
        System.out.println("Captando com o telescópio..");
    }
    public void ampliar() {
        System.out.println("Ampliando a do lente telescópio...");
    }
    
}
