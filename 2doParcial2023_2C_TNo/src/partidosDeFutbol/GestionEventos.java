package partidosDeFutbol;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class GestionEventos {

	private Map<String, EspectadoresPorEvento> estadio = new HashMap<String, EspectadoresPorEvento>();

	public void cargarDatosdeLosEventos(String archivo) {
		File f = new File(archivo);
		FileReader fr;
		BufferedReader br;
		String linea;
		String[] datos;
		EspectadoresPorEvento epe;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			linea = br.readLine();
			while (linea != null) {
				datos = linea.split(",");
				String evento = datos[0];
				int puerta = Integer.parseInt(datos[1]);
				int espectadores = Integer.parseInt(datos[2]);

				if (this.estadio.containsKey(evento)) {
					epe = this.estadio.get(evento);
				} else {
					epe = new EspectadoresPorEvento();
				}
				epe.ingresarEspectadoresPorLaPuerta(puerta, espectadores);
				this.estadio.put(evento, epe);
				linea = br.readLine();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void generarEspectadoresPorEvento(String salida) throws IOException {
		PrintWriter pr = new PrintWriter(new File(salida));
		for (Map.Entry<String, EspectadoresPorEvento> entry : estadio.entrySet()) {
			String key = entry.getKey();
			EspectadoresPorEvento val = entry.getValue();
			pr.println(key + ", Ingresaron: " + val.getCantidadTotalDeEspectadores());
			for (int i = 1; i <= 15; i++) {
				pr.print(val.getEspectadoresQueIngresaronPorLaPuerta(i));
				pr.print("\t");
			}
			pr.println();

		}
		pr.close();
	}

	public static void main(String[] args) throws IOException {
		GestionEventos ge = new GestionEventos();
		ge.cargarDatosdeLosEventos("eventos.csv");
		ge.generarEspectadoresPorEvento("espectadores.csv");

	}

}
