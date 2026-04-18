package EmpleadoYGerente;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Empleado> planilla = new ArrayList<>();
		
		planilla.add(new Empleado("Juan", 5000.00));
		planilla.add(new Gerente("Alvaro", 55000.00, 500.00));
		
		System.out.println("--- Planilla Menusual ---");
		
		double totalApagar = 0;
		
		for (Empleado emp : planilla) {
            System.out.println("Trabajador: " + emp.getNombre());
            System.out.println("Salario a depositar: Q" + emp.calcularSalario());
            System.out.println("--------------------------------");
            
            totalApagar += emp.calcularSalario();
        }

        System.out.println("TOTAL PLANILLA DE LA EMPRESA: Q" + totalApagar);

	}

}
