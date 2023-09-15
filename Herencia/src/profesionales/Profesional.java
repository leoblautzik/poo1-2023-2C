package profesionales;

public abstract class Profesional implements Comparable<Profesional> {

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
		return this.nombre + "  " + this.apellido + ", honorario: " + this.getHonorario();
	}

	@Override
	public int compareTo(Profesional p) {
//		if (this.getHonorario() < p.getHonorario())
//			return -1;
//		else if (this.getHonorario() > p.getHonorario())
//			return 1;
//		else
//			return 0;
		
		return (-1) * Double.compare(this.getHonorario(), p.getHonorario());
	}

}
