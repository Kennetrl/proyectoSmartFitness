package dominio;

public class ProgresoUsuario {

	//atributos
	private int id;
	private boolean logrosAlcanzados;
	private int fecha;
	private double peso;
	
	//método constructor sin argumentos
	public ProgresoUsuario(){
	}
	
	//método constructor con argumentos
	public ProgresoUsuario(int id, boolean logrosAlcanzados, int fecha, double peso) {
		this.id = id;
		this.logrosAlcanzados = logrosAlcanzados;
		this.fecha = fecha;
		this.peso = peso;
	}
	
	//método constructor con referencia a objeto
	public ProgresoUsuario(ProgresoUsuario progreso) {
		this.id = progreso.id;
		this.logrosAlcanzados = progreso.logrosAlcanzados;
		this.fecha = progreso.fecha;
		this.peso = progreso.peso;
	}
	
	//métodos constructores get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isLogrosAlcanzados() {
		return logrosAlcanzados;
	}

	public void setLogrosAlcanzados(boolean logrosAlcanzados) {
		this.logrosAlcanzados = logrosAlcanzados;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
