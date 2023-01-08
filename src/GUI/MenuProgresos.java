package GUI;

import java.util.Scanner;

public class MenuProgresos {
	public static void progresosOpciones() {
		Scanner leer = new Scanner(System.in);	
		System.out.println("========================");
		System.out.println("1 - Registrar Objetivos");
		System.out.println("2 - Recibir Logros");
		System.out.println("3 - SALIR");
		System.out.println("========================");
		String opcion = leer.next();
	}
}
