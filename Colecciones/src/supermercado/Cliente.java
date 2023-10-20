package supermercado;

public class Cliente {
	
	private int ubicacion = 0;
	private int cantidadDeProductos;
	
	public Cliente(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public void setUbicacion(int ubicacion) {
		this.ubicacion = ubicacion; 
	}

	public int getUbicacion() {
		
		return this.ubicacion;
	}
	
	

}
