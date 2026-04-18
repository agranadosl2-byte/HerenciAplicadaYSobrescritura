package AnimalYPerro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal = new Animal("Dragon");
		Perro perro1 = new Perro("Tommy", "Firulais");
		
		
		System.out.println("--- Pruebas ---");
		animal.hacerSonido();
		perro1.hacerSonido();
	}

}
