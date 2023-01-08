package dominio;
/**
 * @author  Rodney Andrade
 * @author  Marlon Argoti
 * @author  Vanessa Heredia
 * @author  Jonathan Planza
 * @author  Vinicio Matango
 * @author  Kennet Rodriguez
 */
public class Entrenador extends Cuenta{
	
	private boolean certificadoProfesional;
	
	public Entrenador() {
		super.id = 1;
		super.nombre = "";
		super.correo = "";
		super.contrasenia = "";
		certificadoProfesional = false;
	}

	public Entrenador(int id, String nombre, String correo, String contrasenia, boolean certificadoProfesional) {
		this.id = id;
		this.nombre = nombre;
		this.correo = correo;
		this.contrasenia = contrasenia;
		this.certificadoProfesional=certificadoProfesional;
	}

	public Entrenador(Entrenador entrenador) {
		this.id = entrenador.id;
		this.nombre = entrenador.nombre;
		this.correo = entrenador.correo;
		this.contrasenia = entrenador.contrasenia;
		this.certificadoProfesional=entrenador.certificadoProfesional;
	}

	public boolean getCertificadoProfesional() {
		return certificadoProfesional;
	}
	
	public void setCertificadoProfesional(boolean certificadoProfesional) {
		this.certificadoProfesional = certificadoProfesional;
	}

	@Override
	public String toString() {
		return "Entrenador [id=" + id + ", nombre=" + nombre
				+ ", correo=" + correo + ", contrasenia=" + contrasenia + ", certificadoProfesional=" + certificadoProfesional+ "]";
	}

	
	
	
}