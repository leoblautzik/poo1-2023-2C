package listasGenericas;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TodosMenores<T extends Comparable<T>> {
	
	/**
	 * 
	 * @param l1
	 * @param l2
	 * @return true si todos los elementos de l1 son mayores que cualquiera de l2
	 */
	public boolean sonTodosMenores(List<T> l1, List<T> l2) {
		Collections.sort(l1);
		Collections.sort(l2);
		return l1.get(l1.size()-1).compareTo(l2.get(0)) < 0;
	}
	
	public boolean sonTodosMenoresConTreeSet(List<T> l1, List<T> l2) {
		TreeSet<T> ts1 = new TreeSet<T>(); 
		TreeSet<T> ts2 = new TreeSet<T>(); 
		ts1.addAll(l1);
		ts2.addAll(l2);		
		return ts1.last().compareTo(ts2.first()) < 0;
	}

}
