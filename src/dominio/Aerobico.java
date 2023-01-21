package dominio;

public class Aerobico extends Ejercicio{
	private int numRepeticiones;
	private String intensidades;
	
	public Aerobico() {
		super();
		/*
		this.id=1;
		this.nombre="";
		this.tipoEjercicio=""; 
		 */
		this.numRepeticiones=1;
		this.intensidades="";
		
	}
	
	public Aerobico(int id, String nombre, String tipoEjercicio, int numRepeticiones, String intensidades) {
		super(id, nombre, tipoEjercicio);
		/*
		this.id=id;;
		this.nombre=nombre;
		this.tipoEjercicio=tipoEjercicio;
		 */
		this.numRepeticiones=numRepeticiones;
		this.intensidades=intensidades;

	}
	
	public Aerobico(Aerobico a) {
		this.id=a.id;
		this.nombre=a.nombre;
		this.tipoEjercicio=a.tipoEjercicio;
		this.numRepeticiones=a.numRepeticiones;
		this.intensidades=a.intensidades;
	}

	public int getNumRepeticiones() {
		return numRepeticiones;
	}

	public void setNumRepeticiones(int numRepeticiones) {
		this.numRepeticiones = numRepeticiones;
	}

	public String getIntensidades() {
		return intensidades;
	}

	public void setIntensidades(String intensidades) {
		this.intensidades = intensidades;
	}

	@Override
	public String toString() {
		
		return "Aerobico [numRepeticiones=" + numRepeticiones + ", intensidades=" + intensidades + ", id=" + id
				+ ", nombre=" + nombre + ", tipoEjercicio=" + tipoEjercicio + "]";
	}

	
	
}
