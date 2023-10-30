package segundoParcial2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {
	
	public List<Libro> eliminarLibrosRepetidos(List<Libro> libros){
		List<Libro> sinRepeLista = new ArrayList<Libro>();
//		for (Libro libro : libros) {
//			if(!sinRepeLista.contains(libro))
//				sinRepeLista.add(libro);
//		}
//		Collections.sort(sinRepe);
		
		Set<Libro> sinRepeSet = new TreeSet<Libro>();
		sinRepeSet.addAll(libros);
		sinRepeLista.addAll(sinRepeSet);
		
		return sinRepeLista;
	}
}
