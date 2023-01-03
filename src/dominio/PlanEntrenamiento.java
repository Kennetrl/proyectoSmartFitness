package dominio;

public class PlanEntrenamiento {
	
	//atributos
	private int id;
	private String nombrePlanEntrenamiento;
	private double tiempoEmpleado;
	private int repeticion;
	private String nombreRutina;
	
	//método constructor sin argumentos
	public PlanEntrenamiento() {
		id = 1;
		nombrePlanEntrenamiento = "Adelgazar";
		tiempoEmpleado = 1;
		repeticion = 1;
		nombreRutina = "Mind & Body";
	}
	
	//método constructor con argumentos
	public PlanEntrenamiento(int id, String nombrePlanEntrenamiento, double tiempoEmpleado, int repeticion, String nombreRutina) {
		this.id = id;
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
		this.tiempoEmpleado = tiempoEmpleado;
		this.repeticion = repeticion;
		this.nombreRutina = nombreRutina;
	}
	
	//método constructor con referencia a objeto
	public PlanEntrenamiento(PlanEntrenamiento plan) {
		this.id = plan.id;
		this.nombrePlanEntrenamiento = plan.nombrePlanEntrenamiento;
		this.tiempoEmpleado = plan.tiempoEmpleado;
		this.repeticion = plan.repeticion;
		this.nombreRutina = plan.nombreRutina;
	}
	
	//métodos constructores get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePlanEntrenamiento() {
		return nombrePlanEntrenamiento;
	}

	public void setNombrePlanEntrenamiento(String nombrePlanEntrenamiento) {
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
	}

	public double getTiempoEmpleado() {
		return tiempoEmpleado;
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

	public String getNombreRutina() {
		return nombreRutina;
	}

	public void setNombreRutina(String nombreRutina) {
		this.nombreRutina = nombreRutina;
	}

	@Override
	public String toString() {
		return "Plan de Entrenamiento\nid=" + id + "\nnombrePlanEntrenamiento=" + nombrePlanEntrenamiento
				+ "\ntiempoEmpleado=" + tiempoEmpleado + "\nrepeticion=" + repeticion + "\nnombreRutina=" + nombreRutina;
	}

	
	
}
