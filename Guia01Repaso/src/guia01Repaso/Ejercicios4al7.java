package guia01Repaso;

public class Ejercicios4al7 {
	
	/*
	 * 4. Dado un valor numérico entero, informar si es par o impar.
	 */

	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}

	/*
	 * 5. Se ingresa un valor numérico de 8 dígitos que representa una fecha con el
	 * siguiente formato aaaammdd. Se pide informar por separado el día, el mes y el
	 * año de la fecha ingresada.
	 */

	public static void diaMesAnio(int fecha) {
		int dia, mes, anio;

		dia = fecha % 100;
		anio = fecha / 10000;
		mes = fecha / 100 % 100;

		System.out.println("Dia: " + dia + ", Mes: " + mes + ", Anio: " + anio);

	}

	/*
	 * 6. Dados dos valores numéricos enteros, indicar cuál es el mayor y cuál es el
	 * menor. Considerar que ambos valores son diferentes.
	 */

	public static void mayorMenor(int a, int b) {
		System.out.println("el mayor es: " + mayor(a, b));
		System.out.println("el menor es: " + menor(a, b));
	}

	/*
	 * recibe dos valores enteros diferentes y devuelve el mayor
	 */
	public static int mayor(int a, int b) {
		if (a > b)
			return a;
		return b;
	}

	/*
	 * recibe dos valores enteros diferentes y devuelve el menor
	 */
	public static int menor(int a, int b) {
		if (a < b)
			return a;
		return b;
	}

	/*
	 * 7. Leer tres valores numéricos enteros, indicar cual es el mayor, cuál es el
	 * del medio y cuál el menor. Considerar que los tres valores son diferentes.
	 */

	public static void mayorMedioMenor(int a, int b, int c) {
		int mayor, medio, menor;

		mayor = a;
		if (b > mayor) {
			medio = mayor;
			mayor = b;
		} else
			medio = b;

		if (c > mayor) {
			menor = medio;
			medio = mayor;
			mayor = c;
		} else if (c > medio) {
			menor = medio;
			medio = c;
		} else
			menor = c;
		System.out.println("Mayor: " + mayor);
		System.out.println("Medio: " + medio);
		System.out.println("Menor: " + menor);
		System.out.println("------------------");
	}



	public static void main(String[] args) {
		System.out.println(esPar(8));
		System.out.println(esPar(3));
		System.out.println(esPar(0));
		
		diaMesAnio(20230811);
		diaMesAnio(20240101);

		mayorMenor(-1, 12);
		mayorMenor(-10000, 12000);
		mayorMenor(0, 12);
		mayorMenor(35, 0);
		mayorMenor(9, 9);
		
		mayorMedioMenor(1, 2, 3);
		mayorMedioMenor(1, 3, 2);
		mayorMedioMenor(2, 1, 3);
		mayorMedioMenor(2, 3, 1);
		mayorMedioMenor(3, 1, 2);
		mayorMedioMenor(3, 2, 1);
	}

}
