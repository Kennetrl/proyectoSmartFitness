package dominio;

/**
 * Esta clase permite crear objetos tipo Cuenta con los atributos id, nombre, correo y contraseña.
 * 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class Cuenta {
	
	//atributos
	protected int id;
	protected String nombre;
	protected String correo;
	protected String contrasenia;


	public Cuenta(){
		id=1;
		nombre = "Juan";
		correo = "juan@hotmail.com";
		contrasenia = "juanito123";
	}
	
	public Cuenta(int id, String nombre, String correo, String contrasenia) {
		this.id=id;
		this.nombre=nombre;
		this.correo=correo;
		this.contrasenia=contrasenia;
	}

	public Cuenta(Cuenta cuenta) {
		this.id=cuenta.id;
		this.nombre=cuenta.nombre;
		this.correo=cuenta.correo;
		this.contrasenia=cuenta.contrasenia;
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
		return "Cuenta \nid=" + id + "\nnombre=" + nombre + "\ncorreo=" + correo + "\ncontrasenia=" + contrasenia;
	}
	
}