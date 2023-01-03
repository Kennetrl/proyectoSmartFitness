package test;

import dominio.ItemEjercicio;
import java.util.Scanner;

public class TestItemEjercicio {
	public static void main(String []args) {
		Scanner leer= new Scanner(System.in);
		System.out.println("Ingrese el nombre del ejercicio");
		String ejercicio = leer.next();
		System.out.println("Ingrese el numero de repeticiones");
		int repeticion = leer.nextInt();
		System.out.println("Ingrese el tipo de ejercicio");
		String tipoEjercicio = leer.next();
		leer.close();
		
		ItemEjercicio itemEjercicio = new ItemEjercicio();
		itemEjercicio.setEjercicio(ejercicio);
		itemEjercicio.setRepeticion(repeticion);
		itemEjercicio.setTipoEjercicio(tipoEjercicio);
		
		imprimir(itemEjercicio);
	}
	public static void imprimir(ItemEjercicio itemEjercicio) {	
		System.out.println(itemEjercicio);
	}
}
