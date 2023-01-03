package test;

import dominio.ItemEjercicio;

public class TestItemEjercicio {
	public static void main(String []args) {
		
		ItemEjercicio itemEjercicio = new ItemEjercicio();
		itemEjercicio.setEjercicio("Lagartijas");
		itemEjercicio.setRepeticion(5);
		itemEjercicio.setTipoEjercicio("Push-up");
		
		imprimir(itemEjercicio);
	}
	public static void imprimir(ItemEjercicio itemEjercicio) {	
		System.out.println(itemEjercicio);
	}
}