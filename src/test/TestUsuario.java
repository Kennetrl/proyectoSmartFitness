package test;

import dominio.Usuario;

public class TestUsuario {
	public static void main(String []args) {
		Usuario usuario = new Usuario();
		/*id, tipoEnfermedad, edad, peso, estatura, sugerencias[], numSugerencias, planes[], numPlanes*/
		usuario.crearCuentas(1, "Ninguna", 19, 65, 1.70, null, 2, null, 2);
		usuario.crearCuentas(2, "Sobrepeso", 15, 60, 1.60, null, 1, null, 4);
		usuario.crearCuentas(3, "Ninguna", 19, 70, 1.60, null, 4, null, 2);
		
		System.out.println(usuario.listarCuenta());
		System.out.println(usuario.consultarCuentas(2) + "\n");
		
		usuario.editarCuentas(1, 1, "Ninguna", 19, 64, 1.71, null, 1, null, 1);
		System.out.println(usuario.listarCuenta());
		
		usuario.eliminarCuentas(3);
		System.out.println(usuario.listarCuenta());
	}	
}