
public abstract class Cuenta implements Comparable<Cuenta> {

	private int dni;
	private double saldo = 0;
	
	public Cuenta(int dni) {
		this.dni = dni;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract boolean haySaldoSuficiente(double importe);
	
	public void depositar(double importe) {
		if(importe <= 0)
			throw new Error("Importe incorrecto");
		this.saldo += importe;
	}
	
	public double extraer(double importe) {
		if(importe <= 0)
			throw new Error("Importe incorrecto");
		if(!haySaldoSuficiente(importe))
			throw new Error("No hay saldo suficiente");
		this.saldo -= importe;
		return importe;
	}
	
	public void transferir(Cuenta destino, double importe) {
		destino.depositar(this.extraer(importe));
	}
	
	@Override
	public int compareTo(Cuenta c) {
		return Double.compare(this.getSaldo(), c.getSaldo());
	}

	@Override
	public String toString() {
		return dni + "\t\t" + this.getSaldo();
	}
	
	
	
			
}
