package test;

import dominio.ItemEjercicio;

public class TestItemEjercicio {
	public static void main(String []args) {
		ItemEjercicio itemEjercicio = new ItemEjercicio();
		itemEjercicio.setEjercicio("Sentadillas");
		itemEjercicio.setRepeticion(5);
		itemEjercicio.setTipoEjercicio("Aerobico");
		
		imprimir(itemEjercicio);
	}
	public static void imprimir(ItemEjercicio itemEjercicio) {	
		System.out.println(itemEjercicio);
	}
}
