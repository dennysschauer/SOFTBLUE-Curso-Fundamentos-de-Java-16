package herancapolimorfismo.Aula_6_4_aplicandopolimorfismo;

public class Cachorro extends Animal {
	@Override
	public void falar() {
		System.out.println("AU AU");
	}
	
	public void morder() {
		System.out.println("Nhac");
	}
}
