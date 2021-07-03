package colecao_de_dados.aula_12_3_varargs;

public class Aplicativo {

	public static void main(String[] args) {
		
		imprimir("a");
		imprimir("a", "b");
		imprimir("a", "b", "c");
		imprimir("a", "b", "c", "d", "e");
		
		String[] array = {"A", "B", "C"};
		imprimir(array);

	}
	
//	public static void imprimir(String s1) {
//		System.out.println(s1);
//	}
//	
//	public static void imprimir(String s1, String s2) {
//		System.out.println(s1);
//		System.out.println(s2);
//	}
//	
//	public static void imprimir(String s1, String s2, String s3) {
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//	}

	public static void imprimir(String... textos) {
//		System.out.println(textos);
		for (int i = 0; i < textos.length; i++) {
			System.out.println(textos[i]);
		}
	}
	
}
