package dominio;

public class Ejercicio {
	
	//atributos
	private int id;
	private String nombre;
	
	//método constructor sin argumentos
	public Ejercicio() {
	}
	
	//método constructor con argumentos
	public Ejercicio(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	//método constructor con referencia a objeto
	public Ejercicio(Ejercicio ejercicio) {
		this.id = ejercicio.id;
		this.nombre = ejercicio.nombre;
	}
	
	//métodos constructores get y set
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
	
	
}
