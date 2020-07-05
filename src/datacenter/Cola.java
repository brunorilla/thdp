package datacenter;

import java.util.LinkedList;
import java.util.Queue;

public class Cola<T> {
	Queue<T> queue;

	public Cola() {
		queue = new LinkedList<T>();
	}

	public void add(T e) {
		queue.add(e);
	}

	public T pool() {
		return queue.poll();
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public T peek() {
		return queue.peek();
	}
}