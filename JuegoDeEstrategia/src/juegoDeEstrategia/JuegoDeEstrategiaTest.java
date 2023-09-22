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
		//rambo ataca hasta matar
		while(conan.estaVivo()) {
			if(!rambo.tieneEnergiaSuficiente())
				rambo.beberAgua();
			rambo.atacar(conan);
		}
		assertFalse(conan.estaVivo());
		
		Error thrown = assertThrows(Error.class,() -> conan.atacar(rambo));
		
	}
	
	@Test
	void arqueroTest() {
		Arquero legolas = new Arquero(new Punto(2,0));
		Arquero robinHood = new Arquero(new Punto(5,0));
		Soldado conan = new Soldado(new Punto(6,0));
		assertTrue(legolas.puedeAtacar(conan));
		assertFalse(robinHood.puedeAtacar(conan));
		legolas.atacar(conan);
		
		assertEquals(19,legolas.getCantidadDeFlechas());
		assertEquals(195, conan.getSalud());
		
		//atacar hasta quedar sin flechas
		
		//ToDo
		
		
	}	
	

}
