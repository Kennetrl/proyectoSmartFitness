package test;

import dominio.Sugerencia;

public class TestSugerencia {

	public static void main(String []args) {
		
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.setId(1);
		sugerencia.setComentario("Agregar mas variantes de ejercicios");
		
		System.out.println(sugerencia);
	}
}