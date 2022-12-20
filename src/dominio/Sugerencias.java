package dominio;

public class Sugerencias {
	
	//atributos
	private int id;
	private String comentario;
	
	//método constructor sin argumentos
	public Sugerencias() {
	}
	
	//método constructor con argumentos
	public Sugerencias(int id, String comentario) {
		this.id = id;
		this.comentario = comentario;
	}
	
	//método constructor con referencia a objetos
	public Sugerencias(Sugerencias sugerencias) {
		this.id = sugerencias.id;
		this.comentario = sugerencias.comentario;
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
	
}