package herancapolimorfismo.Aula_6_4_maispolimorfismo;

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
