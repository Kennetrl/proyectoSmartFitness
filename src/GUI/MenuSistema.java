package GUI;

import java.util.Scanner;

import dominio.Usuario;
import util.Validaciones;

public class MenuSistema {
	//Poner las opciones de nivel 0 de casos de uso
	public static void sesion(Scanner leer, boolean correcto) {
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
		int id = leer.nextInt();
		System.out.println("Ingrese su nombre");
		String nombre = leer.next();
		System.out.println("Ingrese su correo");
		String correo = leer.next();
		System.out.println("Ingrese su contrasenia");
		String contrasenia = leer.next();
		System.out.println("Ingrese su altura");
		double altura = leer.nextDouble();
		System.out.println("Ingrese su edad");
		int edad = leer.nextInt();
		System.out.println("Ingrese su peso");
		double peso = leer.nextDouble();
		System.out.println("Ingrese su tipo de enfermedad");
		String tipoEnfermedad = leer.next();
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
		leer.close();
		if(correcto2) {

			switch(opcion) {
			case "1":
				
				break;
			case "2":
				
				break;
			case "3":
		
				break;
			case "4":
		
				break;
			case "5":
		
				break;
			case "6":
		
				break;
			case "7":
		
				break;
			case "8":
		
				break;
			case "9":
				System.out.println("Regresando al menu principal");
				break;
			}
		} else {
			System.out.println("Opcion Incorrecta");
		}
	}
}
