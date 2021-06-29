package tratamento_de_excecoes.aula_8_4_bloco_finally;

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
