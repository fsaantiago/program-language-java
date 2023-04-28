package br.com.exception;
import javax.swing.JOptionPane;

public class ExeTratExcept04 {

	public static void main(String[] args) {
		System.out.println("Inicio do Programa");
		try {
			int a = Integer.parseInt(JOptionPane.showInputDialog("a:"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("b:"));
			
			System.out.println("Divisao = " + (a / b));
			System.out.println("Multiplicacao = " + (a * b));
			System.out.println("Soma = " + (a + b));
			System.out.println("Subtracao = " + (a - b));
		} catch (ArithmeticException e1){
			 JOptionPane.showMessageDialog(null, "Nao pode dividir por zero");
		} catch (NumberFormatException e2) {
			JOptionPane.showMessageDialog(null, "Favor informar apenas numero interiros");
		}
		System.out.println("Fim do Programa");
	} 
}
