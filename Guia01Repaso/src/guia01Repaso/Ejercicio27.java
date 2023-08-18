package guia01Repaso;

public class Ejercicio27 {
	
	public String invertir(String palabra) {
		
		String invertida ="";
			
		for(int i = 0; i < palabra.length(); i++) {
			invertida += palabra.charAt(palabra.length()-1-i);
		}
		
		return invertida;
		
	}
	
	public boolean esPalindromo(String palabra) {
		
		return palabra.equals(this.invertir(palabra));
		
	}
	
	
	
	public static void main(String[] args) {
		Ejercicio27 ej27 = new Ejercicio27();
		String palabra = "holis";
		System.out.println(ej27.invertir(palabra));
		palabra = "supercalifragilisticoespialidoso";
		System.out.println(ej27.invertir(palabra));
		System.out.println(ej27.esPalindromo("neuquen"));
		System.out.println(ej27.esPalindromo("neuque"));
		System.out.println(ej27.esPalindromo("neuuen"));
		
		
	}

}
