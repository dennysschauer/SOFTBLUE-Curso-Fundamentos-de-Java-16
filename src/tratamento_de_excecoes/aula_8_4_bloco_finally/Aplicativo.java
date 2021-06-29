package tratamento_de_excecoes.aula_8_4_bloco_finally;

import tratamento_de_excecoes.aula_8_2_checked_exceptions.SaldoInsuficienteException;
import tratamento_de_excecoes.aula_8_2_checked_exceptions.ValorNegativoException;

public class Aplicativo {

	public static void main(String[] args) throws Exception {
		
		ContaBancaria c = new ContaBancaria(1000);
		
		try {
			c.sacar(500);
			System.out.println("Saque foi realizado com sucesso");
			
		} finally {
			System.out.println(c.getSaldo());
		}
	}
}
