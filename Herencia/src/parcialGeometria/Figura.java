package parcialGeometria;

public abstract class Figura {
	
	private double area;
	
	public Figura(double area) {
		this.area = area;
	}
	
	public  final double getArea() {
		return this.area;
	}
	

}
