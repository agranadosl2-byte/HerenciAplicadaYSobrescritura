package VehiculoYMoto;

public class Moto extends Vehiculo{

	private int cilindrada;

	public Moto(String marca, int velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	@Override
	public void mostrarInfo() {
		super.mostrarInfo();
		System.out.println("Cilindrada: " + this.cilindrada + "CC");
	}
}
