package dominio;

public class Usuario extends Cuenta{
	
	//atributos
	private String tipoEnfermedad;
	private int edad;
	private double peso;
	private double altura;
	
	//método constructor sin argumentos
	public Usuario() {
	}
	
	//método constructor con argumentos
	public Usuario(String tipoEnfermedad, int edad, double peso, double altura) {
		this.tipoEnfermedad=tipoEnfermedad;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}
	
	//método constructor con referencia a objetos
	public Usuario(Usuario usuario) {
		this.tipoEnfermedad=usuario.tipoEnfermedad;
		this.edad=usuario.edad;
		this.peso=usuario.peso;
		this.altura=usuario.altura;
	}
	
	//métodos constructores get y set
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

	@Override
	public String toString() {
		return "Usuario \ntipoEnfermedad=" + tipoEnfermedad + "\nedad=" + edad + "\npeso=" + peso + " kg" + "\naltura=" + altura + " metros";
	}
	
}
