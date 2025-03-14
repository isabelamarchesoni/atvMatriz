package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Asteroide;


public class MainAst {
        public static void main(String[] args) {
            Asteroide asteroide = new Asteroide(15.2, 30000, 6.0);

            asteroide.exibirInformacoes();
            asteroide.calcularVelocidade();
            asteroide.verificarRiscoDeColisao();
        }
    }


