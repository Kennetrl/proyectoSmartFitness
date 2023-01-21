package test;

import dominio.Ejercicio;
import dominio.Entrenador;
import dominio.ItemEjercicio;
import dominio.PlanEntrenamiento;
import dominio.ProgresoUsuario;
import dominio.Sugerencia;
import dominio.Usuario;

public class TestUsuario {
	public static void main(String []args) {
		Usuario usuario = new Usuario();
		
		Sugerencia[] sugerencias = new Sugerencia[1];
		sugerencias[0] = new Sugerencia(1, "Excelente programa"); 
		
		Ejercicio[] ejer = new Ejercicio[1];
		ejer[0] = new Ejercicio(1, "Sentadillas", "Aérobico");
		
		ItemEjercicio[] item = new ItemEjercicio[1];
		item[0] = new ItemEjercicio(1, ejer, 5, 1);
		
		Entrenador[] entrenadores = new Entrenador[1];
		entrenadores[0] = new Entrenador(1, "Ricardo", "r@hotmail.com", "12345", true);
		
		ProgresoUsuario[] progresos = new ProgresoUsuario[1];
		progresos[0] = new ProgresoUsuario(1, 23, 60.7, true);
		
		PlanEntrenamiento[] planes = new PlanEntrenamiento[1];
		planes[0] = new PlanEntrenamiento(1, "Adelgazar", 6.5, 5, "Body & Head", item, 1, entrenadores, 1, progresos, 1);
		
		/*id, tipoEnfermedad, edad, peso, estatura, sugerencias[], numSugerencias, planes[], numPlanes*/
		usuario.crearCuentas(1, "Ninguna", 19, 65, 1.70, sugerencias, 2, planes, 2);
		usuario.crearCuentas(2, "Sobrepeso", 15, 60, 1.60, sugerencias, 1, planes, 4);
		usuario.crearCuentas(3, "Ninguna", 19, 70, 1.60, sugerencias, 4, planes, 2);
		
		
		
		System.out.println(usuario.listarCuenta());
		System.out.println(usuario.consultarCuentas(2) + "\n");
		
		usuario.editarCuentas(1, 1, "Ninguna", 19, 64, 1.71, sugerencias, 1, planes, 1);
		System.out.println(usuario.listarCuenta());
		
		usuario.eliminarCuentas(3);
		System.out.println(usuario.listarCuenta());
	}	
}