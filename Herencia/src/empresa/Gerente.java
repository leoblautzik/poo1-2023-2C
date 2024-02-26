package empresa;

public class Gerente extends EmpleadoDePlantaPermanente {

	private static final double VALOR_ANIO = 150;
	private static final double VALOR_HORA = 400;
	
	public Gerente(boolean casado, int hijos, int horasTrabajadas, int antiguedad) {
		super(casado, hijos, horasTrabajadas, antiguedad);
		
	}
	
	public double getAntiguedad() {
		return super.getAniosDeAntiguedad() * Gerente.VALOR_ANIO; 
	}
	
	@Override
	public double getSalario() {
		return super.getHorasTrabajadas() * Gerente.VALOR_HORA +
				this.getAntiguedad() + super.getSalatioFamiliar();
	}
	


}
