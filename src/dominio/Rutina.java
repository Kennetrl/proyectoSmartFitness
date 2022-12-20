package dominio;

public class Rutina {
	
	//atributos
	private int id;
	private double tiempoEmpleado;
	private int repeticion;
	private String nombreRutina;
	
	public double getTiempoEmpleado() {
		return tiempoEmpleado;
	}
	
	//método constructor sin argumentos
	public Rutina() {
	}
	
	//método constructor con argumentos
	public Rutina(double tiempoEmpleado, Ejercicio ejercicio, int repeticion, int id, String nombreRutina) {
		this.tiempoEmpleado = tiempoEmpleado;
		this.repeticion = repeticion;
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

	@Override
	public String toString() {
		return "Rutina \nid=" + id + "\ntiempoEmpleado=" + tiempoEmpleado + " minutos" + "\nrepeticion=" + repeticion + " veces"
				+ "\nnombreRutina=" + nombreRutina;
	}
	
	
}
