package test;

import java.util.Scanner;

import dominio.Ejercicio;

public class TestEjercicio {
	public static void main(String []args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Digite el id");
		int id = leer.nextInt();
		System.out.println("Digite el nombre");
		String nombreEjercicio = leer.next();
		leer.close();
		
		Ejercicio ejercicio = new Ejercicio();
		ejercicio.setId(id);
		ejercicio.setNombre(nombreEjercicio);
		
		imprimir(ejercicio);
	}
	public static void imprimir(Ejercicio ejercicio) {	
		System.out.println(ejercicio);
	}
}
