package geometria;

public class Circulo extends Elipse {

	
	public Circulo(double x, double y, double radio) {
		super(new Punto(x, y), radio, radio);
	}
	public Circulo(Punto centro, double radio) {
		super(centro, radio, radio);
	}
	
		

}
