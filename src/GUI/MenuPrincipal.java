package GUI;
import java.util.Scanner;

/**
 * 
 * Esta clase contiene el método main con el cual se inicia el programa CentroEjercicio
 * 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 * 
 */

public class MenuPrincipal {
	
	public static void main(String[] args) {
		//Variables
		int opcion=0;
		boolean correcto=true;
		
		//Bienvenida
		System.out.println("============================");
		System.out.println("BIENVENIDOS A SMART FITNESS");
		System.out.println("============================");
		
		Scanner leer = new Scanner(System.in);
		//Método para ver el menú
		menu(leer, opcion, correcto);
		
	}

	public static void menu(Scanner leer,int opcion,boolean correcto) {
		System.out.println("Elija la opcion");
		System.out.println("========================");
		System.out.println("1 - INGRESAR AL SISTEMA");
		System.out.println("2 - GESTIONAR PLAN ENTRENAMIENTO");
		System.out.println("3 - GESTIONAR EJERCICIO");
		System.out.println("4 - GESTIONAR USUARIO");
		System.out.println("5 - GESTIONAR PROGRESO USUARIO");
		System.out.println("6 - GESTIONAR SUGERENCIAS");
		System.out.println("7 - SALIR");
		System.out.println("========================");
			
		opcion = leer.nextInt();
		correcto = false;
			switch(opcion){
			case 1:
				MenuSistema.sesion();
				break;
			case 2:
				MenuEnfermedades.enfermedadesOpciones();
				break;
			case 3:
				System.out.println("Esta es la opcion 3");
				break;
			case 4:
				System.out.println("Esta es la opción 4");
				break;
			case 5:
				System.out.println("Esta es la opción 5");
				break;
			case 6:
				System.out.println("Esta es la opción 6");
			case 7:
				System.out.println("Gracias por usar el programa <3");
				break;
			default:
				System.out.println("Digite bien la opcion");
				menu(leer, opcion, correcto);
				correcto = false;
			}
	}
}