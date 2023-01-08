package test;

import dominio.PlanEntrenamiento;

public class TestPlanEntrenamiento {
	public static void main(String []args) {
		
		PlanEntrenamiento planEntrenamiento= new PlanEntrenamiento();
		planEntrenamiento.crearItemEjercicio(1, null,  5, 2);
		planEntrenamiento.crearItemEjercicio(2, null,  2, 10);
		planEntrenamiento.crearItemEjercicio(3, null,  4, 4);
		
		System.out.println(planEntrenamiento.listarItemsEjercicio());
		System.out.println(planEntrenamiento.buscarEjercicio(2));
		
		planEntrenamiento.crearEntrenador(1, "Mario", "mario@hotmail.com", "12345", true);
		planEntrenamiento.crearEntrenador(2, "Alex", "alex@hotmail.com", "542", true);
		planEntrenamiento.crearEntrenador(3, "Pedro", "pedro@hotmail.com", "1231231", true);
		System.out.println("");
		System.out.println(planEntrenamiento.listarEntrenadores());
		System.out.println(planEntrenamiento.buscarEntrenadores(2));
		
		planEntrenamiento.crearProgreso(1, 5, 1.70, true);
		planEntrenamiento.crearProgreso(2, 15, 1.68, true);
		planEntrenamiento.crearProgreso(3, 20, 1.67, true);
		System.out.println("");
		System.out.println(planEntrenamiento.listarProgreso());
		System.out.println(planEntrenamiento.buscarProgreso(3));
		
	}
}
