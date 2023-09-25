package sociedades;

import java.util.ArrayList;

public class SRL extends Sociedad {

	private ArrayList<String> nombreDeCadasociosGerente;
	private ArrayList<Double> patrimonioDeCadaSocioGerente;
	private Integer cantidadDeSociosNoGerentes;
	private Integer cantidadDeSociosGerentes = 0;

	public SRL(String denominacionSocial, String domicilioLegal, Double capitalSocial, String cuit,
			Integer cantidadDeSociosNoGerentes) {
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.cantidadDeSociosNoGerentes = cantidadDeSociosNoGerentes;
		this.nombreDeCadasociosGerente = new ArrayList<String>();
		this.patrimonioDeCadaSocioGerente = new ArrayList<Double>();
	}

	
	public void agregarSocio(String nombre, Double patrimonio) {
		if (this.cantidadDeSociosGerentes < 3) {
			this.nombreDeCadasociosGerente.add(nombre);
			this.patrimonioDeCadaSocioGerente.add(patrimonio);
			cantidadDeSociosGerentes++;
		}
	}

	@Override
	public String toString() {
		String sociedad = super.toString();
		String srl = "SRL [nombreDeCadasociosGerente=" + nombreDeCadasociosGerente + ", patrimonioDeCadaSocioGerente="
				+ patrimonioDeCadaSocioGerente + ", cantidadDeSociosNoGerentes=" + cantidadDeSociosNoGerentes
				+ ", cantidadDeSociosGerentes=" + cantidadDeSociosGerentes + "]";

		return sociedad + "\n" + srl + "\n";
	}

}
