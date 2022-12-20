package test;

import dominio.Rutina;

public class TestRutina {
	public static void main(String []args) {
		Rutina rutina = new Rutina();
		rutina.setId(1);;
		rutina.setTiempoEmpleado(30.00);
		rutina.setRepeticion(2);
		rutina.setNombreRutina("Rutina Matutina");
		
		imprimir(rutina);
	}
	public static void imprimir(Rutina rutina) {	
		System.out.println(rutina);
	}
}
