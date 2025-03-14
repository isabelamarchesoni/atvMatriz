package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Trem;

public class MainTrem {
	public static void main(String[] args) {
        Trem trem = new Trem();
        trem.tipo = "Trem de alta velocidade";
        trem.velocidade = 300.5;
        trem.destino = "Rio de Janeiro";

        trem.mostrarTipo();
        trem.mostrarVelocidade();
        trem.mostrarDestino();
    }
}

