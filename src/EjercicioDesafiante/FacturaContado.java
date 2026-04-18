package EjercicioDesafiante;

public class FacturaContado extends Factura{

	private int descuento;

	public FacturaContado(int numero, String cliente, double total, int descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

	@Override
	public void calcularTotal() {
	}
	
}
