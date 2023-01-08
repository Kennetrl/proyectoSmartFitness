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
	private int id;
	private String nombre;
	private String tipoEjercicio;

	public Ejercicio() {
	}
	
	public Ejercicio(int id, String nombre, String tipoEjercicio) {
		this.id = id;
		this.nombre = nombre;
		this.tipoEjercicio = tipoEjercicio;
	}
	
	public Ejercicio(Ejercicio ejercicio) {
		this.id = ejercicio.id;
		this.nombre = ejercicio.nombre;
		this.tipoEjercicio = ejercicio.tipoEjercicio;
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

	@Override
	public String toString() {
		return "id = " + id + ", nombre = " + nombre + ", tipoEjercicio = " + tipoEjercicio;
	}

	
	
}