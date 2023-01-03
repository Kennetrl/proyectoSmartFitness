package dominio;
/**
 * Esta clase representa un plan de entrenamiento, el cual contiene los elementos necesarios para llevar a cabo un entrenamiento. 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango 
 * @author Kennet Rodriguez
 * @version 1.0
 */

public class PlanEntrenamiento {
	
	/**
	 * Id del plan de entrenamiento
	 */
	private int id;
	
	/**
	 * Nombre del plan de entrenamiento
	 */
	private String nombrePlanEntrenamiento;
	
	/**
	 * Tiempo empleado para el entrenamiento
	 */
	private double tiempoEmpleado;
	
	/**
	 * Repeticiones realizadas en el entrenamiento
	 */
	private int repeticion;
	
	/**
	 * Nombre de la rutina
	 */
	private String nombreRutina;
	
	/**
	 * Constructor por defecto de PlanEntrenamiento
	 */
	public PlanEntrenamiento() {
		id = 1;
		nombrePlanEntrenamiento = "Adelgazar";
		tiempoEmpleado = 1;
		repeticion = 1;
		nombreRutina = "Mind & Body";
	}
	
	/**
	 * Constructor con todos los atributos de PlanEntrenamiento
	 * @param id Id del plan de entrenamiento
	 * @param nombrePlanEntrenamiento Nombre del plan de entrenamiento
	 * @param tiempoEmpleado Tiempo empleado para el entrenamiento
	 * @param repeticion Repeticiones realizadas en el entrenamiento
	 * @param nombreRutina Nombre de la rutina
	 */
	public PlanEntrenamiento(int id, String nombrePlanEntrenamiento, double tiempoEmpleado, int repeticion, String nombreRutina) {
		this.id = id;
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
		this.tiempoEmpleado = tiempoEmpleado;
		this.repeticion = repeticion;
		this.nombreRutina = nombreRutina;
	}

	/**
	 * Constructor que crea una instancia de PlanEntrenamiento a partir de otro PlanEntrenamiento
	 * @param plan Plan de entrenamiento
	 */
	public PlanEntrenamiento(PlanEntrenamiento plan) {
		this.id = plan.id;
		this.nombrePlanEntrenamiento = plan.nombrePlanEntrenamiento;
		this.tiempoEmpleado = plan.tiempoEmpleado;
		this.repeticion = plan.repeticion;
		this.nombreRutina = plan.nombreRutina;
	}
	
	/**
	 * Obtiene el Id del plan de entrenamiento
	 * @return Id del plan de entrenamiento
	 */
	public int getId() {
		return id;
	}

	/**
	 * Establece el Id del plan de entrenamiento
	 * @param id Id del plan de entrenamiento
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Obtiene el nombre del plan de entrenamiento
	 * @return Nombre del plan de entrenamiento
	 */
	public String getNombrePlanEntrenamiento() {
		return nombrePlanEntrenamiento;
	}

	/**
	 * Establece el nombre del plan de entrenamiento
	 * @param nombrePlanEntrenamiento Nombre del plan de entrenamiento
	 */
	public void setNombrePlanEntrenamiento(String nombrePlanEntrenamiento) {
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
	}

	/**
	 * Obtiene el tiempo empleado para el entrenamiento
	 * @return Tiempo empleado para el entrenamiento
	 */
	public double getTiempoEmpleado() {
		return tiempoEmpleado;
	}

	/**
	 * Establece el tiempo empleado para el entrenamiento
	 * @param tiempoEmpleado Tiempo empleado para el entrenamiento
	 */
	public void setTiempoEmpleado(double tiempoEmpleado) {
		this.tiempoEmpleado = tiempoEmpleado;
	}

	/**
	 * Obtiene las repeticiones realizadas en el entrenamiento
	 * @return Repeticiones realizadas en el entrenamiento
	 */
	public int getRepeticion() {
		return repeticion;
	}

	/**
	 * Establece las repeticiones realizadas en el entrenamiento
	 * @param repeticion Repeticiones realizadas en el entrenamiento
	 */
	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	/**
	 * Obtiene el nombre de la rutina
	 * @return Nombre de la rutina
	 */
	public String getNombreRutina() {
		return nombreRutina;
	}

	/**
	 * Establece el nombre de la rutina
	 * @param nombreRutina Nombre de la rutina
	 */
	public void setNombreRutina(String nombreRutina) {
		this.nombreRutina = nombreRutina;
	}

	/**
	 * Muestra la informacion del plan de entrenamiento
	 * @return Informacion del plan de entrenamiento
	 */
	@Override
	public String toString() {
		return "Plan de Entrenamiento\nid=" + id + "\nnombrePlanEntrenamiento=" + nombrePlanEntrenamiento
				+ "\ntiempoEmpleado=" + tiempoEmpleado + "\nrepeticion=" + repeticion + "\nnombreRutina=" + nombreRutina;
	}
}