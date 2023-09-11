package vehiculos;

public class Autobus extends Vehiculo {

	private Persona [] pasajeros;
	int cantidadDePasajeros = 0;
	
	public Autobus(int cantidadDeAsientos) {
		super();
		this.pasajeros = new Persona[cantidadDeAsientos];
		
	}
	public Autobus(Persona chofer, int cantidadDeAsientos) {
		super(chofer);
		this.pasajeros = new Persona[cantidadDeAsientos];
		
	}
	
	public void agregarPasajero(Persona p) {
		if(cantidadDePasajeros < pasajeros.length) {
			pasajeros[cantidadDePasajeros] = p;
			cantidadDePasajeros++;
		}
	}
	
	public void bajarPasajero() {
		if(cantidadDePasajeros > 0)
			cantidadDePasajeros--;
	}
	
	@Override
	public void cambiarChofer(Persona nuevoChofer) {
		if(this.cantidadDePasajeros == 0)
			super.asignarChofer(nuevoChofer);
	}
	
}
