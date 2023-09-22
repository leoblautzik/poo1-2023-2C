package sociedades;

import java.util.ArrayList;

public class SH extends Sociedad {
	
	ArrayList<String> socios;
	ArrayList<Double> porcentajes;
	public SH(String denominacionSocial, 
			String domicilioLegal, 
			Double capitalSocial, 
			String cuit
			) 
	{
		super(denominacionSocial, domicilioLegal, capitalSocial, cuit);
		this.socios = new ArrayList<String>();
		this.porcentajes = new ArrayList<Double>();
	}
	
	public void agregarSocio(String nombre, Double porcentaje) {
		this.socios.add(nombre);
		this.porcentajes.add(porcentaje);
	}

	@Override
	public String toString() {
		String sociedad = super.toString();
		String sh = "SH [socios=" + socios + ", porcentajes=" + porcentajes + "]";
		return sociedad + "\n" + sh + "\n";
	}
	
	
	
	

}
