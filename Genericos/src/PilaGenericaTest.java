import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaGenericaTest {

	@Test
	void enterosTest() {
		PilaGenerica<Integer> pila = new PilaGenerica<Integer>();

		pila.apilar(3);
		pila.apilar(4);

		assertEquals(4, pila.ver());
		assertEquals(4, pila.ver());
		pila.desapilar();
		assertEquals(3, pila.ver());
	}

	@Test
	void StrigTest() {
		PilaGenerica<String> pila = new PilaGenerica<String>();

		pila.apilar("Hola");
		pila.apilar("Mundo");

		assertEquals("Mundo", pila.ver());

		pila.desapilar();
		assertEquals("Hola", pila.ver());
	}

}
