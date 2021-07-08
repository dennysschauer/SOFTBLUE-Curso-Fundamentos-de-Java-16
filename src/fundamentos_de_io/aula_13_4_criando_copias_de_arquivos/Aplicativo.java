package fundamentos_de_io.aula_13_4_criando_copias_de_arquivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Aplicativo {

	public static void main(String[] args) throws IOException {
		String inputFile = "src/fundamentos_de_io/aula_13_4_criando_copias_de_arquivos/entrada.txt";
		String outputFile =  "src/fundamentos_de_io/aula_13_4_criando_copias_de_arquivos/saida.txt";
		
		try(InputStream in = new FileInputStream(inputFile);
				OutputStream out = new FileOutputStream(outputFile) ){
			
				byte[] buffer = new byte[1024];
				
				int bytesLidos;
				while((bytesLidos = in.read(buffer)) > -1) {
					out.write(buffer, 0, bytesLidos);
				}
		}
	}

}
