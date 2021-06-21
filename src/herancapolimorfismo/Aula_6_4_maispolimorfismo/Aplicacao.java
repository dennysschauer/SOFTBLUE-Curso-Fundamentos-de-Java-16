package herancapolimorfismo.Aula_6_4_maispolimorfismo;

public class Aplicacao {
	public static void main(String[] args) {
		LeiteQuente leite = new LeiteQuente();

		Preparador preparador = new Preparador();

		preparador.prepararBebida(leite);
		
		Refrigerante refri = new Refrigerante();
		preparador.prepararBebida(refri);
	}
}