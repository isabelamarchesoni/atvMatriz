package br.edu.fatecpg.atvMatriz;
import java.util.Scanner;

public class multiplicacaoMatriz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[][] cadastros = {
				{"user", "senha"},
				{"prof", "ale"},
				{"isabela", "2005"},
				{"araceli", "1977"},
				{"ilda", "1953"},
				{"luiz", "123"}
		};
		
		System.out.println("Digite seu nome de usuário: ");
		String nomeUsuario = scan.nextLine();
		
		System.out.println("Digite sua senha: ");
		String senhaUsuario = scan.nextLine();
		
		 boolean loginConfirmado = false;

	        for (int i = 0; i < cadastros.length; i++) {
	            if (cadastros[i][0].equals(nomeUsuario) && cadastros[i][1].equals(senhaUsuario)) {
	                loginConfirmado = true;
	                break; 
	            }
	        }

	        if (loginConfirmado) {
	            System.out.println("Login correto!");
	        } else {
	            System.out.println("Login incorreto, tente novamente!");
	        }

	        scan.close();


	}

}
