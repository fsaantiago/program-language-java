package br.com.leituraarquivo;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenaNomes {
	public static void main(String[] args) {
        String nomesFile = "ArquivoNomes.txt";
        String sobrenomesFile = "SobreNomes.txt";
        String concatenadosFile = "NomesCompletos.txt";
        String line;
        
        try {
            // Primeiro faz a leitura do arquivo de nomes
            BufferedReader nomesReader = new BufferedReader(new FileReader(nomesFile));
            String[] nomes = new String[10];
            int i = 0;
            while ((line = nomesReader.readLine()) != null) {
                nomes[i] = line.trim();
                i++;
            }
            nomesReader.close();
            System.out.println("Nomes lidos: ");
            for (String nome : nomes) {
                System.out.println(nome);
            }
            
            // Em segundo faz a leitura do arquivo de sobrenomes
            BufferedReader sobrenomesReader = new BufferedReader(new FileReader(sobrenomesFile));
            String[] sobrenomes = new String[10];
            i = 0;
            while ((line = sobrenomesReader.readLine()) != null) {
                sobrenomes[i] = line.trim();
                i++;
            }
            sobrenomesReader.close();
            System.out.println("Sobrenomes lidos: ");
            for (String sobrenome : sobrenomes) {
                System.out.println(sobrenome);
            }
            
            // Depois concatena os nomes e sobrenomes
            String[] completos = new String[10];
            for (i = 0; i < 10; i++) {
                completos[i] = nomes[i] + " " + sobrenomes[i];
            }
            
            // Depois escreve os nomes completos do arquivo
            BufferedWriter writer = new BufferedWriter(new FileWriter(concatenadosFile));
            for (String completo : completos) {
                writer.write(completo);
                writer.newLine();
            }
            writer.close();
            System.out.println("Nomes completos escritos no arquivo: " + concatenadosFile);
        } catch (IOException e) {
            System.out.println("Erro ao ler ou escrever o arquivo: " + e.getMessage());
        }
    }
}
