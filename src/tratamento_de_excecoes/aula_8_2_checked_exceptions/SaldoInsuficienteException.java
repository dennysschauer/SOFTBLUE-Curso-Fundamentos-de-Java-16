package tratamento_de_excecoes.aula_8_2_checked_exceptions;

@SuppressWarnings("serial")
public class SaldoInsuficienteException extends Exception {
	
	private double valor;
	private double saldo;
	
	public SaldoInsuficienteException(double valor, double saldo) {
		this.valor = valor;
		this.saldo = saldo;
	}
	
	public double getValor() {
		return valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	
}
