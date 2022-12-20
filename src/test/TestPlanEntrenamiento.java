package test;

import dominio.PlanEntrenamiento;

public class TestPlanEntrenamiento {
	public static void main(String []args) {
		PlanEntrenamiento planEntrenamiento= new PlanEntrenamiento();
		planEntrenamiento.setId(1);;
		planEntrenamiento.setNombrePlanEntrenamiento("Aumento de Masa Muscular");;
		
		imprimir(planEntrenamiento);
	}
	public static void imprimir(PlanEntrenamiento planEntrenamiento) {	
		System.out.println(planEntrenamiento);
	}
	
}
