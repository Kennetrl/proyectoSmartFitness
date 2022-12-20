package test;

import dominio.Cuenta;

public class TestCuenta {
	
	public static void main(String []args) {
		Cuenta cuenta = new Cuenta();
		cuenta.setId(1);
		cuenta.setNombre("Pablito");
		cuenta.setCorreo("pablito@hotmail.com");
		cuenta.setContrasenia("12345");
		
		imprimir(cuenta);
	}
	public static void imprimir(Cuenta cuenta) {	
		System.out.println(cuenta);
	}
	
}
