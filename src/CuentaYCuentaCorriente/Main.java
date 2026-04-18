package CuentaYCuentaCorriente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CuentaCorriente Cuenta1 = new CuentaCorriente("Alvaro", 1000.0, 500.0);
		System.out.println("--- Estado Inicial ---");
        System.out.println("Titular: " + Cuenta1.getTitular());
        System.out.println("Saldo actual: Q" + Cuenta1.getSaldo());
        System.out.println("Límite de sobregiro: Q" + Cuenta1.getLimiteSobregiro());
        System.out.println("----------------------\n");
        
        System.out.println("Intentando retirar Q400...");
        Cuenta1.retirar(400);
        
        System.out.println("\nIntentando retirar Q800...");
        Cuenta1.retirar(800);
        
        System.out.println("\nIntentando retirar Q400...");
        Cuenta1.retirar(400);
        
	}

}
