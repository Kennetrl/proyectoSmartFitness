package test;

import dominio.Sugerencia;

public class TestSugerencia {

	public static void main(String []args) {
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.setId(1);
		sugerencia.setComentario("Buena aplicación, poner más ejercicios :D");
		
		imprimir(sugerencia);
	}
	public static void imprimir(Sugerencia sugerencia) {	
		System.out.println(sugerencia);
	}
}
