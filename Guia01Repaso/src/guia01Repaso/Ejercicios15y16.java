package guia01Repaso;

public class Ejercicios15y16 {

	/*
	 * 15. Determinar si un carácter es un dígito numérico 
	 * (función esDigito(char c)).
	 */
	public static boolean esDigito(char c) {

		// return Character.isDigit(c);
		return c >= 48 && c <= 57;

	}

	/*
	 * 16. Determinar si un carácter es una letra (función esLetra(char c)).
	 */

	public static boolean esLetra(char c) {

		return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);

	}

	public static String concatenarCadenas(String c1, String c2) {
		// return c1 + c2;
		return c1.concat(c2);
	}

	public static void main(String[] args) {
		System.out.println(esDigito('d'));
		System.out.println(esDigito('4'));
		System.out.println(esLetra('l'));
		System.out.println(esLetra('0'));
		System.out.println(esLetra('B'));
		String hola = "Hola";
		String java = "java";
		System.out.println(concatenarCadenas(hola, java));
		String saludo1 = "Hola";
		String saludo2 = "Hola";
		String saludo3 = new String("Hola");
		System.out.println(saludo1 == saludo2);
		System.out.println(saludo1 == saludo3);
		System.out.println(saludo1.equals(saludo2));
		System.out.println(saludo1.equals(saludo3));
	}

}
