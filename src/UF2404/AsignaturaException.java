package UF2404;

public class AsignaturaException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Sobre escribimos el constructor de Exception al cual se le pasa el String
	 * mensaje
	 * 
	 * @param mensaje
	 */
	public AsignaturaException(String mensaje) {
		super(mensaje);
	}

}
