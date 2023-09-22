package juegoDeEstrategia;

//Los Arqueros pueden atacar a una distancia de 
//entre 2 y 5 respecto de su enemigo, y si tienen 
//suficientes flechas. 
//Comienzan con 20 flechas en su carcaj, 
//y pueden recargar si reciben un paquete 
//de seis flechas. 
//Infringen un daño de 5 puntos, y comienzan 
//con 50 de salud.

public class Arquero extends Unidad {
	
	private int cantidadDeFlechas;
	
	public Arquero(Punto posicion) {
		super(5, 50, posicion);
		this.cantidadDeFlechas = 20;
	}
	
	public void recargar() {
		this.cantidadDeFlechas += 6;
	}

	@Override
	public boolean puedeAtacar(Unidad u) {
		return (this.estaVivo() 
				&& u.estaVivo() 
				&& this.tieneFlechasSuficientes()
				&& this.getPosicion().distancia(u.getPosicion()) <= 5 
				&& this.getPosicion().distancia(u.getPosicion()) >= 2);
	}
	
	public boolean tieneFlechasSuficientes() {
		return this.cantidadDeFlechas > 0;
	}

	public void atacar(Unidad enemigo) {
		if (!this.puedeAtacar(enemigo)) {
			throw new Error("No puede atacar");
		}
		enemigo.recibirDanio(this.getDanio());
		this.cantidadDeFlechas--;
	}

	public Integer getCantidadDeFlechas() {
		return this.cantidadDeFlechas;
	}
	
	

}
