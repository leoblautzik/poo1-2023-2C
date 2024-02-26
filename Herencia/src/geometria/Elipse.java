package geometria;

public class Elipse extends Figura {

	private double radioMenor;
	private double radioMayor;

	public Elipse(double x, double y, double radioMenor, double radioMayor) {
		super(x, y);
		if (radioMenor <= 0 || radioMayor <= 0)
			throw new Error("Dato inválido");

		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	public Elipse(Punto centro, double radioMenor, double radioMayor) {
		super(centro);
		if (radioMenor <= 0 || radioMayor <= 0)
			throw new Error("Dato inválido");

		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;
	}

	public double getRadioMenor() {
		return this.radioMenor;
	}

	public double getRadioMayor() {
		return this.radioMayor;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radioMayor * this.radioMenor;
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.getPunto().desplazar(deltaX, deltaY);

	}

}
