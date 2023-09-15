package profesionales;

public class CirujanoCardiovascular extends Cirujano {

	public CirujanoCardiovascular(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	@Override
	public double getHonorario() {
		return super.getHonorario() * 1.25;
	}

}
