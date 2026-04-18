package FiguraYRectangulo;

public class Figura {

	protected String nombre;

	public Figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double calcularArea() {
        System.out.println("No se puede calcular el área de una figura genérica.");
        return 0.0;
    }
}
