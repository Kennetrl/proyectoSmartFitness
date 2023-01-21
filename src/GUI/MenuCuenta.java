package GUI;

import java.util.Scanner;

import dominio.Usuario;

public class MenuCuenta {
	public static Scanner leer = new Scanner(System.in);
	public static Usuario usuario = new Usuario();
	public static int id;
	public static String tipoEnfermedad;
	public static int edad;
	public static double peso;
	public static double altura;
	public static int numSugerencia;
	public static int numPlanEntrenamiento;
			
	public static void cuentaOpciones() {
		String opcion="0";
		do {
			System.out.println("========================");
			System.out.println("1 - Crear Cuenta");
			System.out.println("2 - Listar Cuenta");
			System.out.println("3 - Consultar Cuenta");
			System.out.println("4 - Editar Cuenta");
			System.out.println("5 - Eliminar Cuenta");
			System.out.println("6 - SALIR");
			System.out.println("========================");
			opcion = leer.next();
			menuCuenta(opcion);
		}while(!opcion.equals("6"));
	}
	public static void menuCuenta(String opcion) {
		switch(opcion) {
		case "1":
			crearCuenta();
			break;
		case "2":
			listarCuenta();
			break;
		case "3":
			consultarCuenta();
			break;
		case "4":
			editarCuenta();
			break;
		case "5":
			eliminarCuenta();
			break;
		case "6":
			System.out.println("Regresando al Menu Principal");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
	}
	public static void crearCuenta() {
		System.out.println("Digite el id de la Cuenta");
		id = leer.nextInt();
		System.out.println("Digite tipo de enfermedad");
		tipoEnfermedad = leer.next();
		System.out.println("Digite su edad");
		edad = leer.nextInt();
		System.out.println("Digite su peso");
		peso = leer.nextInt();
		System.out.println("Digite su altura");
		altura = leer.nextDouble();
		System.out.println("Digite el numero de Sugerencias");
		numSugerencia = leer.nextInt();
		System.out.println("Digite el numero de planes de entrenamiento");
		numPlanEntrenamiento = leer.nextInt();
		
		usuario.crearCuentas(id, tipoEnfermedad, edad, peso, altura, null, numSugerencia, null, numPlanEntrenamiento);
	}
	public static void listarCuenta() {
		System.out.println(usuario.listarCuenta());
	}
	public static void consultarCuenta() {
		System.out.println("Digite el numero de cuenta a consultar");
		int numCuenta = leer.nextInt();
		System.out.println(usuario.consultarCuentas(numCuenta));
	}
	public static void editarCuenta() {
		System.out.println("Digite el numero de cuenta a editar");
		int numCuenta = leer.nextInt();

		System.out.println("ELIJE LA OPCION A MODIFICAR");
		System.out.println("1 - Id");
		System.out.println("2 - Tipo de Enfermedad");
		System.out.println("3 - Edad");
		System.out.println("4 - Peso");
		System.out.println("5 - Altura");
		System.out.println("6 - Edad");
		System.out.println("7 - Numero de planes de entrenamiento");
		System.out.println("8 - Numeros de sugerencias");
		String opcion2 = leer.next();
		
		switch(opcion2) {
		case "1":
			System.out.println("Digite el nuevo id de la cuenta");
			id = leer.nextInt();
			System.out.println("Id de la cuenta registrada");
			break;
		case "2":
			System.out.println("Digite el tipo de enfermedad");
			tipoEnfermedad = leer.next();
			System.out.println("Tipo de enfermedad registrado");
			break;
		case "3":
			System.out.println("Digite la edad");
			edad = leer.nextInt();
			System.out.println("Edad registrada");
			break;
		case "4":
			System.out.println("Digite el peso");
			peso = leer.nextInt();
			System.out.println("Peso registrada");
			break;
		case "5":
			System.out.println("Digite la altura");
			altura = leer.nextInt();
			System.out.println("Altura registrada");
			break;
		case "6":
			System.out.println("Digite el numero de sugerencias");
			numSugerencia = leer.nextInt();
			System.out.println("Numero de sugerencias registrada");
			break;
		case "7":
			System.out.println("Digite el numero de planes de entrenamiento");
			numPlanEntrenamiento = leer.nextInt();
			System.out.println("Numero de planes de entrenamiento registrada");
			break;
		default:
			System.out.println("Opcion Erronea");
		}
		usuario.editarCuentas(numCuenta, id, tipoEnfermedad, edad, peso, altura, null, numSugerencia, null, numPlanEntrenamiento);

	}
	public static void eliminarCuenta() {
		System.out.println("Digite el numero de cuenta a eliminar");
		int numCuenta = leer.nextInt();
		usuario.borrarCuentas(numCuenta);
		System.out.println("Cuenta eliminada");

		
	}
}
