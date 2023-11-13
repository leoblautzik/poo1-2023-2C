package empleadosPorSector;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class GestionACME {

	// private Map<Integer, List<Empleado>> empleadosPorSector;

	public Map<Integer, LinkedList<Empleado>> leerArchivoDePersonal(String entrada) {
		Map<Integer, LinkedList<Empleado>> dicc = new HashMap<Integer, LinkedList<Empleado>>();
		try {
			FileReader fr = new FileReader(entrada);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			String[] datos;
			LinkedList<Empleado> l;

			while ((linea = br.readLine()) != null) {
				datos = linea.split(",");
				int sector = Integer.parseInt(datos[0]);
				int legajo = Integer.parseInt(datos[1]);
				String apenom = datos[2];
				int antiguedad = Integer.parseInt(datos[3]);
				Empleado e = new Empleado(sector, legajo, apenom, antiguedad);

				if (dicc.containsKey(sector)) {
					l = dicc.get(sector);
					l.add(e);
				} else {
					l = new LinkedList<Empleado>();
					l.add(e);
					dicc.put(sector, l);
				}

			}

			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dicc;
	}

	public void listarEmpleadosDelSector(int sector, Map<Integer, LinkedList<Empleado>> empleados) {
		try {
			if (!empleados.containsKey(sector))
				throw new SectorInexistenteException();

			LinkedList<Empleado> l = empleados.get(sector);

			String salida = "empleadosDelSector" + sector + ".csv";
			PrintWriter pr;
			try {
				pr = new PrintWriter(new FileWriter(salida));
				pr.println("EmpleadosDelSector: " + sector);
				for (Empleado e : l) {
					pr.println(e);
				}
				pr.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (SectorInexistenteException sie) {
			// algo
		}

	}

	public static void main(String[] args) {
		GestionACME ga = new GestionACME();
		ga.listarEmpleadosDelSector(100, ga.leerArchivoDePersonal("empleados.csv"));
	}
}
