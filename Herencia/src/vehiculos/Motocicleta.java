package vehiculos;

public class Motocicleta extends Vehiculo {

	private Persona acompaniante;
	
	public Motocicleta(Persona chofer) {
		super(chofer);
	}
	
	public Motocicleta() {
		super();
	}
	
	public void subirAcompaniante(Persona a) {
		if(this.acompaniante == null)
			this.acompaniante = a;
	}
	
	public void bajarAcompaniante() {
		this.acompaniante = null;
	}
	
	
	
	public Persona getAcompaniante() {
		return acompaniante;
	}

	@Override
	public void cambiarChofer(Persona nuevoChofer) {
		if(this.acompaniante == null)
			super.asignarChofer(nuevoChofer);
	}
	
	
}
