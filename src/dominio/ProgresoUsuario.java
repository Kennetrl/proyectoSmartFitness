package dominio;
/**
 * Esta clase contiene los atributos de un progreso de usuario y los métodos constructores 
 * get y set.
 * 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class ProgresoUsuario {

	//atributos
	private int id;
	private boolean logrosAlcanzados;
	private int fecha;
	private double peso;
	
	/**
     * Constructor sin argumentos.
     */
	public ProgresoUsuario(){
		id = 1;
		logrosAlcanzados = true;
		fecha = 25;
		peso= 70.5;
	}
	
	/**
     * Constructor con argumentos.
     * 
     * @param id Id del progreso de usuario.
     * @param logrosAlcanzados Logros alcanzados.
     * @param fecha Fecha del progreso.
     * @param peso Peso del usuario.
     */
	public ProgresoUsuario(int id, boolean logrosAlcanzados, int fecha, double peso) {
		this.id = id;
		this.logrosAlcanzados = logrosAlcanzados;
		this.fecha = fecha;
		this.peso = peso;
	}
	
	/**
     * Constructor con referencia a objeto.
     * 
     * @param progreso Progreso de usuario.
     */
	public ProgresoUsuario(ProgresoUsuario progreso) {
		this.id = progreso.id;
		this.logrosAlcanzados = progreso.logrosAlcanzados;
		this.fecha = progreso.fecha;
		this.peso = progreso.peso;
	}
	
	/**
     * Método para obtener el id del progreso de usuario.
     * 
     * @return Id del progreso de usuario.
     */
	public int getId() {
		return id;
	}

	/**
     * Método para asignar el id del progreso de usuario.
     * 
     * @param id Id del progreso de usuario.
     */
	public void setId(int id) {
		this.id = id;
	}

	/**
     * Método para obtener los logros alcanzados por el usuario.
     * 
     * @return Logros alcanzados por el usuario.
     */
	public boolean isLogrosAlcanzados() {
		return logrosAlcanzados;
	}

	/**
     * Método para asignar los logros alcanzados por el usuario.
     * 
     * @param logrosAlcanzados Logros alcanzados por el usuario.
     */
	public void setLogrosAlcanzados(boolean logrosAlcanzados) {
		this.logrosAlcanzados = logrosAlcanzados;
	}

	/**
     * Método para obtener la fecha del progreso.
     * 
     * @return Fecha del progreso.
     */
	public int getFecha() {
		return fecha;
	}

	/**
     * Método para asignar la fecha del progreso.
     * 
     * @param fecha Fecha del progreso.
     */
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	/**
     * Método para obtener el peso del usuario.
     * 
     * @return Peso del usuario.
     */
	public double getPeso() {
		return peso;
	}

	/**
     * Método para asignar el peso del usuario.
     * 
     * @param peso Peso del usuario.
     */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
     * Método para imprimir los datos del progreso de usuario.
     * 
     * @return Datos del progreso de usuario.
     */
	@Override
	public String toString() {
		return "ProgresoUsuario\nid = " + id + "\nlogrosAlcanzados = " + logrosAlcanzados + "\nfecha = " + fecha + "\npeso = "
				+ peso;
	}
	
}