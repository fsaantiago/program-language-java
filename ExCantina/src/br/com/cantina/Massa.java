package br.com.cantina;

public class Massa {
    private String tipo;
    private double valor;

    public Massa(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }
}