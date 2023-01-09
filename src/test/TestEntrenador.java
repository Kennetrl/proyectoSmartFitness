package test;

import dominio.Entrenador;

public class TestEntrenador {
	public static void main(String []args) {
		
		Entrenador entrenador = new Entrenador();
		entrenador.setId(1);
		entrenador.setNombre("Juan");
		entrenador.setCorreo("juan@hotmail.com");
		entrenador.setContrasenia("123456");
		entrenador.setCertificadoProfesional(true);
		
		System.out.println(entrenador);
	}
}