package heranca_e_polimorfismo.aula_6_5_mais_polimorfismo;

public class Preparador {
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a bebida " + bebida.getNome());
		
		bebida.preparar();
		
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida " + bebida.getNome());
		}
		
		System.out.println("Bebida preparada com sucesso!");
		
	}
}
