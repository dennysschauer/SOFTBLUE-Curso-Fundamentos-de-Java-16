package herancapolimorfismo_Aula_6._2_HerancaEntreClasses;

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
