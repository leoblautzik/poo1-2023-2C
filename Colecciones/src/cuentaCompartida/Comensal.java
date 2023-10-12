package cuentaCompartida;

import java.util.ArrayList;

public class Comensal {
	
	private ArrayList<Consumo> consumos = new ArrayList<Consumo>();
	
	public ArrayList<Consumo> getConsumos() {
		return consumos;
	}

	public void agregarConsumo(Consumo c) {
		this.consumos.add(c);
	}
	
	@Override
	public String toString() {
		String salida ="";
		
		for (Consumo consumo : consumos) {
			salida += consumo.toString();
			salida += ", ";
		}
		salida += "\n";
		
		return salida;
		
	}
	
	public double importeAPagarPorComensal() {
		double importeApagar = 0;
		for (Consumo consumo : consumos)
			importeApagar += consumo.getPrecio();
		return importeApagar;
			
	}
	
	

}
