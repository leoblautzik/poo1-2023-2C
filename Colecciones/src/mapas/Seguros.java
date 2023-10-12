package mapas;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Seguros {

	private Map<String, List<Siniestro>> siniestros = new TreeMap<String, List<Siniestro>>();

	public void denunciarSiniestro(Siniestro s) {

		String key = s.getPatente();
		List<Siniestro> l;

		if (!siniestros.containsKey(key)) {
			l = new ArrayList<Siniestro>();
		} else {
			l = siniestros.get(key);
		}
		l.add(s);
		siniestros.put(key, l);

	}
	
	
	public String listarSiniestros() {
		String salida = "";
		for (Map.Entry<String, List<Siniestro>> cadaPatente : this.siniestros.entrySet()) {
			String key = cadaPatente.getKey();
			List<Siniestro> val = cadaPatente.getValue();
			System.out.println();
			
			salida += key;
			salida += "\n";
			for(Siniestro lds : val) {
				salida += lds.getFecha();
				salida += ", ";
				salida += lds.getDetalle();
				salida += "\n";
				
			}
		}
		return salida;
	}
	
	public static void main(String[] args) {
		Seguros laPrudencia = new Seguros();
		
		laPrudencia.denunciarSiniestro(new Siniestro("AB234YZ", "01/10/2023", "Me chocaron"));
		laPrudencia.denunciarSiniestro(new Siniestro("AB345ES", "05/10/2023", "Me robaron el auto"));
		laPrudencia.denunciarSiniestro(new Siniestro("AB234YZ", "08/10/2023", "Me volvieron a chocar"));
		
		System.out.println(laPrudencia.listarSiniestros());
	}
	
	

}
