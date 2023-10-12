package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mapas {

	public Map<Character, Integer> frecuencias(String s) {

		Map<Character, Integer> frec = new HashMap<Character, Integer>();
		Character key;
		Integer valor;

		for (int i = 0; i < s.length(); i++) {
			key = s.charAt(i);
			valor = 1;
			if (!frec.containsKey(key))
				frec.put(key, valor);
			else {
				valor = frec.get(key);
				valor +=1;
				frec.put(key, valor);
			}

		}

		return frec;
	}
	
	
	public Map<String, Integer> frecuenciaDePalabras(String s) {

		Map<String, Integer> frec = new TreeMap<String, Integer>();
		String key;
		Integer valor;
		
		String [] datos = s.split(" ");
	
		for (int i = 0; i < datos.length; i++) {
			key = datos[i];
			valor = 1;
			if (!frec.containsKey(key))
				frec.put(key, valor);
			else {
				valor = frec.get(key);
				valor +=1;
				frec.put(key, valor);
			}

		}

		return frec;
			
	}
	
	public void mostrarMapa(Map<Character, Integer> mapita) {
		
		for (Map.Entry<Character, Integer> entry : mapita.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + ", " + val);
		}
		
	}
	
	
	public static void main(String[] args) {
		Mapas m = new Mapas();
		m.mostrarMapa(m.frecuencias("supercalifragilisticoespialidoso"));
		/*System.out.println(m.frecuenciaDePalabras("Este lunes, tras el triunfo del neerlandés, "
				+ "la cuenta oficial del Gran Circo publicó un comunicado en sus redes sociales en el que detalló que durante la carrera “se produjo la parada en boxes más rápida de TODOS LOS TIEMPOS”, haciendo alusión al ingreso a boxes de Lando Norris, quien tuvo un cambio de llantas en tan solo 1,80 segundos.\n"
				+ "\n"
				+ "El equipo británico realizó un gran trabajo al costado de la pista ya que, de las cinco paradas más rápidas (fueron 54 en total), “cuatro fueron realizadas por los mecánicos de McLaren”. La parada de 1,80 segundos, en tanto, se dio en la vuelta 27 y, con ese tiempo el joven piloto de 23 años superó el que había realizado Red Bull en el GP de Brasil 2019 (1,82 segundos).\n"
				+ "\n"
				+ "“Una parada en boxes en la Fórmula 1 "
				+ "es mucho más que simplemente detenerse, "
				+ "cambiar neumáticos y acelerar. "
				+ "Se necesita una planificación perfecta y una "
				+ "precisión absoluta a una velocidad impresionante "
				+ "para hacerlo bien a la primera. Las paradas en boxes "
				+ "son sólo un ejemplo de cómo la Fórmula 1 es un deporte de equipo”, "
				+ "reconoció la Máxima en un comunicado, al mismo tiempo que se le otorgó El premio DHL Fastest Pit Stop a McLaren."));
	*/
	}
}
