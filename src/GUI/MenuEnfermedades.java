package GUI;

import java.util.Scanner;

public class MenuEnfermedades {
	public static String enfermedad;
	public static void enfermedadesOpciones() {
		Scanner leer = new Scanner(System.in);	
		System.out.println("========================");
		System.out.println("1 - Ingresar Enfermedades");
		System.out.println("2 - Modificar Enfermedades");
		System.out.println("3 - Eliminar Enfermedades");
		System.out.println("4 - SALIR");
		System.out.println("========================");
		String opcion = leer.next();
		
		switch(opcion) {
		case "1":
			ingresarEnfermedades();
			break;
		case "2":
			modificarEnfermedades();
			break;
		case "3":
			eliminarEnfermedades();
			break;
		}
	}
	
	public static void ingresarEnfermedades() {
		Scanner leer = new Scanner(System.in);		
		System.out.println("¿Tiene algún tipo de enfermedad que afecte el rendimiento fisico?");
		System.out.println("1 - Si");
		System.out.println("2 - No");
		String opcion = leer.next();
		if(opcion.equals("1")) {
			System.out.println("Ingrese el nombre de su enfermedad");
			enfermedad = leer.next();
			System.out.println("La enfermedad " + enfermedad + " ha sido registrada");
			
		} else if(opcion.equals("2")) {
			System.out.println("Enfermedad: Ninguna");
			enfermedad = "Ninguna";
		} else {
			System.out.println("Opción incorrecta");
		}
		
	}
	
	public static void modificarEnfermedades() {
		System.out.println("Editar enfermedad");
		Scanner leer = new Scanner(System.in);
		enfermedad = leer.next();
	}
	
	public static void eliminarEnfermedades() {
		Scanner leer = new Scanner(System.in);		
		System.out.println("¿Desea eliminar la enfermedad?");
		System.out.println("1 - Si");
		System.out.println("2 - No");
		String opcion = leer.next();
		if(opcion.equals("1")) {
			System.out.println("La enfermedad " + enfermedad + " ha sido eliminar");
			enfermedad = "Ninguna";
		} else if(opcion.equals("2")) {
			System.out.println("No se eliminio la enfermedad");
		} else {
			System.out.println("Opción incorrecta");
		}
		
	}
	
}
