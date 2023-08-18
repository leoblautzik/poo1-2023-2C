package encapsulamiento;

public class Nota {

	private int valorNota;

	public Nota(int valorNota) {
		setValorNota(valorNota);
	}

	private void setValorNota(int valorNota) {
		if (esNotaValida(valorNota))
			this.valorNota = valorNota;
	}

	public int obtenerValor() {
		return this.valorNota;
	}

	public boolean aprobado() {
		return this.obtenerValor() >= 4;
	}

	public boolean desaprobado() {
		return !this.aprobado();
	}

	public void recuperar(int nuevoValor) {
		if (esNotaValida(nuevoValor)) {
			if (nuevoValor > this.valorNota)
				this.valorNota = nuevoValor;
		}
	}

	private boolean esNotaValida(int nota) {
		if (nota < 0 || nota > 10)
			throw new Error("Nota invalida");
		return true;
	}

	public static void main(String[] args) {
		Nota p1 = new Nota(4);
		System.out.println(p1.obtenerValor());
		// Nota p2 = new Nota(14);
		// Nota p3 = new Nota(-1);
		p1.recuperar(3);
		System.out.println(p1.obtenerValor());
		
	}

}
