package geometria;
import encapsulamiento.Punto;
public class CoronaCircular {
	
	private Circulo grande;
	private Circulo agujero;
	
	public CoronaCircular(double ri , double re, Punto centro, Color color) {
		if(ri >= re)
			throw new Error("");
		this.grande = new Circulo(re, centro, color);
		this.agujero = new Circulo(ri, centro, Color.BLANCO);
	}
	
	public double getRadioInterior() {
		return agujero.getRadio();
	}
	
	public double getRadioExterior() {
		return grande.getRadio();
	}
	
	public double getPerimetroExterior() {
		return grande.getPerimetro();
	}
	public double getPerimetroInterior() {
		return agujero.getPerimetro();
	}
	
	public double getArea() {
		return grande.getArea() - agujero.getArea();
	}

}
