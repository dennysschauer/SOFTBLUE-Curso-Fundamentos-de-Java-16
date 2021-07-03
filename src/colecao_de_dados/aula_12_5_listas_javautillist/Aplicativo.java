package colecao_de_dados.aula_12_5_listas_javautillist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aplicativo {
	public static void main (String[] args) {
		
		List<String> l = new ArrayList<>();
		
		l.add("abc");
		l.add("def");
		//l.set(0, "ghi"); //substitui
		l.add(0, "ghi"); //empurra | troca de posição
		
		for(String s : l) {
			System.out.println(s);
		}
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
