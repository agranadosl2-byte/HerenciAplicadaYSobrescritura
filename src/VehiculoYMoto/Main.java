package VehiculoYMoto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo vehiculo1 = new Vehiculo("Toyota", 230);
		Moto moto1 = new Moto("Honda", 120, 250);
		
		System.out.println("--- Detalles de vehiculo---");
		vehiculo1.mostrarInfo();
		
		System.out.println("\n--- Detalles de moto---");
		moto1.mostrarInfo();

	}

}
