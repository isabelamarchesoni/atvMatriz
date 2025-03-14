package br.edu.fatecpg.abstracao.view;
import br.edu.fatecpg.abstracao.model.Professor;

		public class  MainProf {
	        public static void main(String[] args) {
	            Professor professor = new Professor("Carlos", 40, "Matemática");

	            professor.ensinar();
	            professor.avaliar(8);
	            professor.corrigirProvas(9);
	        }
	    }		