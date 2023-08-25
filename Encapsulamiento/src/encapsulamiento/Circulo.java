package encapsulamiento;

public class Circulo {

	private double radio;
	private Color color;
	private Punto centro;
	
	public Circulo(double radio, Color color, Punto centro) {
		setRadio(radio);
		setColor(color);
		this.centro = centro;
	}
	
	public Circulo() {
		this(1,Color.BLANCO, new Punto());
	}
	
	public void setRadio(double radio) {
		if(radio <= 0) {
			throw new Error(radio + " Es Radio Inválido");
		}
		this.radio = radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public double getDiametro() {
		return this.radio * 2;
	}
	
	public void setDiametro(double diametro) {
		setRadio(diametro / 2);
	}
	
	public double getCircunferencia() {
		return Math.PI * this.getDiametro(); 
	}
	
	public void setCircunferencia(double circunferencia) {
		setRadio(circunferencia / (2 * Math.PI));
	}
	
	public double getArea() {
		return Math.PI * Math.pow(this.getRadio(), 2);
	}
	
	public void setArea(double area) {
		if(area <= 0) {
			throw new Error(area + " Es Area Inválida");
		}
		setRadio(Math.sqrt(area / Math.PI));
	}
	






	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", color=" + color + ", centro=" + centro + "]";
	}

	public static void main(String[] args) {
		Circulo circulito = new Circulo(5, Color.ROJO, new Punto(1,1));
		System.out.println(circulito);
		Circulo circulon = new Circulo();
		System.out.println(circulon);
		System.out.println(circulito.getRadio());
		circulito.setRadio(4);
		System.out.println(circulito.getRadio());
		System.out.println(circulito);
		//Maldad
		circulito.setRadio(2);
		System.out.println(circulito);
		//Otra Maldad
		//Circulo circuloDeLaMuerte = new Circulo(-1, Color.AZUL);
		//System.out.println(circuloDeLaMuerte);
		circulito.setCircunferencia(Math.PI);
		System.out.println(circulito.getDiametro());
		circulito.setCircunferencia(1);
		System.out.println(circulito.getDiametro());
		
		//circulito.setArea(-10);
		//System.out.println(circulito);
		
		
		

	}

}
