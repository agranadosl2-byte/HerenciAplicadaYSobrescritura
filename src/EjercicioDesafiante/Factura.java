package EjercicioDesafiante;

public class Factura  {

	protected int numero = 1;
	protected String cliente;
	protected double total;
	public Factura(int numero, String cliente, double total) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.total = total;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	

    public void calcularTotal() {
		total = this.total;
		
    }
	
	
	
}
