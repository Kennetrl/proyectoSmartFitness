package dominio;

/**
 * Esta clase se encarga de almacenar los datos de la sugerencia realizada por un usuario.
 * 
 * @author Rodney Andrade
 * @author Marlon Argoti
 * @author Vanessa Heredia
 * @author Jonathan Planza
 * @author Vinicio Matango
 * @author Kennet Rodriguez
 * @version 1.0
 */
public class Sugerencia {
	
	//atributos
	private int id;
	private String comentario;
	
	/**
     * Constructor sin parametros
     */
	public Sugerencia() {
		id=1;
		comentario="Se necesitan de más rutinas y ejercicios nuevos";
	}
	
	/**
     * Constructor con parametros
     * @param id int
     * @param comentario String
     */
	public Sugerencia(int id, String comentario) {
		this.id = id;
		this.comentario = comentario;
	}
	
	/**
     * Constructor con referencia a objetos
     * @param sugerencia Sugerencia
     */
	public Sugerencia(Sugerencia sugerencia) {
		this.id = sugerencia.id;
		this.comentario = sugerencia.comentario;
	}
	
	/**
     * Metodo para obtener el id de la sugerencia
     * @return id int
     */
	public int getId() {
		return id;
	}

	/**
     * Metodo para establecer el id de la sugerencia
     * @param id int
     */
	public void setId(int id) {
		this.id = id;
	}

	/**
     * Metodo para obtener el comentario de la sugerencia
     * @return comentario String
     */
	public String getComentario() {
		return comentario;
	}

	/**
     * Metodo para establecer el comentario de la sugerencia
     * @param comentario String
     */
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	/**
     * Metodo para imprimir los datos de la sugerencia
     */
	@Override
	public String toString() {
		return "Sugerencia \nid=" + id + "\ncomentario=" +comentario;
	}
}