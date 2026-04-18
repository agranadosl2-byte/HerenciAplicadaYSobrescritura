package PersonaDocenteEstudiante;

public class Estudiante extends Persona{

	private String carnet;

	public Estudiante(String nombre, int edad, String carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}
	 
	@Override
	public void mostrar() {
		System.out.println("--- Datos del estudiante ---");
		super.mostrar();
		System.out.println("Carnet: " + this.carnet);
	}
}
