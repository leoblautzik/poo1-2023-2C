package guia01Repaso;

public class MayorMenor {

	public static void mayorMenor(int a, int b) {
		
			System.out.println("El mayor es: " + mayor(a,b));
			System.out.println("El menor es: " + menor(a,b));
		

	}

	public static int mayor(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	public static int menor(int a, int b) {
		if (a < b) {
			return a;
		} else {
			return b;
		}
	}
	

	public static void main(String[] args) {

		mayorMenor(10, 20);
		mayorMenor(10000, 20);
		mayorMenor(-2, -1);
		mayorMenor(1, 0);
		mayorMenor(-100000, -99999);
		System.out.println(mayor(-100000, -99999));
		System.out.println(menor(-100000, -99999));
	}

}
