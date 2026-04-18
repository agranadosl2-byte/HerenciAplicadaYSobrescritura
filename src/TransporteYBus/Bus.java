package TransporteYBus;

public class Bus extends Transporte {

	private String ruta;

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}
	
	public void descripcion() {
		System.out.println("--- Descripcion del transporte ---");
		System.out.println("Capacidad: " + this.capacidad);
		System.out.println("Ruta: " + this.ruta);
	}
}
