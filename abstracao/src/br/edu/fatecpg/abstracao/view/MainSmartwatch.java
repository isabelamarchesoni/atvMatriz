package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Smartwatch;

public class MainSmartwatch {
    public static void main(String[] args) {
        Smartwatch smartwatch = new Smartwatch();
        smartwatch.cor = "Preto";
        smartwatch.modelo = "Galaxy Watch 5";
        smartwatch.marca = "Samsung";

        smartwatch.mostrarCor();
        smartwatch.mostrarModelo();
        smartwatch.mostrarMarca();
    }
}
