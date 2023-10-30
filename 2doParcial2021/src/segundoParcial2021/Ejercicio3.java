package segundoParcial2021;

public class Ejercicio3 {
	
	public int sumar(String [] numeros) {
		int suma = 0;
		for(int i=0; i<numeros.length; i++)
			try {
				suma += Integer.parseInt(numeros[i]);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		return suma;
	}

}
