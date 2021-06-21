package herancapolimorfismo.Aula_6_4_maispolimorfismo;

public class Refrigerante extends Bebida {
	public Refrigerante() {
		super("Refri", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("PReparando o Refrigerante");
	}
}
