package pilas_colas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ColaConDosPilasTest {

	@Test
	void acolarTest() {
		ArrayDeque<Integer> ccdp = new ArrayDeque<Integer>();

		ccdp.enqueue(1);
		ccdp.enqueue(2);
		ccdp.enqueue(3);

		assertEquals(1, ccdp.peek());

	}

	@Test
	void desencolarTest() {
		ArrayDeque<Integer> ccdp = new ArrayDeque<Integer>();

		ccdp.enqueue(1);
		ccdp.enqueue(2);
		ccdp.enqueue(3);

		assertEquals(1, ccdp.dequeue());
		assertEquals(2, ccdp.peek());
		ccdp.enqueue(4);
		ccdp.enqueue(5);
		assertEquals(2, ccdp.peek());
		assertEquals(2, ccdp.dequeue());
		assertEquals(3, ccdp.dequeue());
		assertEquals(4, ccdp.dequeue());
		assertEquals(5, ccdp.peek());
		ccdp.dequeue();

		assertNull(ccdp.dequeue());
		assertNull(ccdp.peek());

	}

	@Test
	void conStringTest() {
		ArrayDeque<String> ccdp = new ArrayDeque<String>();

		ccdp.enqueue("1");
		ccdp.enqueue("2");
		ccdp.enqueue("3");
		assertEquals("1", ccdp.dequeue());
		assertEquals("2", ccdp.peek());
		ccdp.enqueue("4");
		ccdp.enqueue("5");
		assertEquals("2", ccdp.peek());
	}
	
	@Test
	void conDoubleTest() {
		ArrayDeque<Double> ccdp = new ArrayDeque<Double>();

		ccdp.enqueue(1.0);
		ccdp.enqueue(2.0);
		ccdp.enqueue(3.0);

		assertEquals(1.0, ccdp.dequeue());
		assertEquals(2.0, ccdp.peek());
		ccdp.enqueue(4.0);
		ccdp.enqueue(5.0);
		assertEquals(2.0, ccdp.peek());
		assertEquals(2.0, ccdp.dequeue());
		assertEquals(3.0, ccdp.dequeue());
		assertEquals(4.0, ccdp.dequeue());
		assertEquals(5.0, ccdp.peek());
		ccdp.dequeue();

		assertNull(ccdp.dequeue());
		assertNull(ccdp.peek());

	}
}
