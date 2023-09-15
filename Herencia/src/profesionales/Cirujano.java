package profesionales;

public class Cirujano extends Medico {

	public Cirujano(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public double getHonorario() {
		return super.getHonorario() * 1.25;
	}

}
