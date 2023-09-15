package profesionales;

public class Endodoncista extends Dentista {

	public Endodoncista(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double getHonorario() {
		return super.getHonorario() * 1.25;
	}
	
	@Override
	public String toString() {
		return "Endodoncista " + super.toString();
	}

}
