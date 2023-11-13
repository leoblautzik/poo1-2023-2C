package listasGenericas;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListasGenericasTest {

	@Test
	void integerTrueTest() {
		TodosMenores<Integer> tm = new TodosMenores<Integer>();
		List<Integer> l1 = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
		List<Integer> l2 = Arrays.asList(new Integer[]{0,-1,-2,-3,-4,-5,-6,-7,-8,-9});
		assertTrue(tm.sonTodosMenores(l2, l1));
	}
	
	@Test
	void integerFalseTest() {
		TodosMenores<Integer> tm = new TodosMenores<Integer>();
		List<Integer> l1 = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
		List<Integer> l2 = Arrays.asList(new Integer[]{0,-1,-2,-3,-4,-5,-6,-7,-8,9});
		assertFalse(tm.sonTodosMenores(l2, l1));
	}
	
	@Test
	void stringTrueTest() {
		TodosMenores<String> tm = new TodosMenores<String>();
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		l1.add("R");
		l1.add("S");
		l2.add("A");
		l2.add("B");
		assertTrue(tm.sonTodosMenores(l2, l1));
	}
	
	@Test
	void stringFalseTest() {
		TodosMenores<String> tm = new TodosMenores<String>();
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		l1.add("R");
		l1.add("S");
		l2.add("A");
		l2.add("B");
		l2.add("T");
		assertFalse(tm.sonTodosMenores(l2, l1));
	}
	
	

}
