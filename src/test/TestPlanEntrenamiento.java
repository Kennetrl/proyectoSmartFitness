package test;

import dominio.PlanEntrenamiento;

public class TestPlanEntrenamiento {
	public static void main(String []args) {
		
		PlanEntrenamiento planEntrenamiento= new PlanEntrenamiento();
		planEntrenamiento.setId(1);;
		planEntrenamiento.setNombrePlanEntrenamiento("Subir de Peso");;
		planEntrenamiento.setTiempoEmpleado(5.00);
		planEntrenamiento.setRepeticion(5);
		planEntrenamiento.setNombreRutina("Steel Body");
		imprimir(planEntrenamiento);
	}
	
	public static void imprimir(PlanEntrenamiento planEntrenamiento) {	
		System.out.println(planEntrenamiento);
	}
	
}
