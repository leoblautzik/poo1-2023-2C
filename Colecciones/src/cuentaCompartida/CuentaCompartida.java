package cuentaCompartida;

import java.util.Map;
import java.util.TreeMap;

public class CuentaCompartida {

	private int cantidadDeComensales;
	private double precioPorCubierto;
	private Map<Integer, Comensal> comensales;

	public CuentaCompartida(int cantidadDeComensales, double precioPorCubierto) {
		this.cantidadDeComensales = cantidadDeComensales;
		this.precioPorCubierto = precioPorCubierto;
		this.comensales = new TreeMap<Integer, Comensal>();

		for (int i = 0; i < cantidadDeComensales; i++) {
			comensales.put(i + 1, new Comensal());
			comensales.get(i + 1).agregarConsumo(new Consumo(this.precioPorCubierto, "Cubierto"));
		}

	}

	public void agregarConsumo(int numeroDeComensal, Consumo c) {
		if(numeroDeComensal > this.cantidadDeComensales || numeroDeComensal < 1)
			throw new Error("Comensal incorrecto");
		Integer key = numeroDeComensal;
		Comensal consumosDelComensal = comensales.get(key);
		consumosDelComensal.agregarConsumo(c);

		// this.comensales.get(numeroDeComensal).agregarConsumo(c);

	}

	public String consumosPorComensal(Integer numeroDeComensal) {
		String salida = "";
		Comensal consumosDelComensal = comensales.get(numeroDeComensal);

		for (Consumo cc : consumosDelComensal.getConsumos()) {
			salida += cc.toString();
		}
		return salida;
	}

	public void detallesDeLosConsumosPorComensal() {

		for (Map.Entry<Integer, Comensal> entry : comensales.entrySet()) {
			Integer numeroDeComensal = entry.getKey();
			Comensal consumosDelComensal = entry.getValue();

			System.out.println(numeroDeComensal);
			System.out.println(consumosDelComensal);

		}
	}

	public static void main(String[] args) {
		CuentaCompartida cumple = new CuentaCompartida(2, 500);

		cumple.agregarConsumo(1, new Consumo(2000, "Cerveza"));
		cumple.agregarConsumo(2, new Consumo(3000, "Pizza"));

		cumple.detallesDeLosConsumosPorComensal();
		System.out.println(cumple.consumosPorComensal(1));
		System.out.println(cumple.consumosPorComensal(2));

	}

}
