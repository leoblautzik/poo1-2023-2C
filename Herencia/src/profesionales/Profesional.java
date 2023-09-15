package profesionales;

public abstract class Profesional {
	
	private static final double HONORARIO_BASICO = 500000.00;
	private String nombre;
	private String apellido;
	
	public Profesional(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public double getHonorario() {
		return Profesional.HONORARIO_BASICO;
	}
	
	@Override
	public String toString() {
		return this.nombre + "  " + this.apellido + " Honorario: " + this.getHonorario();
	}
		

}
