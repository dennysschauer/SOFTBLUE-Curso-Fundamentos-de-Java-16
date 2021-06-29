package heranca_e_polimorfismo.aula_6_5_mais_polimorfismo;

public class LeiteQuente extends Bebida {
	
	public LeiteQuente() {
		super("Leite Quente", true);
	}
	
	@Override
	public void preparar() {
		System.out.println("Pegando um copo");
		System.out.println("Colocando leite no copo");
	}

}
