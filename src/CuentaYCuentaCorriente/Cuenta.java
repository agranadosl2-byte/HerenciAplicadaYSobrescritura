package CuentaYCuentaCorriente;

public class Cuenta {

	protected String titular;
	protected Double saldo;
	public Cuenta(String titular, Double saldo) {
		super();
		this.titular = titular;
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		
		if(monto > 0) {
			this.saldo += monto;
			System.out.println("Depósito de Q" + monto + " exitoso. Saldo actual: Q" + this.saldo);
		}
	}
	

	public boolean retirar(double monto) {
        if (monto > 0 && this.saldo >= monto) {
            this.saldo -= monto;
            System.out.println("Retiro exitoso de Q" + monto + ". Saldo restante: Q" + this.saldo);
            return true;
        } else {
            System.out.println("Error: Fondos insuficientes para retirar Q" + monto + ".");
            return false;
        }
    }
	
	
}


