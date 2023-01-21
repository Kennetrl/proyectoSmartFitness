package GUI;

import java.util.Scanner;

import dominio.ItemEjercicio;

public class MenuEjercicio {
	public static Scanner leer = new Scanner(System.in);
	public static ItemEjercicio itemEjercicio = new ItemEjercicio();
	public static int id;
	public static String nombre;
	public static String tipoEjercicio;
	
	public static void ejerciciosOpciones() {
		String opcion="0";
		do {
			System.out.println("========================");
			System.out.println("1 - Crear Ejercicio");
			System.out.println("2 - Listar Ejercicio");
			System.out.println("3 - Consultar Ejercicio");
			System.out.println("4 - Editar Ejercicio");
			System.out.println("5 - Eliminar Ejercicio");
			System.out.println("6 - SALIR");
			System.out.println("========================");
			opcion = leer.next();
			menuEjercicio(opcion);
		}while(!opcion.equals("6"));
	}
	public static void menuEjercicio(String opcion) {
		switch(opcion) {
		case "1":
			crearEjercicio();
			break;
		case "2":
			listarEjercicios();
			break;
		case "3":
			consultarEjercicio();
			break;
		case "4":
			editarEjercicio();
			break;
		case "5":
			eliminarEjercicio();
			break;
		case "6":
			System.out.println("Regresando al Menu Principal");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
	}
	public static void crearEjercicio(){
		System.out.println("Digite el id del ejercicio");
		id = leer.nextInt();
		System.out.println("Digite el nombre del ejercicio");
		nombre = leer.next();
		System.out.println("Digite el tipo de ejercicio del ejercicio");
		tipoEjercicio = leer.next();
		itemEjercicio.crearEjercicio(id, nombre, tipoEjercicio);
	}
	public static void listarEjercicios(){
		System.out.println(itemEjercicio.listarEjercicio());
	}
	public static void consultarEjercicio(){
		System.out.println("Digite el numero del ejercicio a consultar");
		int numConsultar=leer.nextInt();
		System.out.println(itemEjercicio.buscarEjercicio(numConsultar));
	}
	public static void editarEjercicio(){
		System.out.println("Digite el numero del ejercicio a editar");
		int numEditar = leer.nextInt();
		
		System.out.println("ELIJE LA OPCION A MODIFICAR");
		System.out.println("1 - Id");
		System.out.println("2 - Nombre del ejercicio");
		System.out.println("3 - Tipo de ejercicio");
		String opcion2 = leer.next();
		
		switch(opcion2) {
		case "1":
			System.out.println("Digite el nuevo id del ejercicio");
			id = leer.nextInt();
			System.out.println("Id del ejercicio registrado");
			break;
		case "2":
			System.out.println("Digite el nuevo nombre del ejercicio");
			nombre = leer.next();
			System.out.println("Nombre del ejercicio registrado");
			break;
		case "3":
			System.out.println("Digite el nuevo tipo de ejercicio del ejercicio");
			tipoEjercicio = leer.nextLine();
			System.out.println("Tipo de ejercicio del ejercicio registrado");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
		itemEjercicio.editarEjercicio(numEditar, id, nombre, tipoEjercicio);
	}
	public static void eliminarEjercicio(){
		System.out.println("Digite el numero del ejercicio(id) a eliminar");
		int numEliminar = leer.nextInt();
		itemEjercicio.eliminarEjercicio(numEliminar);
	}
}
