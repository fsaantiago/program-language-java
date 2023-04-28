package br.com.exception;
import javax.swing.JOptionPane;

public class ExeTratExcept03 {

	public static void main(String[] args) {
		int dividendo, divisor;
		
		while(true) {
				try{
					dividendo = Integer.parseInt(JOptionPane.showInputDialog("Digite o dividendo "));
					divisor = Integer.parseInt(JOptionPane.showInputDialog("Digite o divisor "));
					break;			
			} catch (ArithmeticException e1){
				 JOptionPane.showMessageDialog(null, "Nao pode dividir por zero");
			} catch (NumberFormatException e2) {
				JOptionPane.showMessageDialog(null, "Favor informar apenas numero interiros");
			}
		
		}
		
	}

}
