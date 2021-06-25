package tratamentodeexcecoes.Aula_8_2_tratandoelancandocheckedexceptions;

@SuppressWarnings("serial")
public class BancoException extends Exception {

	public BancoException() {
		// TODO Auto-generated constructor stub
	}

	public BancoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public BancoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public BancoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BancoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
