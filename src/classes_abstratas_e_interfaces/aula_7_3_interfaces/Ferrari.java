package classes_abstratas_e_interfaces.aula_7_3_interfaces;

public class Ferrari implements Carro, ItemCaro {

	@Override
	public void virarEsquerda() {
		System.out.println("Ferrari virou a esquerda");
		
	}

	@Override
	public void virarDireta() {
		System.out.println("Ferrari virou a direita");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Ferrari acelerou");
		
	}

	@Override
	public void abrirPorta() {
		System.out.println("Ferrari abriu porta");
	}

	@Override
	public double getPreco() {
		return 1000000;
	}

}
