package herancapolimorfismo.Aula_6_3_construtoreseheranca;

public class Carro extends Veiculo{
	public Carro(String marca) {
		super(marca);
//		super();
//		super("Ferrari");
		System.out.println("Carro(String)");
	}
}
