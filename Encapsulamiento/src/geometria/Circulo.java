package geometria;
import encapsulamiento.Punto;
import static java.lang.Math.*;

public class Circulo {
	
	private double diametro;
	private Punto centro;
	private Color color;
	
	public Circulo(double radio, Punto centro, Color color) {
		setDiametro(radio * 2);
		this.centro = centro;
		this.color = color;
	}
	
	public Circulo() {
		this(1, new Punto(0,0), Color.BLANCO);
	}
	
	public void setDiametro(double diametro) {
		if(diametro <= 0)
			throw new Error(diametro + " es inválido");
		this.diametro = diametro;
	}
	
	public double getDiametro() {
		return this.diametro;
	}
	
	public double getRadio() {
		return getDiametro() / 2;
	}
	
	public void setRadio(double radio) {
		setDiametro(radio * 2);
	}
	
	public double getPerimetro() {
		return Math.PI * getDiametro();
	}
	
	public void setPerimetro(double perimetro) {
		setDiametro(perimetro/Math.PI);
	}
	
	public double getArea() {
		return PI * pow(getRadio(), 2);
	}
	
	public void setArea(double area) {
		if(area <= 0)
			throw new Error(area + " es inválida");
		setDiametro(sqrt(4 * area / PI));
		
	}
	
	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto centro) {
		this.centro = centro;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
		
	public void desplazar(double enX, double enY) {
		this.centro.desplazar(enX, enY);
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + diametro/2 + ", centro=" + centro + ", color=" + color + "]";
	}

	public static void main(String[] args) {
		Circulo circulito = new Circulo(5, new Punto(1,1), Color.ROJO);
		System.out.println(circulito);
		Circulo circuloPorDefecto = new Circulo();
		System.out.println(circuloPorDefecto);
		
		System.out.println(circuloPorDefecto.getRadio());
		circuloPorDefecto.setRadio(8);
		System.out.println(circuloPorDefecto.getRadio());
		System.out.println(circuloPorDefecto.getDiametro());
		
		circuloPorDefecto.setPerimetro(20);
		System.out.println("----\n" + circuloPorDefecto.getRadio());
		System.out.println(circuloPorDefecto.getDiametro());
		System.out.println(circuloPorDefecto.getPerimetro());
		
		circuloPorDefecto.setArea(-2);
		System.out.println(circuloPorDefecto.getRadio());
		

	}

}
