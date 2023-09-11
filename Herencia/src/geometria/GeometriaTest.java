package geometria;

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

}
