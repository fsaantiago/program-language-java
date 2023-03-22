package br.com.franquia;
import javax.swing.JOptionPane;

public class PontoAcai {

	public static void main(String[] args) {
		int tamanho;
		double valorAcai;
		boolean possuiAcrescimo;
		int opcao;
		
		do {
			opcao=Integer.parseInt(JOptionPane.showInputDialog("Acai do Olho Roxo! Comeu aqui os dente também fica muuuito roxo! \n<1>Escolher tamanho\n<2>Sair"));
				switch(opcao)
					{
						case 1:
						
							tamanho=Integer.parseInt(JOptionPane.showInputDialog("Tamanho do acai: "));
//					 		valorAcai=Double.parseDouble(JOptionPane.showInputDialog("Valor do acai: "));
							possuiAcrescimo=Boolean.parseBoolean(JOptionPane.showInputDialog("Acrescimo de sorvete? "));
							Acai a1 = new Acai(tamanho, possuiAcrescimo);
							JOptionPane.showMessageDialog(null, a1.calculaTamanho(), "Tamanho do acai ", JOptionPane.DEFAULT_OPTION);
							JOptionPane.showMessageDialog(null, a1.consultaValor(), "Valor do acai ", JOptionPane.DEFAULT_OPTION);
							break;
						
						case 2:
							JOptionPane.showMessageDialog(null, "Escolha corretamente uma das opcoes. ");
							break;
								
					} 
		} while(opcao!=2);
	}

}
