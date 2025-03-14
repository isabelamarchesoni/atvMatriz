package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Recessao;

public class MainRecessao {
    public static void main(String[] args) {
        Recessao recessao = new Recessao(4.5, 6.2, 12.3);

        recessao.calcularQuedaPib();
        recessao.analisarDesemprego();
        recessao.projetarInvestimentoFuturo();
    }
}