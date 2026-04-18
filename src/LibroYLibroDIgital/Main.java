package LibroYLibroDIgital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1 = new Libro("Tu y yo un talvez", "Maria Martinez");
		LibroDigital libroDigital1 = new LibroDigital("Los juegos del hambre", "Suzanne Collins", 15);
		
		System.out.println("--- Detalles del libro ---");
		libro1.mostrarInfo();
		libroDigital1.mostrarInfo();
	}

}
