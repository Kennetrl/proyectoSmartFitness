package test;

import dominio.ProgresoUsuario;

public class TestProgresoUsuario {
	public static void main(String []args) {
		
		ProgresoUsuario progresoUsuario= new ProgresoUsuario();
		progresoUsuario.setFecha(20);
		progresoUsuario.setId(1);
		progresoUsuario.setLogrosAlcanzados(true);
		progresoUsuario.setPeso(75.5);
		
		System.out.println(progresoUsuario);
	}
}
