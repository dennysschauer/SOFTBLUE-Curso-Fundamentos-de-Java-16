package conceitos_iniciais;

public class Aula_3_6_switchExpression {

	public enum DiaDaSemana {

		SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO

	}

	public static void main(String[] args) {

		DiaDaSemana d = DiaDaSemana.SEGUNDA;

//		switch (d) {
//
//		case SEGUNDA: System.out.println(1); break;
//		case TERCA: System.out.println(2); break;
//		
//		}

		switch (d) {
		case SEGUNDA -> System.out.println(1);
		case TERCA -> System.out.println(2);
		default -> System.out.println("outro");
		}

		int i = switch (d) {
		case SEGUNDA -> 1;
		case TERCA -> 2;
		default -> 0;
		};
		
		System.out.println(i);

	}

}
