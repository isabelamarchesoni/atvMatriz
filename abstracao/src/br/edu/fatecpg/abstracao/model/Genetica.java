package br.edu.fatecpg.abstracao.model;

public class Genetica {

	String sequenciaDna;
	String hereditariedade;
	String mutacaoGenetica;
	
	public Genetica(String sequenciaDna, String hereditariedade, String mutacaoGenetica) {
		this.sequenciaDna = sequenciaDna;
		this.hereditariedade = hereditariedade;
		this.mutacaoGenetica = mutacaoGenetica;
	}
	
	 public void analisarSequenciaDNA() {
	        System.out.println("Analisando a sequência de DNA: " + sequenciaDna);
	    }

	    public void estudarHereditariedade() {
	        System.out.println("Estudando como as características genéticas são herdadas.");
	    }

	    public void detectarMutacao(String novaSequencia) {
	    	
	        if (sequenciaDna.equals(novaSequencia)) {
	            System.out.println("Nenhuma mutação detectada.");
	        } else {
	            System.out.println("Uma mutação foi encontrada na sequência de DNA.");
	        }
	        
	    }
}
