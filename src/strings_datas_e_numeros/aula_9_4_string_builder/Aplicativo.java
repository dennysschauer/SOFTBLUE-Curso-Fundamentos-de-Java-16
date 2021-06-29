package strings_datas_e_numeros.aula_9_4_string_builder;

public class Aplicativo {

	public static void main(String[] args) {
//		String s = "";
//		
//		for (int i = 0; i < 1000; i++) {
//			s = s + "x";
//		}
//		
//		System.out.println(s);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 1000; i++) {
			sb.append("x");
		}
		
		String s = sb.toString();
		
		System.out.println(s);
		
		System.out.println("A" + "B" + "C" + "D");
		
	}

}
