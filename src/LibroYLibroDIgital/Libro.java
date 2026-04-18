package LibroYLibroDIgital;

public class Libro {

	protected String titulo;
	protected String autor;
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public void mostrarInfo() {
		System.out.println("Titulo: " + this.titulo);
		System.out.println("Autor: " + this.autor);
		
		
	}
}
