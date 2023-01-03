package dominio;
/**
 * Clase que contiene los atributos y métodos necesarios para crear un objeto de tipo Ejercicio.
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class Ejercicio {
	
	//atributos
	private int id;
	private String nombre;
	
	/**
	 * Construye un objeto Ejercicio sin argumentos.
	 */
	public Ejercicio() {
	}
	
	/**
	 * Construye un objeto Ejercicio con argumentos.
	 * @param id Identificador único del ejercicio.
	 * @param nombre Nombre del ejercicio.
	 */
	public Ejercicio(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	/**
	 * Construye un objeto Ejercicio con referencia a otro objeto.
	 * @param ejercicio Ejercicio del cual se obtienen los atributos.
	 */
	public Ejercicio(Ejercicio ejercicio) {
		this.id = ejercicio.id;
		this.nombre = ejercicio.nombre;
	}
	
	/**
	 * Devuelve el identificador único del ejercicio.
	 * @return Identificador único del ejercicio.
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el identificador único del ejercicio.
	 * @param id Identificador único del ejercicio.
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Devuelve el nombre del ejercicio.
	 * @return Nombre del ejercicio.
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre del ejercicio.
	 * @param nombre Nombre del ejercicio.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve una cadena de texto con los atributos del ejercicio.
	 * @return Cadena de texto con los atributos del ejercicio.
	 */
	@Override
	public String toString() {
		return "Ejercicio \nId=" + id + "\nnombre=" + nombre;
	}
	
	
}