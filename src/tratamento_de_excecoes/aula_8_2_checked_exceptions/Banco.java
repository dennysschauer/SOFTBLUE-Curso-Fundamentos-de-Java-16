package tratamento_de_excecoes.aula_8_2_checked_exceptions;

public class Banco {

	public void realizarOperacao() throws BancoException /*SaldoInsuficienteException*//*, ValorNegativoException*/ {

		ContaBancaria c = new ContaBancaria(1000);

		try {
			c.sacar(-2000);
			System.out.println("Saque foi realizado com sucesso");
			System.out.println(c.getSaldo());
			
		} catch (ValorNegativoException e) {
			throw new BancoException("Erro de saque: valor negativo", e);
			
		} catch (SaldoInsuficienteException e) {
			throw new BancoException("Erro de saque: saldo insuficiente", e);
		}
	}
}