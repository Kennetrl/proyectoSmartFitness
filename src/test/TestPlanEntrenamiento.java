package test;

import dominio.Ejercicio;
import dominio.PlanEntrenamiento;

public class TestPlanEntrenamiento {
	public static void main(String []args) {
		
		PlanEntrenamiento planEntrenamiento= new PlanEntrenamiento();
		planEntrenamiento.crearItemEjercicio(1, null,  5, 2);
		planEntrenamiento.crearItemEjercicio(2, null,  2, 10);
		planEntrenamiento.crearItemEjercicio(3, null,  4, 4);
		
		System.out.println(planEntrenamiento.listarItemsEjercicio());
		System.out.println(planEntrenamiento.buscarItemsEjercicio(2));
		System.out.println("");
		planEntrenamiento.editarItemsEjercicio(2, 2, null, 3, 3);
		System.out.println(planEntrenamiento.listarItemsEjercicio());
		planEntrenamiento.eliminarItemsEjercicio(3);
		System.out.println(planEntrenamiento.listarItemsEjercicio());
		
		planEntrenamiento.crearEntrenador(1, "Mario", "mario@hotmail.com", "12345", true);
		planEntrenamiento.crearEntrenador(2, "Alex", "alex@hotmail.com", "542", true);
		planEntrenamiento.crearEntrenador(3, "Pedro", "pedro@hotmail.com", "1231231", true);
		System.out.println("");
		System.out.println(planEntrenamiento.listarEntrenadores());
		System.out.println(planEntrenamiento.buscarEntrenadores(2));
		System.out.println("");
		System.out.println(planEntrenamiento.listarEntrenadores());
		planEntrenamiento.editarEntrenadores(1, 1, "Julian", "julian@hotmail.com", "12345", true);
		System.out.println(planEntrenamiento.listarEntrenadores());
		planEntrenamiento.eliminarEntrenadores(3);
		System.out.println(planEntrenamiento.listarEntrenadores());
		
		planEntrenamiento.crearProgreso(1, 5, 65.00, true);
		planEntrenamiento.crearProgreso(2, 15, 65.00, true);
		planEntrenamiento.crearProgreso(3, 20, 70.00, true);
		System.out.println("");
		System.out.println(planEntrenamiento.listarProgreso());
		System.out.println(planEntrenamiento.buscarProgreso(3));
		System.out.println("");
		System.out.println(planEntrenamiento.listarProgreso());
		planEntrenamiento.editarProgreso(2, 2, 18, 64.5, true);
		System.out.println(planEntrenamiento.listarProgreso());
		planEntrenamiento.eliminarProgreso(3);
		System.out.println(planEntrenamiento.listarProgreso());
	}
}
