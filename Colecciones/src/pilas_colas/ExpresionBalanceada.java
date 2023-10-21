package pilas_colas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ExpresionBalanceada {

	static private Set<Character> deApertura = new HashSet<Character>();
	static private Map<Character, Character> parejita = new HashMap<Character, Character>();

	public ExpresionBalanceada() {
		deApertura.add('{');
		deApertura.add('[');
		deApertura.add('(');

		parejita.put('}', '{');
		parejita.put(']', '[');
		parejita.put(')', '(');
	}

	private boolean esDeApertura(char c) {
		return deApertura.contains(c);
	}

	private boolean esLaParejita(Character abre, Character cierra) {
		return this.parejita.get(cierra).equals(abre);
	}

	public boolean estaBalanceada(String expresion) {
		Stack<Character> pila = new Stack<Character>();
		int i = 0;
		boolean balanceada = true;

		while (i < expresion.length() && balanceada) {
			if (esDeApertura(expresion.charAt(i))) {
				pila.push(expresion.charAt(i));
			} else { //es de cierre
				if (pila.empty() || !esLaParejita(pila.pop(), expresion.charAt(i)))
					balanceada = false;
			}
			i++;
		}
		return balanceada && pila.empty();
	}
}
