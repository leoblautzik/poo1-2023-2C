package sociedades;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSociedades {
	
	public static void main(String[] args) {
		SA laProspera = new SA(
				"La Prospera", 
				"Acá cerca", 
				100000000.00,
				"33333333333", 
				1000, 
				200000.00, 
				true, 
				5
	    );
		
		SRL laPonderosa = new SRL(
				 "La Ponderosa",
				 "Queda Lejos",
				 30000000.00,
				 "44444667788",
				 5
				);
		SH laVacaLoca = new SH(
				"La Vaca Loca",
				"En al campo",
				500000.00,
				"88888888888");
		
		laVacaLoca.agregarSocio("Victor", 65.25);
		laVacaLoca.agregarSocio("Leo", 34.75);
		
		
		
		laPonderosa.agregarSocio("Carlos Perez", 40000000.00);
		laPonderosa.agregarSocio("Luisa Laine", 140000000.00);
		
		/*
		 * System.out.println(laProspera.toString()); System.out.println(laPonderosa);
		 * System.out.println(laVacaLoca);
		 */
		
		ArrayList<Sociedad> sociedades = new ArrayList<Sociedad>();
		sociedades.add(laPonderosa);
		sociedades.add(laProspera);
		sociedades.add(laVacaLoca);
		
		Collections.sort(sociedades);
		
		for(Sociedad cadaSociedad : sociedades) {
			System.out.println(cadaSociedad);
		}
			
	}
}
