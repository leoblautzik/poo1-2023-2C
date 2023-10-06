package listasDeNoche;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class PracticaListas {

	/**
	 * Escribir un método que reciba dos listas de números enteros ordenados y
	 * devuelva una tercera lista de números enteros, con todos los elementos de las
	 * listas que recibió, manteniendo el orden. Por ejemplo, si recibe las listas
	 * [1,3,5,6,8,9,10] y [2,4,7], debe devolver [1,2,3,4,5,6,7,8,9,10].
	 *
	 */

	public List<Integer> dosListasEnOtraOrdenada(List<Integer> l1, List<Integer> l2) {
		List<Integer> aux = new LinkedList<Integer>();

//		for (Integer cadaUno : l1) {
//			aux.add(cadaUno);
//		}
//		
//		for (Integer eleme : l2) {
//			aux.add(eleme);
//		}

		aux.addAll(l1);
		aux.addAll(l2);

		Collections.sort(aux);

		return aux;
	}

	/**
	 * Escribe el método eliminarDuplicados, que recibe una lista de enteros y
	 * devuelve una nueva lista con los mismos elementos pero eliminando los
	 * repetidos. Por ejemplo, si la lista de entrada es: [1, 2, 2, 1, 4, 2, 4, 3],
	 * la salida sería: [1, 2, 4, 3].
	 * 
	 */

	public List<Integer> eliminarDuplicados(List<Integer> l) {
		List<Integer> aux = new LinkedList<Integer>();
		// magia

//		for (Integer item : l) {
//			if (!aux.contains(item))
//				aux.add(item);
//
//		}
		Set<Integer> conjunto = new LinkedHashSet<Integer>();
		conjunto.addAll(l);
		aux.addAll(conjunto);

		return aux;
	}

	/**
	 * Escriba un método que reciba una lista de enteros y la devuelva invertida.
	 * Por ejemplo, si recibe la lista [2, 1, 3, 5, 4] devolverá la lista [4, 5, 3,
	 * 1, 2].
	 */

	public List<Integer> invertirLista(List<Integer> l) {
		List<Integer> aux = new LinkedList<Integer>();
		// magia
//		for (int i = l.size() - 1; i >= 0; i--)
//			aux.add(l.get(i));

		ListIterator<Integer> litr = l.listIterator(l.size());

		while (litr.hasPrevious()) {
			aux.add(litr.previous());
		}

		return aux;

	}

	public static void main(String[] args) {

		PracticaListas pl = new PracticaListas();

		List<Integer> l1 = new ArrayList<Integer>(100);
		List<Integer> l2 = new ArrayList<Integer>();

		l1.addAll(Arrays.asList(1, 3, 5, 6, 8, 9, 10));
		l2.addAll(Arrays.asList(2, 4, 7));

		List<Integer> l3 = pl.dosListasEnOtraOrdenada(l1, l2);

		System.out.println(l3);

	}

}
