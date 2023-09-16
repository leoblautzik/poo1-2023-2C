package appGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GeometriaTest {

	@Test
	void elipseTest() {
		Elipse e = new Elipse(1, 1, 2, 4);
		assertEquals(25.13, e.getArea(), 0.01);
		assertEquals(4, e.getRadioMayor());

		Figura ef = new Elipse(1, 1, 2, 4);
		Elipse otraE = null;
		if (ef instanceof Elipse) {
			otraE = (Elipse) ef;
			assertEquals(4, otraE.getRadioMayor());
		}

	}
	
	@Test
	void circuloTest() {
		Circulo c = new Circulo(1,1,4);
		assertEquals(50.26, c.getArea(), 0.01);
	}
	
	@Test
	void rectanguloTest() {
		Rectangulo r = new Rectangulo(2,2,5,4);
		assertEquals(6, r.getArea(), 0.1);
	}
	
	@Test
	void cuadradoTest() {
		Cuadrado cu = new Cuadrado(2,2,4);
		assertEquals(16, cu.getArea(), 0.1);
	}
	@Test
	public void trianguloTest() {
		//Triangulo tr = new Triangulo(0,0,5,5,0,10);
		Triangulo tr = new Triangulo(1.0,1.0,6.0,6.0,1.0,11.0); 
		assertEquals(25, tr.getArea(), 0.01);
	}
	@Test
	public void trianguloDebeDar1Test() {
		Triangulo tr = new Triangulo(5,0,7,0,7,1);
		tr.desplazar(1, 2);
		assertEquals(1, tr.getArea(), 0.01);
		tr.desplazar(-12.1, 2.23);
		assertEquals(1, tr.getArea(), 0.01);
	}
	
	@Test
	public void segmentosParalelosTest() {
		Segmento s1 = new Segmento(1,1,10,10);
		Segmento s2 = new Segmento(-1,-1,10,10);
		assertTrue(s1.esParaleloA(s2));
	}
	
	@Test
	public void segmentosParalelosPendienteNegativaTest() {
		Segmento s1 = new Segmento(-1,0,0,-1);
		Segmento s2 = new Segmento(0,4,4,0);
		assertTrue(s1.esParaleloA(s2));
	}

}
