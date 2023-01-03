package dominio;
/**
 * Esta clase es la clase Entrenador y extiende la clase Cuenta.
 * 
 * @author  Rodney Andrade
 * @author  Marlon Argoti
 * @author  Vanessa Heredia
 * @author  Jonathan Planza
 * @author  Vinicio Matango
 * @author  Kennet Rodriguez
 * @version 1.0
 * @since   2020-04-15
 */
public class Entrenador extends Cuenta{
	
	private boolean certificadoProfesional;

	/**
     * Constructor para la clase Entrenador.
     */
	public Entrenador() {
		certificadoProfesional = false;
	}
	
	/**
     * Constructor para la clase Entrenador.
     * 
     * @param certificadoProfesional boolean que determina si el entrenador tiene o no certificado profesional.
     */
	public Entrenador(boolean certificadoProfesional) {
		this.certificadoProfesional=certificadoProfesional;
	}
	
	/**
     * Constructor para la clase Entrenador.
     * 
     * @param entrenador objeto de la clase Entrenador.
     */
	public Entrenador(Entrenador entrenador) {
		this.certificadoProfesional=entrenador.certificadoProfesional;
	}
	
	/**
     * Metodo para obtener el certificado profesional del entrenador.
     * 
     * @return certificadoProfesional boolean que determina si el entrenador tiene o no certificado profesional.
     */
	public boolean getCertificadoProfesional() {
		return certificadoProfesional;
	}
	
	/**
     * Metodo para establecer el certificado profesional del entrenador.
     * 
     * @param certificadoProfesional boolean que determina si el entrenador tiene o no certificado profesional.
     */
	public void setCertificadoProfesional(boolean certificadoProfesional) {
		this.certificadoProfesional = certificadoProfesional;
	}

	/**
     * Metodo para mostrar la informacion del entrenador.
     * 
     * @return informacion del entrenador.
     */
	@Override
	public String toString() {
		return "Entrenador \ncertificadoProfesional=" + certificadoProfesional;
	}
	
	
}