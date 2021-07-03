package colecao_de_dados.aula_12_2_arrays;

public class Aplicativo {
	public static void main(String[] args) {
//		int[] array;
//		array = new int[5];

//		int[] array = new int[5];
//		
//		array[1] = 6;
//		array[4] = 7;
//		
//		for (int i = 0; i < array.length; i++) {
//			System.out.println(array[i]);
//		}
//		
//		for (int x : array) {
//			System.out.println(x);
//		}

//		String[] array2 = new String[7];
//
//		array2[0] = "Dennys";
//		array2[1] = "Solange";
//		array2[2] = "Matheus";
//		array2[6] = "Miguel";
//
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}

		//array2[7] = "Z"; // lança uma exceção, pois o indice é maior do que o tamanho do array definido
		
//		for (String nomes : array2) {
//			System.out.println(nomes);
//		}
		
		Object[] array3 = new Object[7];
		
		array3[0] = "Dennys";
		array3[1] = new Object();
		array3[2] = new int[3];
		array3[3] = 10;
		
		String e1 = (String) array3[0];
		//int e2 = (int) array3[2];
		
		System.out.println(e1);
		//System.out.println(e2);

	}
}
