package test;

import dominio.Usuario;
import java.util.Scanner;

public class TestUsuario {
	public static void main(String []args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese la altura");
		double altura = leer.nextDouble();
		System.out.println("Ingrese la edad");
		int edad = leer.nextInt();
		System.out.println("Ingrese el peso en kilogramos");
		double peso = leer.nextDouble();
		System.out.println("Ingrese el tipo de enfermedad");
		String enfermedad = leer.next();
		leer.close();
		
		Usuario usuario = new Usuario();
		usuario.setAltura(altura);
		usuario.setEdad(edad);
		usuario.setPeso(peso);
		usuario.setTipoEnfermedad(enfermedad);
		
		imprimir(usuario);
	}
	public static void imprimir(Usuario usuario) {	
		System.out.println(usuario);
	}
}
