package appGeometria;

public class Triangulo extends Figura implements EsParalelo {

	private Punto v2;
	private Punto v3;

	public Triangulo(double x1, double y1, double x2, double y2, double x3, double y3) {
		super(x1, y1);
		this.v2 = new Punto(x2, y2);
		this.v3 = new Punto(x3, y3);
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		super.getPunto().desplazar(deltaX, deltaY);
		this.v2.desplazar(deltaX, deltaY);
		this.v3.desplazar(deltaX, deltaY);
	}

	@Override
	public double getArea() {
		// Aplicando la formula de Heron
		
		double a = super.getPunto().distancia(v2);
		double b = super.getPunto().distancia(v3);
		double c = v2.distancia(v3);
		double s = (a + b + c) / 2;
		
		return Math.sqrt(s * (s - a) * (s - b) * (s - c));
	}

	
	
	@Override
	public boolean esParaleloAlEjeX() {
		
		return this.v2.getY() == this.v3.getY() ||
				this.v2.getY() == super.getPunto().getY() || 
				 this.v3.getY() == super.getPunto().getY();
	}

	@Override
	public boolean esParaleloAlEjeY() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean esParaleloA(Segmento s) {
		// TODO Auto-generated method stub
		return false;
	}

}
