package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Computador;

public class MainComp {

	public static void main(String[] args) {
		
        Computador comp = new Computador();

        comp.marca = "Acer";
        comp.modelo = "Nitro V15";
        comp.memoria = "512GB";

        comp.ligar();
        comp.desligar();
        comp.reiniciar();

        System.out.println("A marca do seu computador é: " + comp.marca);
        System.out.println("O modelo do seu computador é: " + comp.modelo);
        System.out.println("A memória do seu computador é: " + comp.memoria);
    }
}
