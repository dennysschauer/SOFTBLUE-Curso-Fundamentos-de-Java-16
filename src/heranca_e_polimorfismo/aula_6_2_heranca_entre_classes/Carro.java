package heranca_e_polimorfismo.aula_6_2_heranca_entre_classes;

public class Carro extends Veiculo {
	boolean quatroPortas;

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("Quatro portas : " +quatroPortas);
	}
}
