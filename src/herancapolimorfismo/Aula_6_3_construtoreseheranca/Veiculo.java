package herancapolimorfismo.Aula_6_3_construtoreseheranca;

public class Veiculo {
	
	protected String marca;
	
//	public Veiculo() {
//		super();
//		System.out.println("Veiculo()");
//	}
	
	public Veiculo(String marca) {
		this.marca = marca;
		System.out.println("Veiculo(String)");
	}
}
