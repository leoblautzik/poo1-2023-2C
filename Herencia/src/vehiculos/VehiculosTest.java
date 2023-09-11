package vehiculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VehiculosTest {

	@Test
	void crearMotoTest() {
		Persona cacho = new Persona();
		Motocicleta miMoto = new Motocicleta();
		assertEquals(0, miMoto.getKmrecorridos());
		assertEquals(null, miMoto.getChofer());
		miMoto.asignarChofer(cacho);
		assertEquals(cacho, miMoto.getChofer());
	}
	
	@Test
	void cambiarChoferSinAcompanianteMotoTest() {
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		Persona liz = new Persona();
		Motocicleta miMoto = new Motocicleta(cacho);
		miMoto.subirAcompaniante(liz);
		miMoto.cambiarChofer(pepe);
		assertEquals(cacho, miMoto.getChofer());
		miMoto.bajarAcompaniante();
		miMoto.cambiarChofer(pepe);
		assertEquals(pepe, miMoto.getChofer());
	}
	
	@Test
	void cambiarChoferConAcompanianteMotoTest() {
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		Persona liz = new Persona();
		Vehiculo miMoto = new Motocicleta(cacho);
		Motocicleta otraMoto = (Motocicleta)miMoto;
		otraMoto.subirAcompaniante(liz);
		assertEquals(liz, otraMoto.getAcompaniante());
		miMoto.cambiarChofer(pepe);
		assertEquals(cacho, miMoto.getChofer());
	}
	
	@Test
	void vehiculoTest() {
		Persona cacho = new Persona();
		Vehiculo miMoto = new Motocicleta();
		assertEquals(0, miMoto.getKmrecorridos());
		assertEquals(null, miMoto.getChofer());
		miMoto.asignarChofer(cacho);
		assertEquals(cacho, miMoto.getChofer());
	}
	
	@Test
	void cambiarChoferSinAcompanianteBondiTest() {
		Persona cacho = new Persona();
		Persona pepe = new Persona();
		Persona liz = new Persona();
		Autobus miBondi = new Autobus(cacho, 20);
		miBondi.agregarPasajero(liz);
		miBondi.cambiarChofer(pepe);
		assertEquals(cacho, miBondi.getChofer());
		miBondi.bajarPasajero();
		miBondi.cambiarChofer(pepe);
		assertEquals(pepe, miBondi.getChofer());
	}

}
