package tratamentodeexcecoes.Aula_8_2_tratandoelancandocheckedexceptions;

public class Aplicativo {

	public static void main(String[] args) {

		Banco banco = new Banco();

		try {
			banco.realizarOperacao();

//		} catch (SaldoInsuficienteException e) {
//			System.out.println("Voc� tentou sacar " + e.getValor() + " e seu saldo � de " + e.getSaldo());
//		} catch (ValorNegativoException e) {
//			System.out.println("Voc� tentou sacar um valor negativo de " + e.getValor());
//		}

		} catch (BancoException e) {
			System.out.println("Ocorreu um erro: " + e.getMessage());
			System.out.println(e.getCause());
		}
	}

}
