package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class CerraduraTest {

	@Test
	public void cerraduraInicialTest() {
		Cerradura trabex = new Cerradura(123456, 3);
		
		assertTrue(trabex.estaAbierta());
		assertFalse(trabex.estaCerrada());
		assertFalse(trabex.fueBloqueada());
		
		assertEquals(0, trabex.contarAperturasExitosas());
		assertEquals(0, trabex.contarAperturasFallidas());
		
	}
	
	@Test
	public void cerraduraCerrarTest() {
		Cerradura trabex = new Cerradura(123456, 3);
		trabex.cerrar();
			
		assertFalse(trabex.estaAbierta());
		assertTrue(trabex.estaCerrada());
		assertFalse(trabex.fueBloqueada());
		
		assertEquals(0, trabex.contarAperturasExitosas());
		assertEquals(0, trabex.contarAperturasFallidas());
		
	}
	
	@Test
	public void cerraduraAbrirTest() {
		Cerradura trabex = new Cerradura(123456, 3);
		trabex.cerrar();
		trabex.abrir(123456);
		trabex.abrir(234567);
				
		assertTrue(trabex.estaAbierta());
		assertFalse(trabex.estaCerrada());
		assertFalse(trabex.fueBloqueada());
		
		assertEquals(1, trabex.contarAperturasExitosas());
		assertEquals(0, trabex.contarAperturasFallidas());
		
	}
	
	@Test
	public void cerraduraAbrirFallaTest() {
		Cerradura trabex = new Cerradura(123456, 3);
		trabex.cerrar();
		trabex.abrir(234567);
				
		assertFalse(trabex.estaAbierta());
		assertTrue(trabex.estaCerrada());
		assertFalse(trabex.fueBloqueada());
		
		assertEquals(0, trabex.contarAperturasExitosas());
		assertEquals(1, trabex.contarAperturasFallidas());
		
	}
	
	@Test
	public void cerraduraAbrirFallaPeroNoBloqueaTest() {
		Cerradura trabex = new Cerradura(123456, 3);
		trabex.cerrar();
		trabex.abrir(234567);
		assertEquals(1, trabex.contarAperturasFallidas());
		trabex.abrir(234867);
		assertEquals(2, trabex.contarAperturasFallidas());
		trabex.abrir(123456);
		assertTrue(trabex.estaAbierta());
		assertFalse(trabex.estaCerrada());
		assertFalse(trabex.fueBloqueada());
		
		assertEquals(1, trabex.contarAperturasExitosas());
		assertEquals(0, trabex.contarAperturasFallidas());
		
	}
	
	@Test(expected=Error.class)
	public void cerraduraAbrirFallaHastaBloquearTest() {
		Cerradura trabex = new Cerradura(123456, 3);
		trabex.cerrar();
		trabex.abrir(234567);
		assertEquals(1, trabex.contarAperturasFallidas());
		trabex.abrir(234867);
		assertEquals(2, trabex.contarAperturasFallidas());
		trabex.abrir(023456);
		assertEquals(3, trabex.contarAperturasFallidas());
		assertFalse(trabex.estaAbierta());
		assertTrue(trabex.estaCerrada());
		assertTrue(trabex.fueBloqueada());
		trabex.cerrar();
		
		assertEquals(0, trabex.contarAperturasExitosas());
		trabex.abrir(123456);
		
		
	}

}
