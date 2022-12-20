package dominio;

public class Cuenta {
	private int id;
	private String nombre;
	private String correo;
	private String contrasenia;
	String nombreLista [];
	String contraseniaLista [];
	
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
		String nombreLista [] = {"Kennet", "Vinicio"};
		String contraseniaLista [] = {"123", "1234"};
		for(int i=0; i<nombreLista.length; i++){
			if(nombre.equals(nombreLista[i]) && contrasenia.equals(contraseniaLista[i])) {
				validar = true;
			}
		}
		return validar;
	}
	
	
	
	
}
