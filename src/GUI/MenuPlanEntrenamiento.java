package GUI;

import java.util.Scanner;

public class MenuPlanEntrenamiento {
	public static void planEntrenamientoOpciones() {
		Scanner leer = new Scanner(System.in);	
		System.out.println("========================");
		System.out.println("1 - Crear Plan de Entrenamiento");
		System.out.println("2 - Modificar Plan de Entrenamiento");
		System.out.println("3 - Consultar Plan de Entrenamiento");
		System.out.println("4 - Eliminar Plan de Entrenamiento");
		System.out.println("5 - SALIR");
		System.out.println("========================");
		String opcion = leer.next();
	}
}
