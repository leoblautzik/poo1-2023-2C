package conjuntos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoSet {

	public static void main(String[] args) {
		
		Set<Integer> enteros = new HashSet<Integer>();
		
		enteros.add(2);
		enteros.add(-1);
		enteros.add(-10);
		
		System.out.println(enteros);
		
		
		Set<Punto> puntos = new TreeSet<Punto>();
		
		puntos.add(new Punto(-1, 1));
		puntos.add(new Punto(-1, -1));
		puntos.add(new Punto(1, -1));
		puntos.add(new Punto(1, 1));
		
		System.out.println(puntos);

	}

}
