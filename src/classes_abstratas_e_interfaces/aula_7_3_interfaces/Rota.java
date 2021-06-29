package classes_abstratas_e_interfaces.aula_7_3_interfaces;

public class Rota {
	public void ir(Automovel a) {
		a.acelerar();
		a.virarDireta();
		a.virarEsquerda();
		a.virarDireta();
	}
}
