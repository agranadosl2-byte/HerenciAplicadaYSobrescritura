package PersonaDocenteEstudiante;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estudiante estudiante1 = new Estudiante("Alvaro", 18, "0905-25-12852");
		Docente docente1 = new Docente("Carlos", 35, "Calculo");
		
		estudiante1.mostrar();
		System.out.println();
		docente1.mostrar();
		
		System.out.println("\n Prueba encapsulamiento");
		estudiante1.setEdad(20);
		
		System.out.println("La nueva edad del estudiante " + estudiante1.getNombre() + " es " + estudiante1.getEdad());
	}

}
