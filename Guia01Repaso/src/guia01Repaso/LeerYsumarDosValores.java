package guia01Repaso;

import java.util.Scanner;

public class LeerYsumarDosValores {
	
	public static boolean esPar(int numero) {
		return (numero % 2 == 0);
	}
	
	public static void informarDiaMesAnio(int fecha) {
		
	}

	public static void main(String[] args) {
		Scanner escanercito = new Scanner(System.in);
		int a, b;
		/*System.out.println("Ingrese un valor entero: ");
		a = escanercito.nextInt();
		System.out.println("Ingrese otro valor entero: ");
		b = escanercito.nextInt();
		*/
		a = 10;
		b = 3;
		int suma = a + b;
		float cociente = (float)a / b;
		System.out.println("La suma de los valores ingresados es: " + suma);
		System.out.println(a + " + " + b + " = " + suma);
		System.out.println("El cociente de los valores ingresados es: " + cociente);
		System.out.println("¿Es par el 9?: " + esPar(9));
		System.out.println("¿Es par el 10?: " + esPar(10));
		System.out.println("¿Es par el -1?: " + esPar(-1));
		System.out.println("¿Es par el 0?: " + esPar(0));
	}

}
