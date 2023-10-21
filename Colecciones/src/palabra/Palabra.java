package palabra;

import java.util.Stack;

public class Palabra {

	public String invertir(String palabra) {
		Stack<Character> pila = new Stack<Character>();
		
		for (Character c : palabra.toCharArray()) {
			pila.push(c);
		}
		
		String palabraInvertida = "";
		
		while(!pila.isEmpty()) {
			palabraInvertida+=pila.pop();
		}
	return palabraInvertida;
	}
	
	public boolean esPalindromo(String palabra) {
		return palabra.equalsIgnoreCase(invertir(palabra));
	}
}
