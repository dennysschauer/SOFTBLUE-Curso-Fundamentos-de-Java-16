package heranca_e_polimorfismo.aula_6_2_heranca_entre_classes;

public class Aplicativo {

	public static void main(String[] args) {
//		Veiculo v = new Veiculo();
		Carro v = new Carro();
		v.buzinar();
		v.setMarca("AAAA");
		v.setModelo("BBBB");
		v.setAno(2000);
		v.setQuatroPortas(true);
		v.imprimirDados();
		
		Motocicleta m = new Motocicleta();
		m.buzinar();
		m.empinar();
		
		Caminhao c = new Caminhao();
		c.buzinar();
		
		
	}

}
