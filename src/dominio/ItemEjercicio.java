package dominio;

/**
 * Clase ItemEjercicio para llevar un registro de los ejercicios hechos por los usuarios
 * 
 * @author  Rodney Andrade
 * @author  Marlon Argoti
 * @author  Vanessa Heredia
 * @author  Jonathan Planza
 * @author  Vinicio Matango
 * @author  Kennet Rodriguez
 * @version 1.0
 */
public class ItemEjercicio {
	
	//atributos
	private String ejercicio;
	private int repeticion;
	private String tipoEjercicio;
	
	/**
	 * Constructor sin argumentos
	 */
	public ItemEjercicio() {	
		ejercicio="abdominales";
		repeticion = 2;
		tipoEjercicio = "Anaerobico";
		
	}
	
	/**
	 * Constructor con argumentos
	 * @param ejercicio nombre del ejercicio
	 * @param repeticion cantidad de repeticiones del ejercicio
	 * @param tipoEjercicio el tipo de ejercicio (anaerobico o aerobico)
	 */
	public ItemEjercicio(String ejercicio, int repeticion, String tipoEjercicio) {
		this.ejercicio = ejercicio;
		this.repeticion = repeticion;
		this.tipoEjercicio = tipoEjercicio;
	}
	
	/**
	 * Constructor con referencia a objeto
	 * @param item objeto de tipo ItemEjercicio
	 */
	public ItemEjercicio(ItemEjercicio item) {
		this.ejercicio = item.ejercicio;
		this.repeticion = item.repeticion;
		this.tipoEjercicio = item.tipoEjercicio;
	}
	
	/**
	 * Obtiene el nombre del ejercicio
	 * @return ejercicio
	 */
	public String getEjercicio() {
		return ejercicio;
	}

	/**
	 * Establece el nombre del ejercicio
	 * @param ejercicio nombre del ejercicio
	 */
	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}

	/**
	 * Obtiene la cantidad de repeticiones del ejercicio
	 * @return repeticion
	 */
	public int getRepeticion() {
		return repeticion;
	}

	/**
	 * Establece la cantidad de repeticiones del ejercicio
	 * @param repeticion cantidad de repeticiones del ejercicio
	 */
	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	/**
	 * Obtiene el tipo de ejercicio
	 * @return tipoEjercicio
	 */
	public String getTipoEjercicio() {
		return tipoEjercicio;
	}

	/**
	 * Establece el tipo de ejercicio
	 * @param tipoEjercicio el tipo de ejercicio (anaerobico o aerobico)
	 */
	public void setTipoEjercicio(String tipoEjercicio) {
		this.tipoEjercicio = tipoEjercicio;
	}

	@Override
	public String toString() {
		return "ItemEjercicio \nejercicio=" + ejercicio + "\nrepeticion=" + repeticion + "\ntipoEjercicio="
				+ tipoEjercicio;
	}
}