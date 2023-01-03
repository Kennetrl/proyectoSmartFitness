package test;

import dominio.Sugerencia;

public class TestSugerencia {

	public static void main(String []args) {
		
		Sugerencia sugerencia = new Sugerencia();
		sugerencia.setId(2);
		sugerencia.setComentario("Agregar más variantes de ejercicios");
		
		imprimir(sugerencia);
	}
	public static void imprimir(Sugerencia sugerencia) {	
		System.out.println(sugerencia);
	}
}