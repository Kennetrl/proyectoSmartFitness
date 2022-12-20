package dominio;


public class Cuenta {
	
	//atributos
	private int id;
	private String nombre;
	private String correo;
	private String contrasenia;
	
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

	@Override
	public String toString() {
		return "Cuenta \nid=" + id + "\nnombre=" + nombre + "\ncorreo=" + correo + "\ncontrasenia=" + contrasenia;
	}
	
	
}