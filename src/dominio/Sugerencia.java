package dominio;

public class Sugerencia {
	
	//atributos
	private int id;
	private String comentario;
	
	//método constructor sin argumentos
	public Sugerencia() {
	}
	
	//método constructor con argumentos
	public Sugerencia(int id, String comentario) {
		this.id = id;
		this.comentario = comentario;
	}
	
	//método constructor con referencia a objetos
	public Sugerencia(Sugerencia sugerencia) {
		this.id = sugerencia.id;
		this.comentario = sugerencia.comentario;
	}
	
	//métodos constructores get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Sugerencia \nid=" + id + "\ncomentario=" +comentario;
	}
	
	
	
}