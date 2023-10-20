package supermercado;

import java.util.ArrayDeque;

public class Supermercado {

	private ArrayDeque<Cliente> colaA = new ArrayDeque<Cliente>();
	private ArrayDeque<Cliente> colaB = new ArrayDeque<Cliente>();
	
	public void encolarCliente(Cliente c) {
		c.setUbicacion(colaA.size() + 1);
		colaA.offer(c);
	}
	
	public Cliente atenderCliente(ArrayDeque<Cliente> cola) {
		Cliente aux =  cola.poll();
		
		for (Cliente cliente : cola) {
			cliente.setUbicacion(cliente.getUbicacion()-1);
		}
		return aux;
		
	}
	
	public void abrirColaB() {
		
	}
	
	

}
