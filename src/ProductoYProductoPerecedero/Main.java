package ProductoYProductoPerecedero;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto producto1 = new Producto("Computadora", 5000);
		System.out.println("Detalles del producto...");
		producto1.mostrar();
		System.out.println();
		
		ProductoPerecedero productoPerecedero1 = new ProductoPerecedero("Leche", 35,  LocalDate.of(2026, 4, 19));
		productoPerecedero1.mostrar();
		System.out.println();
		
		ProductoPerecedero productoPerecedero2 = new ProductoPerecedero("Galletas", 15,  LocalDate.of(2026, 4, 14));
		productoPerecedero2.mostrar();
		System.out.println();
	}

}
