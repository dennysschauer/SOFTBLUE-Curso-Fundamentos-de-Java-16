package classesabstrataseinterfaces.Aula_7_3_criandointerfaces;

public class Aplicativo {

	public static void main(String[] args) {
		Ferrari f = new Ferrari();
		
//		Rota rota = new Rota();
//		rota.ir(f);
		
		AnelBrilhante a = new AnelBrilhante();
		
		Vendedor v = new Vendedor();
		v.mostrarPreco(f);
		v.mostrarPreco(a);
	}

}
