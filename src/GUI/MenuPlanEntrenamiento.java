package GUI;

import java.util.Scanner;

import dominio.Cuenta;
import dominio.Entrenador;
import dominio.ItemEjercicio;
import dominio.ProgresoUsuario;

public class MenuPlanEntrenamiento {
	public static Scanner leer = new Scanner(System.in);
	public static Cuenta cuenta = new Cuenta();
	public static int id;
	public static String nombrePlanEntrenamiento;
	public static double tiempoEmpleado;
	public static int repeticion;
	public static String nombreRutina;
	public static ItemEjercicio items[];
	public static int numItems;
	public static Entrenador entrenadores[];
	public static int numEntrenadores;
	public static ProgresoUsuario progresos[];
	public static int numProgresos;
	
	public static void planEntrenamiento() {
		String opcion="0";
		do {
			System.out.println("========================");
			System.out.println("1 - Crear Plan de Entrenamiento");
			System.out.println("2 - Listar Plan de Entrenamiento");
			System.out.println("3 - Consultar Plan de Entrenamiento");
			System.out.println("4 - Editar Plan de Entrenamiento");
			System.out.println("5 - Eliminar Plan de Entrenamiento");
			System.out.println("6 - SALIR");
			System.out.println("========================");
			opcion = leer.next();
			menuPlan(opcion);
		}while(!opcion.equals("6"));
	}
	
	public static void menuPlan(String opcion) {
		switch(opcion) {
		case "1":
			crearPlan();
			break;
		case "2":
			listarPlan();
			break;
		case "3":
			consultarPlan();
			break;
		case "4":
			editarPlan();
			break;
		case "5":
			eliminarPlan();
			break;
		case "6":
			System.out.println("Regresando al Menu Principal");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
	}
	public static void crearPlan() {
		System.out.println("Digite el id del plan de entrenamiento");
		id = leer.nextInt();
		System.out.println("Digite el nombre del plan de entrenamiento");
		nombrePlanEntrenamiento = leer.next();
		System.out.println("Digite el tiempo empleado en minutos del plan de entrenamiento");
		tiempoEmpleado = leer.nextDouble();
		System.out.println("Digite las repeticiones del plan de entrenamiento");
		repeticion = leer.nextInt();
		System.out.println("Digite el nombre de la rutina del plan de entrenamiento");
		nombreRutina = leer.next();
		System.out.println("Digite el numero de los items del plan de entrenamiento");
		numItems = leer.nextInt();
		System.out.println("Digite el numero de entrenadores para el plan de entrenamiento");
		numEntrenadores = leer.nextInt();
		System.out.println("Digite el numero de los progresos del plan de entrenamiento");
		numProgresos = leer.nextInt();
		cuenta.crearPlanes(id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, null, numItems, null, numEntrenadores, null, numProgresos);
	}
	public static void listarPlan() {
		System.out.println(cuenta.listarPlanes());
	}
	public static void consultarPlan() {
		System.out.println("Digite el numero de plan(id) a consultar ");
		int numBuscar = leer.nextInt();
		System.out.println(cuenta.consultarPlanes(numBuscar));
	}
	public static void editarPlan(){
		System.out.println("Elije el numero del plan que quieres modificar");
		int numPlan=leer.nextInt();
		System.out.println("ELIJE LA OPCION A MODIFICAR");
		System.out.println("1 - Id");
		System.out.println("2 - Nombre del Plan de Entrenamiento");
		System.out.println("3 - Tiempo Empleado");
		System.out.println("4 - Repeticion");
		System.out.println("5 - Nombre Rutina");
		System.out.println("6 - Numero de Items");
		System.out.println("7 - Numero de Entrenadores");
		System.out.println("8 - Numero de Progresos");
		String opcion2 = leer.next();
		
		switch(opcion2) {
		case "1":
			System.out.println("Ingrese el nuevo id");
			id = leer.nextInt();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo id registrado");
			break;
		case "2":
			System.out.println("Ingrese el nuevo nombre del plan de entrenamiento");
			nombrePlanEntrenamiento = leer.next();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo nombre registrado");
			break;
		case "3":
			System.out.println("Ingrese el nuevo tiempo empleado");
			tiempoEmpleado = leer.nextInt();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo tiempo empleado registrado");
				break;
		case "4":
			System.out.println("Ingrese el nuevo numero de repeteciones");
			repeticion = leer.nextInt();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo numero de repeticiones registrado");
			break;
		case "5":
			System.out.println("Ingrese el nuevo nombre de la rutina");
			nombreRutina = leer.next();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo nombre de la rutina registrado");
			break;
		case "6":
			System.out.println("Ingrese el nuevo numero de items");
			numItems = leer.nextInt();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo numero de items registrado");
			break;
		case "7":
			System.out.println("Ingrese el nuevo numero de entrenadores");
			numEntrenadores = leer.nextInt();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo numero de entrenadores registrado");
			break;
		case "8":
			System.out.println("Ingrese el nuevo numero de progresos");
			numProgresos = leer.nextInt();
			cuenta.editarPlanes(numPlan, id, nombrePlanEntrenamiento, tiempoEmpleado, repeticion, nombreRutina, items, numItems, entrenadores, numEntrenadores, progresos, numProgresos);
			System.out.println("Nuevo numero de progresos registrado");
			break;
		default:
			System.out.println("Opcion mal ingresada");
		}
	}
	public static void eliminarPlan() {
		System.out.println("Digite el numero de plan(id) a eliminar ");
		int numBuscar = leer.nextInt();
		cuenta.eliminarPlanes(numBuscar);
		System.out.println("Plan N" + numBuscar + " eliminado");

	}
}
