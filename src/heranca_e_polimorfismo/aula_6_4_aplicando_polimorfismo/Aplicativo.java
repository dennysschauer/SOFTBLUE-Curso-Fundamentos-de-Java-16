package heranca_e_polimorfismo.aula_6_4_aplicando_polimorfismo;

public class Aplicativo {

	public static void main(String[] args) {
		
//		Animal a = new Cachorro();
//		
//		if (a instanceof Cachorro) {
//			Cachorro c = (Cachorro) a;
//			c.morder();
//		}
		
		Cachorro c = new Cachorro();
		Gato g = new Gato();
		Pintinho p = new Pintinho();
		
		falar(c);
		falar(g);
		falar(p);

	}
	
	private static void falar(Animal a) {
		a.falar();
	}

}
