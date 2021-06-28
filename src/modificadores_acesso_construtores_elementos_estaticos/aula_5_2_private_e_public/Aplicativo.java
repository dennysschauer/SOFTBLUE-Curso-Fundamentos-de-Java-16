package modificadores_acesso_construtores_elementos_estaticos.aula_5_2_private_e_public;

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
