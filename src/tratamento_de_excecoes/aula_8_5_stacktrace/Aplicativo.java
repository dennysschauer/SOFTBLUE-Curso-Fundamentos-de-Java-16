package tratamento_de_excecoes.aula_8_5_stacktrace;

public class Aplicativo {

	public static void main(String[] args) {

		Pista p = new Pista();
		
		try {
			p.iniciar();
			
		} catch (PistaException e) {
			e.printStackTrace();
		}
	}
}
