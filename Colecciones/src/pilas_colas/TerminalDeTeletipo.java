package pilas_colas;

import java.util.Stack;

/**
 * En una terminal de teletipo existe un carácter de retroceso que permite
 * cancelar el último carácter. Por ejemplo: si el carácter de retroceso es /,
 * entonces la línea abc/d//e será interpretada como ae. Existe también un
 * carácter anulador que elimina todos los caracteres ingresados hasta el
 * momento, suponga que ese carácter es &. Realice un método que dado un tira de
 * caracteres (String), ejecute las operaciones indicadas si se encuentra con el
 * carácter / o el &. Debe por último retornal la tira resultante.
 * 
 */

public class TerminalDeTeletipo {

	private Stack<Character> teletipo = new Stack<Character>();

	public String procesarTira(String tira) {

		for (int i = 0; i < tira.length(); i++) {
			if (tira.charAt(i) == '&') {
				teletipo.clear();
			} else {

				if (tira.charAt(i) == '/' && !teletipo.empty())
					teletipo.pop();

				if (tira.charAt(i) != '/')
					teletipo.push(tira.charAt(i));
			}
		}
		String nuevaTira = "";
		while (!teletipo.empty()) {
			nuevaTira = teletipo.pop() + nuevaTira;
		}
		return nuevaTira;
	}
}
