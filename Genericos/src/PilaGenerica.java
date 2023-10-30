import java.util.LinkedList;

public class PilaGenerica<T> {
	private LinkedList<T> lista;
	
	public PilaGenerica(){
		this.lista= new LinkedList<T>();
	}
	
	public boolean isVacia() {
		return lista.isEmpty();
	}
	
	public void apilar(T elemento) {
		lista.addLast(elemento);
	}
	
	public T desapilar() {
		return lista.removeLast();
	}
	
	public T ver() {
		return lista.getLast();
	}

	@Override
	public String toString() {
		return lista.toString();
	}
	
	

}
