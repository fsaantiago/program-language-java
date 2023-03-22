package br.com.franquia;

public class Acai extends PontoAcai {
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
	
	public Double calculaTamanho() {
		if (getTamanho() == 300) {
			return getValorAcai();
		} else if ((getTamanho() == 500)) {
			return getValorAcai();
		} else if ((getTamanho() == 700)) {
			return getValorAcai();
		} return valorAcai;
	}
	
	public Double calculaSorvete(Boolean possuiAcrescimo){
		if (possuiAcrescimo == true) {
			return getValorAcai() + 2;
		}
		return getValorAcai();
	}
	
	public Double consultaValor() {
		return valorAcai;
	}
}





