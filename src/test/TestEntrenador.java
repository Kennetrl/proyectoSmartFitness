package test;

import java.util.Scanner;

import dominio.Entrenador;

public class TestEntrenador {
	public static void main(String []args) {
		
		Scanner leer = new Scanner(System.in);
		System.out.println();
		System.out.println("¿Tiene un certificado de entrenador? 1/SI o 2/NO");
		int resp = leer.nextInt();
		boolean verificar=false;
		if(resp == 1) {
			verificar = true;
		}else if (resp == 2) {
			verificar = false;
		}
		leer.close();
		
		Entrenador entrenador = new Entrenador();
		entrenador.setCertificadoProfesional(verificar);
		
		imprimir(entrenador);
	}
	public static void imprimir(Entrenador entrenador) {	
		System.out.println(entrenador);
	}
}
