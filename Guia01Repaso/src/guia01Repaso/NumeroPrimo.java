package guia01Repaso;

public class NumeroPrimo {

	/*
	 * Se ingresa un valor numérico > 0, determinar e informar si se trata de un
	 * número primo o no.
	 */

	public boolean esPrimoFor(int n) {
		
		for(int i = 2; i < n; i++) {
			if(n % i == 0)
				return false;
		}
		return true;
		
		
	}
	public boolean esPrimoWhile(int n) {
		
		int i = 2;
		while (n % i != 0) {
			i++;
		}
		return n == i;

	}
	
	public boolean esPrimo(int n) {
		if (n < 1) {
			throw new Error("No pueden ingresar valores menores que 1");
		}
		
		if (n == 1) {
			return false;
		}
		return esPrimoWhile(n);
	}
	
	public void primerosNprimos(int n) {
		int contadorDePrimos = 0;
		int i = 2;
		while(contadorDePrimos < n) {
			if(esPrimo(i)) {
				System.out.println(i);
				contadorDePrimos++;
			}
			i++;
		}
		
		
	}

	public static void main(String[] args) {
		NumeroPrimo p = new NumeroPrimo();
//		System.out.println(p.esPrimo(1));
//		System.out.println(p.esPrimo(2));
//		System.out.println(p.esPrimo(3));
//		System.out.println(p.esPrimo(4));
//		System.out.println(p.esPrimo(25));
//		System.out.println(p.esPrimo(-5));
		p.primerosNprimos(100000);
		
	}

}
