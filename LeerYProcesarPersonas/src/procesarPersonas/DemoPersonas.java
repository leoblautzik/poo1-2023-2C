package procesarPersonas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DemoPersonas {

	public static LinkedList<Persona> getPersonas(String archivoDePersonas) {
		File f = null;
		FileReader fr = null;
		BufferedReader br = null;
		LinkedList<Persona> llp = new LinkedList<Persona>();
		String linea;
		String[] datos;

		f = new File(archivoDePersonas);
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				datos = linea.split(" ");
//				Integer dni = Integer.parseInt(datos[0]);
//				Integer edad = Integer.parseInt(datos[2]);
//				Persona p = new Persona(dni, datos[1], edad);
				llp.add(new Persona(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2])));
				linea = br.readLine();
				fr.close();
			}

		} catch (FileNotFoundException fnfe) {

		} catch (IOException ioe) {

		}
		return llp;
	}

	public static LinkedList<Persona> getPersonasMayores(LinkedList<Persona> personas, int edad) {
		LinkedList<Persona> lpm = new LinkedList<Persona>();

		for (Persona persona : personas) {
			if (persona.getEdad() > edad)
				lpm.add(persona);
		}
		Collections.sort(lpm);

		return lpm;
	}

	public static void generarArchivoDePersonasMayores(LinkedList<Persona> l, int edad) throws IOException {
		String salida = "personasMayoresDe" + edad + ".out";
		LinkedList<Persona> mayores = getPersonasMayores(l, edad);

		escribirLista(salida, mayores);
	}

	public static void escribirLista(String salida, List<Persona> l) throws IOException {
		PrintWriter pr = new PrintWriter(new File(salida));

		for (Persona persona : l) {
			pr.println(persona);
		}
		pr.close();
	}

	public static TreeMap<Integer, LinkedList<Persona>> agruparPorEdad(LinkedList<Persona> lp) {
		TreeMap<Integer, LinkedList<Persona>> personasPorEdad = new TreeMap<Integer, LinkedList<Persona>>();
		Integer key;
		LinkedList<Persona> value;

		for (Persona persona : lp) {
			key = persona.getEdad();
			if (personasPorEdad.containsKey(key)) {
				value = personasPorEdad.get(key);
				value.add(persona);

			} else {
				value = new LinkedList<Persona>();
				value.add(persona);
				personasPorEdad.put(key, value);
			}
		}
		return personasPorEdad;
	}

	public static void generarPersonasPorEdad(TreeMap<Integer, LinkedList<Persona>> m) {

		try {
			PrintWriter pr = new PrintWriter(new File("PersonasPorEdad.out"));
			for (Map.Entry<Integer, LinkedList<Persona>> entry : m.entrySet()) {
				Integer key = entry.getKey();
				List<Persona> val = entry.getValue();
				pr.println(key);
				for (Persona persona : val) {
					pr.println(persona);
				}
				pr.println("------------------------------------");

			}
			pr.close();
		} catch (IOException ioe) {
		}
	}

	public static void main(String[] args) throws IOException {
		LinkedList<Persona> lp = getPersonas("personas.in");

		/*
		 * for (Persona persona : lp) { System.out.println(persona); }
		 */

		generarArchivoDePersonasMayores(lp, 30);
		generarPersonasPorEdad(agruparPorEdad(lp));

	}

}
