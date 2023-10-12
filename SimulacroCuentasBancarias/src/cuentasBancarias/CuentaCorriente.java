package cuentasBancarias;

public class CuentaCorriente extends Cuenta {
	private double descubierto;

	public CuentaCorriente(int dni, double descubierto) {
		super(dni);
		this.descubierto = descubierto;
	}

	@Override
	public boolean haySaldoSuficiente(double importe) {
		return super.getSaldo() + descubierto >= importe;
	}

}
