package tratamentodeexcecoes.Aula_8_4_blocofinally;

import tratamentodeexcecoes.Aula_8_2_tratandoelancandocheckedexceptions.SaldoInsuficienteException;
import tratamentodeexcecoes.Aula_8_2_tratandoelancandocheckedexceptions.ValorNegativoException;

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
