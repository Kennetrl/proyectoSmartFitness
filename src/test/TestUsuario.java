package test;

import dominio.Usuario;

public class TestUsuario {
	public static void main(String []args) {
		Usuario usuario = new Usuario();
		usuario.setAltura(1.70);
		usuario.setEdad(18);
		usuario.setPeso(60);
		usuario.setTipoEnfermedad("Ninguna");
		
		imprimir(usuario);
	}
	public static void imprimir(Usuario usuario) {	
		System.out.println(usuario);
	}
}
