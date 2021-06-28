package classes_objetos.aula_4_2_classes_e_objetos;

public class Aplicativo {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "José";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Maria";
		
		p1.receber(5);
		p1.dar(2, p2);
		
		System.out.println(p1.nome + " possui " + p1.numFigurinha);
		System.out.println(p2.nome + " possui " + p2.numFigurinha);
	}

}
