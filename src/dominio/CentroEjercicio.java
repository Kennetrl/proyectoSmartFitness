/**
*Clase que representa un centro de ejercicio.
*@author Rodney Andrade
*@author Marlon Argoti
*@author Vanessa Heredia
*@author Jonathan Planza
*@author Vinicio Matango
*@author Kennet Rodriguez
*/
		package dominio;

	import java.util.Arrays;
	
	public class CentroEjercicio {
		private String nombreCentro;
		private String telefono;
		private String direccion;
		private int numCuentas;
		private Cuenta cuentas[];
	
		/**
		 * Constructor sin argumentos de la clase CentroEjercicio.
		 * Inicializa los atributos con valores predeterminados.
		 */
		public CentroEjercicio() {
			this.nombreCentro="Smart Fitness";
			this.telefono="+593 99 999 9999";
			this.direccion="Quito, Ecuador";
			this.numCuentas=6;
			this.cuentas = new Cuenta[numCuentas];
		}

		/**
		 * Constructor con argumentos de la clase CentroEjercicio.
		 * Inicializa los atributos con los valores de los argumentos.
		 *
		 * @param nombreCentro Nombre del centro de ejercicio.
		 * @param telefono Número de teléfono del centro de ejercicio.
		 * @param direccion Dirección del centro de ejercicio.
		 * @param numCuentas Número de cuentas que pertenecen al centro de ejercicio.
		 * @param cuentas Arreglo de objetos de tipo Cuenta que representan las cuentas de los usuarios del centro de ejercicio.
		 */
		public CentroEjercicio(String nombreCentro, String telefono, String direccion, int numCuentas, Cuenta cuentas[]) {
			this.nombreCentro = nombreCentro;
			this.telefono=telefono;
			this.direccion=direccion;
			this.numCuentas=numCuentas;
			this.cuentas = cuentas;
		}

		/**
		 * Constructor que toma como argumento un objeto de tipo CentroEjercicio y asigna los valores de los atributos de ese objeto a los atributos de un nuevo objeto de tipo CentroEjercicio.
		 *
		 *
	
	/**

	Constructor de copia de la clase CentroEjercicio. Crea un objeto CentroEjercicio que es una copia del objeto especificado.
	@param centro El objeto CentroEjercicio a copiar.
	*/
	public CentroEjercicio(CentroEjercicio centro) {
	this.nombreCentro = centro.nombreCentro;
	this.telefono = centro.telefono;
	this.direccion = centro.direccion;
	this.numCuentas = centro.numCuentas;
		this.cuentas = centro.cuentas;
	}
	
	public String getNombreCentro() {
		return nombreCentro;
	}
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumCuentas() {
		return numCuentas;
	}
	public void setNumCuentas(int numCuentas) {
		this.numCuentas = numCuentas;
	}
	public Cuenta[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "CentroEjercicio\nnombreCentro = " + nombreCentro + "\ntelefono = " + telefono + "\ndireccion = " + direccion
				+ "\nnumCuentas = " + numCuentas + "\ncuentas = " + Arrays.toString(cuentas);
	}
	
	
	
}