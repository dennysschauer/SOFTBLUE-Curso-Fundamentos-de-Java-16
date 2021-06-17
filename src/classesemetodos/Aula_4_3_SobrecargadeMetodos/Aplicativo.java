package classesemetodos.Aula_4_3_SobrecargadeMetodos;

public class Aplicativo {

	public static void main(String[] args) {
		Matematica m = new Matematica();
		
		int soma = m.somar(10, 20);
		System.out.println(soma);
		
		int soma2 = m.somar(10, 20, 30);
		System.out.println(soma2);
		
		double soma3 = m.somar(10.3, 20.5);
		System.out.println(soma3);

	}

}
