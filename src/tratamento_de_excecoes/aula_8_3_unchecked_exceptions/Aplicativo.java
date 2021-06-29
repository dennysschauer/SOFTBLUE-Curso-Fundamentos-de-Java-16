package tratamento_de_excecoes.aula_8_3_unchecked_exceptions;

public class Aplicativo {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		try {
			boolean iguais = Comparador.comparar(null, o2);
			System.out.println(iguais);
			
		}catch(NullPointerException e) {
			System.out.println("O objeto é nulo");
		}
	}

}
