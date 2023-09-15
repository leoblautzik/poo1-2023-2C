package profesionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DemoProfesionales {

	public static void main(String[] args) {
		
		
		
		Profesional chapatin = new Medico("Romualdo", "Chapatin");
		Profesional cureta = new Cirujano("Agustin", "Cureta");
		Profesional venoso = new CirujanoCardiovascular("Sangriento", "Venoso");
		Profesional molar = new Dentista("Dolores", "Molar");
		Profesional perno = new Endodoncista("Profundo", "Perno");
		
		Profesional[] profesionales = {chapatin, cureta, venoso, molar, perno};
		
		ArrayList<Profesional> listaDeProfesionales = new ArrayList<Profesional>();
		listaDeProfesionales.add(chapatin);
		listaDeProfesionales.add(cureta);
		listaDeProfesionales.add(venoso);
		listaDeProfesionales.add(molar);
		listaDeProfesionales.add(perno);
		
		System.out.println("\n Arreglo de Pro\n");
		for(Profesional p : profesionales)
			System.out.println(p);
	
		Arrays.sort(profesionales);
		System.out.println("Ahora ordenado por honorarios");
		
		for(Profesional p : profesionales)
			System.out.println(p);
		
		System.out.println("\n Lista de Pro\n");
		for(Profesional p : listaDeProfesionales)
			System.out.println(p);
		
		Collections.sort(listaDeProfesionales);
		
		System.out.println("\n Lista de Pro Ordenados\n");
		for(Profesional p : listaDeProfesionales)
			System.out.println(p);
	}

}
