package GUI;

import java.util.Scanner;

import dominio.Usuario;
import util.Validaciones;

public class MenuSistema {
	private static int id;
	private static String nombre;
	private static String correo;
	private static String contrasenia;
	private static double altura;
	private static int edad;
	private static double peso;
	private static String tipoEnfermedad;
	public static Usuario usuario = new Usuario();
	
	//Poner las opciones de nivel 0 de casos de uso
	public static void sesion() {
		Scanner leer = new Scanner(System.in);
		boolean correcto=false;
		boolean correcto2=false;
		do {
			//H0. Ingresar Sistemas
			System.out.println("Ingrese la opcion");
			System.out.println("========================");
			System.out.println("1 - Crear Cuenta");
			System.out.println("2 - Modificar Cuenta");
			System.out.println("3 - Eliminar Cuenta");
			System.out.println("4 - Regresar");
			System.out.println("========================");
			
			String opcion = leer.next();
			correcto2 = Validaciones.validarOpcion4(opcion);
			
			if (correcto2) {
				if(opcion.equals("1")) {
					//Crear Cuenta
					crearCuenta();
					correcto = true;
				} else if(opcion.equals("2")) {
					//Modificar Cuenta
					modificarCuenta(correcto2);
					correcto = true;
				} else if(opcion.equals("3")){
					//Eliminar Cuenta
					eliminarCuenta();
					correcto = true;
				} else if(opcion.equals("4")){
					//Regresar
					
					correcto = true;
				}
			} else {
				System.out.println("Error al digitar la opción");
				correcto = false;
			}
			
		}while(!correcto);
	}
	
	public static void crearCuenta(){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingrese su id");
		id = leer.nextInt();
		System.out.println("Ingrese su nombre");
		nombre = leer.next();
		System.out.println("Ingrese su correo");
		correo = leer.next();
		System.out.println("Ingrese su contrasenia");
		contrasenia = leer.next();
		System.out.println("Ingrese su altura");
		altura = leer.nextDouble();
		System.out.println("Ingrese su edad");
		edad = leer.nextInt();
		System.out.println("Ingrese su peso");
		peso = leer.nextDouble();
		System.out.println("Ingrese su tipo de enfermedad");
		tipoEnfermedad = leer.next();
		
		usuario.setId(id);
		usuario.setNombre(nombre);
		usuario.setCorreo(correo);
		usuario.setContrasenia(contrasenia);
		
		System.out.println("Tu cuenta a sido creada");
		
		sesion();
	}
	
	public static void modificarCuenta(boolean correcto2){
		Scanner leer = new Scanner(System.in);
		boolean correcto=false;
		while(!correcto) {
			System.out.println("ELIJE LA OPCION A MODIFICAR");
			System.out.println("1 - Id");
			System.out.println("2 - Nombre");
			System.out.println("3 - Correo");
			System.out.println("4 - Contrasenia");
			System.out.println("5 - Salir");
			String opcion = leer.next();
			correcto2 = Validaciones.validarOpcion9(opcion);
			
			if(correcto2) {
				switch(opcion) {
				case "1":
					System.out.println("Ingrese el nuevo id");
					id = leer.nextInt();
					usuario.setId(id);
					System.out.println("Nuevo id registrado");
					break;
				case "2":
					System.out.println("Ingrese el nuevo nombre");
					nombre = leer.next();
					usuario.setNombre(nombre);
					System.out.println("Nuevo nombre registrado");
					break;
				case "3":
					System.out.println("Ingrese el nuevo correo");
					correo = leer.next();
					usuario.setCorreo(correo);
					System.out.println("Nuevo correo registrado");
					break;
				case "4":
					System.out.println("Ingrese la nueva contrasenia");
					contrasenia = leer.next();
					usuario.setContrasenia(contrasenia);
					System.out.println("Nueva contrasenia registrado");
					break;
				case "5":
					System.out.println("Regresando");
					correcto = true;
					break;
				}
			} else {
				System.out.println("Opcion Incorrecta");
			}
			sesion();
		}
	}
	
	public static void eliminarCuenta() {
		Scanner leer = new Scanner(System.in);
		System.out.println("¿Desea eliminar la cuenta?");
		System.out.println("============================");
		System.out.println("1 - Si");
		System.out.println("2 - No");
		System.out.println("============================");
		String opcion = leer.next();
		if(opcion.equals("1")) {
			usuario = null;
			System.out.println("La cuenta ha sido eliminada");
		} else if (opcion.equals("2")) {
			System.out.println("No se eliminó la cuenta");
		} else {
			System.out.println("Opción no valida");
		}
		
		sesion();
	}
	
}
