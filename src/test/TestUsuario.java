package test;

import dominio.Usuario;

public class TestUsuario {
	public static void main(String []args) {
		Usuario usuario = new Usuario();
		usuario.crearPlanes(1, "Plan para adelgazar", 60, 2, "Fullbody", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		usuario.crearPlanes(2, "Plan para mejorar el cardio", 40, 3, "Fullbody", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		usuario.crearPlanes(3, "Plan para aumentar de masa muscular", 20, 5, "Fullbody", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		usuario.crearPlanes(4, "Plan para mejorar la salud", 15, 2, "Fullbody", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		System.out.println(usuario.listarPlanes());
		System.out.println(usuario.consultarPlanes(1));	
		
		usuario.crearSugerencia(1, "Este es el comentario n1");
		usuario.crearSugerencia(2, "Este es el comentario n2");
		usuario.crearSugerencia(3, "Este es el comentario n3");
		usuario.crearSugerencia(4, "Este es el comentario n4");
		System.out.println(usuario.listarSugerencia());
		System.out.println(usuario.consultarSugerencia(3));	
		
	}	
}