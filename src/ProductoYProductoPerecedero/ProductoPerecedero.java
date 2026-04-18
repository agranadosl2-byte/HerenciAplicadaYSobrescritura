package ProductoYProductoPerecedero;
import java.time.LocalDate;

public class ProductoPerecedero extends Producto{

	private LocalDate fechaDeVencimiento;

	public ProductoPerecedero(String nombre, double precio, LocalDate fechaDeVencimiento) {
		super(nombre, precio);
		this.fechaDeVencimiento = fechaDeVencimiento;
	}

	public LocalDate getFechaDeVencimiento() {
		return fechaDeVencimiento;
	}

	public void setFechaDeVencimiento(LocalDate fechaDeVencimiento) {
		this.fechaDeVencimiento = fechaDeVencimiento;
	}
	
	public boolean estaVencido() {
		return LocalDate.now().isAfter(this.fechaDeVencimiento);
	}
	
	@Override
	public void mostrar() {
		
		System.out.println(" Detalles del producto perecedero");
		super.mostrar();
		
		System.out.println("Fecha de vencimiento: " + this.fechaDeVencimiento);
		
		if(estaVencido()) {
			System.out.println("El producto ESTA VENCIDO...");
		}else {
			System.out.println("EL producto esta en buen estado");
		}
	}
}
