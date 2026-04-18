package EmpleadoYGerente;

public class Gerente extends Empleado{

	private Double bonoAdicional;

	public Gerente(String nombre, Double salario, Double bonoAdicional) {
		super(nombre, salario);
		this.bonoAdicional = bonoAdicional;
	}

	public Double getBonoAdicional() {
		return bonoAdicional;
	}

	public void setBonoAdicional(Double bonoAdicional) {
		this.bonoAdicional = bonoAdicional;
	}
	
	@Override
	public double calcularSalario() {
		return super.calcularSalario() +  this.bonoAdicional;
	}
	
	
}
