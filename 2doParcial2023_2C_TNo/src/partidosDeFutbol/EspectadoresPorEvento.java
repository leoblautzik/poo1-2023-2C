package partidosDeFutbol;

import java.util.HashMap;
import java.util.Map;

public class EspectadoresPorEvento {

//	private int[] puertas = new int[15];
//	private int cantidadTotalDeEspectadores = 0;
//	
//	public void ingresarEspectadoresPorLaPuerta(int puerta, int espectadores) {
//		this.puertas[puerta-1] += espectadores;
//		this.cantidadTotalDeEspectadores += espectadores;
//	}
//	
//	public int getEspectadoresQueIngresaronPorLaPuerta(int puerta) {
//		return this.puertas[puerta-1];
//	}
//	
	public int getCantidadTotalDeEspectadores() {
		return this.cantidadTotalDeEspectadores;
	}

	private Map<Integer, Integer> puertas = new HashMap<Integer, Integer>(15);
	private int cantidadTotalDeEspectadores = 0;
	
	public EspectadoresPorEvento() {
		for(int i = 1; i <= 15; i++)
			puertas.put(i, 0);
	}

	public void ingresarEspectadoresPorLaPuerta(int puerta, int espectadores) {
		int value = puertas.get(puerta);
		value += espectadores;
		this.cantidadTotalDeEspectadores += espectadores;
		puertas.put(puerta, value);

	}

	public int getEspectadoresQueIngresaronPorLaPuerta(int puerta) {
		return this.puertas.get(puerta);
	}
}
