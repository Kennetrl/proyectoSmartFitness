package dominio;

import java.util.Arrays;

/**
 * @author  Rodney Andrade
 * @author  Marlon Argoti
 * @author  Vanessa Heredia
 * @author  Jonathan Planza
 * @author  Vinicio Matango
 * @author  Kennet Rodriguez
 */
public class ItemEjercicio {
	
	private int id;
	private Ejercicio ejercicios[];
	private int repeticion;
	private int numEjercicios;

	public ItemEjercicio() {
		id = 1;
		ejercicios = new Ejercicio[1];
		numEjercicios = 1;
		repeticion = 1;
	}
	
	public ItemEjercicio(int id, Ejercicio ejercicios[], int repeticion, int numEjercicios) {
		this.id=id;
		this.ejercicios = ejercicios;
		this.repeticion = repeticion;
		this.numEjercicios = numEjercicios;
	}

	public ItemEjercicio(ItemEjercicio item) {
		this.id = item.id;
		this.ejercicios = item.ejercicios;
		this.repeticion = item.repeticion;
		this.numEjercicios = item.numEjercicios;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
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
		return "ItemEjercicio [id=" + id + ", ejercicios=" + Arrays.toString(ejercicios) + ", repeticion=" + repeticion
				+ ", numEjercicios=" + numEjercicios + "]";
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
		System.out.println("Lista de Ejercicios");
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
		 System.out.println("El ejercicio N"+ posicion + " ha sido eliminada");
		 ejercicios[posicion]=null;
	 }
	
}