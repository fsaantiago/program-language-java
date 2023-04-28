package br.com.exception;
import java.util.Scanner;

public class ExeTratExcept01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int dividendo = Integer.parseInt(args[0]);
		int divisor = Integer.parseInt(args[1]);
		try {
			divide(dividendo,divisor);
		} catch (ArithmeticException e){
			 System.out.println("Não pode dividir por zero! ");
		}
	}
	public static void divide (int dividendo, int divisor) {
		System.out.println("Divisao = " + (dividendo/divisor));
		
	}
}
	
