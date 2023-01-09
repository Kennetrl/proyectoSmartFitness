package test;

import dominio.Ejercicio;

public class TestEjercicio {
	public static void main(String []args) {
		
		Ejercicio ejercicio = new Ejercicio();
		ejercicio.setId(1);
		ejercicio.setNombre("Sentadilla");
		ejercicio.setId(2);
		ejercicio.setNombre("Abdominales");

		System.out.println(ejercicio);
	}
}