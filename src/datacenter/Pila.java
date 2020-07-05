package datacenter;

import java.util.Stack;

public class Pila<T> {
	Stack<T> stack;

	public Pila() {
		stack = new Stack<T>();
	}

	public void push(T e) {
		stack.push(e);
	}

	public T pop() {
		return stack.pop();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}

	public T peek() {
		return stack.peek();
	}
}
