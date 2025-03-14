package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Telescopio;

public class MainTeles
{
	public static void main(String[] args) {
		Telescopio teles = new Telescopio();
		
		teles.aumento = "80x";
		teles.tipo = "refrator ";
		teles.abertura = "80mm";
		
		teles.captar();
		teles.ampliar();
		
		System.out.println("O aumento do seu Telescópio é de até: "+teles.aumento);
		System.out.println("O tipo do seu Telescópio é: "+teles.tipo);
		System.out.println("A abertura do seu Telescópio é: "+teles.abertura);
	}
}
