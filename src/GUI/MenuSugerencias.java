package GUI;

import java.util.Scanner;

public class MenuSugerencias {
	public static void sugerenciasOpciones() {
		Scanner leer = new Scanner(System.in);	
		System.out.println("========================");
		System.out.println("1 - Crear Sugerencia");
		System.out.println("2 - Modificar Sugerencia");
		System.out.println("3 - Consultar Sugerencia");
		System.out.println("4 - Eliminar Sugerencia");
		System.out.println("5 - SALIR");
		System.out.println("========================");
		String opcion = leer.next();
	}
}
