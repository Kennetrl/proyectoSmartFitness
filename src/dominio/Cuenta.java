package dominio;

public class Cuenta {
	
	//atributos
	private int id;
	private String nombre;
	private String correo;
	private String contrasenia;
	String nombreLista [];
	String contraseniaLista [];
	
	//método constructor sin argumentos
	public Cuenta(){
	}
	
	//método constructor con argumentos
	public Cuenta(int id, String nombre, String correo, String contrasenia) {
		this.id=id;
		this.nombre=nombre;
		this.correo=correo;
		this.contrasenia=contrasenia;
	}
	
	//método constructor con referencia a objeto
	public Cuenta(Cuenta cuenta) {
		this.id=cuenta.id;
		this.nombre=cuenta.nombre;
		this.correo=cuenta.correo;
		this.contrasenia=cuenta.contrasenia;
	}
	
	//métodos constructores get y set
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	public boolean validar() {
		boolean validar = false;
		String nombreLista [] = {"Rodney", "Marlon", "Jonathan", "Vinicio","Vanessa", "Kennet"};
		String contraseniaLista [] = {"54321", "abc", "9876", "kjhg","1928", "123"};
		for(int i=0; i<nombreLista.length; i++) {
			if(nombre.equals(nombreLista[i])&& contrasenia.equals(contraseniaLista[i])) {
				
				return validar = true;
			}
		}
		return validar;
	}
}