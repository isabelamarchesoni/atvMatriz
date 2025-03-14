package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Roteador;

public class MainRoteador {

	public static void main(String[] args) {
        Roteador roteador = new Roteador();
        roteador.marca = "TP-Link";
        roteador.cor = "Preto";
        roteador.quantidadeAntenas = 4;

        roteador.mostrarMarca();
        roteador.mostrarCor();
        roteador.mostrarQuantidadeAntenas();
    }
}
