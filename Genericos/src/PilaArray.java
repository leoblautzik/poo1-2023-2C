
public class PilaArray<T> {

	private Object[] pila;
	private int tope = 0;

	public PilaArray() {
		this.pila = new Object[1000];
	}

	public boolean isVacia() {
		return tope == 0;
	}

	public void apilar(T elemento) throws PilaLlenaException {
		if(tope >= this.pila.length)
			throw new PilaLlenaException("Pila llena");
		this.pila[tope] = elemento;
		tope++;
	}

	public T desapilar() throws PilaVaciaException {

		if (this.isVacia())
			throw new PilaVaciaException("Pila vacia");

		@SuppressWarnings("unchecked")
		T aux = (T) pila[tope - 1];
		tope--;

		return aux;

	}
	
	public T ver() throws PilaVaciaException {

		if (this.isVacia())
			throw new PilaVaciaException("Pila vacia");

		@SuppressWarnings("unchecked")
		T aux = (T) pila[tope - 1];
		return aux;

	}

}
