package modificadores_acesso_construtores_elementos_estaticos.aula_5_3_construtores_de_classes;

public class Quadrado {
	private double lado;

	
	
	public Quadrado(double lado) {
		this.lado = lado;
	}



	public double calcularArea() {
		return lado * lado;
	}
}
