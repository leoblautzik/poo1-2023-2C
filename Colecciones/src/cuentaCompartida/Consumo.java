package cuentaCompartida;

public class Consumo {
	
	private double precio;
	private String detalle;
	
	public Consumo(double precio, String detalle) {
		this.precio = precio;
		this.detalle = detalle;
	}

	public double getPrecio() {
		return precio;
	}

	public String getDetalle() {
		return detalle;
	}

	@Override
	public String toString() {
		return detalle + "(" + precio + ")";
	}
	
	
	
	

}
