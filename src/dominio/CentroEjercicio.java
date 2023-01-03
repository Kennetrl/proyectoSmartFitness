package dominio;

import java.util.Arrays;

public class CentroEjercicio {
	private String nombreCentro;
	private String telefono;
	private String direccion;
	private int numCuentas;
	private Cuenta cuentas[];
	
	public CentroEjercicio() {
		this.nombreCentro="Smart Fitness";
		this.telefono="+593 99 999 9999";
		this.direccion="Quito, Ecuador";
		this.numCuentas=6;
		this.cuentas = new Cuenta[numCuentas];
	}
	
	public CentroEjercicio(String nombreCentro, String telefono, String direccion, int numCuentas, Cuenta cuentas[]) {
		this.nombreCentro = nombreCentro;
		this.telefono=telefono;
		this.direccion=direccion;
		this.numCuentas=numCuentas;
		this.cuentas = cuentas;
	}
	
	public CentroEjercicio(CentroEjercicio centro) {
		this.nombreCentro = centro.nombreCentro;
		this.telefono = centro.telefono;
		this.direccion = centro.direccion;
		this.numCuentas = centro.numCuentas;
		this.cuentas = centro.cuentas;
	}
	
	public String getNombreCentro() {
		return nombreCentro;
	}
	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getNumCuentas() {
		return numCuentas;
	}
	public void setNumCuentas(int numCuentas) {
		this.numCuentas = numCuentas;
	}
	public Cuenta[] getCuentas() {
		return cuentas;
	}
	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "CentroEjercicio\nnombreCentro = " + nombreCentro + "\ntelefono = " + telefono + "\ndireccion = " + direccion
				+ "\nnumCuentas = " + numCuentas + "\ncuentas = " + Arrays.toString(cuentas);
	}
	
	
	
}
