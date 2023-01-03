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
		
		Usuario usuario = new Usuario();
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
		leer.close();
		
		usuario.setId(id);
		usuario.setNombre(nombre);
		usuario.setCorreo(correo);
		usuario.setContrasenia(contrasenia);
		usuario.setAltura(altura);
		usuario.setEdad(edad);
		usuario.setPeso(peso);
		usuario.setTipoEnfermedad(tipoEnfermedad);
		
		System.out.println("Tu cuenta a sido creada");
	}
	
	public static void modificarCuenta(boolean correcto2){
		Scanner leer = new Scanner(System.in);
		
		System.out.println("ELIJE LA OPCION A MODIFICAR");
		System.out.println("1 - Id");
		System.out.println("2 - Nombre");
		System.out.println("3 - Correo");
		System.out.println("4 - Contrasenia");
		System.out.println("5 - Altura");
		System.out.println("6 - Edad");
		System.out.println("7 - Peso");
		System.out.println("8 - Tipo de Enfermedad");
		System.out.println("9 - Salir");
	
		String opcion = leer.next();
		correcto2 = Validaciones.validarOpcion9(opcion);
		if(correcto2) {

			switch(opcion) {
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
				System.out.println("Ingrese la nueva altura");
				altura = leer.nextDouble();
				System.out.println("Nueva altura registrado");
				break;
			case "6":
				System.out.println("Ingrese la nueva edad");
				edad = leer.nextInt();
				System.out.println("Nueva edad registrada");
				break;
			case "7":
				System.out.println("Ingrese el nuevo peso");
				peso = leer.nextDouble();
				System.out.println("Nuevo peso registrado");
				break;
			case "8":
				System.out.println("Ingrese el nuevo Tipo de Enfermedad");
				tipoEnfermedad = leer.next();
				System.out.println("Nuevo tipo de enfermedad registrado");
				break;
			case "9":
				System.out.println("Regresando");
				
				break;
			}
		} else {
			System.out.println("Opcion Incorrecta");
		}
	}
	
}
