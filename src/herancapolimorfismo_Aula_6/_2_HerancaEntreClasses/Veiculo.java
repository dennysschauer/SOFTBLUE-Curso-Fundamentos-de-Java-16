package herancapolimorfismo_Aula_6._2_HerancaEntreClasses;

public class Veiculo {
	protected String marca;
	protected String modelo;
	protected int ano;
	
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void buzinar() {
		System.out.println("BiBi");
	}
	
	public void imprimirDados() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
}