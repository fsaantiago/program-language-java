package br.com.franquia;

public class Acai {
	private int tamanho;
	private double valorAcai;
	private boolean possuiAcrescimo;
	
	public Acai(int tamanho, double valorAcai, boolean possuiAcrescimo) {
		super();
		this.tamanho = tamanho;
		this.valorAcai = valorAcai;
		this.possuiAcrescimo = possuiAcrescimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public double getValorAcai() {
		return valorAcai;
	}

	public void setValorAcai(double valorAcai) {
		this.valorAcai = valorAcai;
	}

	public boolean isPossuiAcrescimo() {
		return possuiAcrescimo;
	}

	public void setPossuiAcrescimo(boolean possuiAcrescimo) {
		this.possuiAcrescimo = possuiAcrescimo;
	}
	
	public Double calculaSorvete(Boolean possuiAcrescimo){
		if (possuiAcrescimo == true) {
			return valorAcai + 2;
		}
		return valorAcai;
	}
	
	public Double calculaTamanho(Double valorAcai) {
		if (getTamanho() == 300) {
			this.valorAcai = 8;
		} else if ((getTamanho() == 500)) {
			this.valorAcai = 10;
		} else if ((getTamanho() == 700)) {
			this.valorAcai = 12;
		} return valorAcai;
	}
	
	public Double consultaValor() {
		return valorAcai;
	}
}





