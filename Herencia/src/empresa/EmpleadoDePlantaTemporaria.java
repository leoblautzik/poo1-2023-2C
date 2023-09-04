package empresa;

public class EmpleadoDePlantaTemporaria extends Empleado {
	private static final double VALOR_HORA = 200;
	
	
	public EmpleadoDePlantaTemporaria(boolean casado, int hijos, int horasTrabajadas) {
		super(casado, hijos, horasTrabajadas);
		
	}
	
	@Override
	public double getSalario() {
		return super.getHorasTrabajadas() * EmpleadoDePlantaTemporaria.VALOR_HORA +
				super.getSalatioFamiliar();
	}
	
	

}
