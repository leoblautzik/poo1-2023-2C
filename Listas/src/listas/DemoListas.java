package listas;

import java.util.ArrayList;
import java.util.Collections;

public class DemoListas {
	
	
	public static void main(String[] args) {
		
		Long cuit = 99999999999l;
		ArrayList<Integer> edades = new ArrayList<Integer>();
		
		edades.add(7);
		edades.add(12);
		edades.add(9);
		
		System.out.println(edades);
		
		Collections.sort(edades);
		
		System.out.println(edades);
		
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Pepito");
		nombres.add("Luisito");
		nombres.add("Ana");
		
		System.out.println(nombres);
		
		Collections.sort(nombres);
		System.out.println(nombres);
		
		Integer b = 8; 
		Integer c = new Integer(10);
		System.out.println(c);
		
		

	}
}
