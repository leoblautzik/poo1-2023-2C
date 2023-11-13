package listasGenericas;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TodosMayores<T extends Comparable<T>> {
	
	/**
	 * 
	 * @param l1
	 * @param l2
	 * @return true si todos los elementos de l1 son mayores que cualquiera de l2
	 */
	public boolean sonTodosMayores(List<T> l1, List<T> l2) {
		Collections.sort(l1);
		Collections.sort(l2);
		return l1.get(0).compareTo(l2.get(l2.size()-1)) > 0;
	}
	
	public boolean sonTodosMayoresConTreeSet(List<T> l1, List<T> l2) {
		TreeSet<T> ts1 = new TreeSet<T>(); 
		TreeSet<T> ts2 = new TreeSet<T>(); 
		ts1.addAll(l1);
		ts2.addAll(l2);		
		return ts1.first().compareTo(ts2.last()) > 0;
	}

}
