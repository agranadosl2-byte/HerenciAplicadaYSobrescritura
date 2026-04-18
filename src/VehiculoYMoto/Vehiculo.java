package VehiculoYMoto;

public class Vehiculo {

	protected String marca;
	protected int velocidad;
	public Vehiculo(String marca, int velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void mostrarInfo() {
		System.out.println("Marca: " + this.marca);
		System.out.println("Velocidad: " + this.velocidad + "Km/h");
	}
}
