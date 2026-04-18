package FiguraYRectangulo;

public class Circulo extends Figura {

	private double radio;

	public Circulo(String nombre, double radio) {
		super(nombre);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
    public double calcularArea() {

        return Math.PI * Math.pow(this.radio, 2);
    }
}
