package dominio;

public class Anaerobico extends Ejercicio{
	private int tiempoSerie;
	private int numSeries;
	
	public Anaerobico(){
		super.id=1;
		super.nombre="";
		super.tipoEjercicio="";
		tiempoSerie=1;
		numSeries = 1;
	}
	public Anaerobico(int id, String nombre, String tipoEjercicio, int tiempoSerie, int numSeries){
		this.id=id;
		this.nombre=nombre;
		this.tipoEjercicio=tipoEjercicio;
		this.tiempoSerie=tiempoSerie;
		this.numSeries = numSeries;
	}
	public Anaerobico(Anaerobico a) {
		this.id=a.id;
		this.nombre=a.nombre;
		this.tipoEjercicio=a.tipoEjercicio;
		this.tiempoSerie=a.tiempoSerie;
		this.numSeries=a.numSeries;
	}
	
	public int getTiempoSerie() {
		return tiempoSerie;
	}
	public void setTiempoSerie(int tiempoSerie) {
		this.tiempoSerie = tiempoSerie;
	}
	public int getNumSeries() {
		return numSeries;
	}
	public void setNumSeries(int numSeries) {
		this.numSeries = numSeries;
	}
	@Override
	public String toString() {
		return "Anaerobico [tiempoSerie=" + tiempoSerie + ", numSeries=" + numSeries + ", id=" + id + ", nombre="
				+ nombre + ", tipoEjercicio=" + tipoEjercicio + "]";
	}
	
}
