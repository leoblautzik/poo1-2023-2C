package pilas_colas;

import java.util.NoSuchElementException;
import java.util.Stack;

public class ArrayDeque<T> implements QueueInterface<T> {

	private Stack<T> a = new Stack<T>();
	private Stack<T> b = new Stack<T>();

	@Override
	public boolean isEmpty() {
		return a.empty() && b.empty();
	}

	@Override
	public void enqueue(T newItem) {
		a.push(newItem);
	}

	@Override
	public T dequeue() throws NoSuchElementException {
		if (this.isEmpty())
			return null;
		if (b.empty()) {
			this.pasarTodoDeAaB();
		}
		return b.pop();
	}

	@Override
	public T peek() throws NoSuchElementException {
		if (this.isEmpty())
			return null;
		if (b.empty()) {
			this.pasarTodoDeAaB();
		}
		return b.peek();
	}
	
	private void pasarTodoDeAaB() {
		while(!a.empty())
			b.push(a.pop());
	}
	
	public int size() {
		return this.a.size() + this.b.size();
	}

}
