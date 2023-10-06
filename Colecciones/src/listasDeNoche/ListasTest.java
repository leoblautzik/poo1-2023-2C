package listasDeNoche;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListasTest {

	@Test
	void ejercicio2Test() {
		PracticaListas pl = new PracticaListas();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		List<Integer> l2 = new ArrayList<Integer>(Arrays.asList(2, 4, 7));

		// l1.addAll(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		// l2.addAll(Arrays.asList(2, 4, 7));
		List<Integer> esperada = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
		// esperada.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

		assertEquals(esperada, pl.dosListasEnOtraOrdenada(l1, l2));

		assertEquals(esperada, pl.dosListasEnOtraOrdenada(Arrays.asList(1, 3, 5, 6, 8, 9, 10), Arrays.asList(2, 4, 7)));

	}
	
	@Test
	void ejercicio3Test() {
		PracticaListas pl = new PracticaListas();

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 1, 4, 2, 4, 3));
		List<Integer> esperada = new ArrayList<Integer>(Arrays.asList(1, 2, 4, 3));
		
		assertEquals(esperada, pl.eliminarDuplicados(l1));
		
	}
	@Test
	void invertirListaTest() {
		PracticaListas lista = new PracticaListas();
		
		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(2, 1, 3, 5, 4));
		
		List<Integer> esperado = new LinkedList<Integer>(Arrays.asList(4, 5, 3, 1, 2));
		
		assertEquals(esperado, lista.invertirLista(l1));
	}
	
}
