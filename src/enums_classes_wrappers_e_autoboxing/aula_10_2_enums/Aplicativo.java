package enums_classes_wrappers_e_autoboxing.aula_10_2_enums;

public class Aplicativo {
		
	private enum Sexo{
		MASCULINO, FEMININO
	}
	
	public static void main(String[] args) {
		
		DiaDaSemana hoje = DiaDaSemana.SEXTA;
		
		int num = DiaDaSemana.QUARTA.getNum();
		System.out.println(num);
		
		String s = "TERCA";
		
		DiaDaSemana d = DiaDaSemana.valueOf(s);
		System.out.println(d.getNum());
		
		Sexo sexo = Sexo.MASCULINO;
	}

}
