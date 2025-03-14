package br.edu.fatecpg.abstracao.model;

public class Professor {
    
    String nome;
    int idade;
    String materia;

   
    public Professor(String nome, int idade, String materia) {
        this.nome = nome;
        this.idade = idade;
        this.materia = materia;
    }

    
    public void ensinar() {
        System.out.println(nome + " está ensinando a matéria: " + materia);
    }


    public void avaliar(int nota) {
        String avaliacao;
        if (nota >= 9) {
            avaliacao = "Excelente!";
        } else if (nota >= 7) {
            avaliacao = "Bom!";
        } else {
            avaliacao = "Precisa melhorar.";
        }
        System.out.println("A avaliação do aluno na matéria " + materia + " é: " + avaliacao);
    }

 
    public void corrigirProvas(int nota) {
        System.out.println("Após corrigir a prova de " + materia + ", concluo que o aluno tirou nota " + nota + ".");
    }
}
