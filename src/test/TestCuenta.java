package test;

import dominio.Cuenta;

public class TestCuenta{
	
	public static void main(String []args) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.crearPlanes(1, "Plan para adelgazar", 60, 2, "Fullbody", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		cuenta.crearPlanes(2, "Plan para mejorar el cardio", 40, 3, "Resistencia", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		cuenta.crearPlanes(3, "Plan para aumentar de masa muscular", 20, 5, "Mind & Body", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		cuenta.crearPlanes(4, "Plan para mejorar la salud", 15, 2, "My Trainer", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		System.out.println(cuenta.listarPlanes());
		System.out.println(cuenta.consultarPlanes(1)+"\n");
		cuenta.editarPlanes(3, 3, "Plan para definir musculatura", 40, 10, "Mind & Body", /*items*/null, 2, /*entrenadores*/null, 2, /*progresos*/null, 2);
		System.out.println(cuenta.listarPlanes());
		cuenta.eliminarPlanes(4);
		System.out.println(cuenta.listarPlanes());
		
		cuenta.crearSugerencia(1, "Este es el comentario n1");
		cuenta.crearSugerencia(2, "Este es el comentario n2");
		cuenta.crearSugerencia(3, "Este es el comentario n3");
		cuenta.crearSugerencia(4, "Este es el comentario n4");
		System.out.println(cuenta.listarSugerencia());
		System.out.println(cuenta.consultarSugerencia(3)+"\n");
		System.out.println(cuenta.listarSugerencia());
		cuenta.editarSugerencia(3, 3, "Este es el comentario editado");
		System.out.println(cuenta.listarSugerencia());
		cuenta.eliminarSugerencia(4);
		System.out.println(cuenta.listarSugerencia());
		
	}
	
}