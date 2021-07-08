package fundamentos_de_io.aula_13_3_escrevendo_dados_em_arquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Aplicativo {

	public static void main(String[] args) throws IOException {
//		String s = "Texto para ser gravado no arquivo OutPutStream";
//		
//		try(OutputStream os = new FileOutputStream("src/fundamentos_de_io/aula_13_3_escrevendo_dados_em_arquivos/saida.txt")){
//			
//			byte[] buffer = s.getBytes();
//			
//			os.write(buffer);
//		}
		
//		String s = "Texto para ser gravado no arquivo BufferedWriter";
//		
//		try(BufferedWriter writer = new BufferedWriter(new FileWriter("src/fundamentos_de_io/aula_13_3_escrevendo_dados_em_arquivos/saida2.txt"))){
//			writer.write(s);
//		}

		String s = "Texto para ser gravado no arquivo PrintWriter";
		
		try(PrintWriter pw = new PrintWriter("src/fundamentos_de_io/aula_13_3_escrevendo_dados_em_arquivos/saida3.txt")){
			pw.println(s);
		}
	}

}
