import java.util.ArrayList;
import java.util.List;
package br.com.cantina;

public class Pedido {
    private Cliente cliente;
    private Massa massa;
    private List<Ingrediente> ingredientes;

    public Pedido(Cliente cliente, Massa massa, List<Ingrediente> ingredientes) {
        this.cliente = cliente;
        this.massa = massa;
        this.ingredientes = ingredientes;
    }

    public double calcularValor() {
        double valorPedido = massa.getValor() + (ingredientes.size() * 2.0);
        return valorPedido;
    }

    public String getDescricao() {
        String descricao = "Pedido feito para " + cliente.getNome() + "\n" +
                            massa.getTipo() + " com ";
        for (Ingrediente ingrediente : ingredientes) {
            descricao += ingrediente.getNome() + " e ";
        }
        descricao = descricao.substring(0, descricao.length() - 3); // Remove o último "e "
        descricao += "\nValor: " + calcularValor();
        return descricao;
    }
}
