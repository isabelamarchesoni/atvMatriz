package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Gravura;


public class MainGrav 
{
public static void main(String[] args) {
    Gravura gravura = new Gravura("Xilogravura", 30.5, "10/05/2020");
    gravura.exibirDetalhes();
    gravura.analisarTecnica();
    gravura.verificarEstado();
	}
}