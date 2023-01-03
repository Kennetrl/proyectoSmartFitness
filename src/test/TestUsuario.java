package test;

import dominio.Usuario;

public class TestUsuario {
	public static void main(String []args) {
		
		Usuario usuario = new Usuario();
		usuario.setAltura(1.75);
		usuario.setEdad(23);
		usuario.setPeso(67.8);
		usuario.setTipoEnfermedad("Ninguna");
		
		imprimir(usuario);
	}
	public static void imprimir(Usuario usuario) {	
		System.out.println(usuario);
	}
}