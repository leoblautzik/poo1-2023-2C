package guia01Repaso;

import java.util.Scanner;

public class Ejercicios2y3 {
	public static void main(String[] args) {
		int a, b, suma;
		double cociente;
		Scanner escanercito = new Scanner(System.in);
		System.out.println("Ingrese un entero: ");
		a = escanercito.nextInt();
		System.out.println("Ingrese otro entero: ");
		b = escanercito.nextInt();
		escanercito.close();
		suma = a + b;
		cociente = 1.0 * a / b;
		System.out.println("La suma es: " + suma);
		System.out.println("El cociente es: " + cociente);
	}

}
