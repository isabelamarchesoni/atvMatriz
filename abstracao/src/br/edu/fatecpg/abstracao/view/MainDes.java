package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Desenho;

public class MainDes {

	public static void main(String[] args) {
		Desenho desenho = new Desenho("Lápis", 30.0, "Complexo");
        desenho.descreverDesenho();
        desenho.apresentarDimensao();
        desenho.adicionarDetalhes();
	}

}
