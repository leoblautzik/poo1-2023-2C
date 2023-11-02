package ejerciciosConGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListaGenericaTests {

	@Test
	void unionTest() {
		ListaGenerica<Integer> lg = new ListaGenerica<Integer>(); 
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(Arrays.asList(new Integer[]{1,2,3,6,7,8,9}));
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(Arrays.asList(new Integer[]{3,4,5,6}));
		List<Integer> l3 = new ArrayList<Integer>();
		l3.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
		Assertions.assertEquals(l3, lg.union(l1, l2));
	}
	
	@Test
	void interseccionTest() {
		ListaGenerica<Integer> lg = new ListaGenerica<Integer>(); 
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(Arrays.asList(new Integer[]{1,2,3,6,7,8,9}));
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(Arrays.asList(new Integer[]{3,4,5,6,-1,-2}));
		List<Integer> l3 = new ArrayList<Integer>();
		l3.addAll(Arrays.asList(new Integer[]{3,6}));
		Assertions.assertEquals(l3, lg.interseccion(l1, l2));
	}
	
	@Test
	void diferenciaSimetricaTest() {
		ListaGenerica<Integer> lg = new ListaGenerica<Integer>(); 
		List<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(Arrays.asList(new Integer[]{1,2,3,6,7,8,9}));
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(Arrays.asList(new Integer[]{3,4,5,6,-1,-2}));
		List<Integer> l3 = new ArrayList<Integer>();
		l3.addAll(Arrays.asList(new Integer[]{1,2,7,8,9,4,5,-1,-2}));
		Assertions.assertEquals(l3, lg.diferenciaSimetrica(l1, l2));
	}
}
