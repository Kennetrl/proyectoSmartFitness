package GUI;

import java.util.Scanner;

import dominio.CentroEjercicio;
import util.Validaciones;

public class MenuSistema {
	public static Scanner leer = new Scanner(System.in);
	public static CentroEjercicio centro = new CentroEjercicio();
	public static int id;
	public static String nombre;
	public static String correo;
	public static String contrasenia;
	public static int numCuentas;
	public static String opcion;
	//Poner las opciones de nivel 0 de casos de uso
	public static void sesion() {
		boolean correcto=false;
		boolean correcto2=false;
		do {
			//H0. Ingresar Sistemas
			System.out.println("Ingrese la opcion");
			System.out.println("========================");
			System.out.println("1 - Crear Usuario");
			System.out.println("2 - Listar Usuarios");
			System.out.println("3 - Encontrar Usuario");
			System.out.println("4 - Modificar Usuario");
			System.out.println("5 - Eliminar Usuario");
			System.out.println("6 - Regresar");
			System.out.println("========================");
			
			opcion = leer.next();
			correcto2 = Validaciones.validarOpcion6(opcion);
			
			if (correcto2) {
				if(opcion.equals("1")) {
					//Crear Cuenta
					crearCuenta();
					correcto = true;
				} else if(opcion.equals("2")) {
					//Listar Usuario
					System.out.println(centro.listarUsuario());
					correcto = true;
				} else if(opcion.equals("3")){
					//Encontrar Usuario
					System.out.println("Digite el numero(id) del usuario");
					int numBuscar = leer.nextInt();
					System.out.println(centro.buscarUsuario(numBuscar));
					correcto = true;
				} else if(opcion.equals("4")){
					//Modificar Usuario
					editarUsuario();
					correcto = true;
				} else if (opcion.equals("5")) {
					//Eliminar Usuario
					System.out.println("Digite el numero de usuario(id) a eliminar");
					int numEliminar = leer.nextInt();
					centro.eliminarUsuario(numEliminar);
					correcto = true;
				} else if (opcion.equals("6")){
					//Regresar
					System.out.println("Regresando al Menu Principal");
					correcto=false;
					break;
				}
			} else {
				System.out.println("Error al digitar la opción");
				correcto = true;
			}
			
		}while(correcto);
	}
	public static void crearCuenta() {
		System.out.println("Ingrese el id del Usuario");
		id = leer.nextInt();
		System.out.println("Ingrese el nombre del Usuario");
		nombre = leer.next();
		System.out.println("Ingrese el correo del Usuario");
		correo = leer.next();
		System.out.println("Ingrese la contrasenia del Usuario");
		contrasenia = leer.next();
		System.out.println("Ingrese el numero de Cuenta");
		int numCuentas = leer.nextInt();
		centro.crearUsuario(id, nombre, correo, contrasenia, null, numCuentas);
	}
	public static void editarUsuario() {
		boolean correcto1=true;
		boolean correcto2=true;
		while(correcto1) {
			System.out.println("Elije el usuario que quieres modificar");
			int numUsuario=leer.nextInt();
			System.out.println("ELIJE LA OPCION A MODIFICAR");
			System.out.println("1 - Id");
			System.out.println("2 - Nombre");
			System.out.println("3 - Correo");
			System.out.println("4 - Contrasenia");
			System.out.println("5 - Salir");
			String opcion2 = leer.next();
			correcto2 = Validaciones.validarOpcion9(opcion);
			
			if(correcto2) {
				switch(opcion2) {
				case "1":
					System.out.println("Ingrese el nuevo id");
					id = leer.nextInt();
					System.out.println("Nuevo id registrado");
					break;
				case "2":
					System.out.println("Ingrese el nuevo nombre");
					nombre = leer.next();
					System.out.println("Nuevo nombre registrado");
					break;
				case "3":
					System.out.println("Ingrese el nuevo correo");
					correo = leer.next();
					System.out.println("Nuevo correo registrado");
					break;
				case "4":
					System.out.println("Ingrese la nueva contrasenia");
					contrasenia = leer.next();
					System.out.println("Nueva contrasenia registrado");
					break;
				case "5":
					System.out.println("Ingrese el numero de cuentas");
					System.out.println("Nuevo numero de cuentas registrado");
					break;
				case "6":
					System.out.println("Regresando");
					correcto1 = false;
					break;
				}
				centro.editarUsuario(numUsuario, id, nombre, correo, contrasenia, null, numCuentas);
			} else {
				System.out.println("Opcion Incorrecta");
			}
			sesion();
		}
		correcto1 = false;
	}
}
