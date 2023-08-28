package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class SegmentoTest {

	@Test
	public void longitudTest() {
		Segmento s = new Segmento(1,1,5,1);
		double esperado = 4;
		double obtenido = s.getLongitud();
		assertEquals(esperado, obtenido, 0.001);
	}

	@Test
	public void paraleloAXTest() {
		Segmento s = new Segmento(1,1,5,1);
		assertTrue(s.esParaleloAlEjeX());
	}
	
	@Test
	public void paraleloAYTest() {
		Segmento s = new Segmento(4,1,4,-10);
		assertTrue(s.esParaleloAlEjeY());
	}
	
	@Test
	public void sonPparalelosTest() {
		Segmento s1 = new Segmento(1,1,4,4);
		Segmento s2 = new Segmento(1,-1,4,2);
		assertTrue(s1.esParalelo(s2));
		assertTrue(s2.esParalelo(s1));
		
	}
	
}
