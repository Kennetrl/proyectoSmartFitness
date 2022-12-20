package dominio;

public class ItemEjercicio {
	
	//atributos
	private String ejercicio;
	private int repeticion;
	private String tipoEjercicio;
	
	//método constructor sin argumentos
	public ItemEjercicio() {	
	}
	
	//método constructor con argumentos
	public ItemEjercicio(String ejercicio, int repeticion, String tipoEjercicio) {
		this.ejercicio = ejercicio;
		this.repeticion = repeticion;
		this.tipoEjercicio = tipoEjercicio;
	}
	
	//método constructor con referencia a objeto
	public ItemEjercicio(ItemEjercicio item) {
		this.ejercicio = item.ejercicio;
		this.repeticion = item.repeticion;
		this.tipoEjercicio = item.tipoEjercicio;
	}
	
	//métodos constructores get y set
	public String getEjercicio() {
		return ejercicio;
	}

	public void setEjercicio(String ejercicio) {
		this.ejercicio = ejercicio;
	}

	public int getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	public String getTipoEjercicio() {
		return tipoEjercicio;
	}

	public void setTipoEjercicio(String tipoEjercicio) {
		this.tipoEjercicio = tipoEjercicio;
	}

	@Override
	public String toString() {
		return "ItemEjercicio \nejercicio=" + ejercicio + "\nrepeticion=" + repeticion + "\ntipoEjercicio="
				+ tipoEjercicio;
	}
	
}