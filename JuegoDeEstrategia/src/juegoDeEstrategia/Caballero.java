package juegoDeEstrategia;

//Los caballeros pueden atacar a una distancia de 1 a 2, 
//siempre que su caballo no se haya puesto rebelde. 
//Infringe un daño de 50 puntos y comienza con 200 
//de salud. 
//Un caballo se pone rebelde luego de 3 ataques, 
//y puede calmarse si recibe una poción de agua.


public class Caballero extends Unidad {
	
	
	private Caballo caballo;
	private int contadorDeAtaques = 0;

	
	public Caballero(Punto posicion, Caballo pony) {
		super(50, 200, posicion);
		this.caballo = pony;
	}

	
	@Override
	public boolean puedeAtacar(Unidad u) {
		return (this.estaVivo() 
				&& u.estaVivo() 
				&& !this.caballo.estaRebelde()
				&& this.getPosicion().distancia(u.getPosicion()) <= 2 
				&& this.getPosicion().distancia(u.getPosicion()) >= 1);
	}

	public void atacar(Unidad enemigo) {
		if (!this.puedeAtacar(enemigo)) {
			throw new Error("No puede atacar");
		}
		enemigo.recibirDanio(this.getDanio());
		this.contadorDeAtaques++;
	}
	
	public void darAguaAlCaballo() {
		this.caballo.beberAgua();
		this.contadorDeAtaques = 0;
	}
}
