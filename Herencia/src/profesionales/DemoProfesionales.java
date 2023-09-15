package profesionales;

import java.util.Arrays;

public class DemoProfesionales {

	public static void main(String[] args) {
		
		
		
		Profesional chapatin = new Medico("Romualdo", "Chapatin");
		Profesional cureta = new Cirujano("Agustin", "Cureta");
		Profesional venoso = new CirujanoCardiovascular("Sangriento", "Venoso");
		Profesional molar = new Dentista("Dolores", "Molar");
		Profesional perno = new Endodoncista("Profundo", "Perno");
		
		Profesional[] profesionales = {chapatin, cureta, venoso, molar, perno};
		
		for(Profesional p : profesionales)
			System.out.println(p);
	
		Arrays.sort(profesionales);
		System.out.println("Ahora ordenado por honorarios");
		
		for(Profesional p : profesionales)
			System.out.println(p);
	}

}
