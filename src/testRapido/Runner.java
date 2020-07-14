package testRapido;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ARRAY REVERSE

		int[] array = new int[6];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		System.out.println("\n\n");

		int aux = 0;
		for (int i = 0; i < array.length / 2; i++) {
			aux = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = aux;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

		// STACKS

		Stack<Auto> autos = new Stack<Auto>();
		for (int i = 0; i < 10; i++) {
			Auto a = new Auto(i);
			autos.push(a);
		}

		Stack<Auto> pila_aux = new Stack<Auto>();
		Auto encontrado = null;
		int valor = 2;
		Auto aux1 = null;

		// BÚSQUEDA EN STACK SIN REMOVER

		while (!autos.isEmpty() && encontrado == null) {
			aux1 = autos.pop();
			if (aux1.getId() == valor) {
				encontrado = aux1;
			}
			pila_aux.push(aux1);
		}
		while (!pila_aux.isEmpty()) {
			autos.push(pila_aux.pop());
		}

		System.out.println(encontrado.toString());

		// BÚSQUEDA EN STACK REMOVIENDO ELEMENTO ENCONTRADO

		// System.out.println(autos.size());

		while (!autos.isEmpty() && encontrado == null) {
			aux1 = autos.pop();
			if (aux1.getId() == valor) {
				encontrado = aux1;
			}
			if (encontrado == null) {
				pila_aux.push(aux1);
			}
		}
		while (!pila_aux.isEmpty()) {
			autos.push(pila_aux.pop());
		}

		System.out.println(encontrado.toString()); //
		System.out.println(autos.size());

		// NO HAY MÉTODO SIZE - OBTENER CANTIDAD DE ELEMENTOS EN UN STACK
		int counter = 0;
		while (!autos.isEmpty()) {
			pila_aux.push(autos.pop());
			counter++;
		}
		System.out.println("La pila tiene " + counter + " elementos");
		while (!pila_aux.isEmpty()) {
			autos.push(pila_aux.pop());
		}

		System.out.println("Tamaño aux: " + pila_aux.size());
		System.out.println("Tamaño pila original: " + autos.size());

		/* TRABAJO CON QUEUES/COLAS */

		Queue<Auto> cola = new LinkedList<Auto>();
		for (int i = 0; i < 200; i++) {
			Auto a = new Auto(i);
			cola.add(a);
		}

		// Encontrar un elemento en una cola:

		Auto found = null;
		Auto centinela = new Auto(-1);
		int id = 1;
		cola.add(centinela);
		Auto ax = cola.poll();
		while (!cola.isEmpty() && ax.getId() != centinela.getId()) {
			ax = cola.poll();
			if (ax.getId() == id) {
				found = ax;
			}
			cola.add(ax);
			ax = cola.poll();
		}
		System.out.println(found.toString());

		// ENCONTRAR Y SACAR EL ELEMENTO

		Auto found1 = null;
		Auto ax1 = null;
		int comparador = 1;
		Auto centinela1 = new Auto(-1);
		cola.add(centinela1);
		ax1 = cola.poll();
		while (!cola.isEmpty() && ax1.getId() != centinela1.getId()) {
			if (ax1.getId() == comparador) {
				found1 = ax1;
				ax1 = cola.poll();
			} else {
				cola.add(ax1);
				ax1 = cola.poll();
			}
		}

		System.out.println("El tamaño de la cola es " + cola.size());
		System.out.println(found1.toString());

		// SIN MÉTODO SIZE. SACAR LA CANTIDAD DE ELEMENTOS QUE TIENE LA COLA

		int count = 0;
		Auto cent = new Auto(-1);
		cola.add(cent);
		Auto a = cola.poll();
		while (!cola.isEmpty() && a.getId() != cent.getId()) {
			cola.add(a);
			a = cola.poll();
			count++;
		}

		System.out.println("El tamaño de la cola es " + count);
		System.out.println("El tamaño de la cola método size " + cola.size());
	}

}
