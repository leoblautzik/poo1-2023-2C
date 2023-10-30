package segundoParcial2021;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio1 {

	public void reemplazar(String archivoOrigen, String archivoDestino, String palabraAReemplazar,
			String nuevaPalabra) {
		String linea;
		String lineaR;

		try {
			FileReader fr = new FileReader(archivoOrigen);
			BufferedReader br = new BufferedReader(fr);
			PrintWriter pr = new PrintWriter(new File(archivoDestino));
		
			while ((linea = br.readLine()) != null) {
				lineaR = linea.replace(palabraAReemplazar, nuevaPalabra);
				pr.println(lineaR);
			}
			
			fr.close();
			pr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		Ejercicio1 e1 = new Ejercicio1();
		
		e1.reemplazar("kit.in", "set.out", "elementos", "cositas");
		
	}

}
