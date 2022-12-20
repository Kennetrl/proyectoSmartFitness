package dominio;

public class Rutina {
	
	//atributos
	private double tiempoEmpleado;
	private Ejercicio ejercicio;
	public double getTiempoEmpleado() {
		return tiempoEmpleado;
	}

	private int repeticion;
	private int id;
	private String nombreRutina;
	
	//método constructor sin argumentos
	public Rutina() {
	}
	
	//método constructor con argumentos
	public Rutina(double tiempoEmpleado, Ejercicio ejercicio, int repeticion, int id, String nombreRutina) {
		this.tiempoEmpleado = tiempoEmpleado;
		this.repeticion = repeticion;
		this.ejercicio = ejercicio;
		this.id = id;
		this.nombreRutina = nombreRutina;
	}
	
	//método constructor con referencia a objeto
	public Rutina(Rutina rutina) {
		this.tiempoEmpleado = rutina.tiempoEmpleado;
		this.repeticion = rutina.repeticion;
		this.id = rutina.id;
		this.nombreRutina = rutina.nombreRutina;
	}
	
	public void setTiempoEmpleado(double tiempoEmpleado) {
		this.tiempoEmpleado = tiempoEmpleado;
	}

	public Ejercicio getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(Ejercicio ejercicio) {
		this.ejercicio = ejercicio;
	}

	public int getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreRutina() {
		return nombreRutina;
	}

	public void setNombreRutina(String nombreRutina) {
		this.nombreRutina = nombreRutina;
	}
	
	
}
