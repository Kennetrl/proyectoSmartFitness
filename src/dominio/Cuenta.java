package dominio;

import java.util.Arrays;

/**
 * Clase para crear los objetos cuenta
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class Cuenta{
	private int id;
	private String tipoEnfermedad;
	private int edad;
	private double peso;
	private double altura;
	private Sugerencia sugerencias[];
	private int numSugerencias;
	private PlanEntrenamiento planes[];
	private int numPlanes;

	public Cuenta() {
		tipoEnfermedad="Ninguna";
		edad=19;
		peso=80.5;
		altura=1.70;
		sugerencias = new Sugerencia[2];
		numSugerencias = 1;
		planes = new PlanEntrenamiento[5];
		numPlanes = 1;
	}

	public Cuenta(int id, String tipoEnfermedad, int edad, double peso, double altura, Sugerencia sugerencias[], int numSugerencias, PlanEntrenamiento planes[], int numPlanes) {
		this.id = id;
		this.tipoEnfermedad=tipoEnfermedad;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
		this.sugerencias=sugerencias;
		this.numSugerencias=numSugerencias;
		this.planes=planes;
		this.numPlanes=numPlanes;
	}
	public Cuenta(Cuenta cuenta) {
		this.id = cuenta.id;
		this.tipoEnfermedad=cuenta.tipoEnfermedad;
		this.edad=cuenta.edad;
		this.peso=cuenta.peso;
		this.altura=cuenta.altura;
		this.sugerencias=cuenta.sugerencias;
		this.numSugerencias=cuenta.numSugerencias;
		this.planes=cuenta.planes;
		this.numPlanes=cuenta.numPlanes;
	}

	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}

	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public Sugerencia[] getSugerencias() {
		return sugerencias;
	}

	public void setSugerencias(Sugerencia[] sugerencias) {
		this.sugerencias = sugerencias;
	}

	public int getNumSugerencias() {
		return numSugerencias;
	}

	public void setNumSugerencias(int numSugerencias) {
		this.numSugerencias = numSugerencias;
	}

	public PlanEntrenamiento[] getPlanes() {
		return planes;
	}

	public void setPlanes(PlanEntrenamiento[] planes) {
		this.planes = planes;
	}

	public int getNumPlanes() {
		return numPlanes;
	}

	public void setNumPlanes(int numPlanes) {
		this.numPlanes = numPlanes;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", tipoEnfermedad=" + tipoEnfermedad + ", edad=" + edad + ", peso=" + peso
				+ ", altura=" + altura + ", sugerencias=" + Arrays.toString(sugerencias) + ", numSugerencias="
				+ numSugerencias + ", planes=" + Arrays.toString(planes) + ", numPlanes=" + numPlanes + "]";
	}

	public void crearPlanes(int id, String nombrePlanEntrenamiento, double tiempoEmpleado, int repeticion, String nombreRutina, ItemEjercicio items[], int numItems, Entrenador entrenadores[], int numEntrenadores, ProgresoUsuario progresos[], int numProgresos) {
		if (numPlanes == planes.length) {
	        PlanEntrenamiento[] aux = new PlanEntrenamiento[planes.length + 1];
	        System.arraycopy(planes, 0, aux, 0, numPlanes);
	          planes = aux;
	        }
	        int i = numPlanes++;
	        planes[i] = new PlanEntrenamiento(id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
	    }

	public String listarPlanes() {
		String lista = "";
		System.out.println("Lista de los Planes de Entrenamiento");
		for (PlanEntrenamiento plan : planes) {
			if (plan != null) {
		    	 lista += plan + "\r\n";
		        }
			}
		return lista;
	}
	public PlanEntrenamiento consultarPlanes(int posicion) {
		System.out.println("Plan N" + posicion + " a consultar: ");
			return planes[posicion];
	}
	public void editarPlanes(int posicion, int id, String nombrePlanEntrenamiento, double tiempoEmpleado, int repeticion, String nombreRutina, ItemEjercicio items[], int numItems, Entrenador entrenadores[], int numEntrenadores, ProgresoUsuario progresos[], int numProgresos) {
		System.out.println("El plan de entrenamiento N"+ posicion + " ha sido editada");
		 planes[posicion] = new PlanEntrenamiento(id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
	 }
	 
	 public void eliminarPlanes(int posicion) {
		 System.out.println("El plan de entrenamiento N"+ posicion + " ha sido eliminada");
		 planes[posicion]=null;
	 }

	public void crearSugerencia(int id, String comentario) {
		if (numSugerencias == sugerencias.length) {
			Sugerencia[] aux = new Sugerencia[sugerencias.length + 1];
			System.arraycopy(sugerencias, 0, aux, 0, numSugerencias);
			sugerencias = aux;
		}
	int i = numSugerencias++;
	sugerencias[i] = new Sugerencia(id, comentario);
	}

	public String listarSugerencia() {
		String lista = "";
		for (Sugerencia sugerencia : sugerencias) {
			if (sugerencia != null) {
				lista += sugerencia + "\r\n";
			}
		}
		return lista;
	}
	public Sugerencia consultarSugerencia(int posicion) {
		System.out.println("Sugerencia N" + posicion + " a consultar: ");
		return sugerencias[posicion];
	}
	public void editarSugerencia(int posicion, int id, String comentario) {
		System.out.println("La sugerencia N"+ posicion + " ha sido editada");
		 sugerencias[posicion] = new Sugerencia(id, comentario);
	 }
	 
	 public void eliminarSugerencia(int posicion) {
		 System.out.println("La sugerencia N"+ posicion + " ha sido eliminada");
		 sugerencias[posicion]=null;
	 }
	
}