package br.com.cantina;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Cliente cliente = new Cliente(JOptionPane.showInputDialog("Nome do cliente:"));
        Massa massa = new Massa(JOptionPane.showInputDialog("Nome da massa:"), 
                                Double.parseDouble(JOptionPane.showInputDialog("Valor da massa:")));

        List<Ingrediente> ingredientes = new ArrayList<>();
        int opcao = 0;
        while (opcao != 5) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe os ingredientes escolhidos:\n" +
                                                    "1-Bacon\n2-Mussarela\n3-Tomate\n4-Queijo\n5-Finalizar"));
            switch (opcao) {
                case 1:
                    ingredientes.add(new Ingrediente("Bacon"));
                    break;
                case 2:
                    ingredientes.add(new Ingrediente("Mussarela"));
                    break;
                case 3:
                    ingredientes.add(new Ingrediente("Tomate"));
                    break;
                case 4:
                    ingredientes.add(new Ingrediente("Queijo"));
                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }

        Pedido pedido = new Pedido(cliente, massa, ingredientes);

        JOptionPane.showMessageDialog(null, pedido.getDescricao());
    }
}
