package tratamento_de_excecoes.aula_8_4_bloco_finally;

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
		return valor;
	}
}
