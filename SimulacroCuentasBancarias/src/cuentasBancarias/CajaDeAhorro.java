
public class CajaDeAhorro extends Cuenta {

	public CajaDeAhorro(int dni) {
		super(dni);
	}

	@Override
	public boolean haySaldoSuficiente(double importe) {
		return super.getSaldo() >= importe;
	}

}
