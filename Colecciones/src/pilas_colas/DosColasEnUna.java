package pilas_colas;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Escribir un método que, dadas dos colas de enteros, 
 * construya una cola con el resultado de poner una a 
 * continuación de la otra. por ejemplo si 
 * q1 = [1,2,3] (con 1 al frente y 3 al final) y 
 * q2 = [5,7], el resultado es [1,2,3,5,7] (con 1 al frente y 7 al final).
 * 
 */

public class DosColasEnUna {
	
	public Queue<Integer> dosColasEnUna(Queue<Integer> q1, Queue<Integer> q2){
		Queue<Integer> aux = new LinkedList<Integer>();
		
		while(!q1.isEmpty())
			aux.offer(q1.poll());
		
		while(!q2.isEmpty())
			aux.offer(q2.poll());
		
		return aux;
	}

}
