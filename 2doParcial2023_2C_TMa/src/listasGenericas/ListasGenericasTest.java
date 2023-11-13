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
		TodosMayores<Integer> tm = new TodosMayores<Integer>();
		List<Integer> l1 = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
		List<Integer> l2 = Arrays.asList(new Integer[]{0,-1,-2,-3,-4,-5,-6,-7,-8,-9});
		assertTrue(tm.sonTodosMayores(l1, l2));
	}
	
	@Test
	void integerFalseTest() {
		TodosMayores<Integer> tm = new TodosMayores<Integer>();
		List<Integer> l1 = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
		List<Integer> l2 = Arrays.asList(new Integer[]{0,-1,-2,-3,-4,-5,-6,-7,-8,9});
		assertFalse(tm.sonTodosMayores(l1, l2));
	}
	
	@Test
	void stringTrueTest() {
		TodosMayores<String> tm = new TodosMayores<String>();
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		l1.add("R");
		l1.add("S");
		l2.add("A");
		l2.add("B");
		assertTrue(tm.sonTodosMayores(l1, l2));
	}
	
	@Test
	void stringFalseTest() {
		TodosMayores<String> tm = new TodosMayores<String>();
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		l1.add("R");
		l1.add("S");
		l2.add("A");
		l2.add("B");
		l2.add("T");
		assertFalse(tm.sonTodosMayores(l1, l2));
	}
	
	

}
