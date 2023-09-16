package parcialGeometria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FigurasTest {

	@Test
	void trianguloTest() {
		Triangulo t = new Triangulo(5, 2);
		assertEquals(5, t.getArea());
	}
	
	@Test
	void rectanguloTest() {
		Rectangulo re = new Rectangulo(5, 2);
		assertEquals(10, re.getArea());
	}
	
	@Test
	void cuadradoTest() {
		Cuadrado cua = new Cuadrado(5);
		assertEquals(25, cua.getArea());
	}

}
