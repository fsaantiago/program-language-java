package br.com.exception;
import java.util.Scanner;

public class ExeTryCatch01 {
	public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero inteiro: ");
			int num1 = s.nextInt();
			
			System.out.println("Digite um numero inteiro: ");
			int num2 = s.nextInt();
			
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} catch (Exception ex) {
			System.out.println("ERRO - Valor digitado não é um inteiro!");
		}
	}
}
