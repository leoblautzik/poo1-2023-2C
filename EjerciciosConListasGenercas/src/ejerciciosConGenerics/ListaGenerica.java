package ejerciciosConGenerics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class ListaGenerica<T> {

	/**
	 * Escribir un método que reciba dos listas como parámetros y devuelva una
	 * tercera lista que sea la diferencia entre la primera y la segunda. La
	 * diferencia entre dos listas son los objetos que están en la primera y NO
	 * están en la segunda. Considere que los objetos que están contenidos en las
	 * listas tienen órden total (Implementan Comparable y tienen implementado su
	 * propio equals y hashCode). Ejemplificar con dos casos JUnit, uno para Integer
	 * y otro para Strings.
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */

	public List<T> union(List<T> l1, List<T> l2) {
		List<T> aux = new ArrayList<T>();
		// usando un set para no repetir los que estan en ambas listas.
		Set<T> s = new HashSet<T>();
		for (T t : l1)
			s.add(t);
		for (T t : l2)
			s.add(t);
		aux.addAll(s);
		return aux;
	}
	
	/*
	 * Idem con interseccion de dos listas
	 */
	public List<T> interseccion(List<T> l1, List<T> l2) {
		List<T> aux = new ArrayList<T>();
		
		for (T t : l1)
			if(l2.contains(t))
				aux.add(t);
		return aux;
	}
	
	
	/*
	 * Idem con diferencia simetrica de dos listas
	 */
	public List<T> diferenciaSimetrica(List<T> l1, List<T> l2) {
		List<T> aux = new ArrayList<T>();
		
		for (T t : l1)
			if(!l2.contains(t))
				aux.add(t);
		for (T t : l2)
			if(!l1.contains(t))
				aux.add(t);
		
		return aux;
	}
	
	/*
	 * Idem con diferencia l1 - l2 de dos listas
	 */
	public List<T> diferencia(List<T> l1, List<T> l2) {
		List<T> aux = new ArrayList<T>();
		
		for (T t : l1)
			if(!l2.contains(t))
				aux.add(t);
		return aux;
	}
	
	/*
	 * Idem con invertir una lista
	 * a- Retorna otra lista pero invertida
	 * b- Invierte la misma Lista 
	 */
	public List<T> a_invertir(List<T> l1) {
		List<T> aux = new ArrayList<T>();
		Stack<T> pila = new Stack<T>();
		for (T t : l1)
			pila.push(t);
		
		while(!pila.isEmpty()) {
			aux.add(pila.pop());
		}
		return aux;
	}
	
	public void b_invertir(List<T> l1) {
		Stack<T> pila = new Stack<T>();
		for (T t : l1)
			pila.push(t);
		l1.clear();
		while(!pila.isEmpty()) {
			l1.add(pila.pop());
		}
	}
}
