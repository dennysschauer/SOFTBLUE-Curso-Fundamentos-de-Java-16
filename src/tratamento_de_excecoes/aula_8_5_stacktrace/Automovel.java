package tratamento_de_excecoes.aula_8_5_stacktrace;

public class Automovel {
	
	private static final int VELOCIDADE_MAXIMA = 180;
	
	private int velocidadeAtual;
	
	public void acelerar(int velocidade) throws AcimaVelocidadeMaximaException {
		
		if(velocidadeAtual + velocidade > VELOCIDADE_MAXIMA) {
			throw new AcimaVelocidadeMaximaException("Excedeu a velocidade m?xima");
		}
		
		velocidade += velocidade;
	}
}
