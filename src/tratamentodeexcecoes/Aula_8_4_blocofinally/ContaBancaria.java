package tratamentodeexcecoes.Aula_8_4_blocofinally;

import tratamentodeexcecoes.Aula_8_2_tratandoelancandocheckedexceptions.SaldoInsuficienteException;

public class ContaBancaria {
	private double saldo;
	
	public ContaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteException {
		if (valor <= 0) {
			throw new ValorNegativoException(valor);
		}
		
		if (saldo - valor < 0) {
			throw new SaldoInsuficienteException(valor, saldo);
		}
		
		this.saldo -= valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
}
