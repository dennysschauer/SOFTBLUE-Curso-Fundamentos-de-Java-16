package multithred_e_sincronismo.aula_14_2_threads;

public class Contador extends Thread {
	@Override
	public void run() {
			for(int i = 0; i < 10; i++) {
				System.out.println("=>" + i);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			
		}
	}
}
