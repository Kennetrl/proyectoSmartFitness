package dominio;
import java.util.Scanner;
public class CentroEjercicio {
	
	public static void main(String[] args) {
		
		//Variables
		int opcionSesion=0;
		boolean correcto=true;
		
		//Bienvenida
		System.out.println("============================");
		System.out.println("BIENVENIDOS A SMART FITNESS");
		System.out.println("============================");
		
		Scanner leer = new Scanner(System.in);
		
		sesion(leer, opcionSesion, correcto);
		
	}
	
	public static void sesion(Scanner leer, int opcionSesion, boolean correcto) {
		Usuario usuario = new Usuario();
		do {
			System.out.println("Ingrese la opción");
			System.out.println("1 - Iniciar Sesión");
			System.out.println("2 - Registrarse");
			
			opcionSesion = leer.nextInt();
			
			if(opcionSesion == 1) {
				//Iniciar Sesion
				String entrenadores [] = {"Pablo", "Luis"};
				
				System.out.println("Ingrese el Usuario");
				
				leer.nextLine();
				String nombre = leer.nextLine();
				usuario.setNombre(nombre);
				
				System.out.println("Ingrese la Contraseña");
				
				String contrasenia = "";
				contrasenia = leer.nextLine();
				usuario.setContrasenia(contrasenia);
				
				if(usuario.validar()) {
					System.out.println("========================");
					System.out.println("Accediendo al Sistema");
					System.out.println("========================");
					
					menu(leer, correcto);
					
				}else {
					System.out.println("Usuario o Contraseña Incorrecta");
				}
							
				correcto = true;
			} else if(opcionSesion == 2) {
				//Registrarse
				
				do {
					correcto = false;
					
					System.out.println("Ingrese su nombre");
					leer.nextLine();
					String nombreLista=leer.nextLine();
					
					System.out.println("Ingrese su nombre nuevamente");
					String nombreLista2=leer.nextLine();
					if(nombreLista.equals(nombreLista2)) {
						correcto=true;
						usuario.setNombre(nombreLista);
					} else {
						System.out.println("Error al digitar el nombre");
						correcto=false;
					}
				}while(!correcto);
				
				do {
					correcto = false;
					String contraseniaLista;
					System.out.println("Ingrese su contraseña");
					contraseniaLista=leer.nextLine();
					String contraseniaLista2;
					System.out.println("Ingrese su contraseña nuevamente");
					contraseniaLista2=leer.nextLine();
					if(contraseniaLista.equals(contraseniaLista2)) {
						correcto=true;
						usuario.setContrasenia(contraseniaLista);
					} else {
						System.out.println("Error al digitar la contraseña");
						correcto=false;
					}
				}while(!correcto);
				
				
				System.out.println("Te registraste");
				menu(leer, correcto);
				correcto = true;
			} else {
				System.out.println("Digite correctamente la opción");
				correcto = false;
			}
		}while(!correcto);
	}
	
	public static void menu(Scanner leer, boolean correcto) {
		correcto = false;
		int opcion;
		System.out.println("Elija la opción");
		System.out.println("========================");
		System.out.println("1 - GESTIONAR PERFIL");
		System.out.println("2 - PLAN DE ENTRAMIENTO");
		System.out.println("3 - PROGRESO");
		System.out.println("4 - SUGERENCIAS");
		System.out.println("5 - SALIR");
		System.out.println("========================");
		opcion = leer.nextInt();
		
		switch(opcion){
		case 1:
			System.out.println("Esta es la opción 1");
			menu(leer, correcto);
			break;
		case 2:
			System.out.println("Esta es la opción 2");
			menu(leer, correcto);
			break;
		case 3:
			System.out.println("Esta es la opción 3");
			menu(leer, correcto);
			break;
		case 4:
			System.out.println("Esta es la opción 4");
			menu(leer, correcto);
			break;
		case 5:
			System.out.println("Gracias por usar el programa <3");
			break;
		default:
			System.out.println("Digite bien la opción");
			menu(leer, correcto);
		}
	}

}
