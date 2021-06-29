package heranca_e_polimorfismo.aula_6_5_mais_polimorfismo;

public class Refrigerante extends Bebida {
	public Refrigerante() {
		super("Refri", false);
	}
	
	@Override
	public void preparar() {
		System.out.println("PReparando o Refrigerante");
	}
}
