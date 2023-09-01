package tragamonedas;

public class Garito {
	
	private static final double VALOR_FICHIN = 50;
	private static double premio = VALOR_FICHIN * 40; 

	public static void main(String[] args) {
		
		Tragamonedas elHonesto = new Tragamonedas();
		// System.out.println(elHonesto);
		int contador = 0;
		while (!elHonesto.entregaPremio()) {
			elHonesto.activar();
			contador++;
		}
		
		System.out.println(elHonesto + " Luego de " + contador + " intentos");
		//System.out.println("Gastaste: " + contador * VALOR_FICHIN);
		if (premio > contador * VALOR_FICHIN)
			System.out.println("Ganaste: " + (premio-contador*VALOR_FICHIN));
		else 
			System.out.println("Perdiste JAJAJAJAJA: " + (contador*VALOR_FICHIN - premio));
	}

}
