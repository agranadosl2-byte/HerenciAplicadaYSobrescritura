package ProductoYProductoPerecedero;

public class Producto {

	protected String nombre;
	protected double precio;
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void mostrar() {
	
		System.out.println("Producto: " + this.nombre);
        System.out.println("Precio: Q" + this.precio);
	}
}
