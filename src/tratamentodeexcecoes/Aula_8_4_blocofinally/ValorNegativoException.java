package tratamentodeexcecoes.Aula_8_4_blocofinally;

@SuppressWarnings("serial")
public class ValorNegativoException extends Exception {
	private double valor;
	
	public ValorNegativoException(double valor) {
		this.valor = valor;
	}
	
	public double getValor(double valor) {
		return valor;
	}
}
