package geometria;

public class Segmento implements Desplazable, Comparable<Segmento>, EsParalelo{
	
	private Punto v1;
	private Punto v2;
	
	public Segmento(double x1, double y1, double x2, double y2) {
		this.v1 = new Punto(x1,y1);
		this.v2 = new Punto(x2, y2);
	}
	
	public double pendiente() {
 		return (this.v2.getY() - this.v1.getY()) /
 				(this.v2.getX() - this.v1.getX());
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.v1.desplazar(deltaX, deltaY);
		this.v2.desplazar(deltaX, deltaY);
	}
	
	@Override
	public int compareTo(Segmento s) {
		return Double.compare(this.v1.distancia(this.v2), s.v1.distancia(s.v2));
	}

	@Override
	public boolean esParaleloAlEjeX() {
		return this.v1.getY() - this.v2.getY() == 0;
	}

	@Override
	public boolean esParaleloAlEjeY() {
		return this.v1.getX() - this.v2.getX() == 0;
	}

	@Override
	public boolean esParaleloA(Segmento s) {
		return this.pendiente() == s.pendiente();
	}
	
	
}
