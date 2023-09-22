package sociedades;

public class SA extends Sociedad {

	Integer cantidadDeAcciones;
	Double precioDeCadaAcción;
	Boolean cotizaEnBolsa;
	Integer cantidadDeDirectores;

	public SA(String denominacionSocial, String domicilioLegal, Double capitalSocial, String cuit,
			Integer cantidadDeAcciones, Double precioDeCadaAcción, Boolean cotizaEnBolsa,
			Integer cantidadDeDirectores) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.cantidadDeAcciones = cantidadDeAcciones;
		this.precioDeCadaAcción = precioDeCadaAcción;
		this.cotizaEnBolsa = cotizaEnBolsa;
		this.cantidadDeDirectores = cantidadDeDirectores;
	}

	@Override
	public String toString() {
		String sociedad = super.toString();
		String sa = "SA [cantidadDeAcciones=" + cantidadDeAcciones + ", precioDeCadaAcción=" + precioDeCadaAcción
				+ ", cotizaEnBolsa=" + cotizaEnBolsa + ", cantidadDeDirectores=" + cantidadDeDirectores + "]";

		return sociedad + "\n" + sa + "\n";
	}

}
