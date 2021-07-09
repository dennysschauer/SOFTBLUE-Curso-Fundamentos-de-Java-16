package multithread_e_sincronismo.aula_14_5_wait_notify_notifyall;

public class Aplicativo {

	public static void main(String[] args) {
		Buffer buffer = new Buffer();

		Produtor[] produtores = new Produtor[3];
		Consumidor[] consumidores = new Consumidor[3];

		for (int i = 0; i < produtores.length; i++) {
			produtores[i] = new Produtor(buffer);
			produtores[i].start();
		}

		for (int i = 0; i < consumidores.length; i++) {
			consumidores[i] = new Consumidor(buffer);
			consumidores[i].start();
		}

	}

}
