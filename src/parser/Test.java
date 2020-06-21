package parser;

import java.util.Stack;

public class Test {

	public Test() {
		// TODO Auto-generated constructor stub

	}

	public static boolean parser(char[] cadena) {
		boolean balanceada = true;
		int index = 0;
		Stack<Character> pila = new Stack<Character>();

		while (index < cadena.length && balanceada) {
			System.out.println("empiezo");
			// es de apertura?
			if (cadena[index] == '(') {
				// si es de apertura se apila
				pila.push(cadena[index]);

			} else {
				// no es de apertura
				if(pila.isEmpty()) {
					balanceada = false;
				} else {
					pila.pop();
				}
			}
			index++;
		}

		if(balanceada && pila.isEmpty()) {
			System.out.println("La pila está balanceada");
		} else {
			System.out.println("La pila NO está balanceada");
		}
		return balanceada && pila.isEmpty();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char cadena[] = {'(','(','(',')',')',')'};
		System.out.println("Hola");
		System.out.println(parser(cadena));
		
	}

}
