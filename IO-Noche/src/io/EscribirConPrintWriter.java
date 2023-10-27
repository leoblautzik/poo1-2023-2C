package io;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

// esto es un ejemplo minimo para  grabar sus datos en un archivo  de texto
public class EscribirConPrintWriter {

	public static void main(String[] args){
		//  preparo el arch de salida
		FileWriter fr = null;
		PrintWriter salida = null;
		try {
			fr = new FileWriter("salida.out");
			salida = new PrintWriter(fr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			     
	    int dni = 34567890;
	    String s = "dni:";
	    salida.print(s);      
		salida.println(" "+ dni); 
	
        for(int i=0; i<100000; i++)
            salida.println(i);

		salida.close();

	}

}
