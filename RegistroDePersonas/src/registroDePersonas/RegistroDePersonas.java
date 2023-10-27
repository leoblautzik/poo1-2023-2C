package registroDePersonas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class RegistroDePersonas {

	public LinkedList<Persona> getPersonas(String archivo) {
		LinkedList<Persona> lp = new LinkedList<Persona>();
		String linea;
		String[] datos;

		try {
			Scanner sc = new Scanner(new File(archivo));
			while (sc.hasNext()) {
				linea = sc.nextLine();
				datos = linea.split(" ");
				lp.add(new Persona(Integer.parseInt(datos[0]), datos[1], Integer.parseInt(datos[2])));
			}
			sc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lp;
	}

	public LinkedList<Persona> getPersonasMayores(LinkedList<Persona> l, int edad) {
		LinkedList<Persona> mayores = new LinkedList<Persona>();

		for (Persona persona : l) {
			if(persona.getEdad() > edad)
				mayores.add(persona);
		}
		
		Collections.sort(mayores);
		
		return mayores;
	}
	
	public void generarArchivoDeLista(LinkedList<Persona> l, String salida) throws IOException {
		
		PrintWriter pr = new PrintWriter(new File(salida));
		for (Persona persona : l) {
			pr.println(persona);
		}
		pr.close();
	}

	public static void main(String[] args) throws IOException {
		RegistroDePersonas rnp = new RegistroDePersonas();

		LinkedList<Persona> lista = rnp.getPersonas("personas.in");
//		for (Persona persona : lista) {
//			System.out.println(persona);
//		}
//		
//		System.out.println("\n--------------------------------\n");
		
		LinkedList<Persona> listaDeMayores = rnp.getPersonasMayores(lista, 36);
//		for (Persona persona : listaDeMayores) {
//			System.out.println(persona);
//		}
		
		rnp.generarArchivoDeLista(listaDeMayores, "MayoresDe36.out");

	}

}
