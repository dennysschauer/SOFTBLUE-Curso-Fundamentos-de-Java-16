package heranca_e_polimorfismo.aula_6_3_construtores_e_heranca;

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
