package juegoDeEstrategia;

public abstract class Unidad {

	private int danio;
	private int salud;
	private Punto posicion;

	public Unidad(int danio, int salud, Punto posicion) {
		this.setDanio(danio);
		this.setSalud(salud);
		this.setPosicion(posicion);
	}

	public abstract boolean puedeAtacar(Unidad u);

	public abstract void atacar(Unidad enemigo);

	public boolean estaVivo() {
		return this.getSalud() > 0;
	}

	public void recibirDanio(int danio) {
		this.setSalud(this.getSalud() - danio);
	}

	public int getDanio() {
		return danio;
	}

	public void setDanio(int danio) {
		if (danio < 0)
			throw new Error("Valor incorrecto para el daño");
		this.danio = danio;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		if (salud < 0)
			throw new Error("Valor incorrecto para la salud");
		this.salud = salud;
	}

	public Punto getPosicion() {
		return posicion;
	}

	public void setPosicion(Punto posicion) {
		this.posicion = posicion;
	}

}
