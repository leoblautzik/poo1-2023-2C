package appGeometria;

public abstract class Figura implements Desplazable, Comparable<Figura>{
	
	private Punto p;
	
	public Figura(double x, double y) {
		this.p = new Punto(x,y);
	}
	
	public Figura(Punto p) {
		this.p = p;
	}
	
	public Figura() {
		this(0,0);
	}
	
	public Punto getPunto() {
		return this.p;
	}
	
	public abstract double getArea();
	
	@Override
	public int compareTo(Figura f) {
		return Double.compare(this.getArea(), f.getArea());
	}
	
}
