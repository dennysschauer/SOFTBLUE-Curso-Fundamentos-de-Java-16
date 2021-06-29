package heranca_e_polimorfismo.aula_6_5_mais_polimorfismo;

public class Aplicacao {
	public static void main(String[] args) {
		LeiteQuente leite = new LeiteQuente();

		Preparador preparador = new Preparador();

		preparador.prepararBebida(leite);
		
		Refrigerante refri = new Refrigerante();
		preparador.prepararBebida(refri);
	}
}