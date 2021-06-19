package acessoconstrutoreselementosestaticos.Aula_5_4_ElementosEstaticos;

public class Contador {
//	private int valor;
//
//	public Contador() {
//		valor = 1;
//	}
//	
//	public void incrementar() {
//		valor++;
//	}
//	
//	public int getValor() {
//		return valor;
//	}
	
	private static int valor;
	
	static {
		valor = 1;
	}
	
	public static void incrementar() {
		valor++;
	}
	
	public static int getValor() {
		return valor;
	}
	
	
}
