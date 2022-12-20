package dominio;

public class PlanEntrenamiento {
	
	//atributos
	private int id;
	private String nombrePlanEntrenamiento;
	
	//método constructor sin argumentos
	public PlanEntrenamiento() {
	}
	
	//método constructor con argumentos
	public PlanEntrenamiento(int id, String nombrePlanEntrenamiento) {
		this.id = id;
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
	}
	
	//método constructor con referencia a objeto
	public PlanEntrenamiento(PlanEntrenamiento plan) {
		this.id = plan.id;
		this.nombrePlanEntrenamiento = plan.nombrePlanEntrenamiento;
	}
	
	//métodos constructores get y set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePlanEntrenamiento() {
		return nombrePlanEntrenamiento;
	}

	public void setNombrePlanEntrenamiento(String nombrePlanEntrenamiento) {
		this.nombrePlanEntrenamiento = nombrePlanEntrenamiento;
	}
		
}
