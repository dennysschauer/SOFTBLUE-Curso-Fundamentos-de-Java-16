package colecao_de_dados.aula_12_9_interfaces_comparator_comparable;

import java.util.Comparator;

public class DescricaoComparator implements Comparator<Produto> {
	public int compare(Produto o1, Produto o2) {
		if(o1.getDescricao().equals(o2.getDescricao())) {
			return 0;
		}
		
		if(o1.getDescricao().compareTo(o2.getDescricao()) > 0) {
			return 1;
		}
		
		return -1;
	}
}
