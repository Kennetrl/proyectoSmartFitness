package dominio;
/**
 * @author  Rodney Andrade
 * @author  Marlon Argoti
 * @author  Vanessa Heredia
 * @author  Jonathan Planza
 * @author  Vinicio Matango
 * @author  Kennet Rodriguez
 */
public class Entrenador{
	private int id;
	private String nombre;
	private String correo;
	private String contrasenia;
	private boolean certificadoProfesional;
	
	public Entrenador() {
		id = 1;
		nombre = "";
		correo = "";
		contrasenia = "";
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@Override
	public String toString() {
		return "Entrenador [id = " + id + ", nombre = " + nombre + ", correo = " + correo + ", contrasenia = " + contrasenia
				+ ", certificadoProfesional = " + certificadoProfesional + "]";
	}

	
	
}