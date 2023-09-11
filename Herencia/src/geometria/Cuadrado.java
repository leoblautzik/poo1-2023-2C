package geometria;

public class Cuadrado extends Rectangulo{
	
	public Cuadrado(double x, double y, double lado) {
		super(x, y, x+lado, y+lado);
	}

}
