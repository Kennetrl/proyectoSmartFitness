package dominio;

public class Aerobico extends Ejercicio{
	private int numRepeticiones;
	private String intensidades;
	
	public Aerobico() {
		this.id=1;
		this.nombre="";
		this.numRepeticiones=1;
		this.intensidades="";
		this.tipoEjercicio="";
	}
	
	public Aerobico(int id, String nombre, int numRepeticiones, String intensidades, String tipoEjercicio) {
		this.id=id;;
		this.nombre=nombre;
		this.numRepeticiones=numRepeticiones;
		this.intensidades=intensidades;
		this.tipoEjercicio=tipoEjercicio;
	}
	
	public Aerobico(Aerobico a) {
		this.id=a.id;
		this.nombre=a.nombre;
		this.numRepeticiones=a.numRepeticiones;
		this.intensidades=a.intensidades;
		this.tipoEjercicio=a.tipoEjercicio;
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
