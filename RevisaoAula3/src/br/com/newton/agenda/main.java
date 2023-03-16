package br.com.newton.agenda;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Contato contato = new Contato();

		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome do contato: " );
		String nome = ler.nextLine();
		
		System.out.println("Informe o numero do telefone: ");
		int telefone = ler.nextInt();
		
		
		

	}

}
