package mapas;

public class Siniestro {
	
	private String patente;
	private String fecha;
	private String detalle;
	
	public Siniestro(String patente, String fecha, String detalle) {
		super();
		this.patente = patente;
		this.fecha = fecha;
		this.detalle = detalle;
	}

	public String getPatente() {
		return patente;
	}

	public String getFecha() {
		return fecha;
	}

	public String getDetalle() {
		return detalle;
	}
	
	

}
