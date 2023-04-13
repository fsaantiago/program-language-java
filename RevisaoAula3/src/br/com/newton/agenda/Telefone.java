package br.com.newton.agenda;
import java.util.Scanner;

public class Telefone {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do contato:");
        String nome = scanner.nextLine();

        System.out.println("Informe o número de telefone:");
        String numero = scanner.nextLine();

        if(numero.length() != 9){
            System.out.println("Telefone inválido");
        } else {
            Contato contato = new Contato(nome, numero);
            System.out.println("Contato cadastrado com sucesso!");
            System.out.println("Nome: " + contato.getNome() + " - Telefone: " + contato.getTelefone());
        }
    }
}
