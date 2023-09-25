package encapsulamiento;

import static org.junit.Assert.*;

import org.junit.Test;

public class PulsadoresTest {

	@Test
	public void pulsadoresTest() {
		
		MaquinaDePulsadores mdp = new MaquinaDePulsadores(10);
		
		assertEquals(0, mdp.numActivos());
		mdp.activarPulsador(2);
		mdp.activarPulsador(5);
		assertEquals(2, mdp.numActivos());
		int[]esperado = {2, 5};
		assertArrayEquals(esperado, mdp.pulsadoresActivos());
		mdp.activarPulsador(7);
		esperado = new int[3];
		esperado[0] = 2;
		esperado[1] = 5;
		esperado[2] = 7;
		assertArrayEquals(esperado, mdp.pulsadoresActivos());
		mdp.desactivarPulsador(5);
		esperado = new int[2];
		esperado[0] = 2;
		esperado[1] = 7;
		assertArrayEquals(esperado, mdp.pulsadoresActivos());
		
		
		
		
		
		
		
		
		
	}

}
