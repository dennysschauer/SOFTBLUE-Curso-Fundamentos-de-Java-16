package heranca_e_polimorfismo.aula_6_4_aplicando_polimorfismo;

public class Cachorro extends Animal {
	@Override
	public void falar() {
		System.out.println("AU AU");
	}
	
	public void morder() {
		System.out.println("Nhac");
	}
}
