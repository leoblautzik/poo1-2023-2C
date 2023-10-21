package pilas_colas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpresionBalanceadaTest {

	@Test
	void ejemploBalanceadoTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		
		assertTrue(eb.estaBalanceada("[()]{}{[()()]()}"));
	
	}
	
	@Test
	void ejemploNoBalanceadoTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		assertFalse(eb.estaBalanceada("[(])"));
	}
	
	@Test
	void empiezaConCierreTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		assertFalse(eb.estaBalanceada("][]()["));
	}
	@Test
	void unoDeAperturaDeMasTest() {
		ExpresionBalanceada eb = new ExpresionBalanceada();
		assertFalse(eb.estaBalanceada("[()]{}{[()()]()"));
	}

}
