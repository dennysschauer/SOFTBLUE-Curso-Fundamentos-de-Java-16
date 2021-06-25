package tratamentodeexcecoes.Aula_8_5_stacktrace;

@SuppressWarnings("serial")
public class PistaException extends Exception {
	
	public PistaException() {
		
	}
	
	public PistaException(String message) {
		super(message);
	}
	
	public PistaException(Throwable cause) {
		super(cause);
	}
	
	public PistaException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public PistaException(String message, Throwable cause,
						boolean enableSuppresion, boolean writableStackTrace) {
		super(message, cause, enableSuppresion, writableStackTrace);
	}
}
