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
	private int id;
	private String nombre;
	private String correo;
	private String contrasenia;
	
	/**
	 * Constructor sin argumentos de la clase Cuenta.
	 */
	public Cuenta(){
	}
	
	/**
	 * Constructor con argumentos de la clase Cuenta.
	 * 
	 * @param id la id de la cuenta.
	 * @param nombre el nombre de la cuenta.
	 * @param correo el correo de la cuenta.
	 * @param contrasenia la contraseña de la cuenta.
	 */
	public Cuenta(int id, String nombre, String correo, String contrasenia) {
		this.id=id;
		this.nombre=nombre;
		this.correo=correo;
		this.contrasenia=contrasenia;
	}
	
	/**
	 * Constructor de la clase Cuenta que recibe un objeto de tipo Cuenta.
	 * 
	 * @param cuenta el objeto de tipo Cuenta.
	 */
	public Cuenta(Cuenta cuenta) {
		this.id=cuenta.id;
		this.nombre=cuenta.nombre;
		this.correo=cuenta.correo;
		this.contrasenia=cuenta.contrasenia;
	}
	
	/**
	 * Método get de la clase Cuenta.
	 * 
	 * @return la id de la cuenta.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Método set de la clase Cuenta.
	 * 
	 * @param id la id de la cuenta a setear.
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Método get de la clase Cuenta.
	 * 
	 * @return el nombre de la cuenta.
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * Método set de la clase Cuenta.
	 * 
	 * @param nombre el nombre de la cuenta a setear.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * Método get de la clase Cuenta.
	 * 
	 * @return el correo de la cuenta.
	 */
	public String getCorreo() {
		return correo;
	}
	
	/**
	 * Método set de la clase Cuenta.
	 * 
	 * @param correo el correo de la cuenta a setear.
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	/**
	 * Método get de la clase Cuenta.
	 * 
	 * @return la contraseña de la cuenta.
	 */
	public String getContrasenia() {
		return contrasenia;
	}
	
	/**
	 * Método set de la clase Cuenta.
	 * 
	 * @param contrasenia la contraseña de la cuenta a setear.
	 */
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	/**
	 * Método toString de la clase Cuenta.
	 * 
	 * @return los datos de la cuenta.
	 */
	@Override
	public String toString() {
		return "Cuenta \nid=" + id + "\nnombre=" + nombre + "\ncorreo=" + correo + "\ncontrasenia=" + contrasenia;
	}
	
	
}