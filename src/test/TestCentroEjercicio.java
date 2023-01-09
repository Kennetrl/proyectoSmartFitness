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
		
		centro.crearUsuario(1, "Kennet", "kennet_rl@hotmail.com", "12345", null, 1);
		centro.crearUsuario(2, "Andres", "andresvini@hotmail.com", "vinicio123", null, 1);
		centro.crearUsuario(3, "Marlon", "argoti@hotmail.com", "argoti@123", null, 1);
		
		System.out.println("lista de las cuentas \r\n"+ centro.listarUsuario());
		System.out.println("Cuenta a buscar: \r\n" + centro.buscarUsuario(3)+ "\n");
		
		centro.editarUsuario(1, 1, "Raul", "raul@hotmail.com", "321", null, 1);
		System.out.println("lista de las cuentas \r\n"+ centro.listarUsuario());
		
		centro.eliminarUsuario(3);
		System.out.println("lista de las cuentas \r\n"+ centro.listarUsuario());
		
		centro.crearEjercicio(1, "Caminata", "Aerobico");
		centro.crearEjercicio(2, "Baile", "Aerobico");
		centro.crearEjercicio(3, "Levantar Pesas", "Anaerobico");
		centro.crearEjercicio(4, "Flexiones", "Anaerobico");
		System.out.println("Lista de los ejercicios \r\n"+centro.listarEjercicio());
		System.out.println("Ejercicio a buscar: \r\n"+centro.buscarEjercicio(3)+ "\n");
		
		centro.editarEjercicio(3, 3, "Trote", "Aerobico");
		System.out.println("lista de las cuentas \r\n"+ centro.listarEjercicio());
		
		centro.eliminarEjercicio(4);
		System.out.println("lista de las cuentas \r\n"+ centro.listarEjercicio());
	}
}
