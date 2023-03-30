package br.com.aluguel;
import java.awt.Container;
import java.text.ParseException;

import javax.swing.JLabel;
import javax.swing.text.MaskFormatter;

public class Formulario extends JFrame {
	
	public static final long serialVersionUID = 1L;
	
	public static void main(String [] args) {
		Formulario field = new Formulario();
		field.formJFormattedTextField();	
	}
	public void formJFormattedTextField() {
		Container janela = getContentPane();
		setLayout(null);
		
		//Definindp os rótulos dos botões
	    JLabel labelNome = new JLabel("Nome: ");
	    JLabel labelCpf = new JLabel("CPF: ");
	    JLabel labelTel = new JLabel("Telefone: ");
	    labelTel.setBounds(50,80,100,20);
	    labelCpf.setBounds(50,120,100,20);
	    
	    //máscaras
	    MaskFormatter mascaraCep = null;
	    MaskFormatter mascaraTel = null;
	    MaskFormatter mascaraCpf = null;
	    
	    
	    JLabel labelNomeC = new JLabel("Nome: ");
	    JLabel labelDataLoc = new JLabel ("Data de Locacao: ");
	    JLabel labelDataEntr = new JLabel ("Data de Entrega: ");
	    JLabel labelAno = new JLabel ("Ano: ");
	    JLabel labelPlaca = new JLabel("Placa do carro: ");
	    labelDataLoc.setBounds(50,160,100,20);
	    labelDataEntr.setBounds(50,160,100,20);
	    labelAno.setBounds(50,160,100,20);
	    labelPlaca.setBounds(50,160,100,20);
	    
	    
	    //máscaras
	    MaskFormatter labelDataLoc = null;
	    MaskFormatter labelDataEntr = null;
	    MaskFormatter labelAno = null;
	    MaskFormatter labelPlaca = null;
	    
	    try{
	        mascaraCep = new MaskFormatter("#####-###");
	        mascaraTel = new MaskFormatter("(##)####-####");
	        mascaraCpf = new MaskFormatter("#########-##");

	        mascaraCep.setPlaceholderCharacter('_');
	        mascaraTel.setPlaceholderCharacter('_');
	        mascaraCpf.setPlaceholderCharacter('_');
	 }
	 catch(ParseException excp) {
	        System.err.println("Erro na formatação: " + excp.getMessage());
	        System.exit(-1);
	 }
	    
	    try{
	    	labelDataLoc = new MaskFormatter("##/##/####");
	    	labelDataEntr = new MaskFormatter("##/##/####");
	    	labelAno = new MaskFormatter("####");
	    	labelPlaca = new MaskFormatter("########");

	        mascaraCep.setPlaceholderCharacter('_');
	        mascaraTel.setPlaceholderCharacter('_');
	        mascaraCpf.setPlaceholderCharacter('_');
	 }
	 catch(ParseException excp) {
	        System.err.println("Erro na formatação: " + excp.getMessage());
	        System.exit(-1);
	 }
	   
	}
}
