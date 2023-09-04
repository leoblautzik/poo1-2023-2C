package empresa;

public class EmpleadoDePlantaPermanente extends Empleado {
	private static final double VALOR_ANIO = 100;
	private static final double VALOR_HORA = 300;
	
	private int aniosDeAntiguedad;

	protected int getAniosDeAntiguedad() {
		return aniosDeAntiguedad;
	}

	public EmpleadoDePlantaPermanente(boolean casado, int hijos, int horasTrabajadas, int antiguedad) {
		super(casado, hijos, horasTrabajadas);
		this.aniosDeAntiguedad = antiguedad;
	}
	
	public double getAntiguedad() {
		return this.aniosDeAntiguedad * EmpleadoDePlantaPermanente.VALOR_ANIO; 
	}
	
	@Override
	public double getSalario() {
		return super.getHorasTrabajadas() * EmpleadoDePlantaPermanente.VALOR_HORA +
				this.getAntiguedad() + super.getSalatioFamiliar();
	}

	
	
	
	

	
	
	

}
