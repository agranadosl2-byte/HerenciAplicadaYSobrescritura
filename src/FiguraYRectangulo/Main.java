package FiguraYRectangulo;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Figura> misFiguras = new ArrayList<>();
		
		misFiguras.add(new Rectangulo("Terreno Rectangular", 5.0, 10.0));
		misFiguras.add(new Circulo("Piscina Circular", 3.0));
		
		System.out.println("--- CÁLCULO DE ÁREAS ---");
		
		for (Figura f : misFiguras) {
            System.out.println("Figura: " + f.getNombre());
            System.out.println("Área calculada: " + f.calcularArea());
            System.out.println("------------------------");
        }
	}

}
