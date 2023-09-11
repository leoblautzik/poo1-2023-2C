package geometria;

public class Rectangulo extends Figura{
	
	private Punto sd;
	
	public Rectangulo(double x1, double y1, double x2, double y2) {
		super(x1, y1);
		this.sd = new Punto(x2, y2);
	}
	
	public Rectangulo(Punto ii, Punto sd) {
		super(ii);
		this.sd = sd;
	}

	@Override
	public double getArea() {
		double base = this.sd.getX() - super.getPunto().getX();
		System.out.println(base);
		double altura = this.sd.getY() - super.getPunto().getY();
		System.out.println(altura);
		return base*altura;
		
		
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		super.getPunto().desplazar(deltaX, deltaY);
		this.sd.desplazar(deltaX, deltaY);
		
	}

}
