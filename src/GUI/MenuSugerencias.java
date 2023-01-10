package GUI;

import java.util.Scanner;

import dominio.Cuenta;

public class MenuSugerencias {
	public static Scanner leer = new Scanner(System.in);
	public static Cuenta cuenta = new Cuenta();
	public static int id;
	public static String comentario;
	
	public static void sugerenciasOpciones() {
		String opcion="0";
		do {
			System.out.println("========================");
			System.out.println("1 - Crear Sugerencia");
			System.out.println("2 - Listar Sugerencia");
			System.out.println("3 - Consultar Sugerencia");
			System.out.println("4 - Modificar Sugerencia");
			System.out.println("5 - Eliminar Sugerencia");
			System.out.println("6 - SALIR");
			System.out.println("========================");
			opcion = leer.next();
			menuSugerencia(opcion);
		}while(!opcion.equals("6"));
	}
	public static void menuSugerencia(String opcion) {
		switch(opcion) {
		case "1":
			crearSugerencia();
			break;
		case "2":
			listarSugerencia();
			break;
		case "3":
			consultarSugerencia();
			break;
		case "4":
			editarSugerencia();
			break;
		case "5":
			eliminarSugerencia();
			break;
		case "6":
			System.out.println("Regresando al Menu Principal");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
	}
	public static void crearSugerencia() {
		System.out.println("Digite el id de la Sugerencia");
		id=leer.nextInt();
		System.out.println("Digite el comentario");
		leer.next();
		comentario=leer.nextLine();
		cuenta.crearSugerencia(id, comentario);
	}
	public static void listarSugerencia() {
		System.out.println(cuenta.listarSugerencia());
	}
	public static void consultarSugerencia() {
		System.out.println("Digite el numero de sugerencia a consultar");
		int numSugerencia=leer.nextInt();
		System.out.println(cuenta.consultarSugerencia(numSugerencia));
	}
	public static void editarSugerencia() {
		System.out.println("Digite el numero de sugerencia a modificar");
		int numSugerencia=leer.nextInt();
		
		System.out.println("ELIJE LA OPCION A MODIFICAR");
		System.out.println("1 - Id");
		System.out.println("2 - Comentario");
		String opcion2 = leer.next();
		switch(opcion2) {
		case "1":
			System.out.println("Digite el nuevo id");
			id=leer.nextInt();
			System.out.println("Id registrado");
			break;
		case "2":
			System.out.println("Digite el nuevo comentario");
			comentario=leer.nextLine();
			System.out.println("Comentario registrado");
			break;
			default:
				System.out.println("Opcion Erronea");
		}
		
		cuenta.editarSugerencia(numSugerencia, id, comentario);
	}
	public static void eliminarSugerencia() {
		System.out.println("Digite el numero de sugerencia a eliminar");
		int numSugerencia=leer.nextInt();
		cuenta.eliminarPlanes(numSugerencia);
	}
	
}
