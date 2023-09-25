package juegoDeEstrategia;

public class Caballo implements Bebedor {
	
	private boolean rebelde = false;
	
	public boolean estaRebelde() {
		return this.rebelde;
	}

	@Override
	public void beberAgua() {
		this.rebelde = false;
	}
	
	public void sePoneRebelde() {
		this.rebelde = true;
	}
	
	
}
