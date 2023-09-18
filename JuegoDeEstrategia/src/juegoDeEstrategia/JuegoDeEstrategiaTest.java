package juegoDeEstrategia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JuegoDeEstrategiaTest {

	@Test
	void soldadoTest() {
		Soldado rambo = new Soldado(new Punto(2,2));
		Soldado conan = new Soldado(new Punto(2,2));
		rambo.atacar(conan);
		rambo.atacar(conan);
		
		assertEquals(80, rambo.getEnergia());
		assertEquals(180, conan.getSalud());
		while(conan.estaVivo()) {
			if(!rambo.tieneEnergiaSuficiente())
				rambo.beberAgua();
			rambo.atacar(conan);
		}
		assertFalse(conan.estaVivo());
		
		Error thrown = assertThrows(Error.class,() -> conan.atacar(rambo));
		
	}

}
