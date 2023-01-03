package test;

import dominio.CentroEjercicio;

public class TestCentroEjercicio {

	public static void main(String []args) {
		
		CentroEjercicio centro = new CentroEjercicio();
		centro.setNombreCentro("Smart Fitness");;
		centro.setTelefono("123456789");
		centro.setDireccion("Universidad Central");
		centro.setNumCuentas(6);
		centro.setCuentas(centro.getCuentas());
		
		imprimir(centro);
	}
	public static void imprimir(CentroEjercicio centro) {	
		System.out.println(centro);
	}
	
}
