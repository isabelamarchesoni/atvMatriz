package br.edu.fatecpg.abstracao.model;

public class Computador {

        public String marca;
        public String modelo;
        public String memoria;

        public void ligar() {
            System.out.println("Ligando o computador...");
        }

        public void desligar() {
            System.out.println("Desligando o computador...");
        }

        public void reiniciar() {
            System.out.println("Reiniciando o computador...");
        }
    }