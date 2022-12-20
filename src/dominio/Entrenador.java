package dominio;

public class Entrenador extends Cuenta{
	private boolean certificadoProfesional;

	public boolean isCertificadoProfesional() {
		return certificadoProfesional;
	}

	public void setCertificadoProfesional(boolean certificadoProfesional) {
		this.certificadoProfesional = certificadoProfesional;
	}
	
}
