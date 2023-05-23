package br.com.calc;
import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame{
	private JFrame frame;
	private JTextField textField;
    private JButton[] buttons;
    private String[] buttonLabels = {
        "7", "8", "9", "/",
        "4", "5", "6", "*",
        "1", "2", "3", "-",
        "0", ".", "=", "+"
    };

    public Calculadora() {
    	frame = new JFrame("Calculadora");

        textField = new JTextField(10);
        textField.setEditable(false);

        buttons = new JButton[buttonLabels.length];
        JPanel buttonPanel = new JPanel(new GridLayout(0, 4)); 
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(buttonLabels[i]);
            buttonPanel.add(buttons[i]);

        }

        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(textField, BorderLayout.NORTH);
        frame.getContentPane().add(buttonPanel, BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Calculadora();
            }
        });
    }
	
}
