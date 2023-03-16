package br.com.restaurante;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome;
		double valorPizza;
		double valorHamburguer;
		boolean borda;
		boolean artesanal;
		int opcao;
		
		do {
		opcao=Integer.parseInt(JOptionPane.showInputDialog("Ristorant Falta Sal & Pemento: Informe o pedido, sua vergonha da porrofission!\n<1>Pizza\n<2>Hamburguer\n<3>Sair"));
			switch(opcao)
				{
					case 1:
					
						nome=(JOptionPane.showInputDialog("Nome da pizza: "));
						valorPizza=Double.parseDouble(JOptionPane.showInputDialog("Valor da pizza: "));
						borda=Boolean.parseBoolean(JOptionPane.showInputDialog("Possui borda? "));
						Pizza p1 = new Pizza(nome, valorPizza, borda);
						JOptionPane.showMessageDialog(null, p1.consultaNome(), "Mensagem", JOptionPane.DEFAULT_OPTION);
						break;
					
					case 2:
					
						nome=(JOptionPane.showInputDialog("Nome do hamburguer: "));
						valorHamburguer=Double.parseDouble(JOptionPane.showInputDialog("Valor do hamburguer: "));
						artesanal=Boolean.parseBoolean(JOptionPane.showInputDialog("Eh artesanal? "));
						Hamburguer h1 = new Hamburguer(nome, valorHamburguer, artesanal);
						JOptionPane.showMessageDialog(null, h1.consultaNome(), "Mensagem", JOptionPane.DEFAULT_OPTION);
						break;
					
					case 3:
						JOptionPane.showMessageDialog(null, "Escolha corretamente uma das opcoes. ");
						break;				
							
				} 
		} while(opcao!=3);
	}

}
