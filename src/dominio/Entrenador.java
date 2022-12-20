package dominio;

public class Entrenador extends Cuenta{
	
	//atributos
	private boolean certificadoProfesional;

	//método constructor sin argumentos
	public Entrenador() {
	}
	
	//método constructor con argumentos
	public Entrenador(boolean certificadoProfesional) {
		this.certificadoProfesional=certificadoProfesional;
	}
	
	//método constructor con referencia a objeto
	public Entrenador(Entrenador entrenador) {
		this.certificadoProfesional=entrenador.certificadoProfesional;
	}
	
	//métodos constructores get y set
	public boolean getCertificadoProfesional() {
		return certificadoProfesional;
	}
	
	public void setCertificadoProfesional(boolean certificadoProfesional) {
		this.certificadoProfesional = certificadoProfesional;
	}

	@Override
	public String toString() {
		return "Entrenador \ncertificadoProfesional=" + certificadoProfesional;
	}
	
	
}