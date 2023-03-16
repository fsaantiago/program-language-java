package br.com.restaurante;

public class Pizza {
	private String nome;
	private double valorPizza;
	private boolean borda;
	
	Pizza(String nome, double valorPizza, boolean borda) {
		super();
		this.nome = nome;
		this.valorPizza = valorPizza;
		this.borda = borda;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getvalorPizza() {
		return valorPizza;
	}

	public void setvalorPizza(double valorPizza) {
		this.valorPizza = valorPizza;
	}

	public boolean getBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}
	
	
	public Double calculaBorda() {
		if (borda == true) {
			return valorPizza + 5;
		}
		return valorPizza;
	}
	
	public String consultaNome() {
		return nome;
	}
	
}
