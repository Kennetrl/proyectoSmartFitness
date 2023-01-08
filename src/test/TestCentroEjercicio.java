package test;

import dominio.CentroEjercicio;
import dominio.Cuenta;

public class TestCentroEjercicio {

	public static void main(String []args) {
		CentroEjercicio centro = new CentroEjercicio();
		centro.setNombreCentro("Smart Fitness");;
		centro.setTelefono("123456789");
		centro.setDireccion("Universidad Central");
		System.out.println(centro);
		
		centro.crearCuenta(1, "Kennet", "kennet_rl@hotmail.com", "12345");
		centro.crearCuenta(2, "Andres", "andresvini@hotmail.com", "vinicio123");
		centro.crearCuenta(3, "Marlon", "argoti@hotmail.com", "argoti@123");
		System.out.println("lista de las cuentas \r\n"+ centro.listarCuenta());
		System.out.println("Cuenta a buscar: \r\n"+ centro.buscarCuenta(3));
		
		centro.crearEjercicio(1, "Caminata", "Aerobico");
		centro.crearEjercicio(2, "Baile", "Aerobico");
		centro.crearEjercicio(3, "Levantar Pesas", "Anaerobico");
		centro.crearEjercicio(4, "Flexiones", "Anaerobico");
		System.out.println("Lista de los ejercicios \r\n"+centro.listarEjercicio());
		System.out.println("Ejercicio a buscar: \r\n"+centro.buscarEjercicio(3));
	}
	
	
}
