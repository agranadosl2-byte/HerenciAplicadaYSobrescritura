package EmpleadoYGerente;

public class Empleado {

	protected String nombre;
	protected Double salario;
	public Empleado(String nombre, Double salario) {
		super();
		this.nombre = nombre;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public double calcularSalario() {
		return this.salario;
	}
	
	
}
