package test;
import dominio.ItemEjercicio;

public class TestItemEjercicio {
	public static void main(String []args) {
		
	ItemEjercicio itemEjercicio = new ItemEjercicio();
	itemEjercicio.crearEjercicio(1, "Caminata", "Aerobico");
	itemEjercicio.crearEjercicio(2, "Baile", "Aerobico");
	itemEjercicio.crearEjercicio(3, "Levantar Pesas", "Anaerobico");
	itemEjercicio.crearEjercicio(4, "Flexiones", "Anaerobico");
	System.out.println(itemEjercicio.listarEjercicio());
	}
}