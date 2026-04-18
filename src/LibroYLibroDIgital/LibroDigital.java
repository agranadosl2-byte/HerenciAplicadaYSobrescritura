package LibroYLibroDIgital;

public class LibroDigital extends Libro{

	private int tamaño;

	public LibroDigital(String titulo, String autor, int tamaño) {
		super(titulo, autor);
		this.tamaño = tamaño;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("\n--- Detalles del Libro Digital ---");
		super.mostrarInfo();
		System.out.println("Tamaño: " + this.tamaño + "MB");
		
	}
}
