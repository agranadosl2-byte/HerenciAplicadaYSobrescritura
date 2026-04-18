package EjercicioDesafiante;

public class Cliente extends Factura{

	private String nombre;
	private String mit;
	public Cliente(int numero, String cliente, double total, String nombre, String mit) {
		super(numero, cliente, total);
		this.nombre = nombre;
		this.mit = mit;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMit() {
		return mit;
	}
	public void setMit(String mit) {
		this.mit = mit;
	}
	
	
	
}
