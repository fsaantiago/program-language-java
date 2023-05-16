package br.com.contabanco;

public class Conta {
	private double agencia;
	private double conta;
	private double saldo;
	
	public Conta(double agencia, double conta, double saldo) {
		super();
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}
	public double getAgencia() {
		return agencia;
	}
	public void setAgencia(double agencia) {
		this.agencia = agencia;
	}
	public double getConta() {
		return conta;
	}
	public void setConta(double conta) {
		this.conta = conta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
}
