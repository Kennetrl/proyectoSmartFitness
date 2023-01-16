package dominio;

import java.util.Arrays;

/**
 * Esta clase permite crear objetos tipo Cuenta con los atributos id, nombre, correo y contraseña.
 * 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class Usuario{
	
	//atributos
	private int id;
	private String nombre;
	private String correo;
	private String contrasenia;
	private Cuenta cuentas[];
	private int numCuentas;
	

	public Usuario(){
		id=1;
		nombre = "Juan";
		correo = "juan@hotmail.com";
		contrasenia = "juanito123";
		cuentas = new Cuenta[1];
		numCuentas = 1;
	}
	
	public Usuario(int id, String nombre, String correo, String contrasenia, Cuenta cuentas[], int numCuentas) {
		this.id=id;
		this.nombre=nombre;
		this.correo=correo;
		this.contrasenia=contrasenia;
		this.cuentas=cuentas;
		this.numCuentas=numCuentas;
	}

	public Usuario(Usuario usuario) {
		this.id=usuario.id;
		this.nombre=usuario.nombre;
		this.correo=usuario.correo;
		this.contrasenia=usuario.contrasenia;
		this.cuentas=usuario.cuentas;
		this.numCuentas=usuario.numCuentas;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}
	
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public String getContrasenia() {
		return contrasenia;
	}
	
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public int getNumCuentas() {
		return numCuentas;
	}

	public void setNumCuentas(int numCuentas) {
		this.numCuentas = numCuentas;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", contrasenia=" + contrasenia
				+ ", cuentas=" + Arrays.toString(cuentas) + ", numCuentas=" + numCuentas + "]";
	}

	public void crearCuentas(int id, String tipoEnfermedad, int edad, double peso, double altura, Sugerencia sugerencias[], int numSugerencia, PlanEntrenamiento planes[], int numPlanes) {
		if (numCuentas == cuentas.length) {
	        Cuenta[] aux = new Cuenta[cuentas.length + 1];
	        System.arraycopy(cuentas, 0, aux, 0, numCuentas);
	        	cuentas = aux;
	        }
	        int i = numCuentas++;
	        cuentas[i] = new Cuenta(id, tipoEnfermedad, edad, peso, altura, sugerencias, numSugerencia, planes, numPlanes);
	    }

	public String listarCuenta() {
		String lista = "";
		System.out.println("Lista de cuentas");
		for (Cuenta cuenta : cuentas) {
			if (cuenta != null) {
		    	 lista += cuenta + "\r\n";
		        }
			}
		return lista;
	}
	public Cuenta consultarCuentas(int posicion) {
		System.out.println("Cuenta N" + posicion + " a consultar: ");
			return cuentas[posicion];
	}
	public void editarCuentas(int posicion, int id, String tipoEnfermedad, int edad, double peso, double altura, Sugerencia sugerencias[], int numSugerencia, PlanEntrenamiento planes[], int numPlanes) {
		System.out.println("La cuenta N"+ posicion + " ha sido editada");
		cuentas[posicion] = new Cuenta(id, tipoEnfermedad, edad, peso, altura, sugerencias, numSugerencia, planes, numPlanes);
	 }
	 
	public void eliminarCuentas(int posicion) {
		 Cuenta aux[] = new Cuenta[cuentas.length - 1];
		 if (posicion > 0) {
		 System.arraycopy(cuentas, 0, aux, 0, posicion);
		 }
		 if (aux.length > posicion) {
		 System.arraycopy(cuentas, posicion + 1, aux, posicion, aux.length - posicion);
		 }
		 cuentas = new Cuenta[aux.length];
		 System.arraycopy(aux, 0, cuentas, 0, aux.length);
		 numCuentas--;
		 }

	 public void borrarCuentas(int posicion) {
		 if (numCuentas >= cuentas.length) {
			for (int i = 0; i < cuentas.length; i++) {
				if (i == posicion) {
					eliminarCuentas(i);
				}
			}
		}
	}

}