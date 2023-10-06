package primerparcial2023_2do_cuatrimestre;

public abstract class Deportista implements Comparable<Deportista> {
	protected static Double CUOTA_BASE = 5000.00;
	private int numeroDeSocio;
	private int diasSemanalesDeEntrenamiento;

	public Deportista(int numeroDeSocio, int diasSemanalesDeEntrenamiento) {
		if(diasSemanalesDeEntrenamiento > 7 || diasSemanalesDeEntrenamiento < 1)
			throw new Error("Dias de entrenamiento fuera de rango");
		this.numeroDeSocio = numeroDeSocio;
		this.diasSemanalesDeEntrenamiento = diasSemanalesDeEntrenamiento;
	}

	public int getNumeroDeSocio() {
		return numeroDeSocio;
	}

	public int getDiasSemanalesDeEntrenamiento() {
		return diasSemanalesDeEntrenamiento;
	}

	public abstract double getCuotaMensual();
	
	@Override
	public int compareTo(Deportista d) {
		return Integer.compare(this.numeroDeSocio, d.getNumeroDeSocio());
	}

	@Override
	public String toString() {
		return numeroDeSocio + "\t\t" + this.getCuotaMensual();
	}
	
	

}
