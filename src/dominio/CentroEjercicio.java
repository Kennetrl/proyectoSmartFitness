package dominio;
import java.util.Arrays;
/**
*Esta clase representa el Centro de Ejercicio
*@author Rodney Andrade
*@author Marlon Argoti
*@author Vanessa Heredia
*@author Jonathan Planza
*@author Vinicio Matango
*@author Kennet Rodriguez
*/
public class CentroEjercicio {
	private String nombreCentro;
	private String telefono;
	private String direccion;
	private Usuario usuarios[];
	private int numUsuarios;
	private Ejercicio ejercicios[];
	private int numEjercicios;

	public CentroEjercicio() {
		this.nombreCentro="Smart Fitness";
		this.telefono="+593 99 999 9999";
		this.direccion="Quito, Ecuador";
		this.usuarios = new Usuario[3];
		this.numUsuarios=1;
		this.ejercicios= new Ejercicio[3];
		this.numEjercicios=1;
	}
	
	public CentroEjercicio(String nombreCentro, String telefono, String direccion, Usuario[] usuarios, int numUsuarios, Ejercicio ejercicios[], int numEjercicios) {
		this.nombreCentro = nombreCentro;
		this.telefono=telefono;
		this.direccion=direccion;
		this.usuarios = usuarios;
		this.numUsuarios=numUsuarios;
		this.ejercicios=ejercicios;
		this.numEjercicios=numEjercicios;
	}

	public CentroEjercicio(CentroEjercicio centro) {
		this.nombreCentro = centro.nombreCentro;
		this.telefono = centro.telefono;
		this.direccion = centro.direccion;
		this.numUsuarios = centro.numUsuarios;
		this.usuarios = centro.usuarios;
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
	public int getNumUsuarios() {
		return numUsuarios;
	}
	public void setNumUsuarios(int numUsuarios) {
		this.numUsuarios = numUsuarios;
	}
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
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
		return "CentroEjercicio [nombreCentro=" + nombreCentro + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", usuarios=" + Arrays.toString(usuarios) + ", numUsuarios=" + numUsuarios + ", ejercicios="
				+ Arrays.toString(ejercicios) + ", numEjercicios=" + numEjercicios + "]";
	}

	public void crearUsuario(int id, String nombre, String correo, String contrasenia, Cuenta cuentas[], int numCuentas) {
        if (numUsuarios == usuarios.length) {
            Usuario[] aux = new Usuario[usuarios.length + 1];
            System.arraycopy(usuarios, 0, aux, 0, numUsuarios);
            
            usuarios = aux;
        }
        int i = numUsuarios++;
        usuarios[i] = new Usuario(id, nombre, correo, contrasenia, cuentas, numCuentas);
    }

	public String listarUsuario() {
	        String lista = "";
	        for (Usuario usuario : usuarios) {
	            if (usuario != null) {
	                lista += usuario + "\r\n";
	            }
	        }
	        return lista;
	   }
	 public Usuario buscarUsuario(int posicion) {
	        return usuarios[posicion];
	    }
	 
	 public void editarUsuario(int posicion, int id, String nombre, String correo, String contrasenia, Cuenta cuentas[], int numCuentas) {
		 System.out.println("El usuario N"+ posicion + " ha sido editado");
		 usuarios[posicion] = new Usuario(id, nombre, correo, contrasenia, cuentas, numCuentas);
	 }
	 
	 public void eliminarUsuario(int posicion) {
		 Usuario aux[] = new Usuario[usuarios.length - 1];
		 if (posicion > 0) {
		 System.arraycopy(usuarios, 0, aux, 0, posicion);
		 }
		 if (aux.length > posicion) {
		 System.arraycopy(usuarios, posicion + 1, aux, posicion, aux.length - posicion);
		 }
		 usuarios = new Usuario[aux.length];
		 System.arraycopy(aux, 0, usuarios, 0, aux.length);
		 numUsuarios--;
		 }

	 public void borrarUsuario(int posicion) {
		 if (numUsuarios >= usuarios.length) {
			for (int i = 0; i < usuarios.length; i++) {
				if (i == posicion) {
					eliminarUsuario(i);
				}
			}
		}
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
		System.out.println("Ejercicio N"+ posicion + " a encontrar");
		return ejercicios[posicion];
	}
	public void editarEjercicio(int posicion, int id, String nombre, String tipoEjercicio) {
		System.out.println("El ejercicio N"+ posicion + " ha sido editada");
		 ejercicios[posicion] = new Ejercicio(id, nombre, tipoEjercicio);
	 }
	 
	 
	 public void eliminarEjercicio(int posicion) {
		 Ejercicio aux[] = new Ejercicio[ejercicios.length - 1];
		 if (posicion > 0) {
		 System.arraycopy(ejercicios, 0, aux, 0, posicion);
		 }
		 if (aux.length > posicion) {
		 System.arraycopy(ejercicios, posicion + 1, aux, posicion, aux.length - posicion);
		 }
		 ejercicios = new Ejercicio[aux.length];
		 System.arraycopy(aux, 0, ejercicios, 0, aux.length);
		 numEjercicios--;
		 }

	 public void borrarEjercicio(int posicion) {
		 if (numEjercicios >= ejercicios.length) {
			for (int i = 0; i < ejercicios.length; i++) {
				if (i == posicion) {
					eliminarEjercicio(i);
				}
			}
		}
	}
	
}