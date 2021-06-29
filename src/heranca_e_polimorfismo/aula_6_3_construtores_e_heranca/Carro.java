package heranca_e_polimorfismo.aula_6_3_construtores_e_heranca;

public class Carro extends Veiculo{
	public Carro(String marca) {
		super(marca);
//		super();
//		super("Ferrari");
		System.out.println("Carro(String)");
	}
}
