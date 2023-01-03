package dominio;
/**
 * Clase Usuario que hereda de la clase Cuenta
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 */
public class Usuario extends Cuenta{
	
	//atributos
	private String tipoEnfermedad;
	private int edad;
	private double peso;
	private double altura;
	
	//método constructor sin argumentos
	/**
	 * Constructor sin argumentos
	 */
	public Usuario() {
		tipoEnfermedad="Ninguna";
		edad=19;
		peso=80.5;
		altura=1.70;
	}
	
	//método constructor con argumentos
	/**
	 * Constructor con argumentos
	 * @param tipoEnfermedad parametro que indica el tipo de enfermedad
	 * @param edad parametro que indica la edad 
	 * @param peso parametro que indica el peso 
	 * @param altura parametro que indica la altura
	 */
	public Usuario(String tipoEnfermedad, int edad, double peso, double altura) {
		this.tipoEnfermedad=tipoEnfermedad;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}
	
	//método constructor con referencia a objetos
	/**
	 * Constructor con referencia a objetos
	 * @param usuario objeto de la clase Usuario
	 */
	public Usuario(Usuario usuario) {
		this.tipoEnfermedad=usuario.tipoEnfermedad;
		this.edad=usuario.edad;
		this.peso=usuario.peso;
		this.altura=usuario.altura;
	}
	
	//métodos constructores get y set
	/**
	 * Metodo que devuelve el tipo de enfermedad
	 * @return retorna el tipo de enfermedad
	 */
	public String getTipoEnfermedad() {
		return tipoEnfermedad;
	}
	
	/**
	 * Metodo que asigna un tipo de enfermedad
	 * @param tipoEnfermedad parametro que indica el tipo de enfermedad
	 */
	public void setTipoEnfermedad(String tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}
	
	/**
	 * Metodo que devuelve la edad
	 * @return retorna la edad
	 */
	public int getEdad() {
		return edad;
	}
	
	/**
	 * Metodo que asigna una edad
	 * @param edad parametro que indica la edad 
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	/**
	 * Metodo que devuelve el peso
	 * @return retorna el peso
	 */
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Metodo que asigna un peso
	 * @param peso parametro que indica el peso 
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/**
	 * Metodo que devuelve la altura
	 * @return retorna la altura
	 */
	public double getAltura() {
		return altura;
	}
	
	/**
	 * Metodo que asigna una altura
	 * @param altura parametro que indica la altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Metodo que devuelve los valores de los atributos en forma de cadena
	 * @return retorna la cadena de los valores de los atributos
	 */
	@Override
	public String toString() {
		return "Usuario \ntipoEnfermedad=" + tipoEnfermedad + "\nedad=" + edad + "\npeso=" + peso + " kg" + "\naltura=" + altura + " metros";
	}
	
}