package colecao_de_dados.aula_12_6_conjuntos_javautilset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplicativo {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();
//		Set<String> set = new LinkedHashSet<>();
		Set<String> set = new TreeSet<>();
		
		set.add("D4");
		set.add("C5");
		set.add("A7");
		set.add("E3");
		set.add("B6");
		set.add("F2");
		set.add("G1");
		set.add("G1");
		set.add("G1");
		
		for(String s : set) {
			System.out.println(s);
		}
		

	}

}
