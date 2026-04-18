package CuentaYCuentaCorriente;

public class CuentaCorriente extends Cuenta {

	private double limiteSobregiro;

	public CuentaCorriente(String titular, Double saldo, double limiteSobregiro) {
		super(titular, saldo);
		this.limiteSobregiro = limiteSobregiro;
	}

	public double getLimiteSobregiro() {
		return limiteSobregiro;
	}

	public void setLimiteSobregiro(double limiteSobregiro) {
		this.limiteSobregiro = limiteSobregiro;
	}
	
	@Override
	public boolean retirar(double monto) {
		if(this.saldo >= monto) {
			return super.retirar(monto);
		}
		
		else if(monto <= (this.saldo + this.limiteSobregiro)) {
			this.saldo -= monto;
			System.out.println("Retiro de Q" + monto + " utilizando SOBREGIRO. Nuevo saldo: Q" + this.saldo);
            return true;
		}
		else {
            System.out.println("Error: Se excedió el límite de sobregiro. No se pueden retirar Q" + monto + ".");
            return false;
        }
	}
}
