package guia01Repaso;

public class Arreglos {
	
	/*
	 * Escribir una función que reciba un arreglo de enteros y 
	 * devuelva true si el arreglo está ordenado de 
	 * mayor a menor y false si está desordenado.
	 */
	
	public boolean estaOrdenado(int [] a) {
		for(int i = 0; i < a.length-1; i++) {
			
			if (a[i] < a[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Escribir una función que reciba un arreglo de enteros y 
	 * devuelva la suma de los elementos que se encuentran en 
	 * posiciones pares (incluido el elemento de la posición 0). 
	 * Por ejemplo:
	 * Dado el arreglo [1, 2, 13 ,4, 8, 6] => devuelve 22 (1+13+8)
	 */
	
	public boolean esPar(int x) {
		return x % 2 == 0;
	}
	
	public int sumaDePosicionesPares(int [] a) {
		int suma = 0;
		for(int i = 0; i < a.length; i+=2) {
			suma += a[i];
		}
		return suma;
	}

	public static void main(String[] args) {
		Arreglos arr = new Arreglos();
		
		int [] a = {1,2,3,4,5,6,7,8,9};
		int [] b = {9,8,7,6,5,4,3,2,1};
		int [] c = {1};
		int [] d = {};
		int [] e = { 1,1,1,1,1,1,1,1,1};
		int [] f = {-1,-2,-3,-4};
		int [] g = {-4,-3,-2,-1};
		int [] h = {1,8,7,6,5,4,3,2,1};
		int [] i = {9,8,7,6,5,4,3,2,3};
		
		System.out.println(arr.estaOrdenado(a));
		System.out.println(arr.estaOrdenado(b));
		System.out.println(arr.estaOrdenado(c));
		System.out.println(arr.estaOrdenado(d));
		System.out.println(arr.estaOrdenado(e));
		System.out.println(arr.estaOrdenado(f));
		System.out.println(arr.estaOrdenado(g));
		System.out.println(arr.estaOrdenado(h));
		System.out.println(arr.estaOrdenado(i));
		System.out.println(arr.sumaDePosicionesPares(a));
		System.out.println(arr.sumaDePosicionesPares(b));

	}

}
