package test;

import dominio.Cuenta;
import dominio.Ejercicio;
import dominio.Entrenador;
import dominio.ItemEjercicio;
import dominio.PlanEntrenamiento;
import dominio.ProgresoUsuario;
import dominio.Sugerencia;

public class TestCuenta{
	
	public static void main(String []args) {
		
		Cuenta cuenta = new Cuenta();
		
		Sugerencia[] sugerencias = new Sugerencia[1];
		sugerencias[0] = new Sugerencia(1, "Buen programa"); 
		
		Ejercicio[] ejer = new Ejercicio[1];
		ejer[0] = new Ejercicio(1, "Polichilenos", "Aérobico");
		
		ItemEjercicio[] item = new ItemEjercicio[1];
		item[0] = new ItemEjercicio(1, ejer, 5, 1);
		
		Entrenador[] entrenadores = new Entrenador[1];
		entrenadores[0] = new Entrenador(1, "Josue", "j@hotmail.com", "123498", true);
		
		ProgresoUsuario[] progresos = new ProgresoUsuario[1];
		progresos[0] = new ProgresoUsuario(1, 13, 75.3, true);
		
		PlanEntrenamiento[] planes = new PlanEntrenamiento[1];
		planes[0] = new PlanEntrenamiento(1, "Ganar peso", 5.3, 10, "Gains", item, 1, entrenadores, 1, progresos, 1);
		
		
		cuenta.crearPlanes(1, "Plan para adelgazar", 60, 2, "Fullbody", /*items*/item, 2, /*entrenadores*/entrenadores, 2, /*progresos*/progresos, 2);
		cuenta.crearPlanes(2, "Plan para mejorar el cardio", 40, 3, "Resistencia", /*items*/item, 2, /*entrenadores*/entrenadores, 2, /*progresos*/progresos, 2);
		cuenta.crearPlanes(3, "Plan para aumentar de masa muscular", 20, 5, "Mind & Body", /*items*/item, 2, /*entrenadores*/entrenadores, 2, /*progresos*/progresos, 2);
		cuenta.crearPlanes(4, "Plan para mejorar la salud", 15, 2, "My Trainer", /*items*/item, 2, /*entrenadores*/entrenadores, 2, /*progresos*/progresos, 2);
		System.out.println(cuenta.listarPlanes());
		System.out.println(cuenta.consultarPlanes(1)+"\n");
		cuenta.editarPlanes(3, 3, "Plan para definir musculatura", 40, 10, "Mind & Body", /*items*/item, 2, /*entrenadores*/entrenadores, 2, /*progresos*/progresos, 2);
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