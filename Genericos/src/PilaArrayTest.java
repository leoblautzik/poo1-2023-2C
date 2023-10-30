import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilaArrayTest {

	@Test
	void pilaArrayTest() throws PilaVaciaException, PilaLlenaException {
		PilaArray<Integer> pila = new PilaArray<Integer>();
		
		pila.apilar(3);
		pila.apilar(4);
		//pila.apilar((int) 4.3);

		assertEquals(4, pila.ver());
		assertEquals(4, pila.ver());
		pila.desapilar();
		assertEquals(3, pila.ver());
		
		
	}
	@Test
	void StrigTest() throws PilaVaciaException {
		PilaArray<String> pila = new PilaArray<String>();

		try {
			pila.apilar("Hola");
			pila.apilar("Mundo");
		} catch (PilaLlenaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		assertEquals("Mundo", pila.ver());

		pila.desapilar();
		assertEquals("Hola", pila.ver());
	}

}
