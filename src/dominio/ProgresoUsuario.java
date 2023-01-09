package dominio;
/**
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class ProgresoUsuario {

	private int id;
	private int fecha;
	private double peso;
	private boolean logrosAlcanzados;
	
	public ProgresoUsuario(){
		id = 1;
		logrosAlcanzados = true;
		fecha = 25;
		peso= 70.5;
	}

	public ProgresoUsuario(int id, int fecha, double peso, boolean logrosAlcanzados) {
		this.id = id;
		this.logrosAlcanzados = logrosAlcanzados;
		this.fecha = fecha;
		this.peso = peso;
	}
	
	public ProgresoUsuario(ProgresoUsuario progreso) {
		this.id = progreso.id;
		this.logrosAlcanzados = progreso.logrosAlcanzados;
		this.fecha = progreso.fecha;
		this.peso = progreso.peso;
	}

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

	@Override
	public String toString() {
		return "ProgresoUsuario [id = " + id + ", logrosAlcanzados = " + logrosAlcanzados + " fecha = " + fecha + " dias, " + "peso = "
				+ peso + " kg.";
	}
	
}