package multithread_e_sincronismo.aula_14_3_sincronismo_multithread;

public class Contador {
	private int valor;

	public synchronized void incrementar() {
		valor++;
	}

	public int getValor() {
		return valor;
	}

}
