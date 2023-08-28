package geometria;

import encapsulamiento.Punto;

public class Segmento {
	
	private Punto a;
	private Punto b;
	
	public Segmento(double x1, double y1, double x2, double y2) {
		this(new Punto(x1, y1), new Punto(x2, y2));
	}

	public Segmento(Punto a, Punto b) {
		if(a.equals(b))
			throw new Error("");
		this.a = a;
		this.b = b;
	}
	
	public double getLongitud() {
		return a.distancia(b);
	}
	
	public boolean esParaleloAlEjeX() {
		return this.a.getY() == this.b.getY();
	}
	
	public boolean esParaleloAlEjeY() {
		return this.a.getX() == this.b.getX();
	}
	
	public double pendiente() {
		return (a.getY() - b.getY()) / (a.getX() - b.getX());
	}
	
	public boolean esParalelo(Segmento s) {
		return this.pendiente() == s.pendiente();
	}
	
	public static void main(String[] args) {
		Punto a = new Punto(1,1);
		Punto b = new Punto(1,4);
		
		Segmento s1 = new Segmento(a,b);
		Segmento s2 = new Segmento(2,3,2,3);
	}
	
	

}
