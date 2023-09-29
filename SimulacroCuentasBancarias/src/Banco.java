import java.util.ArrayList;
import java.util.Collections;

public class Banco {
	
	public Banco() {
		this.cuentas = new ArrayList<Cuenta>();
	}

	private ArrayList<Cuenta> cuentas;
	
	public Cuenta abrirCajaDeAhorro(int dni) {
		Cuenta aux = new CajaDeAhorro(dni);
		cuentas.add(aux);
		return aux;
	}

	public Cuenta abrirCuentaCorriente(int dni, double descubierto) {
		Cuenta aux = new CuentaCorriente(dni, descubierto);
		cuentas.add(aux);
		return aux;
	}
	
	
	public double totalSaldoEnDescubierto() {
		double total = 0;
		for (Cuenta c : cuentas)
			if (c.getSaldo() < 0)
				total += c.getSaldo();
		return Math.abs(total);
	}
	
	public void listarCuentas() {
		Collections.sort(cuentas);
		System.out.println("DNI" + "\t\t" + "Saldo");
		for (Cuenta c : cuentas)
			System.out.println(c);
	}

}
