package GUI;

import java.util.Scanner;

import dominio.PlanEntrenamiento;

public class MenuProgresos {
	public static Scanner leer = new Scanner(System.in);
	public static PlanEntrenamiento planEntrenamiento = new PlanEntrenamiento();
	public static int id;
	public static int fecha;
	public static double peso;
	public static boolean logrosAlcanzados;
	
	public static void progresosOpciones() {
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
			menuProgresos(opcion);
		}while(!opcion.equals("6"));
	}
	public static void menuProgresos(String opcion) {
		switch(opcion) {
		case "1":
			crearProgreso();
			break;
		case "2":
			listarProgresos();
			break;
		case "3":
			consultarProgreso();
			break;
		case "4":
			editarProgreso();
			break;
		case "5":
			eliminarProgreso();
			break;
		case "6":
			System.out.println("Regresando al Menu Principal");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
	}
	public static void crearProgreso() {
		System.out.println("Digite el id del progreso");
		id = leer.nextInt();
		System.out.println("Digite la fecha en dias del progreso");
		fecha = leer.nextInt();
		System.out.println("Digite el peso durante actual");
		peso = leer.nextDouble();
		System.out.println("Alcanzo sus objetivos 1-Si o 2-No");
		String logros = leer.next();
		if(logros.equals("1")) {
			logrosAlcanzados=true;
		}else {
			logrosAlcanzados=false;
		}
		planEntrenamiento.crearProgreso(id, fecha, peso, logrosAlcanzados);
		
	}
	public static void listarProgresos() {
		System.out.println(planEntrenamiento.listarProgreso());
	}
	public static void consultarProgreso() {
		System.out.println("Digite el numero del progreso(id) para buscarlo");
		int numProgreso = leer.nextInt();
		System.out.println(planEntrenamiento.buscarProgreso(numProgreso));
	}
	public static void editarProgreso() {
		System.out.println("Digite el numero del progreso(id) para modificarlo");
		int numProgreso = leer.nextInt();
		System.out.println("Digite el numero del progreso(id) para modificarlo");
		String opcion2 = leer.next();
		switch(opcion2) {
		case "1":
			System.out.println("Digite el nuevo id del progreso");
			id = leer.nextInt();
			System.out.println("Id del progreso regristrado");
			break;
		case "2":
			System.out.println("Digite la nueva fecha del progreso");
			fecha = leer.nextInt();
			System.out.println("La nueva del progreso regristrada");
			break;
		case "3":
			System.out.println("Digite el nuevo peso");
			peso = leer.nextInt();
			System.out.println("Peso regristrado");
			break;
		case "4":
			System.out.println("Alcanzo sus objetivos 1-Si o 2-No");
			String logros = leer.next();
			if(logros.equals("1")) {
				logrosAlcanzados=true;
			}else {
				logrosAlcanzados=false;
			}
			System.out.println("Logros del progreso regristrado");
			break;
		default: 
		}
		planEntrenamiento.editarProgreso(numProgreso, id, fecha, peso, logrosAlcanzados);
	}
	public static void eliminarProgreso() {
		System.out.println("Digite el numero del progreso(id) para eliminarlo");
		int numProgreso = leer.nextInt();
		planEntrenamiento.eliminarProgreso(numProgreso);
	}
}
