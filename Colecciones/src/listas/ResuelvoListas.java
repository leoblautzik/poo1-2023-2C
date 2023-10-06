package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class ResuelvoListas {

	/**
	 * Escribir un método que reciba dos listas de números enteros ordenados y
	 * devuelva una tercera lista de números enteros, con todos los elementos de las
	 * listas que recibió, manteniendo el orden.
	 * 
	 * Por ejemplo, si recibe las listas [1,3,5,6,8,9,10] y [2,4,7], debe devolver
	 * [1,2,3,4,5,6,7,8,9,10].
	 */

	List<Integer> dosListasOrdenadasEnUna(List<Integer> l1, List<Integer> l2) {
		List<Integer> aux = new ArrayList<Integer>();

		for (Integer i : l1)
			aux.add(i);

		for (Integer i : l2)
			aux.add(i);

		Collections.sort(aux);

		return aux;

	}

	/**
	 * Escribe el método eliminarDuplicados, que recibe una lista de enteros y
	 * devuelve una nueva lista con los mismos elementos pero eliminando los
	 * repetidos. Por ejemplo, si la lista de entrada es: [1, 2, 2, 1, 4, 2, 4, 3],
	 * la salida sería: [1, 2, 4, 3].
	 */

	public List<Integer> eliminarDuplicados(List<Integer> l) {
		List<Integer> aux = new ArrayList<Integer>();

		for (Integer i : l) {
			if (!aux.contains(i))
				aux.add(i);
		}
		return aux;
	}
	
	public List<Integer> eliminarDuplicadosConSet(List<Integer> l) {
		List<Integer> aux = new ArrayList<Integer>();
		Set<Integer> conjunto = new TreeSet<Integer>();
		
		conjunto.addAll(l);
		aux.addAll(conjunto);
		return aux;

	}

	/**
	 * Escriba un método que reciba una lista de enteros y la devuelva invertida.
	 * Por ejemplo, si recibe la lista [1, 2, 3, 4, 5] devolverá la lista [5, 4, 3,
	 * 2, 1].
	 * 
	 */
	public List<Integer> invertirLista(List<Integer> l1) {
		List<Integer> aux = new ArrayList<Integer>();

		for (int i = l1.size() - 1; i >= 0; i--) {
			aux.add(l1.get(i));
		}

		return aux;
	}
	
	public List<Integer> invertirListaConListIterator(List<Integer> l1) {
		List<Integer> aux = new ArrayList<Integer>();

		ListIterator<Integer> litr = l1.listIterator(l1.size());
		while(litr.hasPrevious()) {
			aux.add(litr.previous());
		}

		return aux;
	}

	public static void main(String[] args) {
		ResuelvoListas rl = new ResuelvoListas();

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		l1.addAll(Arrays.asList(-11, 2, -30, 4, 5, 6, 7));

		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(5);
		l1.add(6);

		ArrayList<Integer> l2 = new ArrayList<Integer>();
		l2.add(2);
		l2.add(4);
		l2.add(7);
		l2.add(9);
		l2.add(6);

		List<Integer> l3 = rl.dosListasOrdenadasEnUna(l1, l2);
		
		System.out.println(rl.eliminarDuplicados(l3));
		System.out.println(rl.eliminarDuplicadosConSet(l3));
		
		ArrayList<Integer> l5 = new ArrayList<Integer>();
		l5.addAll(Arrays.asList(-11, 2, -30, 4, 5, 6, 7));
		System.out.println(rl.invertirLista(l5));
		System.out.println(rl.invertirListaConListIterator(l5));

	}

}
