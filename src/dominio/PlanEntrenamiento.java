package dominio;

import java.util.Arrays;

/**
 * Esta clase representa un plan de entrenamiento, el cual contiene los elementos necesarios para llevar a cabo un entrenamiento. 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango 
 * @author Kennet Rodriguez
 */

public class PlanEntrenamiento {

	private int id;
	private String nombrePlanEntrenamiento;
	private double tiempoEmpleado;
	private int repeticion;
	private String nombreRutina;
	private ItemEjercicio items[];
	private int numItems;
	private Entrenador entrenadores[];
	private int numEntrenadores;
	private ProgresoUsuario progresos[];
	private int numProgresos;
	
	public PlanEntrenamiento() {
		id = 1;
		nombrePlanEntrenamiento = "Adelgazar";
		tiempoEmpleado = 1;
		repeticion = 1;
		nombreRutina = "Mind & Body";
		items = new ItemEjercicio[1];
		numItems = 1;
		entrenadores = new Entrenador[1];
		numEntrenadores = 1;
		progresos = new ProgresoUsuario[1];
		numProgresos = 1;
	}

	public PlanEntrenamiento(int id, String nombrePlanEntrenamiento, double tiempoEmpleado, int repeticion, String nombreRutina, ItemEjercicio items[], int numItems, Entrenador entrenadores[], int numEntrenadores, ProgresoUsuario progresos[], int numProgresos) {
		this.id = id;
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
		this.tiempoEmpleado = tiempoEmpleado;
		this.repeticion = repeticion;
		this.nombreRutina = nombreRutina;
		this.items=items;
		this.numItems=numItems;
		this.entrenadores=entrenadores;
		this.numEntrenadores=numEntrenadores;
		this.progresos=progresos;
		this.numProgresos=numProgresos;
	}

	public PlanEntrenamiento(PlanEntrenamiento plan) {
		this.id = plan.id;
		this.nombrePlanEntrenamiento = plan.nombrePlanEntrenamiento;
		this.tiempoEmpleado = plan.tiempoEmpleado;
		this.repeticion = plan.repeticion;
		this.nombreRutina = plan.nombreRutina;
		this.items = plan.items;
		this.numItems = plan.numItems;
		this.entrenadores = plan.entrenadores;
		this.numEntrenadores = plan.numEntrenadores;
		this.progresos = plan.progresos;
		this.numProgresos = plan.numProgresos;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePlanEntrenamiento() {
		return nombrePlanEntrenamiento;
	}

	public void setNombrePlanEntrenamiento(String nombrePlanEntrenamiento) {
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
	}

	public double getTiempoEmpleado() {
		return tiempoEmpleado;
	}

	public void setTiempoEmpleado(double tiempoEmpleado) {
		this.tiempoEmpleado = tiempoEmpleado;
	}

	public int getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(int repeticion) {
		this.repeticion = repeticion;
	}

	public String getNombreRutina() {
		return nombreRutina;
	}

	public void setNombreRutina(String nombreRutina) {
		this.nombreRutina = nombreRutina;
	}

	public ItemEjercicio[] getItems() {
		return items;
	}

	public void setItems(ItemEjercicio[] items) {
		this.items = items;
	}

	public int getNumItems() {
		return numItems;
	}

	public void setNumItems(int numItems) {
		this.numItems = numItems;
	}

	public Entrenador[] getEntrenadores() {
		return entrenadores;
	}

	public void setEntrenadores(Entrenador[] entrenadores) {
		this.entrenadores = entrenadores;
	}

	public int getNumEntrenadores() {
		return numEntrenadores;
	}

	public void setNumEntrenadores(int numEntrenadores) {
		this.numEntrenadores = numEntrenadores;
	}

	public ProgresoUsuario[] getProgresos() {
		return progresos;
	}

	public void setProgresos(ProgresoUsuario[] progresos) {
		this.progresos = progresos;
	}

	public int getNumProgresos() {
		return numProgresos;
	}

	public void setNumProgresos(int numProgresos) {
		this.numProgresos = numProgresos;
	}

	@Override
	public String toString() {
		return "PlanEntrenamiento [id = " + id + ", nombrePlanEntrenamiento = " + nombrePlanEntrenamiento
				+ ", tiempoEmpleado = " + tiempoEmpleado + " minutos" +", repeticion = " + repeticion + " veces" +", nombreRutina = " + nombreRutina
				+ ", items = " + Arrays.toString(items) + ", numItems = " + numItems + ", entrenadores = "
				+ Arrays.toString(entrenadores) + ", numEntrenadores = " + numEntrenadores + ", progresos = "
				+ Arrays.toString(progresos) + ", numProgresos = " + numProgresos + "]";
	}
	
	 public void crearItemEjercicio(int id, Ejercicio[] ejercicios, int repeticion, int numEjercicios) {
		 if (numItems == items.length) {
	     ItemEjercicio[] aux = new ItemEjercicio[items.length + 1];
	     System.arraycopy(items, 0, aux, 0, numItems);
	     items = aux;
	     }
	     int i = numItems++;
	     items[i] = new ItemEjercicio(id, ejercicios, repeticion, numEjercicios);
	 }

	public String listarItemsEjercicio() {
		String lista = "";
		System.out.println("Lista de los items ejercicios");
		for (ItemEjercicio item : items) {
			if (item != null) {
				lista += item + "\r\n";
		    }
		}
		        return lista;
	}
	public ItemEjercicio buscarItemsEjercicio(int posicion) {
		System.out.println("Ejercicio " + posicion + " a consultar: ");
		return items[posicion];
	}
	public void editarItemsEjercicio(int posicion, int id, Ejercicio[] ejercicios, int repeticion, int numEjercicios) {
		System.out.println("El item del ejercicio N"+ posicion + " ha sido editada");
		 items[posicion] = new ItemEjercicio(id, ejercicios, repeticion, numEjercicios);
	 }
	 
	public void eliminarItemsEjercicio(int posicion) {
			ItemEjercicio aux[] = new ItemEjercicio[items.length - 1];
		 if (posicion > 0) {
		 System.arraycopy(items, 0, aux, 0, posicion);
		 }
		 if (aux.length > posicion) {
		 System.arraycopy(items, posicion + 1, aux, posicion, aux.length - posicion);
		 }
		 items = new ItemEjercicio[aux.length];
		 System.arraycopy(aux, 0, items, 0, aux.length);
		 numItems--;
		 }

	 public void borrarItemsEjercicio(int posicion) {
		 if (numItems >= items.length) {
			for (int i = 0; i < items.length; i++) {
				if (i == posicion) {
					eliminarItemsEjercicio(i);
				}
			}
		}
	}
	
	
	//entrenador
	public void crearEntrenador(int id, String nombre, String correo, String contrasenia, boolean certificadoProfesional) {
		 if (numEntrenadores == entrenadores.length) {
		 Entrenador[] aux = new Entrenador[entrenadores.length + 1];
	     System.arraycopy(entrenadores, 0, aux, 0, numEntrenadores);
	     entrenadores= aux;
	     }
	     int i = numEntrenadores++;
	     entrenadores[i] = new Entrenador(id, nombre, correo, contrasenia, certificadoProfesional);
	 }

	public String listarEntrenadores() {
		String lista = "";
		System.out.println("Lista de los entrenadores");
		for (Entrenador entrenador : entrenadores) {
			if (entrenador != null) {
				lista += entrenador + "\r\n";
		    }
		}
		        return lista;
	}
	public Entrenador buscarEntrenadores(int posicion) {
		System.out.println("Entrenador " + posicion + " a consultar: ");
		return entrenadores[posicion];
	}
	public void editarEntrenadores(int posicion, int id, String nombre, String correo, String contrasenia, boolean certificadoProfesional) {
		System.out.println("El entrenador N"+ posicion + " ha sido editado");
		entrenadores[posicion] = new Entrenador(id, nombre, correo, contrasenia, certificadoProfesional);
	 }
	 
	public void eliminarEntrenadores(int posicion) {
		Entrenador aux[] = new Entrenador[entrenadores.length - 1];
	 if (posicion > 0) {
	 System.arraycopy(entrenadores, 0, aux, 0, posicion);
	 }
	 if (aux.length > posicion) {
	 System.arraycopy(entrenadores, posicion + 1, aux, posicion, aux.length - posicion);
	 }
	 entrenadores = new Entrenador[aux.length];
	 System.arraycopy(aux, 0, entrenadores, 0, aux.length);
	 numEntrenadores--;
	 }

	 public void borrarEntrenadores(int posicion) {
		 if (numEntrenadores >= entrenadores.length) {
			for (int i = 0; i < entrenadores.length; i++) {
				if (i == posicion) {
					eliminarEntrenadores(i);
				}
			}
		}
	}
	
	//Progresos
	public void crearProgreso(int id, int fecha, double peso, boolean logrosAlcanzados) {
		 if (numProgresos == progresos.length) {
		 ProgresoUsuario[] aux = new ProgresoUsuario[progresos.length + 1];
	     System.arraycopy(progresos, 0, aux, 0, numProgresos);
	     progresos= aux;
	     }
	     int i = numProgresos++;
	     progresos[i] = new ProgresoUsuario(id, fecha, peso, logrosAlcanzados);
	 }

	public String listarProgreso() {
		String lista = "";
		System.out.println("Lista de los logros alcanzados");
		for (ProgresoUsuario logro : progresos) {
			if (logro != null) {
				lista += logro + "\r\n";
		    }
		}
		        return lista;
	}
	public ProgresoUsuario buscarProgreso(int posicion) {
		System.out.println("Logro " + posicion + " a buscar: ");
		return progresos[posicion];
	}
	public void editarProgreso(int posicion, int id, int fecha, double peso, boolean logrosAlcanzados) {
		System.out.println("El progreso N"+ posicion + " ha sido editado");
		progresos[posicion] = new ProgresoUsuario(id, fecha, peso, logrosAlcanzados);
	 }
	 
	public void eliminarProgreso(int posicion) {
		ProgresoUsuario aux[] = new ProgresoUsuario[progresos.length - 1];
	 if (posicion > 0) {
	 System.arraycopy(progresos, 0, aux, 0, posicion);
	 }
	 if (aux.length > posicion) {
	 System.arraycopy(progresos, posicion + 1, aux, posicion, aux.length - posicion);
	 }
	 progresos = new ProgresoUsuario[aux.length];
	 System.arraycopy(aux, 0, progresos, 0, aux.length);
	 numProgresos--;
	 }

	 public void borrarProgreso(int posicion) {
		 if (numProgresos >= progresos.length) {
			for (int i = 0; i < progresos.length; i++) {
				if (i == posicion) {
					eliminarProgreso(i);
				}
			}
		}
	}
}