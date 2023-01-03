package test;

import java.util.Scanner;

import dominio.Sugerencia;

public class TestSugerencia {

	public static void main(String []args) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Ingrese el id");
		int id = leer.nextInt();
		String comentario;
		System.out.println("Ingrese el comentario");
		leer.next();
		comentario = leer.nextLine();
		leer.close();
		
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.setId(id);
		sugerencia.setComentario(comentario);
		
		imprimir(sugerencia);
	}
	public static void imprimir(Sugerencia sugerencia) {	
		System.out.println(sugerencia);
	}
}
