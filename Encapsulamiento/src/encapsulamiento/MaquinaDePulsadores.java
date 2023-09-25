package encapsulamiento;

public class MaquinaDePulsadores {

	private boolean[] pulsadores;

	public MaquinaDePulsadores(int n) {
		this.pulsadores = new boolean[n];
	}

	// activarPulsador: que recibirá un número de pulsador y hará que figure como
	// activo.
	public void activarPulsador(int p) {
		if (!esValido(p)) {
			throw new Error("Pulsador incorrecto");
		}
		pulsadores[p] = true;
	}

	// desactivarPulsador: que recibirá un número de pulsador y hará que figure como
	// NO activo.
	public void desactivarPulsador(int p) {
		if (!esValido(p)) {
			throw new Error("Pulsador incorrecto");
		}
		pulsadores[p] = false;
	}

	// activado: que recibirá un número de pulsador y devolverá si este está activo o no.
	public boolean activado(int p) {
		if (!esValido(p)) {
			throw new Error("Pulsador incorrecto");
		}
		return pulsadores[p];
	}

	// numActivos: que devolverá el número de pulsadores que están activados

	public int numActivos() {
		int contador = 0;
		for (boolean p : pulsadores)
			if (p)
				contador++;
		return contador;
	}
	
	public int[] pulsadoresActivos() {
		int cantActivos = this.numActivos();
		int j = 0;
		int[] aux = new int[cantActivos];
		for (int i = 0; i < pulsadores.length; i++)
			if (pulsadores[i]) {
				aux[j] = i;
				j++;
			}
		return aux;		
	}
	
	private boolean esValido(int p) {
		return p < this.pulsadores.length && p >= 0;
	}
}
