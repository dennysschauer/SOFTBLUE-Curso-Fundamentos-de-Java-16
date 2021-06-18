package acessoconstrutoreselementosestaticos.Aula_5_2_PrivatePublic;

public class Aplicativo {

	public static void main(String[] args) {
		ContaBancaria c = new ContaBancaria();
		
		c.setNumConta(54334);
		c.setAtiva(true);
		
		c.depositar(5000);
		c.sacar(1000);
		
		System.out.println("meu saldo é: R$ " + c.getSaldo());
		
		

	}

}
