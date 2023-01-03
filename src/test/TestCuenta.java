package test;

import dominio.Cuenta;

public class TestCuenta {
	
	public static void main(String []args) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.setId(1);
		cuenta.setNombre("Pablo");
		cuenta.setCorreo("pablo@hotmail.com");
		cuenta.setContrasenia("1234567");
		
		imprimir(cuenta);
	}
	public static void imprimir(Cuenta cuenta) {	
		System.out.println(cuenta);
		
	}
	
}