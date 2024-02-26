package empresa;

public abstract class Empleado {

	private static final double VALOR_HIJO = 200;
	private static final double VALOR_CASADO = 100;

	private boolean casado;
	private int hijos;
	private int horasTrabajadas;

	public Empleado(boolean casado, int hijos, int horasTrabajadas) {
		this.casado = casado;
		this.hijos = hijos;
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getSalatioFamiliar() {
		double sf = this.hijos * Empleado.VALOR_HIJO;
		if (this.casado)
			sf += Empleado.VALOR_CASADO;
		return sf;

	}
	
	

	protected int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public abstract double getSalario();
	
}
