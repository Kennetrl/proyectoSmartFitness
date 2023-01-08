package dominio;
import java.util.Arrays;
	/** 
	* @author Rodney Andrade
	* @author Marlon Argoti
	* @author Vanessa Heredia
	* @author Jonathan Planza
	* @author Vinicio Matango
	* @author Kennet Rodriguez
	*/
	
public class CentroEjercicio {
	private String nombreCentro;
	private String telefono;
	private String direccion;
	private Cuenta cuentas[];
	private int numCuentas;
	private Ejercicio ejercicios[];
	private int numEjercicios;

	public CentroEjercicio() {
		this.nombreCentro="Smart Fitness";
		this.telefono="+593 99 999 9999";
		this.direccion="Quito, Ecuador";
		this.cuentas = new Cuenta[3];
		this.numCuentas=1;
		this.ejercicios= new Ejercicio[3];
		this.numEjercicios=1;
	}
	
	public CentroEjercicio(String nombreCentro, String telefono, String direccion, Cuenta cuentas[], int numCuentas, Ejercicio ejercicios[], int numEjercicios) {
		this.nombreCentro = nombreCentro;
		this.telefono=telefono;
		this.direccion=direccion;
		this.cuentas = cuentas;
		this.numCuentas=numCuentas;
		this.ejercicios=ejercicios;
		this.numEjercicios=numEjercicios;
	}

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
	
	public Ejercicio[] getEjercicios() {
		return ejercicios;
	}

	public void setEjercicios(Ejercicio[] ejercicios) {
		this.ejercicios = ejercicios;
	}

	public int getNumEjercicios() {
		return numEjercicios;
	}

	public void setNumEjercicios(int numEjercicios) {
		this.numEjercicios = numEjercicios;
	}

	@Override
	public String toString() {
		return "CentroEjercicio\nnombreCentro=" + nombreCentro + "\ntelefono=" + telefono + "\ndireccion=" + direccion
				+ "\ncuentas=" + Arrays.toString(cuentas) + "\nnumCuentas=" + numCuentas + "\nejercicios="
				+ Arrays.toString(ejercicios) + "\nnumEjercicios=" + numEjercicios + "\n";
	}

	public void crearCuenta(int id, String nombre, String correo, String contrasenia) {
        if (numCuentas == cuentas.length) {
            Cuenta[] aux = new Cuenta[cuentas.length + 1];
            System.arraycopy(cuentas, 0, aux, 0, numCuentas);
            
            cuentas = aux;
        }
        int i = numCuentas++;
        cuentas[i] = new Cuenta(id, nombre, correo, contrasenia);
    }

	public String listarCuenta() {
	        String lista = "";
	        for (Cuenta cuentas : cuentas) {
	            if (cuentas != null) {
	                lista += cuentas + "\r\n";
	            }
	        }
	        return lista;
	   }
	 public Cuenta buscarCuenta(int posicion) {
	        return cuentas[posicion];
	    }
	 
	 public void crearEjercicio(int id, String nombre, String tipoEjercicio) {
		 if (numEjercicios == ejercicios.length) {
	     Ejercicio[] aux = new Ejercicio[ejercicios.length + 1];
	     System.arraycopy(ejercicios, 0, aux, 0, numEjercicios);
	     ejercicios = aux;
	     }
	     int i = numEjercicios++;
	     ejercicios[i] = new Ejercicio(id, nombre, tipoEjercicio);
	 }

	public String listarEjercicio() {
		String lista = "";
		for (Ejercicio ejercicio : ejercicios) {
			if (ejercicio != null) {
				lista += ejercicio + "\r\n";
		    }
		}
		        return lista;
	}
	public Ejercicio buscarEjercicio(int posicion) {
		return ejercicios[posicion];
	}
	
}