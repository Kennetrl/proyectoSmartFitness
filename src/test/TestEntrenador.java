package test;

import dominio.Entrenador;

public class TestEntrenador {
	public static void main(String []args) {
		
		Entrenador entrenador = new Entrenador();
		entrenador.setCertificadoProfesional(true);
		
		imprimir(entrenador);
	}
	public static void imprimir(Entrenador entrenador) {	
		System.out.println(entrenador);
	}
}