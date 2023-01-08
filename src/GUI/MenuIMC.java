package GUI;

import java.util.Scanner;

public class MenuIMC {
	public static void imcOpciones() {
		Scanner leer = new Scanner(System.in);	
		System.out.println("========================");
		System.out.println("1 - Ingresar Altura");
		System.out.println("2 - Ingresar Peso");
		System.out.println("3 - Ingresar Edad");
		System.out.println("4 - SALIR");
		System.out.println("========================");
		String opcion = leer.next();
	}
}
