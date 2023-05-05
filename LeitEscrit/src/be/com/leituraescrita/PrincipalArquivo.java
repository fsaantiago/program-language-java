package be.com.leituraescrita;
import java.io.IOException;

public class PrincipalArquivo {

	public static void main(String[] args) throws IOException {
		
		ExeLeitEscrit1 manipulador = new ExeLeitEscrit1();
		String path = "Teste.txt";
		
		ExeLeitEscrit1.escritor(path);
		ExeLeitEscrit1.leitor(path);

	}

}
