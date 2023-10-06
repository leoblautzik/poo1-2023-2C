package cuentasBancarias;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BancoConArreglo {
	
	private Cuenta [] cuentas;
	private int cantDeCuentasAgregadas = 0;

	public BancoConArreglo(int maxCantCuentas) {
		this.cuentas = new Cuenta[maxCantCuentas];
	}

	public Cuenta abrirCajaDeAhorro(int dni) {
		Cuenta aux = new CajaDeAhorro(dni);
		cuentas[cantDeCuentasAgregadas] = aux;
		cantDeCuentasAgregadas++;
		return aux;
	}

	public Cuenta abrirCuentaCorriente(int dni, double descubierto) {
		Cuenta aux = new CuentaCorriente(dni, descubierto);
		cuentas[cantDeCuentasAgregadas] = aux;
		cantDeCuentasAgregadas++;
		return aux;
	}

	public double totalSaldoEnDescubierto() {
		double total = 0;
		for (int i = 0; i < cantDeCuentasAgregadas; i++)
			if (cuentas[i].getSaldo() < 0)
				total += cuentas[i].getSaldo();
		return Math.abs(total);
	}

	public void listarCuentas() {
		//Collections.sort(cuentas);
		Cuenta [] cuentasAordenar = new Cuenta[cantDeCuentasAgregadas];
		
		for (int i = 0; i < cantDeCuentasAgregadas; i++)
			cuentasAordenar[i] = cuentas[i];
		Arrays.sort(cuentasAordenar);
		
		System.out.println("DNI" + "\t\t" + "Saldo");
		for (int i = 0; i < cantDeCuentasAgregadas; i++)
			System.out.println(cuentasAordenar[i]);
	}

}
