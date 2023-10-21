package palabra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalabraTest {

	@Test
	void eje1Test() {
		Palabra p = new Palabra();
		assertEquals("aloH", p.invertir("Hola"));
	}
	
	@Test
	void palabraVaciaTest() {
		Palabra p = new Palabra();
		assertEquals("", p.invertir(""));
	}
	
	@Test
	void palabraDeUnaLetraTest() {
		Palabra p = new Palabra();
		assertEquals("o", p.invertir("o"));
	}
	
	@Test
	void palindromoDeUnaLetraTest() {
		Palabra p = new Palabra();
		assertTrue(p.esPalindromo("o"));
	}
	
	@Test
	void palindromoDeCantidadParDeLetrasTest() {
		Palabra p = new Palabra();
		assertTrue(p.esPalindromo("123321"));
	}
	
	@Test
	void palindromoMayusculasYminusculasTest() {
		Palabra p = new Palabra();
		assertTrue(p.esPalindromo("NeuQuen"));
	}

}
