package juegoDeEstrategia;

//Los lanceros pueden atacar a una distancia de 1 a 3, 
//sin condición. Infringen un daño de 25 puntos, 
//y comienzan con 150 de salud.

public class Lancero extends Unidad {

	public Lancero(Punto posicion) {
		super(25, 150, posicion);
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (this.estaVivo() 
				&& u.estaVivo() 
				&& this.getPosicion().distancia(u.getPosicion()) <= 3 
				&& this.getPosicion().distancia(u.getPosicion()) >= 1);
	}
	public void atacar(Unidad enemigo) {
		if (!this.puedeAtacar(enemigo)) {
			throw new Error("No puede atacar");
		}
		enemigo.recibirDanio(this.getDanio());
	}

}
