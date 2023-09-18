package juegoDeEstrategia;

public class Soldado extends Unidad implements Bebedor {

	private int energia;

	public Soldado(Punto posicion) {
		super(10, 200, posicion);
		this.setEnergia(100);
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (this.estaVivo() 
				&& u.estaVivo() 
				&& this.tieneEnergiaSuficiente()
				&& this.getPosicion().distancia(u.getPosicion()) == 0);
	}

	public boolean tieneEnergiaSuficiente() {
		return this.getEnergia() >= 10;
	}

	public void atacar(Unidad enemigo) {
		if (!this.puedeAtacar(enemigo)) {
			throw new Error("No puede atacar");
		}

		enemigo.recibirDanio(this.getDanio());
		this.setEnergia(this.getEnergia() - 10);
	}

	public void setEnergia(int energia) {
		if (energia < 0)
			throw new Error("Valor incorrecto para la energá");
		this.energia = energia;

	}

	public int getEnergia() {
		return energia;
	}

	@Override
	public void beberAgua() {
		this.setEnergia(100);

	}

}
