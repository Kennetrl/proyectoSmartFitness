package dominio;

public class Usuario extends Cuenta{
	private String tipoEnfermedad;
	private int edad;
	private double peso;
	private double altura;
	
	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}
	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	
}
