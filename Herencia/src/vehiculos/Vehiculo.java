package vehiculos;

public abstract class Vehiculo {

	private Persona chofer;
	private int km = 0;

	public Vehiculo(Persona chofer) {
		this.chofer = chofer;
	}

	public Vehiculo() {
		
	}

	public int getKmrecorridos() {
		return this.km;
	}

	public Persona getChofer() {
		return this.chofer;
	}

	protected void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}

	public abstract void cambiarChofer(Persona nuevoChofer);

}
