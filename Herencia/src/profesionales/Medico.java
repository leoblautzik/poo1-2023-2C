package profesionales;

public class Medico extends Profesional{

	public Medico(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
//	@Override
//	public double getHonorario() {
//		return super.getHonorario();
//	}
	
	@Override
	public String toString() {
		return "Dr. " + super.toString();
	}

	

}
